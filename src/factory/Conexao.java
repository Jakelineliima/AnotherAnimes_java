package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	private Connection con;
	Statement comando;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/anotheranimes";
	private String usuario = "root";
	private String senha = "";
	
	public Conexao() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, 
					usuario, senha);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexao() {
		return con;
	}
	
}


