package cs1302.calc;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;
 
public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    } // main
    
    @Override
    public void start(Stage primaryStage) {

	Parent root = null;

	try {
	    root = FXMLLoader.load(getClass().getResource("/calculator.fxml"));
	} catch (IOException e) {
	    System.out.println(e);
	    System.exit(1);
	} // try

	// FXMLLoader.setController(
        primaryStage.setTitle("C@lcul8r: Brought to You by Easy Siegs & The Yvetteran");
	primaryStage.setWidth(600);
	primaryStage.setHeight(400);
	primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    } // start

} // Driver


