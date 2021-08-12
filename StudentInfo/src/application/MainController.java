package application;


import java.util.ArrayList;
import java.util.Collections;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController{
	//Controllers 	
	@FXML private TextField _txtName;
	@FXML private TextField _txtAdd; 
	@FXML private TextField _txtGpa;

	@FXML private Button _btnAdd;
	@FXML private Button _btnSort;
	@FXML private Button _btnDis;
	
	@FXML private Label _lblErr;
	@FXML private Label _lblSort;
	

	//Fields 
	String name;
	String add;
	double gpa;

	//ArrayList of type Student to save student objects in 
	static ArrayList<Student> stArr = new ArrayList<Student>();

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
		
		_lblErr.setVisible(false);
		_lblSort.setVisible(false);
	}

	//Methods
	//Allows user to add input
	private void addHandle() {
		//TODO try catch block 
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
		
		_txtName.clear();
		_txtAdd.clear();
		_txtGpa.clear();
	}

	//Sorts the users input based off first name
	private void sortHandle(){
		System.out.println("Sort Button");
		System.out.println(stArr.toString());
		Collections.sort(stArr);
		
		System.out.println(stArr.toString());
		_lblSort.setVisible(true);
	}

	private void disHandle() {
		System.out.println("Display Button");
		
		//Access the second gui
		Stage secondaryStage = new Stage();
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Second.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			secondaryStage.setScene(scene);
			secondaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
