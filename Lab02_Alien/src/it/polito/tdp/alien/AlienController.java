package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
    private AlienDictionary dizionario; 
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	 
    	dizionario=new AlienDictionary(); 
    	//txtResult.setText("Welcome to Alien Dictionary v2019"); 
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String s=txtWord.getText(); 
    	String [] scritto=s.split(" "); 
    	if(scritto.length==2) {
    		//VOGLIO INSERIRE UNA NUOVA PAROLA
    		String parola=scritto[0].trim().toLowerCase(); 
    		String traduzione=scritto[1].trim().toLowerCase(); 
    		//controllo sulle stringhe inserite
    		if(parola.matches("[a-zA-Z]+") && traduzione.matches("[a-zA-Z]+")) {
    			dizionario.addWord(parola, traduzione);
    		}
    	}
    	else if(scritto.length==1) {
    		//VOGLIO CERCARE LA TRADUZIONE DI QUELLA PAROLA
    		String parola=scritto[0].trim().toLowerCase(); 
    		//controllo sulla stringa inserita
    		if(parola.matches("[a-zA-Z]+")) {
    			String traduzione=dizionario.translateWord(parola);
    			txtResult.appendText(traduzione+"\n");
    		}
    	}
    	txtWord.clear();
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }
    
}
