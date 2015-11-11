/**
 * Sample Skeleton for 'calc.fxml' Controller Class
 */

package calc;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
	public ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
	public URL location;

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

    public String operation = "";
    public int result = 0;
    // binary ?? TO-DO
    public RecursiveMath rMath = new RecursiveMath();
    public IterativeMath iMath = new IterativeMath();


    @FXML
	void div(ActionEvent event) {
	operation += " /";
    }

    @FXML
	void mul(ActionEvent event) {
	operation += " *";
    }

    @FXML
	void sub(ActionEvent event) {
	operation += " -";
    }

    @FXML
	void add(ActionEvent event) {
	operation += " +";
    }

    @FXML
	void fac(ActionEvent event) {
	operation += " !";
    }

    @FXML
	void pow(ActionEvent event) {
	operation += " ^";
    }

    @FXML
	void lshift(ActionEvent event) {
	
    }

    @FXML
	void rshift(ActionEvent event) {

    }

    @FXML
	void b0 (ActionEvent event) {
	operation += " 0";
    }

    @FXML
	void b1 (ActionEvent event) {
	operation += " 1";
    }

    @FXML
	void b2 (ActionEvent event) {
	operation += " 2";
    }

    @FXML
	void b3 (ActionEvent event) {
	operation += " 3";
    }
    
    @FXML
	void b4 (ActionEvent event) {
	operation += " 4";
    }

    @FXML
	void b5 (ActionEvent event) {
	operation += " 5";
    }

    @FXML
	void b6 (ActionEvent event) {
	operation += " 6";
    }

    @FXML
	void b7 (ActionEvent event) {
	operation += " 7";
    }

    @FXML
	void b8 (ActionEvent event) {
	operation += " 8";
    }
    
    @FXML
	void b9 (ActionEvent event) {
	operation += " 9";
    }




    @FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
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

    } // FXML
}