package Controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	
	
	
	@FXML
	private TextField passwordField;
	
	
	@FXML
	public void loadNextScreen() throws IOException {
		
		Stage priorScreen = (Stage)this.passwordField.getScene().getWindow();
		priorScreen.close();
		
		
		// Criar uma Stage
		Stage stage = new Stage();
		//criar um parent
		Parent parent = FXMLLoader.load(getClass().getResource("/views/Cadastro.fxml"));
		//pegar a Scene
		Scene scene = new Scene(parent);
		// set stage
		stage.setScene(scene);
		//mostra
		stage.show();
		
		
		
	}
	

	
	
	
	
}
