package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionFormController {

    public AnchorPane context;

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(location + ".fxml"))));
    }

    public void btnBack(ActionEvent actionEvent) throws IOException {
        setUi("../view/LoginForm");
    }

    public void btnRoomReservation(ActionEvent actionEvent) throws IOException {
        setUi("../view/RoomReservationForm");
    }

    public void btnRoomMaintenance(ActionEvent actionEvent) throws IOException {
        setUi("../view/RoomMaintenanceForm");
    }
}
