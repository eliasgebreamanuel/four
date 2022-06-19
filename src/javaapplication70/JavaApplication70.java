/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication70;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaApplication70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        conncerdb();
    }
   public static Connection conncerdb(){
        Connection conn = null;

          try{
        Class.forName("com.mysql.jdbc.Driver");
        //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\HP\\Desktop\\BLLOD DONATION SQL.sql");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost/blood_bank","sa","123");

        JOptionPane.showMessageDialog(null,"Connection Established");
        return conn;
        }
        catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
        return null;
        }
        }   
}
