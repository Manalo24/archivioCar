package application;

import java.awt.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.sun.glass.ui.MenuItem;

import Auto.Model.Archivio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.MenuButton;

public class SampleController {
	private Archivio garage = new Archivio();
	 @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	@FXML
	private TextField txtTarga;

    @FXML
    private TextField TxtAuto;

    @FXML
    private TextField TxtKm;

    @FXML
    private TextField TxtAnno;

    @FXML
    private TextField TxtPrezzo;

    @FXML
    private MenuButton MenuAzione;

    @FXML
    private MenuItem MenuAggiungi;

    @FXML
    private MenuItem MenuElmina;

    @FXML
    private Button BtnLista;

    @FXML
    private TextField TxtRecord;

    @FXML
    private Button TxtCerca;

    @FXML
    private TextField TxtrResult;



	    void onInserisci(ActionEvent event) {
	    	garage.addAuto(txtTarga.getText(), TxtKm.getText(), TxtAnno.getText(),TxtPrezzo.getText());
	    	
	    }
	    void onSearch(ActionEvent event) {
	    	garage.searchAuto(txtTarga.getText());
	    	
	    }
	    void Delete(ActionEvent event) {
	    	garage.deleteAuto(txtTarga.getText());
	    	
	    }
	public void setModel(Archivio model) {
		garage=model;
		
		
	}
	 @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert txtTarga != null : "fx:id=\"TxtTarga\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert TxtAuto != null : "fx:id=\"TxtAuto\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert TxtKm != null : "fx:id=\"TxtKm\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert TxtAnno != null : "fx:id=\"TxtAnno\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert TxtPrezzo != null : "fx:id=\"TxtPrezzo\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert MenuAzione != null : "fx:id=\"MenuAzione\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert MenuAggiungi != null : "fx:id=\"MenuAggiungi\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert MenuElmina != null : "fx:id=\"MenuElmina\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert BtnLista != null : "fx:id=\"BtnLista\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert TxtRecord != null : "fx:id=\"TxtRecord\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert TxtCerca != null : "fx:id=\"TxtCerca\" was not injected: check your FXML file 'Sample.fxml'.";
	        assert TxtrResult != null : "fx:id=\"TxtrResult\" was not injected: check your FXML file 'Sample.fxml'.";

	    }
	}


