package com.bml.qa.util;

import java.sql.*;
public class databaseConnectUtil {
	
	private final String url = "jdbc:postgresql://ec2-54-225-70-53.compute-1.amazonaws.com:5432/d6ufttlsjj9n1?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
    private final String user = "nmnngnsqyjuwpe";
    private final String password = "92c2412f52f562bfefbd17d4a350b38850e56db15c28e540bffe660afd8cb3dc";
 
    /**
     * Connect to the PostgreSQL database
     * 
     * @return a Connection object
     */
    public Connection connectToDatabase() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
    
    
    /**
     * Get Database Table count by passing query string
     * @return 
     */
    public int dbTableCount(String query) {
        String SQL = query;
        int count = 0;
 
        try (Connection conn = connectToDatabase();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
 
        return count;
    }
    
    
    /**
     * Get Database Table column values by passing query string
     * @return 
     */
    public void getDbTableColValues(String query, String...columns) {
    	String colvalues=null; 
        String SQL = query;
 
        try (Connection conn = connectToDatabase();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
        	while (rs.next()) {
        	for(String col:columns) 
        		System.out.print(rs.getString(col) + " "); 
            System.out.println(); 
        	}
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    /**
     * Display Table column values by passing a query string
     *
     * @param rs
     * @throws SQLException
     */
    public void displayDbTableColValues(ResultSet rs, int...a) throws SQLException {
    	String colvalues=null;
    	
            System.out.println("Number of arguments: " + a.length); 
      
            // using for each loop to display contents of a 
            for (int i: a) 
                System.out.print(i + " "); 
            System.out.println(); 
        } 
       /* while (rs.next()) {
        	if(rs!=null) {
            	for(String col:columns) {
            	//System.out.println(rs.getString(col));
            		//colvalues=rs.getString(col);
            		//System.out.print(colvalues);
            		System.out.print(rs.getString(col) + " "); 
                    System.out.println(); 
            	}
            	//System.out.print("Outside For Loop ================================="+"\n"+colvalues);
            }
        //}*/
    
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	databaseConnectUtil psqlDb = new databaseConnectUtil();
    	psqlDb.connectToDatabase();
    	int usersCount= psqlDb.dbTableCount("SELECT count(*) FROM leads");
    	System.out.println(usersCount);
    	psqlDb.getDbTableColValues("select *from users where usertype=4","fname","lname");
    }
	
}