package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Adicionar;
import singleton.ConexaoSingleton;

public class AdicionarDAO {
	private Connection con;
	
	public AdicionarDAO() {
		//Conexao c = new Conexao();
		//con = c.getConexao();
		con = ConexaoSingleton.getInstancia().getConexao();
	}
	
	public String salvar(Adicionar s) {
		String sql;
		if (s.getCodigo() > 0) {
			sql = " UPDATE salvos SET titulo = ?, temporada = ?, episodio = ?, "+
				  " imagem = ? WHERE codigo = ? ";
		}else {
			sql = "INSERT INTO salvos (titulo, temporada, episodio, imagem)" +
	                 " VALUES (?,?,?,?) ";
	                 
		}             
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getTitulo());
			ps.setString(2, s.getTemporada());
			ps.setString(3, s.getEpisodio());
			ps.setString(4, s.getImagem());
			if (s.getCodigo() > 0)
				ps.setInt(5, s.getCodigo());
			ps.executeUpdate();
			ps.close();			
			return "Seu anime/serie foi salvo";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		} 
	}
	
	public List<Adicionar> listarSalvos() {
		List<Adicionar> meusSalvos = new ArrayList<>();
		String sql = " SELECT * FROM salvos ";
		try {
			PreparedStatement ps =  con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Adicionar s = new Adicionar();
				s.setCodigo(rs.getInt("codigo"));
				s.setTitulo(rs.getString("titulo"));
				s.setTemporada(rs.getString("temporada"));
				s.setEpisodio(rs.getString("episodio"));
				s.setImagem(rs.getString("imagem"));
				meusSalvos.add(s);
			}
			ps.close();
			return meusSalvos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public Adicionar getSalvoPorCodigo(int codigo) {
		String sql = " SELECT * FROM salvos "+
				     " WHERE codigo = ? ";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Adicionar s = new Adicionar();
			s.setCodigo(rs.getInt("codigo"));
			s.setTitulo(rs.getString("titulo"));
			s.setTemporada(rs.getString("temporada"));
			s.setEpisodio(rs.getString("episodio"));
			s.setImagem(rs.getString("imagem"));
			ps.close();
			return s;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
	//EXCLUIR//
	public String excluir(int codigo) {
		String sql = "DELETE FROM salvos WHERE codigo = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.executeUpdate();
			ps.close();
			return "Excluido com Sucesso";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		}
	}		
}