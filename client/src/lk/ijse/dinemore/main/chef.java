package lk.ijse.dinemore.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class chef extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dinemore/view/Chef/Chef.fxml"));
        Scene root=new Scene(parent);
        primaryStage.setScene(root);
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
