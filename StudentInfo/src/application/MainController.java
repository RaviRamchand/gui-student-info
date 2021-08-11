package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	//Controllers 	
	@FXML private TextField _txtName;
	@FXML private TextField _txtAdd; 
	@FXML private TextField _textGpa;
	
	@FXML private Button _btnAdd;
	@FXML private Button _btnSort;
	@FXML private Button _btnDis;
	
	
	@FXML private void initialize() {
		_btnAdd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				addHandle();
			}
		});
		
		_btnSort.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				sortHandle();
			}
		});
		
		_btnDis.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				disHandle();
			}
		});
	}
	
	private void addHandle() {
		System.out.println("Add Button");
	}
	
	private void sortHandle() {
		System.out.println("Sort Button");
	}
	
	private void disHandle() {
		System.out.println("Display Button");
	}
	
}
