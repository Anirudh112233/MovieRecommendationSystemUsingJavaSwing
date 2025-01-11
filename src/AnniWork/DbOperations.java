/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnniWork;

import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author alokk
 */
public class DbOperations {
    public static void setDataOrDelete(String Query,String msg){
        try {
            Connection con = null;
            con = Connect.ConnectToDB();  
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
