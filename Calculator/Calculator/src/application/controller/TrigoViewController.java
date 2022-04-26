package application.controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.*;

public class TrigoViewController {
	
	private Main main;
	private double degrees=0;
	private double ans = 0;
	private ArrayList<String> array= new ArrayList<String>();
	private String result = "";
	@FXML
	Label answer;
	
	@FXML
	private TextField input;
	
	@FXML
	private void openArith() {
		main.openArith();
	}
	public void setMain(Main main) {
		this.main = main;
	}
	boolean isDouble (String str) {
		try {
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
	}
	@FXML
	public void setSin() {
		if (isDouble(input.getText())==true ) {
			degrees = Double.parseDouble(input.getText());
		
			ans = Math.sin(degrees);
			answer.setText("sin(" + degrees + ") = " + ans);
			result = "sin(" + degrees + ") = " + ans;
			array.add(result);
		
		}
		else {
			answer.setText("Error in input");
		}
		
		
	}
	
	@FXML
	public void setCos() {
		if (isDouble(input.getText())==true ) {
			degrees = Double.parseDouble(input.getText());
		
			ans = Math.cos(degrees);
			answer.setText("cos(" + degrees + ") = " + ans);
			result = "cos(" + degrees + ") = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
		
		
	}
	
	@FXML
	public void setTan() {
		
		if (isDouble(input.getText())==true ) {
			degrees = Double.parseDouble(input.getText());
			
			ans = Math.tan(degrees);
			answer.setText("tan(" + degrees + ") = " + ans);
			result = "tan(" + degrees + ") = " + ans;
			array.add(result);
			
		}
		else {
			answer.setText("Error in input");
		}
		
		
	}
	
	@FXML
	public void setCot() {
		
		if (isDouble(input.getText())==true ) {
			degrees = Double.parseDouble(input.getText());
			
			ans = 1.0/Math.tan(degrees);
			answer.setText("cot(" + degrees + ") = " + ans);
			result = "cot(" + degrees + ") = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
		
		
	}
	
	@FXML
	public void setSec() {
		
		if (isDouble(input.getText())==true ) {
			degrees = Double.parseDouble(input.getText());
			
			ans = 1.0/Math.cos(degrees);
			answer.setText("sec(" + degrees + ") = " + ans);
			result = "sec(" + degrees + ") = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
		
		
	}
	
	@FXML
	public void setCsc() {
		
		if (isDouble(input.getText())==true ) {	
			degrees = Double.parseDouble(input.getText());
			
			ans = 1.0/Math.sin(degrees);
			answer.setText("csc(" + degrees + ") = " + ans);
			result = "csc(" + degrees + ") = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
		
	}
	@FXML
	private void openHistory() {
		main.openHistory(array);
	}
	
	
}
