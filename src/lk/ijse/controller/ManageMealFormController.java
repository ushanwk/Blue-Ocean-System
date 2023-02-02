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

public class ManageMealFormController {

    public AnchorPane context;
    public TextField txtMealId;
    public TextField txtMealType1;
    public TextField txtMealType;

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(location + ".fxml"))));
    }
    public void btnBack(ActionEvent actionEvent) throws IOException {
        setUi("../view/AdminForm");
    }

    public void btnAdd(ActionEvent actionEvent) {
        txtMealId.clear();
        txtMealType.clear();
        txtMealType1.clear();

        Image image = new Image("lk/ijse/asset/checked.png");

        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text("Blue Ocean Hotel - Reception");
        notifications.title("Meal added Successfull");
        notifications.hideAfter(Duration.seconds(3));
        notifications.show();
    }

    public void btnSearch(ActionEvent actionEvent) {
    }

    public void btnDelete(ActionEvent actionEvent) {
        txtMealId.clear();
        txtMealType.clear();
        txtMealType1.clear();

        Image image = new Image("lk/ijse/asset/checked.png");

        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text("Blue Ocean Hotel - Reception");
        notifications.title("Meal deleted Successfull");
        notifications.hideAfter(Duration.seconds(3));
        notifications.show();
    }

    public void btnUpdate(ActionEvent actionEvent) {
        txtMealId.clear();
        txtMealType.clear();
        txtMealType1.clear();

        Image image = new Image("lk/ijse/asset/checked.png");

        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text("Blue Ocean Hotel - Reception");
        notifications.title("Meal updated Successfull");
        notifications.hideAfter(Duration.seconds(3));
        notifications.show();
    }
}
