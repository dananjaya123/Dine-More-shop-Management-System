package lk.ijse.dinemore.Controller.Reception;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import lk.ijse.dinemore.dto.*;
import lk.ijse.dinemore.prooxy.ProxyHandler;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.custom.CustomerSerive;
import lk.ijse.dinemore.service.custom.ItemService;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class ReceptionOderController implements Initializable {

    @FXML
    private TextField textSearch;

    @FXML
    private Label btnSearch;
    @FXML
    private TextField textStatus;

    @FXML
    private JFXTextField textCustomerName;

    @FXML
    private JFXTextField textCustomerAddress;

    @FXML
    private JFXTextField textCustomerPhoneNum;

    @FXML
    private JFXTextField textDate;

    @FXML
    private JFXTextField textCustomweNIC;

    @FXML
    private JFXTextField textCustomerID;

    @FXML
    private JFXTextField textItemCode;

    @FXML
    private JFXTextField textDescription;

    @FXML
    private JFXTextField textItemPrice;


    @FXML
    private JFXComboBox<String> comboItemName;

    @FXML
    private JFXTextField textQTY;

    @FXML
    private JFXButton btnItemAdd;

    @FXML
    private JFXComboBox<String> comboItemDescription;

    @FXML
    private TextField textAmount;

    @FXML
    private TableView<?> tableOder;

    @FXML
    private TableColumn<?, ?> colNic;

    @FXML
    private TableColumn<?, ?> colCustName;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colPhoneNum;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colItemName;

    @FXML
    private TableColumn<?, ?> colItemDescription;

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private TableView<SelectItemDTO> tblitem;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSave;

    @FXML
    private TextField textFullAmount;

    @FXML
    private JFXTextField textOID;

    @FXML
    private Label lblDate;

    @FXML
    private Label lablTime;

    @FXML
    private JFXTextField textRID;
    double tot=0;


    private ItemService itemService;
    private CustomerSerive customerSerive;

    public ReceptionOderController() throws Exception {
        itemService= (ItemService) ProxyHandler.getInstance().getSarvice(ServiceFactory.SaviceType.ITEM);
        customerSerive=(CustomerSerive)ProxyHandler.getInstance().getSarvice(ServiceFactory.SaviceType.CUSTOMER);
    }


    @FXML
    void amountOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        try {

            loadCombo();
            Date();
            Time();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void loadCombo() throws Exception {
        List<ItemDTO> item = itemService.getAll();
        ArrayList<String>strings=new ArrayList<>();


        for (ItemDTO itemDTO:item){
            strings.add(itemDTO.getItem_Name());

        }
        for (String s:strings){
            comboItemName.getItems().add(s);
        }

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnItemAddOnAction(ActionEvent event) {

        SelectItemDTO selectItemDTO=new SelectItemDTO(textItemCode.getText(),comboItemName.getSelectionModel().getSelectedItem(),textDescription.getText(),Integer.parseInt(textQTY.getText()),Double.parseDouble(textItemPrice.getText()));

            tblitem.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("ItemID"));
            tblitem.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("item_Name"));
            tblitem.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("item_Discription"));
            tblitem.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("Qty"));
            tblitem.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("item_Price"));

        tblitem.getItems().addAll(selectItemDTO);
        double amount=Double.parseDouble(textItemPrice.getText())*Integer.parseInt(textQTY.getText());
        tot+=amount;
        textFullAmount.setText(tot+"");

    }

    String psymentStatus="Pending";
    String status="pending";
    String chefId="0000";
    String deliwerID="0000";
    String receptionID="0000";


    @FXML
    void btnSaveOnAtion(ActionEvent event) {
        CustomerDTO customerDTO=new CustomerDTO(textCustomerID.getText(),textCustomweNIC.getText(),textCustomerName.getText(),textCustomerAddress.getText(),textCustomerPhoneNum.getText());
//        OderDTO oderDTO=new OderDTO(textOID.getText(),lablTime.getText(),lblDate.getText(),psymentStatus, Double.parseDouble(textFullAmount.getText()) ,Integer.parseInt(textQTY.getText()) ,textStatus.getText(),status,textCustomerID.getText(),deliwerID,receptionID);
//        OderDetailsDTO oderDetailsDTO=new OderDetailsDTO(textOID.getText(),Double.parseDouble(textFullAmount.getText()),Integer.parseInt(textQTY.getText()),textItemCode.getText());
//        CommonDTO commonDTO=new CommonDTO(customerDTO,oderDTO,oderDetailsDTO);

       // boolean isAdded=


        //CustomerDTO customerDTO=new CustomerDTO(textCustomerID.getText(),textCustomweNIC.getText(),textCustomerName.getText(),textCustomerAddress.getText(),textCustomerPhoneNum.getText());
        try {
            boolean b = customerSerive.add(customerDTO);
            if (b){
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Added Success", ButtonType.OK);
                alert.showAndWait();
            }else {
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Failed to Add Deliver", ButtonType.OK);
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void btnSearchOnAction(MouseEvent event) {


    }

    @FXML
    void btnUbdateOnAction(ActionEvent event) {

    }

    @FXML
    void comboItemDescriptionOnAction(ActionEvent event) {

    }

    @FXML
    void comboItemNameOnActon(ActionEvent event) {
        String id=comboItemName.getSelectionModel().getSelectedItem();
        try {
            List<ItemDTO> all = itemService.getAll();
            for (ItemDTO itemDTO:all){
                if(id.equalsIgnoreCase(itemDTO.getItem_Name())){
                    textItemCode.setText(itemDTO.getItemID());
                    textDescription.setText(itemDTO.getItem_Discription());
                    textItemPrice.setText(itemDTO.getItem_Price()+"");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void customerAddressOnAction(ActionEvent event) {

    }

    @FXML
    void customerNameOnAction(ActionEvent event) {

    }

    @FXML
    void customerPhoneNum(ActionEvent event) {

    }

    @FXML
    void customweNICOnAction(ActionEvent event) {

    }

    @FXML
    void dateOnAction(ActionEvent event) {

    }

    @FXML
    void itemCodeOnAction(ActionEvent event) {

    }

    @FXML
    void itemPricrOnAction(ActionEvent event) {

    }

    @FXML
    void qtyOnAction(ActionEvent event) {

    }

    @FXML
    void ridOnAction(ActionEvent event) {

    }

    @FXML
    void searchOnActon(ActionEvent event) {

    }


    public void statusOnAction(ActionEvent actionEvent) {
    }

    public void customerIDOnAction(ActionEvent actionEvent) {
    }

    public void DescriptionOnAction(ActionEvent actionEvent) {
    }

    public void fullAmount(ActionEvent actionEvent) {
    }

    public void OidOnAction(ActionEvent actionEvent) {
    }

    private void Date() {
        Timeline time = new Timeline(new KeyFrame(Duration.seconds(0), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lblDate.setText(new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
            }
        }), new KeyFrame(Duration.seconds(1)));
        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }

    private void Time() {
        Timeline time = new Timeline(new KeyFrame(Duration.seconds(0), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lablTime.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }), new KeyFrame(Duration.seconds(1)));
        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }
}



//