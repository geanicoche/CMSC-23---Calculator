package application.controller;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HistoViewController {
	@FXML
	VBox answers;
	
	@FXML
	private	void exit() {
		stage.close();
	}
	
	Stage stage;
	public void getStage(Stage stage) {
		this.stage = stage;
	}
	
	public void addtohisto(ArrayList<String> array) {
		for(int i=0 ; i< array.size();i++ ) {
			answers.getChildren().add(new Label(array.get(i) + "\n\n"));
		}
	}
}
