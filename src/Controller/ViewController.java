package Controller;

import java.awt.Button;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ViewController {
	
	@FXML
	private Button apagarBtn;
	
	@FXML 
	private Text valorDoNome;
	@FXML 
	private Text valorDoEmail;
	@FXML 
	private Text valorDoTelefone;
	
	
	@FXML
	public void onBtnClick() {
		System.out.println("");
	}
	
	@FXML 
	public void onBtnSalvar() {
		System.out.println("O nome Digitado foi:" + nome.getText());
		
		valorDoNome.setText(nome.getText());
		valorDoEmail.setText(email.getText());
		valorDoTelefone.setText(telefone.getText());
	}
	
	@FXML
	private TextField nome;
	@FXML
	private TextField email;
	@FXML
	private TextField telefone;
	
	@FXML 
	public void onBtnApagar() {
		System.out.println("O nome foi deletado:" + nome.getText());
		
		valorDoNome.setText("Diego");
	}
	
	@FXML 
	public void onBtnSair() {
		System.out.println("O nome foi deletado:" + nome.getText());
		
		
	}
	
	
}
