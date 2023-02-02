package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.io.IOException;

public class RoomMaintenanceController {

    public AnchorPane context;
    public TextField btnDesc;

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(location + ".fxml"))));
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        setUi("../view/ReceptionForm");
    }

    public void btnClear(ActionEvent actionEvent) {
        btnDesc.clear();
    }

    public void btnAdd(ActionEvent actionEvent) {
        btnDesc.clear();
        Image image = new Image("lk/ijse/asset/checked.png");

        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text("Blue Ocean Hotel - Reception");
        notifications.title("Room Maintenance added Successfull");
        notifications.hideAfter(Duration.seconds(3));
        notifications.show();
    }
}
