

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class MainController {
	@FXML
	private Label lbWelcome;

	@FXML
	private TextField txtUsername;

	@FXML
	private TextField txtPassword;

	@FXML
	private Button bttnMember;

	@FXML
	private TextField txtFirstName;

	@FXML
	private TextField txtPassword2;

	@FXML
	private TextField txtCPassword;

	@FXML
	private MenuButton bttnSecurityQ;

	@FXML
	private Button bttnRegister;

	
	@FXML
	private TextField txtSSN;
	
	Stage window;

	Scene scene1, scene2;
	
	
	String comma="";
	 

	/*
	 * Login method that gets userName and password
	 * 
	 * if(userName = user and password = pass) go to /application/Main.fxml
	 * 
	 * if not print out login failed
	 * 
	 */
	public void Login(ActionEvent event) throws Exception {

		if (txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin")) {

			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root, 500, 500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} else {
			lbWelcome.setText("Login Failed");
		}

	}

	/*
	 * Register method that loads to the register.fxml scene on the click of
	 * "Not a member?"
	 * 
	 */
	public void Register(ActionEvent event) throws Exception {

		Stage primaryStage = new Stage();

		Parent root = FXMLLoader.load(getClass().getResource("/application/Register.fxml"));
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/*
	 * A method that registers a new member on action of passwords matching
	 *
	 */
	public void RegisterSuccess(ActionEvent event) throws Exception {

		Stage primaryStage = new Stage();
		try {
			String m = txtCPassword.getText();
			if (txtPassword2.getText().equals(m)) {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
				Scene scene = new Scene(root, 400, 400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			else if (txtPassword2.getText().equals(null) || txtPassword2.getText().equals(null)) {
				bttnRegister.setText("All input not recieved");
			}
				
			
			else
				bttnRegister.setText("Passwords dont match");
		} catch (Exception e) {
			bttnRegister.setText("Failed");
		}

	}

	public void SecurityQuestion(ActionEvent event) throws Exception {
		Stage primaryStage = new Stage();
		window = primaryStage;

		Parent root = new BorderPane();
		
		Menu securityQuestion = new Menu("Security Question");
		securityQuestion.getItems().add(new MenuItem("What is your mothers maiden name?"));
		
		
		
		
		
		Scene scene = new Scene(root, 400, 400);

		window.setScene(scene);
		window.show();
	}
}
