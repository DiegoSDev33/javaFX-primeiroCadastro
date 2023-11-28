package Controller;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
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
		System.out.println("O nome foi deletado:" + nome.getText());
		
		valorDoNome.setText("Diego");
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
	
}
