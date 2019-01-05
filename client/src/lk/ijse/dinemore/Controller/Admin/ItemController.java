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
import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.prooxy.ProxyHandler;
import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.custom.ItemService;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    @FXML
    private AnchorPane pnlAddItem;

    @FXML
    private JFXTextField textItemCode;

    @FXML
    private JFXTextField textItemPrice;

    @FXML
    private JFXTextField textItemName;

    @FXML
    private JFXButton btnItemAdd;
    @FXML
    private TableView<ItemDTO> tblItem;

    @FXML
    private TableColumn<ItemDTO, String> colItemCode;

    @FXML
    private TableColumn<ItemDTO, String> ColItemName;

    @FXML
    private TableColumn<ItemDTO, String> colItemDiscription;

    @FXML
    private TableColumn<ItemDTO, String> ColPrice;


    @FXML
    private JFXTextField textItemDiscription;

    private ItemService itemService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            itemService=(ItemService) ProxyHandler.getInstance().getSarvice(ServiceFactory.SaviceType.ITEM);
            System.out.println(itemService);

            loadItem();

            System.out.println(itemService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadItem() {
        tblItem.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("ItemID"));
        tblItem.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("item_Name"));
        tblItem.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("item_Discription"));
        tblItem.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("item_Price"));

        try {
            tblItem.setItems(FXCollections.observableArrayList(itemService.getAll()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnItemAddOnAction(ActionEvent event) {
        ItemDTO itemDTO=new ItemDTO(textItemCode.getText(),textItemName.getText(),textItemDiscription.getText(),Integer.parseInt(textItemPrice.getText()));
        try {
            boolean b= itemService.add(itemDTO);

            if (b==true){
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Added Success ", ButtonType.OK);
                alert.showAndWait();
                IremClear();
                loadItem();


            }else {

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Failed to Add Deliver", ButtonType.OK);
                alert.showAndWait();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void IremClear() {
        textItemCode.clear();
        textItemName.clear();
        textItemDiscription.clear();
        textItemPrice.clear();
    }

    @FXML
    void btnItemDeleteOnActon(ActionEvent event) {

    }

    @FXML
    void btnItemEditOnAction(ActionEvent event) {

    }

    @FXML
    void textItemCodeOnAction(ActionEvent event) {

    }

    @FXML
    void textItemDiscriptionOnAction(ActionEvent event) {

    }

    @FXML
    void textItemNameOnAction(ActionEvent event) {

    }

    @FXML
    void textItemPriceOnAction(ActionEvent event) {

    }


}
