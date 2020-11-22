package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conta;
import singleton.ConexaoSingleton;

public class ContaDAO {
	private Connection con;
	
	public ContaDAO() {
		//Conexao c = new Conexao();
		//con = c.getConexao();
		
		this.con = ConexaoSingleton.getInstancia().getConexao();
	}
	
	public String salvar(Conta p) {
		String sql;
		if (p.getCodigo() > 0) {
			sql = " UPDATE conta SET nome = ?, email = ?, "+
		          " senha = ? WHERE codigo = ? ";
		} else {
			sql = " INSERT INTO conta (nome, email, senha) "+
	              " VALUES (?,?,?) ";
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			ps.setString(3, p.getSenha());
			if (p.getCodigo() > 0)
				ps.setInt(4, p.getCodigo());
			ps.executeUpdate();
			ps.close();			
			return "Conta criada com sucesso";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		} 
	}
	
	public List<Conta> listarConta() {
		List<Conta> minhaConta = new ArrayList<>();
		String sql = " SELECT * FROM conta ";
		try {
			PreparedStatement ps =  con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Conta p = new Conta();
				p.setCodigo(rs.getInt("codigo"));
				p.setNome(rs.getString("nome"));
				p.setEmail(rs.getString("email"));
				p.setSenha(rs.getString("senha"));
				minhaConta.add(p);
			}
			ps.close();
			return minhaConta;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Conta getContaPorCodigo(int codigo) {
		String sql = " SELECT * FROM conta "+
					 " WHERE codigo = ? ";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Conta p = new Conta();
			p.setCodigo(rs.getInt("codigo"));
			p.setNome(rs.getString("nome"));
			p.setEmail(rs.getString("email"));
			p.setSenha(rs.getString("senha"));
			ps.close();
			return p;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public String excluir(int codigo) {
		String sql = "DELETE FROM conta WHERE codigo = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.executeUpdate();
			ps.close();
			return "Excluido com sucesso!";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		}
	}
}