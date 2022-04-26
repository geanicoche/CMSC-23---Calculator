package application.controller;

import java.util.ArrayList;


import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ArithViewController {
	
	private Main main;
	private ArrayList<String> array= new ArrayList<String>();
	private String result = "";
	private double num1= 0;
	private double num2= 0;
	private double ans= 0;

	
	@FXML
	Label answer;
	
	@FXML
	private TextField input1;
	@FXML
	private TextField input2;
	
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
	public void setAdd() {
		
		if (isDouble(input1.getText())==true && isDouble(input2.getText())== true) {
			num1= Double.parseDouble(input1.getText());
			num2= Double.parseDouble(input2.getText());

			ans = num1 + num2;
		
			answer.setText(num1 + " + " + num2 + " = " + ans);
			result = num1 + " + " + num2 + " = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
		
	}
	@FXML
	public void setSub() {
	
		if (isDouble(input1.getText())==true && isDouble(input2.getText())== true) {
			num1= Double.parseDouble(input1.getText());
			num2= Double.parseDouble(input2.getText());

			ans = num1 - num2;
		
			answer.setText(num1 + " - " + num2 + " = " + ans);
			result = num1 + " - " + num2 + " = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
	}
	@FXML
	public void setMul(){
	
		if (isDouble(input1.getText())==true && isDouble(input2.getText())== true) {
			num1= Double.parseDouble(input1.getText());
			num2= Double.parseDouble(input2.getText());

			ans = num1 * num2;
		
			answer.setText(num1 + " * " + num2 + " = " + ans);
			result = num1 + " * " + num2 + " = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
	}
	@FXML
	public void setDiv() {
		
		if (isDouble(input1.getText())==true && isDouble(input2.getText())== true) {
			num1= Double.parseDouble(input1.getText());
			num2= Double.parseDouble(input2.getText());

			ans = num1 / num2;
		
			answer.setText(num1 + " / " + num2 + " = " + ans);
			result = num1 + " / " + num2 + " = " + ans;
			array.add(result);
		}
		else {
			answer.setText("Error in input");
		}
	}
	
	@FXML
	private void openTrigo() {
		main.openTrig();
		array.removeAll(array);
	}
	
	@FXML
	private void openHistory() {
		main.openHistory(array);
	}
	
	
	
	
	

}
