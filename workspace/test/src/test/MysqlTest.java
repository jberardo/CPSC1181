package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Joao Berardo 
 * Simple Hello World MySQL Tutorial on how to make JDBC connection, Add and Retrieve Data
 * 
 */
public class MysqlTest {
	static Connection conn = null;
	static PreparedStatement prepareStat = null;
	 
	public static void main(String[] argv) {
		try {
			log("-------- Initializing ------------");
			makeJDBCConnection();
	 
			log("\n---------- Adding data to DB ----------");
			addDataToDB("jab", "todO");
			addDataToDB("jab", "tod");
			addDataToDB("jab", "t");
	 
			log("\n---------- Let's get Data from DB ----------");
			getDataFromDB();
	 
			prepareStat.close();
			conn.close(); // connection close
	 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 
	private static void makeJDBCConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			log("Congrats - Seems your MySQL JDBC Driver Registered!");
		} catch (ClassNotFoundException e) {
			log("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
			e.printStackTrace();
			return;
		}
	 
		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
			conn = DriverManager.getConnection("jdbc:mysql://10.0.10.11:3306/joca_test", "jab", "k@j0c@!!");
			if (conn != null) {
				log("Connection Successful! Enjoy. Now it's time to push data");
			} else {
				log("Failed to make connection!");
			}
		} catch (SQLException e) {
			log("MySQL Connection Failed!");
			e.printStackTrace();
			return;
		}
	}
	 
	private static void addDataToDB(String userName, String todos) {
	 
		try {
			String insertQueryStatement = "INSERT  INTO  todo (user, todo)  VALUES  (?,?)";
	 
			// prepare insert SQL statement
			prepareStat = conn.prepareStatement(insertQueryStatement);
			prepareStat.setString(1, userName);
			prepareStat.setString(2, todos);
 
			// execute insert SQL statement
			prepareStat.executeUpdate();
			log(todos + " added successfully");
		} catch (
		SQLException e) {
			e.printStackTrace();
		}
	}
	 
	private static void getDataFromDB() {
	 
		try {
			// MySQL Select Query Tutorial
			String getQueryStatement = "SELECT * FROM todo";
	 
			prepareStat = conn.prepareStatement(getQueryStatement);
	 
			// Execute the Query, and get a java ResultSet
			ResultSet rs = prepareStat.executeQuery();
	 
			// Let's iterate through the java ResultSet
			while (rs.next()) {
				String userName = rs.getString("user");
				String todos = rs.getString("todo");
	 
				// Simply Print the results
				System.out.format("%s, %s\n", userName, todos);
			}
		} catch (
		SQLException e) {
			e.printStackTrace();
		}
	}
	 
	// Simple log utility
	private static void log(String string) {
		System.out.println(string);
	}
}