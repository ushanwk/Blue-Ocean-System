package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import javax.management.Notification;
import java.awt.*;
import java.io.IOException;

public class LoginFormController {
    public AnchorPane context;
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnClose(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void btnLogin(ActionEvent actionEvent) throws IOException {
        if(txtUserName.getText() .equals("admin") && txtPassword.getText() .equals("1234")){

            setUi("../view/AdminForm");

            Image image = new Image("lk/ijse/asset/checked.png");

            Notifications notifications = Notifications.create();
            notifications.graphic(new ImageView(image));
            notifications.text("Blue Ocean Hotel - Admin");
            notifications.title("Login Successfull");
            notifications.hideAfter(Duration.seconds(3));
            notifications.show();

        } else if(txtUserName.getText() .equals("reception") && txtPassword.getText() .equals("1234")) {

            setUi("../view/ReceptionForm");

            Image image = new Image("lk/ijse/asset/checked.png");

            Notifications notifications = Notifications.create();
            notifications.graphic(new ImageView(image));
            notifications.text("Blue Ocean Hotel - Reception");
            notifications.title("Login Successfull");
            notifications.hideAfter(Duration.seconds(3));
            notifications.show();

        }else{

            new Alert(Alert.AlertType.WARNING,"Invalid userName or Password").show();
            txtUserName.clear();
            txtPassword.clear();

            Image image = new Image("lk/ijse/asset/cancel.png");

            Notifications notifications = Notifications.create();
            notifications.graphic(new ImageView(image));
            notifications.text("Blue Ocean Hotel");
            notifications.title("Login Unsuccessfull");
            notifications.hideAfter(Duration.seconds(3));
            notifications.show();

        }
    }

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(location + ".fxml"))));
    }

}
