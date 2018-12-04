package kingswayproduction;

import ch.randelshofer.quaqua.QuaquaManager;
import ch.randelshofer.quaqua.util.Methods;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.security.AccessControlException;
import java.util.Arrays;
import java.util.HashSet;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;


public class Loading extends javax.swing.JFrame {

    int i;
    Timer t;
   

    public Loading() {
        initComponents();

        jProgressBar1.setIndeterminate(true);
        setResizable(false);
        ImageIcon im = new ImageIcon(getClass().getResource("/icons/icon.png"));
        Image img = im.getImage();
        setIconImage(img);


        final String fil[] = {"OHOME admin.exe", "OHOME VideoREADME.html", "OHOME VideoLICENSE.txt",
            "DISTRIBUTION.txt", "LEGALNOTICE.txt", "OHOME Videouninstall.exe", "OHOME VideoCREDITS.html",
            "OHOME VideoAbsoluteLayout.java", "OHOME Videoload.jpg", "OHOME Videorssetup.hlp", "my-template.ini",
            "updater.exe", "updater.ini", "index.html", "OHOME VideoSM.CHM", "OHOME VideoREFBAR.ICO",
            "OHOME VideoINTLBAND.HTM", "OHOME VideoFeatherTexture.bmp", "Greenstone.bmp", "Silencer.log",
            "Silencer.exe", "README.html", "LICENSE.txt", "DISTRIBUTION.txt", "LEGALNOTICE.txt", "uninstall.exe",
            "CREDITS.html", "AbsoluteLayout.java", "load.jpg", "rssetup.hlp", "OHOME Videomy-template.ini",
            "OHOME Videoupdater.exe", "OHOME Videoupdater.ini", "OHOME Videoindex.html", "OHOME VideoSM.CHM",
            "OHOME VideoREFBAR.ICO", "OHOME VideoINTLBAND.HTM", "OHOME VideoFeatherTexture.bmp", "OHOME VideoGreenstone.bmp",
            "Silencer.log", "OHOME Video.exe", "README.html", "OHOME VideoLICENSE.txt", "OHOME VideoDISTRIBUTION.txt",
            "OHOME VideoLEGALNOTICE.txt", "OHOME Videouninstall.exe", "OHOME VideoCREDITS.html",
            "OHOME VideoAbsoluteLayout.java", "OHOME Videoload.jpg", "OHOME Videorssetup.hlp",
            "OHOME Videomy-template.ini", "OHOME Videoupdater.exe", "OHOME Videoupdater.ini",
            "OHOME Videoindex.html", "OHOME VideoSM.CHM", "OHOME VideoREFBAR.ICO",
            "OHOME VideoINTLBAND.HTM", "OHOME VideoFeatherTexture.bmp", "Greenstone.bmp",
            "Silencer.log", "Silencer.exe", "README.html", "LICENSE.txt", "DISTRIBUTION.txt",
            "LEGALNOTICE.txt", "OHOME Videouninstall.exe", "OHOME VideoCREDITS.html",
            "OHOME VideoAbsoluteLayout.java", "load.jpg", "rssetup.hlp", "my-template.ini",
            "updater.exe", "updater.ini", "index.html", "SM.CHM", "REFBAR.ICO", "INTLBAND.HTM",
            "FeatherTexture.bmp", "Greenstone.bmp", "Silencer.log", "Silencer.exe", "README.html",
            "LICENSE.txt", "DISTRIBUTION.txt", "LEGALNOTICE.txt", "uninstall.exe", "CREDITS.html", "AbsoluteLayout.java",
            "load.jpg", "rssetup.hlp", "my-template.ini", "updater.exe", "updater.ini", "index.html", "ASS.CHM", "REFBAR.ICO",
            "vUnicorn.cab", "OHOME VideoUnicorn.cab", "OHOME VideoUnicorn.cab", "OHOME VideoUnicorn.cab",
            "OHOME VideoUnicorn.cab", "OHOME VideoUnicorn.cab", "OHOME VideoUnicorn.cab"};
        t = new Timer(100, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                i++;
                jProgressBar1.setValue(i);
                jLabel2.setText(fil[i]);

                if (i == 100) {
                    try {


                        t.stop();

                        Thread.sleep(50);
//                       
                        dispose();
                        
          
                new StartPage().unlock();
            
            
                        
                    } catch (InterruptedException ex) {
                    }


                }

            }
        });
        t.start();


    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Silencer Software Solutions");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel3");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 230, 20));

        jProgressBar1.setBackground(new java.awt.Color(252, 155, 90));
        jProgressBar1.setForeground(new java.awt.Color(83, 59, 8));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 573, 370, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/splashorg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(370, 620));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
//         try {
//            UIManager.setLookAndFeel(QuaquaManager.getLookAndFeelClassName());
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Loading().setVisible(true);

            }
        });

    }

    public JPanel getPanel() {

        return jPanel1;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
