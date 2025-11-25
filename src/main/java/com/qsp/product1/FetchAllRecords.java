package com.qsp.product1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllRecords {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/shop1";
		String user = "postgres";
		String password = "root";

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "SELECT * FROM  product1";

			Statement stm = con.createStatement();

			 ResultSet rs = stm.executeQuery(sql);
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 double cost = rs.getDouble(3);
				 
				 System.out.println("ID is : " + id);
				 System.out.println("NAME is : " + name);
				 System.out.println("COST is : " + cost);
				 
				 System.out.println("-----------------------------");
			 }
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
