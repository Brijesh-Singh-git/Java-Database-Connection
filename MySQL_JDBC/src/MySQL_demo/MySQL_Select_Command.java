package MySQL_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_Select_Command {
	
	
public static void main(String[] args) throws SQLException {
		
		//1. Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		
		//2. Create Statement or Query
		Statement stmt = con.createStatement();
		
		String s = "SELECT ID, Name, CountryCode, District FROM City";
		
		
		//3,4 Execute statement/Query & Store data in resultset
		ResultSet rs = stmt.executeQuery(s);
		
		while (rs.next()) {
			int eid = rs.getInt("ID");
			String name = rs.getString("NAME");
			String code = rs.getString("CountryCode");
			String dist = rs.getNString("District");
			
			System.out.println(eid + "   " + name + "   " + code + "   " + dist);
		}
		
		//4.Close Connection 
		con.close();
		
		System.out.println("Query Executed Successfully!!!");
		
		
	}
}
