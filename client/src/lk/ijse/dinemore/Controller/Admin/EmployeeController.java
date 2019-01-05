package lk.ijse.dinemore.Controller.Admin;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.dto.DeliverDTO;
import lk.ijse.dinemore.dto.ReceptionDTO;
import lk.ijse.dinemore.prooxy.ProxyHandler;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.custom.ChefSerive;
import lk.ijse.dinemore.service.custom.DeliverService;
import lk.ijse.dinemore.service.custom.ReceptionService;

import java.net.URL;

import java.util.ResourceBundle;

public class EmployeeController implements Initializable {

    @FXML
    private AnchorPane pnlMan;

    @FXML
    private JFXTextField textChefName;

    @FXML
    private JFXTextField textChefAddress;

    @FXML
    private JFXTextField textChefPhoneNum;

    @FXML
    private JFXTextField textChefID;

    @FXML
    private JFXButton btnChefSave;

    @FXML
    private JFXButton btnChefDelete;

    @FXML
    private JFXButton btnChefEdit;

    @FXML
    private JFXTextField textChefNIC;

    @FXML
    private JFXTextField textChefPasword;

    @FXML
    private JFXTextField textChefConfirmPasword;

    @FXML
    private JFXButton btnDeliverSave;

    @FXML
    private JFXButton btnDeliverDelete;

    @FXML
    private JFXButton btnDeliverEdit;

    @FXML
    private JFXTextField textDID;

    @FXML
    private JFXTextField textDeliverName;

    @FXML
    private JFXTextField textDeliverAddress;

    @FXML
    private JFXTextField textDeliverPhoneNum;

    @FXML
    private JFXTextField textDeliverNic;

    @FXML
    private JFXTextField textDeliverPasword;

    @FXML
    private JFXTextField textDeliverConfirmPw;

    @FXML
    private JFXButton btnReceptionSave;

    @FXML
    private JFXButton btnReceptionDelete;

    @FXML
    private JFXButton btnReceptionEdit;

    @FXML
    private JFXTextField textRID;

    @FXML
    private JFXTextField textReceptionName;

    @FXML
    private JFXTextField textReceptionAddress;

    @FXML
    private JFXTextField textReceptionPhoneNum;

    @FXML
    private JFXTextField textReceptionNIC;

    @FXML
    private JFXTextField textReceptionPw;

    @FXML
    private JFXTextField textReceptionConfirmPw;

    @FXML
    private TableView<ChefDTO> tblChef;

    @FXML
    private TableColumn<ChefDTO, String> colChefID;

    @FXML
    private TableColumn<ChefDTO, String> colChefName;

    @FXML
    private TableColumn<ChefDTO, String> colChefPaswoed;

    @FXML
    private TableView<DeliverDTO> tblDeliver;

    @FXML
    private TableColumn<DeliverDTO, String> colDID;

    @FXML
    private TableColumn<DeliverDTO, String> colDeliverName;

    @FXML
    private TableColumn<DeliverDTO, String> colDeliverPw;

    @FXML
    private TableView<ReceptionDTO> tblReception;

    @FXML
    private TableColumn<ReceptionDTO, String> colRID;

    @FXML
    private TableColumn<ReceptionDTO, String> colReceptionName;

    @FXML
    private TableColumn<ReceptionDTO, String> colReceptinPW;


    private  ChefSerive chefSerive;
    private DeliverService deliverService;
    private ReceptionService receptionService;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            chefSerive= (ChefSerive) ProxyHandler.getInstance().getSarvice(ServiceFactory.SaviceType.CHEF);
            deliverService=(DeliverService)ProxyHandler.getInstance().getSarvice(ServiceFactory.SaviceType.DELIVER);
            receptionService=(ReceptionService)ProxyHandler.getInstance().getSarvice(ServiceFactory.SaviceType.RECEPTION);

//
            System.out.println(chefSerive);
            System.out.println(deliverService);
            System.out.println(receptionService);


            loadChef(); //chef getAll method
            loadDeliver();//deliver getAll method
            loadReception();//reception getall

        } catch (Exception e) {

            e.printStackTrace();
        }

 }

    private void loadReception() {
        tblReception.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("ReceptionID"));
        tblReception.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblReception.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("nic"));

        try {
            tblReception.setItems(FXCollections.observableArrayList(receptionService.getAll()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadDeliver() {
        tblDeliver.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("DeliverID"));
        tblDeliver.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblDeliver.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("nic"));

        try {
            tblDeliver.setItems(FXCollections.observableArrayList(deliverService.getAllDeliver()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadChef() {
        tblChef.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("chefID"));
        tblChef.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblChef.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("nic"));

        try {
            tblChef.setItems(FXCollections.observableArrayList(chefSerive.getAllChef()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    @FXML
    void btnDeliverDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeliverEditOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeliverSaveOnAction(ActionEvent event){

        DeliverDTO deliverDTO=new DeliverDTO(textDID.getText(),textDeliverNic.getText(),textDeliverName.getText(),textDeliverAddress.getText(),textDeliverPhoneNum.getText());

        try {
          boolean  a = deliverService.addDeliver(deliverDTO);

            if (a){
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Added Success", ButtonType.OK);
                alert.showAndWait();


               deliverClearText();
                loadDeliver();


            }else {
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Failed to Add Deliver", ButtonType.OK);
                alert.showAndWait();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    private void deliverClearText() {
        textDID.clear();
        textDeliverNic.clear();
        textDeliverName.clear();
        textDeliverAddress.clear();
        textDeliverPhoneNum.clear();

    }


    @FXML
    void btnReceptionDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnReceptionEditOnAction(ActionEvent event) {

    }

    @FXML
    void btnReceptionSaveOnAction(ActionEvent event) {

        ReceptionDTO receptionDTO=new ReceptionDTO(textRID.getText(),textReceptionNIC.getText(),textReceptionName.getText(),textReceptionAddress.getText(),textReceptionPhoneNum.getText());
        try {
            boolean b= receptionService.add(receptionDTO);

            if (b){

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Added Success.", ButtonType.OK);
                alert.showAndWait();

                receptionClereText();
                loadReception();

            }else {
                System.out.println(b);

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Failed to Add Deliver", ButtonType.OK);
                alert.showAndWait();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void receptionClereText() {
        textRID.clear();
        textReceptionNIC.clear();
        textReceptionName.clear();
        textReceptionAddress.clear();
        textReceptionPhoneNum.clear();
    }

    @FXML
    void btnchefDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnchefEditOnAction(ActionEvent event) {

    }

    @FXML
    void btnchefSaveOnAction(ActionEvent event) {
        ChefDTO chefDTO=new ChefDTO(textChefID.getText(),textChefNIC.getText(),textChefName.getText(),textChefAddress.getText(),textChefPhoneNum.getText());

        try {
            boolean   b = chefSerive.addChef(chefDTO);

            if (b==true){
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION," Added Success", ButtonType.OK);
                alert.showAndWait();

                ChefClereText();
                loadChef();


            }else {
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Failed to Add Deliver", ButtonType.OK);
                alert.showAndWait();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void ChefClereText() {
        textChefID.clear();
        textChefNIC.clear();
        textChefName.clear();
        textChefAddress.clear();
        textChefPhoneNum.clear();
    }

    @FXML
    void chefAddressOnAction(ActionEvent event) {

    }


    @FXML
    void chefIDOnAction(ActionEvent event) {

    }

    @FXML
    void chefNameOnAction(ActionEvent event) {

    }

    @FXML
    void chefNicOnAction(ActionEvent event) {

    }


    @FXML
    void chefPhoneNumberOnAction(ActionEvent event) {

    }

    @FXML
    void deliverAddressOnAction(ActionEvent event) {

    }

    @FXML
    void deliverNameOnAction(ActionEvent event) {

    }

    @FXML
    void deliverNicOnAction(ActionEvent event) {

    }


    @FXML
    void deliverPhoneNumOnAction(ActionEvent event) {

    }

    @FXML
    void didOnAction(ActionEvent event) {

    }

    @FXML
    void receptionAddress(ActionEvent event) {

    }


    @FXML
    void receptionNIC(ActionEvent event) {

    }

    @FXML
    void receptionName(ActionEvent event) {

    }

    @FXML
    void receptionPhoneNum(ActionEvent event) {

    }


    @FXML
    void ridOnAction(ActionEvent event) {

    }


}
