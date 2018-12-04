/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingswayproduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Silencer
 */
public class ReportJasper {

    public static void printInvoice(String filename, HashMap<String, Object> params) {
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(filename);
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql:///kingsway_production", "root", "123");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, con);
            JasperViewer.viewReport(jasperPrint, false);
           //JasperPrintManager.printReport(jasperPrint, false);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
