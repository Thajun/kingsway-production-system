/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingswayproduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

 
public class StartPage {
Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
   
    
    void unlock(){
    
       con=DBConnect.ConnectDb();
   /* String sql ="select * from lock where key=?";
        try{
        pst = con.prepareStatement(sql);
        pst.setString(1,"1");
       */
      String sql ="select DES_DECRYPT(Password) from login ";
        try{
        pst = con.prepareStatement(sql);
        
        
        rs = pst.executeQuery();
         
        
         while (rs.next()) {
                String s = rs.getString("DES_DECRYPT(Password)");
                
           
        if(s.equals("jyg64fbihgfigr68fgiuebc8")){  
          
            
              new Lock(null, true).setVisible(true);
            
        }else{
        
             new Login().setVisible(true);
      
            
        }
        
            }

        
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
        
        }
        
        
    
   
      
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
          /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().unlock();
            }
        });
      
       
        
    }
    
}
