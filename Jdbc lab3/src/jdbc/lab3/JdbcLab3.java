/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.lab3;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class JdbcLab3
{

    Connection conn=null;
    public static Connection connectDB() 
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/lab3","root","student");
        return (Connection) conn;
        }
    
       catch(ClassNotFoundException | SQLException | HeadlessException e)
        {
                JOptionPane.showMessageDialog(null, e);
                return null;
         }
    
        
    }
    
}
