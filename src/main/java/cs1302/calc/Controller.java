/**
 * Sample Skeleton for 'calc.fxml' Controller Class
 */

package cs1302.calc;

import java.awt.event.ActionListener;
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
import javafx.beans.property.StringProperty;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
	public ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
	public URL location;

    @FXML
	public Pane topPane;
    
    @FXML
	public Label opLabel;

    @FXML
	public Pane midPane;

    @FXML
	public Pane binPane;

    @FXML
	public GridPane calcPane;

    @FXML // fx:id="mulButton"
	public Button mulButton; // Value injected by FXMLLoader

    @FXML // fx:id="recButton"
	public Button recButton; // Value injected by FXMLLoader

    @FXML // fx:id="subButton"
	public Button subButton; // Value injected by FXMLLoader

    @FXML // fx:id="rButton"
	public Button rButton; // Value injected by FXMLLoader

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
	public Button lButton; // Value injected by FXMLLoader

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

    public String operation = "";
    public int result = 0;
    public int lhs = 0;
    public int rhs = 0;
    // opLabel.setText(operation);
    // binary ?? TO-DO
    private RecursiveMath rMath = new RecursiveMath();
    private IterativeMath iMath = new IterativeMath();
    private boolean useRecursion = false;
    private boolean showBinary = true;
    private boolean useDiv = false;
    private boolean useMul = false;
    private boolean useAdd = false;
    private boolean useSub = false;
    private boolean usePow = false;
    private boolean useFac = false;


    @FXML
	void div(MouseEvent click) {
	operation += " / ";
	opLabel.setText(operation);
	useDiv = true;
    }

    @FXML
	void mul(MouseEvent click) {
	operation += " * ";
	opLabel.setText(operation);
	useMul = true;
    }

    @FXML
	void sub(MouseEvent click) {
	operation += " - ";
	opLabel.setText(operation);
	useSub = true;
    }

    @FXML
	void add(MouseEvent click) {
	operation += " + ";
	opLabel.setText(operation);
	useAdd = true;
    }

    @FXML
	void fac(MouseEvent click) {
	operation += " ! ";
	opLabel.setText(operation);
	useFac = true;
    }


    @FXML
	void pow(MouseEvent click) {
	operation += " ^ ";
	opLabel.setText(operation);
	usePow = true;
    }

    @FXML
	void lshift(MouseEvent click) {
	
    }

    @FXML
	void rshift(MouseEvent click) {

    }

    @FXML
	void b0 (MouseEvent click) {
	operation += "0";
	opLabel.setText(operation);
    }

    @FXML
	void b1 (MouseEvent click) {
	operation += "1";
	opLabel.setText(operation);
    }


    @FXML
	void b2 (MouseEvent click) {
	operation += "2";
	opLabel.setText(operation);
    }

    @FXML
	void b3 (MouseEvent click) {
	operation += "3";
	opLabel.setText(operation);
    }
    
    @FXML
	void b4 (MouseEvent click) {
	operation += "4";
	opLabel.setText(operation);
    }

    @FXML
	void b5 (MouseEvent click) {
	operation += "5";
	opLabel.setText(operation);
    }

    @FXML
	void b6 (MouseEvent click) {
	operation += "6";
	opLabel.setText(operation);
    }

    @FXML
	void b7 (MouseEvent click) {
	operation += "7";
	opLabel.setText(operation);
    }

    @FXML
	void b8 (MouseEvent click) {
	operation += "8";
	opLabel.setText(operation);
    }
    
    @FXML
	void b9 (MouseEvent click) {
	operation += "9";
	opLabel.setText(operation);
    }

    @FXML
	void recButton (MouseEvent click) {
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
	void binButton (MouseEvent click) {
	if (showBinary != true) {
	    showBinary = true;
	    binButton.setText("Hide Binary"); // change button to "Hide Binary"
	}
	else {
	    showBinary = false;
	    binButton.setText("Show Binary"); // change button to "Show Binary"
	}
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {

	assert topPane != null : "fx:id=\"topPane\" was not injected: check your FXML file 'calc.fxml'.";
	assert opLabel != null : "fx:id=\"opLabel\" was not injected: check your FXML file 'calc.fxml'.";
      	assert midPane != null : "fx:id=\"midPane\" was not injected: check your FXML file 'calc.fxml'.";
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

    } // FXML
}
