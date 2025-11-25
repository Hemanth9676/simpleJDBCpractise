package com.qsp.product1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveData {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/shop1";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO product1 VALUES(301,'Realme',56700)";

			Statement stm = con.createStatement();

			stm.execute(sql);

			con.close();
			
			System.out.println("Data is Stored");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
