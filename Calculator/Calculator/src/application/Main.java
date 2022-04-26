package application;
	
import java.util.ArrayList;

import application.controller.ArithViewController;
import application.controller.HistoViewController;
import application.controller.TrigoViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

//Glenn Angelo Anicoche
//Gabriel Austin Untalan

public class Main extends Application {
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		openArith();
		
	}
	public void openArith() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/ArithView.fxml"));
			AnchorPane arithViewfxml = (AnchorPane) loader.load();
			
			Scene scene = new Scene(arithViewfxml);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Calculator");
			
			ArithViewController arithViewController = loader.getController();
			arithViewController.setMain(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void openTrig() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/TrigView.fxml"));
			AnchorPane trigViewfxml = (AnchorPane) loader.load();
			Scene scene = new Scene(trigViewfxml);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			TrigoViewController trigoViewController = loader.getController();
			trigoViewController.setMain(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openHistory(ArrayList<String> array) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/HistoView.fxml"));
			AnchorPane histoViewfxml = (AnchorPane) loader.load();
			
			Scene scene = new Scene(histoViewfxml);
			Stage historyStage = new Stage();

			historyStage.initOwner(primaryStage);
			historyStage.initModality(Modality.WINDOW_MODAL);
			historyStage.setTitle("History");
			
			historyStage.setScene(scene);
			historyStage.show();
			
			HistoViewController histoViewController = loader.getController();
			histoViewController.getStage(historyStage);
			histoViewController.addtohisto(array);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
