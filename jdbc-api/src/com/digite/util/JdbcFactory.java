package com.digite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class JdbcFactory {
	private JdbcFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws SQLException {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, "mitra", "password");
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			throw new SQLException(e);
		}
	}
}
