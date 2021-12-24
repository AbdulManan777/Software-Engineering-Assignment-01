package gms.sda_ap.view;

import java.io.IOException;

import gms.sda_ap.gym;
import gms.sda_ap.incomplete_entry;
import gms.sda_ap.member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class memberLoginController {
	
	
	@FXML
    private TextField t1;
	
	@FXML
	private TextField t2;
	
	@FXML
	private Text t;

	private Stage stage;

	gms.sda_ap.gym gym = new gym();

	public void LoginPressed(ActionEvent e) throws IOException {


		try {
			if (t1.getText().equals("") || t2.getText().equals("")) {
				throw new incomplete_entry("Error");
			}
			else {

				member m = new member();
				m.setUsername(t1.getText());
				m.setPassword(t2.getText());

				boolean verification = gym.authenticateMember(m);

				if(!verification){

					t.setText("Incorrect Username or Password!");
				}
				else{
					FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("member_menu_2.fxml"));
					Parent root = fxmlLoader.load();
					Scene scene = new Scene(root);
					stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
					stage.setScene(scene);
					stage.show();
				}

			}
		}
		catch(incomplete_entry e1) {

			t.setText("Username and password cannot be empty");
		}
	}

	public void BackPressed(ActionEvent e) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(gms.sda_ap.App.class.getResource("member_menu_1.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();

	}
	

}
