package application;


import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	//Controllers 	
	@FXML private TextField _txtName;
	@FXML private TextField _txtAdd; 
	@FXML private TextField _txtGpa;
	
	@FXML private Button _btnAdd;
	@FXML private Button _btnSort;
	@FXML private Button _btnDis;
	
	//Fields 
	String name;
	String add;
	double gpa;
	
	//ArrayList of type Student to student objects in 
	ArrayList<Student> stArr = new ArrayList<Student>();
	
	//Handlers
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
	
	//Methods
	private void addHandle() {
		//TODO add text into the boxes.
		
		//Convert user input into a string
		name = _txtName.getText();
		add = _txtAdd.getText(); 
		
		//Convert user input into a double
		gpa = Double.parseDouble(_txtGpa.getText());	
		
		//Create a Student class object to initalise the field variables in Person class
		Student stObj = new Student(name, add, gpa);
		
		//Add the values in the student object into the array list
		stArr.add(stObj);
		
		System.out.println(stArr.toString());
	}
	
	private void sortHandle() {
		System.out.println("Sort Button");
	}
	
	private void disHandle() {
		System.out.println("Display Button");
	}
	
}
