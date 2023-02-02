package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.io.IOException;

public class RoomReservationFormController {

    public AnchorPane context;
    public TextField txtName;
    public TextField txtNic;
    public TextField txtEmail;
    public TextField txtTel;
    public TextField txtAddress;
    public ComboBox cmbRoomType;
    public ComboBox cmbMealPlan;
    public ComboBox cmbRoomNo;

    public void initialize(){
        cmbRoomNo.getItems().addAll("R1", "R2", "R3");
        cmbRoomType.getItems().addAll("Single Bed", "Double Bed", "Triple Bed");
        cmbMealPlan.getItems().addAll("Chinese", "Local", "Italian");
    }

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(location + ".fxml"))));
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        setUi("../view/ReceptionForm");
    }

    public void btnClear(ActionEvent actionEvent) {
        txtAddress.clear();
        txtEmail.clear();
        txtName.clear();
        txtTel.clear();
        txtNic.clear();
    }

    public void btnReserve(ActionEvent actionEvent) {
        txtAddress.clear();
        txtEmail.clear();
        txtName.clear();
        txtTel.clear();
        txtNic.clear();

        Image image = new Image("lk/ijse/asset/checked.png");

        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text("Blue Ocean Hotel - Reception");
        notifications.title("Room Reservation Successfull");
        notifications.hideAfter(Duration.seconds(3));
        notifications.show();
    }
}
