package br.gov.serpro.ambulatorio.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConn {
	
	
	private static MysqlConn CONN = new MysqlConn();
	
	private MysqlConn() {}
	
	public static MysqlConn getInstance() {
		return CONN;
	}
	
	
	public static Connection getConn() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ambulatorio","root", "Bu$carta5");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
