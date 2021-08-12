package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SecondController {
	@FXML private TextArea _txtBox;
	
	
	@FXML private void initialize() {
		
		String display =  "";
		ArrayList<Student> st = MainController.stArr;
		
		for(int i = 0; i<st.size(); i++) {
			display = st.toString();
		}
		
		_txtBox.setText(display);
	}
}
