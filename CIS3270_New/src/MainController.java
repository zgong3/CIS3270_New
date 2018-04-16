package application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
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

public void Login(ActionEvent event) throws Exception{
	if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")) {
		lbWelcome.setText("Login Success");
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	else {
		lbWelcome.setText("Login Failed");
	}
}
}
