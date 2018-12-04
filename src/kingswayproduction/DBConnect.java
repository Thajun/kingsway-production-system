
package kingswayproduction;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.*;
import javax.swing.*;


public class DBConnect {

   Connection con = null;
   public static Connection ConnectDb(){
      
       /*
       try{
           
         Class.forName("org.sqlite.JDBC");
         Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ilham\\Desktop\\a.sql");
         
         return con;  
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           
           return null;
       }
       
      */
       
       
      
	  
       
       try{
             InetAddress addr = InetAddress.getByName("localhost");
String host = addr.getHostAddress();
           Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://"+host+"/kingsway_production?zeroDateTimeBehavior=convertToNull","root","123");
         return con;  
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           
           return null;
       }
       
       
      
   }
       
}
