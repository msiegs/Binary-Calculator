package cs1302.calc;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.fxml.Initializable;

public class Controller {

    @FXML
	public Label operationLabel;

    @FXML
	public Label resultLabel;

    @FXML // fx:id="mulButton"
	public Button mulButton; // Value injected by FXMLLoader

    @FXML // fx:id="recButton"
	public Button recButton; // Value injected by FXMLLoader

    @FXML // fx:id="subButton"
	public Button subButton; // Value injected by FXMLLoader

    @FXML // fx:id="rButton"
	public Button rightButton; // Value injected by FXMLLoader

    @FXML // fx:id="addButton"
	public Button addButton; // Value injected by FXMLLoader

    @FXML // fx:id="b0"
	public Button b0; // Value injected by FXMLLoader

    @FXML // fx:id="b1"
	public Button b1; // Value injected by FXMLLoader

    @FXML // fx:id="b2"
	public Button b2; // Value injected by FXMLLoader

    @FXML // fx:id="b3"
	public Button b3; // Value injected by FXMLLoader

    @FXML // fx:id="b4"
	public Button b4; // Value injected by FXMLLoader

    @FXML // fx:id="b5"
	public Button b5; // Value injected by FXMLLoader

    @FXML // fx:id="b6"
	public Button b6; // Value injected by FXMLLoader

    @FXML // fx:id="b7"
	public Button b7; // Value injected by FXMLLoader

    @FXML // fx:id="powButton"
	public Button powButton; // Value injected by FXMLLoader

    @FXML // fx:id="b8"
	public Button b8; // Value injected by FXMLLoader

    @FXML // fx:id="lButton"
	public Button leftButton; // Value injected by FXMLLoader

    @FXML // fx:id="b9"
	public Button b9; // Value injected by FXMLLoader

    @FXML // fx:id="binButton"
	public Button binButton; // Value injected by FXMLLoader

    @FXML // fx:id="facButton"
	public Button facButton; // Value injected by FXMLLoader

    @FXML // fx:id="divButton"
	public Button divButton; // Value injected by FXMLLoader

    @FXML
	public Button deleteButton;
    
    @FXML
	public Button clearButton;

    @FXML
	public Button equalButton;


    public String operation = "";
    public int result = 0;
    private boolean useRecursion = false;
    private boolean showBinary = true;

    @FXML
	void divide(ActionEvent event) {
	operation += " / ";
	operationLabel.setText(operation);
    }

    @FXML
	void multiply(ActionEvent event) {
	operation += " * ";
	operationLabel.setText(operation);
    }

    @FXML
	void subtract(ActionEvent event) {
	operation += " - ";
	operationLabel.setText(operation);
    }

    @FXML
	void addition(ActionEvent event) {
	operation += " + ";
	operationLabel.setText(operation);
    }

    @FXML
	void factorial(ActionEvent event) {
	operation += " ! ";
	operationLabel.setText(operation);
    }


    @FXML
	void power(ActionEvent event) {
	operation += " ^ ";
	operationLabel.setText(operation);
    }

    @FXML
	void leftShift(ActionEvent event) {
	System.out.println("lButton pushed!");
	// !!!
    }

    @FXML
	void rightShift(ActionEvent event) {
	System.out.println("rButton pushed!");
	// !!!
    }

    @FXML
	void b0Pressed (ActionEvent event) {
	operation += "0";
	operationLabel.setText(operation);
    }

    @FXML
	void b1Pressed (ActionEvent event) {
	operation += "1";
	operationLabel.setText(operation);
    }

    @FXML
	void b2Pressed (ActionEvent event) {
	operation += "2";
	operationLabel.setText(operation);
    }

    @FXML
	void b3Pressed (ActionEvent event) {
	operation += "3";
	operationLabel.setText(operation);
    }
    
    @FXML
	void b4Pressed (ActionEvent event) {
	operation += "4";
	operationLabel.setText(operation);
    }

    @FXML
	void b5Pressed (ActionEvent event) {
	operation += "5";
	operationLabel.setText(operation);
    }

    @FXML
	void b6Pressed (ActionEvent event) {
	operation += "6";
	operationLabel.setText(operation);
    }

    @FXML
	void b7Pressed (ActionEvent event) {
	operation += "7";
	operationLabel.setText(operation);
    }

    @FXML
	void b8Pressed (ActionEvent event) {
	operation += "8";
	operationLabel.setText(operation);
    }
    
    @FXML
	void b9Pressed (ActionEvent event) {
	operation += "9";
	operationLabel.setText(operation);
    }

    @FXML
	void equals (ActionEvent event) {
	RecursiveMath rMath = new RecursiveMath();
	IterativeMath iMath = new IterativeMath();
	String infix[] = operation.split(" ");
	String postfix[] = ReversePolishNotation.infixToPostfix(infix);
	if (useRecursion == true) result = ReversePolishNotation.evaluate(rMath, postfix);
	else {
	    result = ReversePolishNotation.evaluate(iMath, postfix);
	}
	resultLabel.setText(result);
    }

    @FXML
	void recursion (ActionEvent event) {
	if (useRecursion == false) {
	    useRecursion = true;
	    recButton.setText("Use Iteration");// change button to "Use Recursion"
	}
	else {
	    useRecursion = false;
	    recButton.setText("Use Recursion");//change button to "Use Iterative"
	}
    }

    @FXML
	void binary (ActionEvent event) {
	if (showBinary != true) {
	    showBinary = true;
	    binButton.setText("Hide Binary"); // change button to "Hide Binary"
	}
	else {
	    showBinary = false;
	    binButton.setText("Show Binary"); // change button to "Show Binary"
	}
    }

    @FXML
	void delete (ActionEvent event) {
	System.out.println("deleteButton was pressed!");
	String modString = operation.substring(0, operation.length()-1);
	operation = modString;
    }

    @FXML
	void clear (ActionEvent event) {
	operation = "";
	operationLabel.setText(operation);
    }

}

