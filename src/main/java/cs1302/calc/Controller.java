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
    private boolean useDiv = false;
    private boolean useMul = false;
    private boolean useAdd = false;
    private boolean useSub = false;
    private boolean usePow = false;
    private boolean useFac = false;
    private String binResult = "";
   


    @FXML
	void divide(ActionEvent event) {
	operation += " / ";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	opLabel.setText(operation);
	useDiv = true;

>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void multiply(ActionEvent event) {
	operation += " * ";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	opLabel.setText(operation);
	useMul = true;


>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void subtract(ActionEvent event) {
	operation += " - ";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	opLabel.setText(operation);
	useSub = true;


>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void addition(ActionEvent event) {
	operation += " + ";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	opLabel.setText(operation);
	useAdd = true;


>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void factorial(ActionEvent event) {
	operation += " ! ";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	opLabel.setText(operation);
	useFac = true;


>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }


    @FXML
	void power(ActionEvent event) {
	operation += " ^ ";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	opLabel.setText(operation);
	usePow = true;


>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
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
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 0;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void b1Pressed (ActionEvent event) {
	operation += "1";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 1;	
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void b2Pressed (ActionEvent event) {
	operation += "2";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 2;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void b3Pressed (ActionEvent event) {
	operation += "3";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 3;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }
    
    @FXML
	void b4Pressed (ActionEvent event) {
	operation += "4";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 4;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void b5Pressed (ActionEvent event) {
	operation += "5";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 5;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void b6Pressed (ActionEvent event) {
	operation += "6";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 6;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void b7Pressed (ActionEvent event) {
	operation += "7";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 7;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }

    @FXML
	void b8Pressed (ActionEvent event) {
	operation += "8";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 8;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
    }
    
    @FXML
	void b9Pressed (ActionEvent event) {
	operation += "9";
<<<<<<< HEAD
	operationLabel.setText(operation);
=======
	numPushed = 9;
	useNumbers(numPushed);
	opLabel.setText(operation);
>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
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
	
	Integer resultObj = new Integer(result);
	binResult = resultObj.toBinaryString(resultObj);	
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

<<<<<<< HEAD
=======
 
    public void initialize(URL location, ResourceBundle resources) {

	assert opLabel != null : "fx:id=\"opLabel\" was not injected: check your FXML file 'calc.fxml'.";
      	assert midPane != null : "fx:id=\"midPane\" was not injected: check your FXML file 'calc.fxml'.";
	assert resultLabel != null : "fx:id=\"resultLabel\" was not injected: check your FXML file 'calc.fxml'.";
	assert binPane != null : "fx:id=\"binPane\" was not injected: check your FXML file 'calc.fxml'.";
	assert calcPane != null : "fx:id=\"calcPane\" was not injected: check your FXML file 'calc.fxml'.";
	assert mulButton != null : "fx:id=\"mulButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert topPane != null : "fx:id=\"topPane\" was not injected: check your FXML file 'calc.fxml'.";
        assert opLabel != null : "fx:id=\"opLabel\" was not injected: check your FXML file 'calc.fxml'.";
        assert midPane != null : "fx:id=\"midPane\" was not injected: check your FXML file 'calc.fxml'.";
        assert resultLabel != null : "fx:id=\"resultLabel\" was not injected: check your FXML file 'calc.fxml'.";
        assert binPane != null : "fx:id=\"binPane\" was not injected: check your FXML file 'calc.fxml'.";
        assert calcPane != null : "fx:id=\"calcPane\" was not injected: check your FXML file 'calc.fxml'.";
        assert mulButton != null : "fx:id=\"mulButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert recButton != null : "fx:id=\"recButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert subButton != null : "fx:id=\"subButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert rButton != null : "fx:id=\"rButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert b0 != null : "fx:id=\"b0\" was not injected: check your FXML file 'calc.fxml'.";
        assert b1 != null : "fx:id=\"b1\" was not injected: check your FXML file 'calc.fxml'.";
        assert b2 != null : "fx:id=\"b2\" was not injected: check your FXML file 'calc.fxml'.";
        assert b3 != null : "fx:id=\"b3\" was not injected: check your FXML file 'calc.fxml'.";
        assert b4 != null : "fx:id=\"b4\" was not injected: check your FXML file 'calc.fxml'.";
        assert b5 != null : "fx:id=\"b5\" was not injected: check your FXML file 'calc.fxml'.";
        assert b6 != null : "fx:id=\"b6\" was not injected: check your FXML file 'calc.fxml'.";
        assert b7 != null : "fx:id=\"b7\" was not injected: check your FXML file 'calc.fxml'.";
        assert powButton != null : "fx:id=\"powButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert b8 != null : "fx:id=\"b8\" was not injected: check your FXML file 'calc.fxml'.";
        assert lButton != null : "fx:id=\"lButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert b9 != null : "fx:id=\"b9\" was not injected: check your FXML file 'calc.fxml'.";
        assert binButton != null : "fx:id=\"binButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert facButton != null : "fx:id=\"facButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert divButton != null : "fx:id=\"divButton\" was not injected: check your FXML file 'calc.fxml'.";
	assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'calc.fxml'.";
	assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'calc.fxml'.";
	opLabel.setText(operation);
	resultLabel.setText(Integer.toString(result));

    } // FXML

    // This method is used to determine whether a number will be saved as "lhs" or whether it will be used as rhs and call on an operation.
      public void useNumbers(int numPushed) {
	if (useAdd == true) {
	    useAdd = false;
	    rhs = numPushed;
	    if (useRecursion == true) result = rMath.add(lhs, rhs);
	    else result = iMath.add(lhs, rhs);
	} // useAdd
	else if (useSub == true) {
	    useSub = false;
	    rhs = numPushed;
	    if (useRecursion == true) result = rMath.sub(lhs, rhs);
	    else result = iMath.sub(lhs, rhs);
	} // useSub
	else if (useMul == true) {
	    useMul = false;
	    rhs = numPushed;
	    if (useRecursion == true) result = rMath.mul(lhs, rhs);
	    else result = iMath.mul(lhs, rhs);
	} // useMul
	else if (useDiv == true) {
	    useDiv = false;
	    rhs = numPushed;
	    if (useRecursion == true) result = rMath.div(lhs, rhs);
	    else result = iMath.div(lhs, rhs);
	} // useDiv
	else if (usePow == true) {
	    usePow = false;
	    rhs = numPushed;
	    if (useRecursion == true) result = rMath.pow(lhs, rhs);
	    else result = iMath.pow(lhs, rhs);
	} // usePow
	else if (useFac == true) {
	    useFac = false;
	    rhs = numPushed;
	    if (useRecursion == true) result = rMath.fac(lhs);
	    else result = iMath.fac(lhs);
	} // useFac
	resultLabel.setText(Integer.toString(result));
	lhs = result;
    } // useNumbers		/

        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'calc.fxml'.";
        assert equalButton != null : "fx:id=\"equalButton\" was not injected: check your FXML file 'calc.fxml'.";
	// opLabel.setText(operation);

    } // FXML initialize()


>>>>>>> 5dec25a2dc6ba3d501ce703c3e625c51f354d37e
}

