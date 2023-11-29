package Controller;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Cliente;

public class ViewController implements Initializable{
	
	@FXML
	private Button apagarBtn;
	
	@FXML 
	private Text valorDoNome;
	@FXML 
	private Text valorDoEmail;
	@FXML 
	private Text valorDoTelefone;
	
	
	
	private ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();
	
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
		
		Cliente c = new Cliente();
		
		c.setNome(nome.getText());
		c.setEmail(email.getText());
		c.setTelefone(telefone.getText());
		
		listaClientes.add(c);
		tabelaClientes.setItems(listaClientes);
		tabelaClientes.refresh();;
	}
	
	@FXML
	private TextField nome;
	@FXML
	private TextField email;
	@FXML
	private TextField telefone;
	
	@FXML 
	public void onBtnApagar() {
		try {
			Cliente selectedCliente = tabelaClientes.getSelectionModel().getSelectedItem();

			listaClientes.remove(selectedCliente);

			tabelaClientes.setItems(listaClientes);
			tabelaClientes.refresh();

		} catch (Exception e) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro!");
			alert.setContentText("Acredito que não tenha dados na tabela...");
			alert.show();
		}
	}
	
	@FXML 
	public void onBtnSair() {
		System.out.println("O nome foi deletado:" + nome.getText());
		
		
	}
	@FXML
	TableView<Cliente> tabelaClientes;
	
	
	@FXML
	private TableColumn<Cliente, String> colunaNome;
	
	@FXML
	private TableColumn<Cliente, String> colunaEmail;
	
	@FXML
	private TableColumn<Cliente, String> colunaTelefone;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		colunaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		colunaTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		
			
	}
	
	@FXML
	public void nextScreen() throws IOException {
		// Criar uma Stage
		Stage stage = new Stage();
		//criar um parent
		Parent parent = FXMLLoader.load(getClass().getResource("/views/Login.fxml"));
		//pegar a Scene
		Scene scene = new Scene(parent);
		// set stage
		stage.setScene(scene);
		//mostra
		stage.show();
		
		
		
	}
	
}
