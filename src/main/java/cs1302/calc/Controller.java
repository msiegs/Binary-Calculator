package cs1302.calc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.paint.Color;

public class Controller implements Initializable {

    @FXML
	public Label operationLabel;

    @FXML
	public Label resultLabel;

    @FXML
	public FlowPane binaryPane;

    @FXML // fx:id="recButton"
	public Button recButton; // Value injected by FXMLLoader

    @FXML // fx:id="binButton"
	public Button binButton; // Value injected by FXMLLoader

    public String operation = "";
    public int result = 0;
    private boolean useRecursion = false;
    private boolean showBinary = true;
    private String binResult = "";
    private Button[] binaryButtons = new Button[32];
    private Label swag;
    private Label jBiebz;

    @Override
	public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
	resultLabel.setText(Integer.toString(result));
	swag = new Label("  31                                                                                                                         16           ");
	swag.setTextFill(Color.web("#3354ff"));
	jBiebz = new Label("  15                                                                                                                          0            ");
	for (int i = 0; i < binaryButtons.length; i++) {
	    if(i % 4 == 0 && i != 0) binaryPane.getChildren().add(new Label("         "));
	    if(i == 16) binaryPane.getChildren().add(swag);
	    Button newButton = new Button("0");
	    newButton.setStyle("-fx-background-color: transparent");
	    newButton.setOnAction(new EventHandler <ActionEvent>() {
		    @Override
			public void handle (ActionEvent event) {
			if(newButton.getText().equals("0")) newButton.setText("1");
			else newButton.setText("0");
		    }
		}); // setOnAction
	    binaryButtons[i] = newButton;
	    binaryPane.getChildren().add(binaryButtons[i]);
	} // for
	binaryPane.getChildren().add(jBiebz);
    } // initialize

    @FXML
	void divide(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += "/ ";
	else operation += " / ";
	operationLabel.setText(operation);
    }

    @FXML
	void multiply(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += "* ";
	else operation += " * ";
	operationLabel.setText(operation);
    }

    @FXML
	void subtract(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += "- ";
	else operation += " - ";
	operationLabel.setText(operation);
    }

    @FXML
	void addition(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += "+ ";
	else operation += " + ";
	operationLabel.setText(operation);
    }

    @FXML
	void factorial(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += "! ";
	else operation += " ! ";
	operationLabel.setText(operation);
    }


    @FXML
	void power(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += "^ ";
	else operation += " ^ ";
	operationLabel.setText(operation);
    }

    @FXML
	void leftShift(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += "<< ";
	else operation += " << ";
	operationLabel.setText(operation);
    }

    @FXML
	void rightShift(ActionEvent event) {
	if (operation.charAt(operation.length()-1) == ' ') operation += ">> ";
	else operation += " >> ";
	operationLabel.setText(operation);
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
	String sillyString = operation.replaceAll(">>",">").replaceAll("<<","<");
	String infix[] = sillyString.split(" ");
	String postfix[] = ReversePolishNotation.infixToPostfix(infix);
	if (useRecursion == true) result = ReversePolishNotation.evaluate(rMath, postfix);
	else {
	    result = ReversePolishNotation.evaluate(iMath, postfix);
	}
	Integer resultObj = new Integer(result);
	binResult = resultObj.toBinaryString(resultObj);	
	resultLabel.setText(Integer.toString(result));
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
	    for (int i = 0; i < binaryButtons.length; i++) {
		binaryButtons[i].setVisible(true);
		binaryButtons[i].setDisable(false);
		swag.setVisible(true);
		jBiebz.setVisible(true);
	    }
	}
	else {
	    showBinary = false;
	    binButton.setText("Show Binary"); // change button to "Show Binary"
	    for (int i = 0; i < binaryButtons.length; i++) {
		binaryButtons[i].setVisible(false);
		binaryButtons[i].setDisable(true);
		swag.setVisible(false);
		jBiebz.setVisible(false);
	    }
	}
    }

    @FXML
	void delete (ActionEvent event) {
	if (operation.equals("")) {}
	else if (operation.length() == 1) operation = "";
	else if (operation.charAt(operation.length()-2) == '<' || operation.charAt(operation.length()-2) == '>') operation = operation.substring(0, operation.length()-3);
	else if (operation.charAt(operation.length()-1) != ' ') operation = operation.substring(0, operation.length()-1); 
	else operation = operation.substring(0, operation.length()-2);
	operationLabel.setText(operation);
    }

    @FXML
	void clear (ActionEvent event) {
	operation = "";
	operationLabel.setText(operation);
	result = 0;
	resultLabel.setText(Integer.toString(result));
    }

}