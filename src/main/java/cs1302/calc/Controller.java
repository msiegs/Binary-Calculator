/**
 * Sample Skeleton for 'calc.fxml' Controller Class
 */

package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

    @FXML // fx:id="mulButton"
	private Button mulButton; // Value injected by FXMLLoader

    @FXML // fx:id="recButton"
	private Button recButton; // Value injected by FXMLLoader

    @FXML // fx:id="subButton"
	private Button subButton; // Value injected by FXMLLoader

    @FXML // fx:id="rButton"
	private Button rButton; // Value injected by FXMLLoader

    @FXML // fx:id="addButton"
	private Button addButton; // Value injected by FXMLLoader

    @FXML // fx:id="b0"
	private Button b0; // Value injected by FXMLLoader

    @FXML // fx:id="b1"
	private Button b1; // Value injected by FXMLLoader

    @FXML // fx:id="b2"
	private Button b2; // Value injected by FXMLLoader

    @FXML // fx:id="b3"
	private Button b3; // Value injected by FXMLLoader

    @FXML // fx:id="b4"
	private Button b4; // Value injected by FXMLLoader

    @FXML // fx:id="b5"
	private Button b5; // Value injected by FXMLLoader

    @FXML // fx:id="b6"
	private Button b6; // Value injected by FXMLLoader

    @FXML // fx:id="b7"
	private Button b7; // Value injected by FXMLLoader

    @FXML // fx:id="powButton"
	private Button powButton; // Value injected by FXMLLoader

    @FXML // fx:id="b8"
	private Button b8; // Value injected by FXMLLoader

    @FXML // fx:id="lButton"
	private Button lButton; // Value injected by FXMLLoader

    @FXML // fx:id="b9"
	private Button b9; // Value injected by FXMLLoader

    @FXML // fx:id="binButton"
	private Button binButton; // Value injected by FXMLLoader

    @FXML // fx:id="facButton"
	private Button facButton; // Value injected by FXMLLoader

    @FXML // fx:id="divButton"
	private Button divButton; // Value injected by FXMLLoader

    @FXML
	void div(ActionEvent event) {

    }

    @FXML
	void mul(ActionEvent event) {

    }

    @FXML
	void sub(ActionEvent event) {

    }

    @FXML
	void add(ActionEvent event) {

    }

    @FXML
	void fac(ActionEvent event) {

    }

    @FXML
	void pow(ActionEvent event) {

    }

    @FXML
	void lshift(ActionEvent event) {

    }

    @FXML
	void rshift(ActionEvent event) {

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

    }
}




