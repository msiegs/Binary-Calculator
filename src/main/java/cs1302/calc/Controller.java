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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable {

    @FXML
	public Label operationLabel;

    @FXML
	public Label resultLabel;

    @FXML
	public FlowPane binaryPane;

    @FXML
	public Button recButton;

    @FXML
	public Button binButton;

    public String operation = "";
    public int result = 0;
    private boolean useRecursion = false;
    private boolean showBinary = true;
    private String binResult = "";
    private Button[] binaryButtons = new Button[32];
    private Label swag; // labels bits 31 - 16
    private Label jBiebz; // labels bits 15 - 0
    private String supaMike = ""; // binary string

    // The initialize method creates the binary buttons and labels.
    @Override
	public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
	resultLabel.setText(Integer.toString(result));
	swag = new Label("  31                                                                                                                         16           "); // this spacing was fun
	swag.setTextFill(Color.web("#3354ff")); // blue text
	jBiebz = new Label("  15                                                                                                                          0            "); // so was this
	jBiebz.setTextFill(Color.web("#3354ff")); // blue text
	for (int i = 0; i < binaryButtons.length; i++) { // creates each binary button
	    if(i % 4 == 0 && i != 0) binaryPane.getChildren().add(new Label("         ")); // spacing between sets of 4 binary buttons
	    if(i == 16) binaryPane.getChildren().add(swag); 
	    Button newButton = new Button("0"); // binary buttons start as 0
	    newButton.setStyle("-fx-background-color: transparent");
	    newButton.setOnAction(new EventHandler <ActionEvent>() {
		    @Override
			public void handle (ActionEvent event) { 
			if(newButton.getText().equals("0")) newButton.setText("1"); // changes from 0 to 1
			else newButton.setText("0"); // changes from 1 to 0
			for (int purpose = 0; purpose < binaryButtons.length; purpose++) { // "Purpose" is the name of the new album by Justin Bieber, aka "jBiebz"
			    supaMike += binaryButtons[purpose].getText(); // adds the text of each button (0 or 1) to the binary string supaMike
			    result = Integer.parseInt(supaMike,2); // saves the supaMike binary string to the result int
			    resultLabel.setText(Integer.toString(result)); // posts the binary string (now saved as the result int!!) to the result label 
			}
			supaMike = ""; // resetting supaMike
		    }
		}); // setOnAction
	    binaryButtons[i] = newButton; 
	    binaryPane.getChildren().add(binaryButtons[i]);
	} // for
	binaryPane.getChildren().add(jBiebz);
	binaryButtons[0].setVisible(false); // prevents button 32 from showing up
	binaryButtons[0].setDisable(true); // prevents button 32 from functioning
    } // initialize

    @FXML
	void divide(ActionEvent event) {
	if (operation == "") {} // prevents the user from hitting an operator before a number has been pressed
	else if (operation.charAt(operation.length()-1) == ' ') operation += "/ "; // prevents too much spacing
	else operation += " / "; // adds enough spacing
	operationLabel.setText(operation);
    } // divide

    @FXML
	void multiply(ActionEvent event) {
	if (operation == "") {}
	else if (operation.charAt(operation.length()-1) == ' ') operation += "* ";
	else operation += " * ";
	operationLabel.setText(operation);
    } // multiply

    @FXML
	void subtract(ActionEvent event) {
	if (operation == "") {}
	else if (operation.charAt(operation.length()-1) == ' ') operation += "- ";
	else operation += " - ";
	operationLabel.setText(operation);
    } // subtract

    @FXML
	void addition(ActionEvent event) {
	if (operation == "") {}
	else if (operation.charAt(operation.length()-1) == ' ') operation += "+ ";
	else operation += " + ";
	operationLabel.setText(operation);
    } // addition

    @FXML
	void factorial(ActionEvent event) {
	if (operation == "") {}
	else if (operation.charAt(operation.length()-1) == ' ') operation += "! ";
	else operation += " ! ";
	operationLabel.setText(operation);
    } // factorial


    @FXML
	void power(ActionEvent event) {
	if (operation == "") {}
	else if (operation.charAt(operation.length()-1) == ' ') operation += "^ ";
	else operation += " ^ ";
	operationLabel.setText(operation);
    } // power

    @FXML
	void leftShift(ActionEvent event) {
	if (operation == "") {}
	else if (operation.charAt(operation.length()-1) == ' ') operation += "<< ";
	else operation += " << ";
	operationLabel.setText(operation);
    } // leftShift

    @FXML
	void rightShift(ActionEvent event) {
	if (operation == "") {}
	else if (operation.charAt(operation.length()-1) == ' ') operation += ">> ";
	else operation += " >> ";
	operationLabel.setText(operation);
    } // rightShift

    @FXML
	void b0Pressed (ActionEvent event) {
	operation += "0";
	operationLabel.setText(operation);
    } // 0

    @FXML
	void b1Pressed (ActionEvent event) {
	operation += "1";
	operationLabel.setText(operation);
    } // 1

    @FXML
	void b2Pressed (ActionEvent event) {
	operation += "2";
	operationLabel.setText(operation);
    } // 2

    @FXML
	void b3Pressed (ActionEvent event) {
	operation += "3";
	operationLabel.setText(operation);
    } // 3
    
    @FXML
	void b4Pressed (ActionEvent event) {
	operation += "4";
	operationLabel.setText(operation);
    } // 4

    @FXML
	void b5Pressed (ActionEvent event) {
	operation += "5";
	operationLabel.setText(operation);
    } // 5

    @FXML
	void b6Pressed (ActionEvent event) {
	operation += "6";
	operationLabel.setText(operation);
    } // 6

    @FXML
	void b7Pressed (ActionEvent event) {
	operation += "7";
	operationLabel.setText(operation);
    } // 7

    @FXML
	void b8Pressed (ActionEvent event) {
	operation += "8";
	operationLabel.setText(operation);
    } // 8
    
    @FXML
	void b9Pressed (ActionEvent event) {
	operation += "9";
	operationLabel.setText(operation);
    } // 9

    @FXML
	void equals (ActionEvent event) {
	try {
	    RecursiveMath rMath = new RecursiveMath();
	    IterativeMath iMath = new IterativeMath();
	    String sillyString = operation.replaceAll(">>",">").replaceAll("<<","<");
	    String infix[] = sillyString.split(" ");
	    String postfix[] = ReversePolishNotation.infixToPostfix(infix);
	    if (useRecursion == true) result = ReversePolishNotation.evaluate(rMath, postfix);
	    else result = ReversePolishNotation.evaluate(iMath, postfix);
	    resultLabel.setText(Integer.toString(result));
	}
	catch (Exception e) { // handles big numbers!
	    System.out.println("You have run into exception " + e);
	    System.out.println("Don't worry, dawg. Fixed that for you.");
	}
	if (result > Integer.MAX_VALUE) {
	    System.out.println("Result has exceeded max integer value! Your result has been replaced with the max integer value.");
	    Alert exceed = new Alert(AlertType.WARNING);
	    exceed.setTitle("Warning!");
	    exceed.setHeaderText("You have exceeded the maximum integer value!");
	    exceed.setContentText("Your result value has been set to the maximum integer value. Our program cannot handle bigger numbers. Please try again with a smaller number.");
	    exceed.showAndWait();
	}

        Integer resultObj = new Integer(result);
	binResult = resultObj.toBinaryString(resultObj);	
        resultLabel.setText(Integer.toString(result));
        	
        supaMike = Integer.toBinaryString(result); // sets the binary integer to the supaMike string
        for (int i = 0; i < supaMike.length(); i++) { // sets each binary button according to the binary string
	    char position = supaMike.charAt(supaMike.length()-i-1); 
	    binaryButtons[binaryButtons.length-i-1].setText(Character.toString(position));
	}
	supaMike = ""; // resets supaMike so he doesn't get too crazy
    } // equals

    @FXML
	void recursion (ActionEvent event) {
	if (useRecursion == false) {
	    useRecursion = true;
	    recButton.setText("Use Iteration"); // changes button to "Use Recursion"
	}
	else {
	    useRecursion = false;
	    recButton.setText("Use Recursion"); // changes button to "Use Iterative"
	}
    } // recursion

    @FXML
	void binary (ActionEvent event) {
	if (showBinary != true) {
	    showBinary = true;
	    binButton.setText("Hide Binary"); // changes button to "Hide Binary"
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
    } // binary

    @FXML
	void delete (ActionEvent event) { // does lots of checks to make sure it correctly deletes the previous operand or number and all spaces inbetween
	if (operation.equals("")) {}
	else if (operation.length() == 1) operation = "";
	else if (operation.charAt(operation.length()-2) == '<' || operation.charAt(operation.length()-2) == '>') operation = operation.substring(0, operation.length()-3);
	else if (operation.charAt(operation.length()-1) != ' ') operation = operation.substring(0, operation.length()-1); 
	else operation = operation.substring(0, operation.length()-2);
	operationLabel.setText(operation);
    } // delete

    @FXML
	void clear (ActionEvent event) {
	operation = "";
	operationLabel.setText(operation);
	result = 0;
	resultLabel.setText(Integer.toString(result));
	for (int hey = 0; hey < binaryButtons.length; hey++) { // resets every binary button to 0
	    binaryButtons[hey].setText("0");
	} // for
	supaMike = ""; // resets supaMike
    } // clear

}