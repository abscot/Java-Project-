/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluestar_crm;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author abigail.cotterill
 */
public class db {
    
        public static Connection Connect() {
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\abigail.cotterill\\OneDrive - Accenture\\Documents\\College\\bluestar_db.db");
            System.out.println("Connected to database");
            return conn;
            
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        
    }
}

