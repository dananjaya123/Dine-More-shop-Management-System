package lk.ijse.dinemore.Controller.Admin;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lk.ijse.dinemore.DB.DBConnection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;

public class ReportController {

    @FXML
    void DallyChefActin(ActionEvent event) {
        InputStream inputStream =getClass().getResourceAsStream("/lk/ijse/dinemore/Report/view chef.jasper");
        HashMap map=new HashMap();
        try {
            JasperPrint jasperPrint = null;
            try {
                jasperPrint = JasperFillManager.fillReport(inputStream,map, DBConnection.getInstance().getConnection());
            } catch (JRException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JasperViewer.viewReport(jasperPrint);
        }catch (Exception e){

        }
    }

    @FXML
    void DallyCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void DellyReceptionAction(ActionEvent event) {
        InputStream inputStream =getClass().getResourceAsStream("/lk/ijse/dinemore/Report/view Reception.jasper");
        HashMap map=new HashMap();
        try {
            JasperPrint jasperPrint = null;
            try {
                jasperPrint = JasperFillManager.fillReport(inputStream,map, DBConnection.getInstance().getConnection());
            } catch (JRException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JasperViewer.viewReport(jasperPrint);
        }catch (Exception e){

        }

    }

    @FXML
    void dellyDeliverOnAction(ActionEvent event) {
        InputStream inputStream =getClass().getResourceAsStream("/lk/ijse/dinemore/Report/ Deliver.jasper");
        HashMap map=new HashMap();
        try {
            JasperPrint jasperPrint = null;
            try {
                jasperPrint = JasperFillManager.fillReport(inputStream,map, DBConnection.getInstance().getConnection());
            } catch (JRException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JasperViewer.viewReport(jasperPrint);
        }catch (Exception e){

        }

    }

    @FXML
    void foodManuOnAction(ActionEvent event) {
        InputStream inputStream = getClass().getResourceAsStream("/lk/ijse/dinemore/Report/view Food.jasper");
        HashMap map = new HashMap();
        try {
            JasperPrint jasperPrint = null;
            try {
                jasperPrint = JasperFillManager.fillReport(inputStream, map, DBConnection.getInstance().getConnection());
            } catch (JRException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JasperViewer.viewReport(jasperPrint);
        } catch (Exception e) {

        }
    }
}
