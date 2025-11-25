package com.qsp.product1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicQury {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/shop1";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO product1 VALUES(?,?,?)";

			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, 401);
			p.setString(2, "Google");
			p.setDouble(3, 40000);

			p.execute();
			System.out.println("Data is Inserted ");
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
