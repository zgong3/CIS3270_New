package mySQL_Connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;
public class Connector {
	

		public static void main (String [] args) throws SQLException, ClassNotFoundException{
		Connection con = null;
		
			try {	
				Class.forName("com.mysql.jdbc.Driver");
				
				con = (Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CIS3270", "root", "549688");
				PreparedStatement ps =con.prepareStatement("Select * from Customer where SSN ='123'");
				ResultSet rs = ps.executeQuery();
				

		}
		
		catch (SQLException e) {
			System.out.println("Not connected");
			throw e;
			
		}
			
			
			if (con != null){
				System.out.println("Connected successfully");
			}
		}
	}



