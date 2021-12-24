package gms.sda_ap.view;

import java.io.IOException;
import java.lang.reflect.Member;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import gms.sda_ap.member;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class member_menu2_Controller {


    private Stage stage;

    private ComboBox<String> c;

    public void BackPressed(ActionEvent e) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("member_menu_1.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void SelectPlan(ActionEvent e) throws IOException {

        Node node = (Node) e.getSource();
        stage = (Stage) node.getScene().getWindow();
        member user = (member) stage.getUserData();

        FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("member_select_plan.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setUserData(user);
        stage.setScene(scene);
        stage.show();

    }

    public void makePayment(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("member_payment.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }


    public void HireTrainer(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("HireTrainer.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }


    public void SelectSchedule(ActionEvent e) throws IOException {
        Node node = (Node) e.getSource();
        stage = (Stage) node.getScene().getWindow();
        member user = (member) stage.getUserData();

        FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("member_select_schedule.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setUserData(user);
        stage.setScene(scene);
        stage.show();

    }

    public void viewEquipment(ActionEvent e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("viewEquipment.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


}
