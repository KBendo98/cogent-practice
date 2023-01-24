package com.cogent.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BusinessLogic {
	public void create(int id, String name, String dept, float salary) {
		Connection conn = null;
		
		// Open the Connection
		try {
			conn=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", 
							"root", "BarHarbor4589.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found");
		}
		
		try {
			// Issue the query
			PreparedStatement pStatement = conn.prepareStatement("Insert into"
					+ " employee values(?, ?, ?, ?)");
			pStatement.setInt(1, id);
			pStatement.setString(2, name);
			pStatement.setString(3, dept);
			pStatement.setFloat(4, salary);
			
			// execute the query
			int x = pStatement.executeUpdate();
			
			if(x != 0) {
				System.out.println("Data inserted");
			}
			else {
				System.out.println("Query issue.");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			// Close the connection
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void read() {
		Connection conn = null;
		
		// Open the Connection
		try {
			conn=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", 
							"root", "BarHarbor4589.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found");
		}
		
		try {
			// Issue the query
			PreparedStatement pStatement = conn.prepareStatement("Select * from"
					+ " employee");
			
			// execute the query, save in result set
			ResultSet rSet = pStatement.executeQuery();
			
			while(rSet.next()) {
				System.out.println(rSet.getInt(1) + ", " + rSet.getString(2) + 
						", " + rSet.getString(3) + ", " + rSet.getFloat(4));
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			// Close the connection
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void update(int id, String name, String dept, float salary) {
		Connection conn = null;
		
		// Open the Connection
		try {
			conn=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", 
							"root", "BarHarbor4589.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found");
		}
		
		try {
			// Issue the query
			PreparedStatement pStatement = conn.prepareStatement("Update employee"
					+ " set name = ?, dept = ?, salary = ? where id = ?");
			pStatement.setString(1, name);
			pStatement.setString(2, dept);
			pStatement.setFloat(3, salary);
			pStatement.setInt(4, id);
			
			// execute the query
			int x = pStatement.executeUpdate();
			
			if(x != 0) {
				System.out.println("Row with id: " + id + " has been updated.");
			}
			else {
				System.out.println("Query issue.");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			// Close the connection
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void delete(int id) {
		Connection conn = null;
		
		// Open the Connection
		try {
			conn=DriverManager
					.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", 
							"root", "BarHarbor4589.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " not found");
		}
		
		try {
			// Issue the query
			PreparedStatement pStatement = conn.prepareStatement("Delete from"
					+ " employee where id = ?");
			pStatement.setInt(1, id);
			
			// execute the query
			int x = pStatement.executeUpdate();
			
			if(x != 0) {
				System.out.println("Row with id " + id + " has been deleted");
			}
			else {
				System.out.println("Query issue.");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			// Close the connection
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
