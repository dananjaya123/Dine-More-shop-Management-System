package lk.ijse.dinemore.Controller.Admin;

import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.IOException;

public class AdminController {

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private ImageView imageDashboard;

    @FXML
    private JFXButton btnOders;

    @FXML
    private ImageView imageCustomer;

    @FXML
    private JFXButton btnEmploye;

    @FXML
    private ImageView imageEmploye;

    @FXML
    private JFXButton btnItems;

    @FXML
    private ImageView imageItems;

    @FXML
    private JFXButton btnReport;

    @FXML
    private ImageView imageReport;

    @FXML
    private AnchorPane pnlMan;


    public void initialize(){
        setTooltips();

        AnchorPane pane= null;
        try {
            pane = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/Admin/Dashbord.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pnlMan.getChildren().setAll(pane);
    }

    private void setTooltips() {
        Tooltip dashboard = new Tooltip();
        dashboard.setText("Click to load Dash Board");
        btnDashboard.setTooltip(dashboard);

        Tooltip oders = new Tooltip();
        oders.setText("Click to load Manage Oder");
        btnOders.setTooltip(oders);

        Tooltip employe = new Tooltip();
        employe.setText("Click to load Manage Employ");
        btnEmploye.setTooltip(employe);

        Tooltip item = new Tooltip();
        item.setText("Click to load manage item");
        btnItems.setTooltip(item);

        Tooltip report = new Tooltip();
        report.setText("Click to load Report");
        btnReport.setTooltip(report);


    }

    @FXML
    void imageDashboardEntered(MouseEvent event) {


    }

    @FXML
    void imageDashboardExited(MouseEvent event) {

    }

    @FXML
    void mouseClickedDashboard(MouseEvent event) {
        AnchorPane pane= null;
        try {
            pane = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/Admin/Dashbord.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pnlMan.getChildren().setAll(pane);

    }

    @FXML
    void mouseClickedEmploye(MouseEvent event)throws IOException {
        AnchorPane pane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/Admin/Employe.fxml"));
        pnlMan.getChildren().setAll(pane);
    }

    @FXML
    void mouseClickedItem(MouseEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("/lk/ijse/dinemore/view/Admin/Item.fxml"));
        popup.modalset(parent, event);

    }

    @FXML
    void mouseClickedOders(MouseEvent event)throws IOException {
        AnchorPane pane= FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/Admin/Oder.fxml"));
        pnlMan.getChildren().setAll(pane);

    }

    @FXML
    void mouseClickedReport(MouseEvent event)throws IOException {
        AnchorPane pane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/Admin/Report.fxml"));
        pnlMan.getChildren().setAll(pane);
    }


    public static class popup {


        public  static void modalset(Parent modalWindow, MouseEvent event) throws IOException {
            Window theStage = ((Node) event.getSource()).getScene().getWindow();
            FadeTransition ft = new FadeTransition(Duration.millis(500), modalWindow);
            ft.setFromValue(0.0);
            ft.setToValue(1.0);
            ft.play();
            Stage dialog = new Stage();
            Scene scene = new Scene(modalWindow);

            dialog.setScene(scene);
            dialog.initOwner(theStage);
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.centerOnScreen();
            dialog.showAndWait();
        }


    }


}
