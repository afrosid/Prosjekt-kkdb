/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Sidney
 */
public class MySQLConnect {
    Connection conn = null;
    public static Connection ConnectDB() {
     
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/kkdb","root","root");
        //JOptionPane.showMessageDialog(null,"Connection to MySQL Database established.");
        return conn;    
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        
        }
    }
    
}
