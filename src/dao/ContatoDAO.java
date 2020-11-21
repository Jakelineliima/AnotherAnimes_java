package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contato;
import singleton.ConexaoSingleton;

public class ContatoDAO {
	private Connection con;
	
	public ContatoDAO() {
		//Conexao c = new Conexao();
		//con = c.getConexao();
		con = ConexaoSingleton.getInstancia().getConexao();
	}
	
	public String salvar(Contato p) {
		String sql;
		if (p.getCodigo() > 0) {
			sql = " UPDATE mensagem SET nome = ?, email = ?, "+
				  " mensagem = ? WHERE codigo = ? ";
		}else {
			sql = "INSERT INTO mensagem (nome, email, mensagem)" +
	                 " VALUES (?,?,?) ";
	                 
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			ps.setString(3, p.getMensagem());
			if (p.getCodigo() > 0)
				ps.setInt(4, p.getCodigo());
			ps.executeUpdate();
			ps.close();			
			return "Em breve responderemos! Obrigado ";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		} 
	}
 
	public List<Contato> listarMsg() {
		List<Contato> minhasMsg = new ArrayList<>();
		String sql = " SELECT * FROM mensagem ";
		try {
			PreparedStatement ps =  con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Contato p = new Contato();
				p.setCodigo(rs.getInt("codigo"));
				p.setNome(rs.getString("nome"));
				p.setEmail(rs.getString("email"));
				p.setMensagem(rs.getString("mensagem"));
				minhasMsg.add(p);
			}
			ps.close();
			return minhasMsg;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Contato getMgsporCodigo(int codigo) {
		String sql = " SELECT * FROM mensagem "+
					 " WHERE codigo = ? ";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Contato p = new Contato();
			p.setCodigo(rs.getInt("codigo"));
			p.setNome(rs.getString("nome"));
			p.setEmail(rs.getString("email"));
			p.setMensagem(rs.getString("mensagem"));
			ps.close();
			return p;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public String excluir(int codigo) {
		String sql = "DELETE FROM mensagem WHERE codigo = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.executeUpdate();
			ps.close();
			return "Excluido";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		}
	}
	
}
