package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



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
    
    AlienDictionary dizionario; 
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	 
    	dizionario=new AlienDictionary(); 
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String s=txtWord.getText(); 
    	System.out.println(s); 
    	String[] info=s.split(" "); 
    	if(info.length==2) {
    		//STO INSERENDO UNA NUOVA PAROLA NEL DIZIONARIO
    		String parola=info[0].toLowerCase(); 
    		String traduzione=info[1].toLowerCase(); 
    		if(parola.matches("[a-zA-Z]+") && traduzione.matches("[a-zA-Z]+")) {
    			dizionario.addWord(parola, traduzione);
    			//System.out.println("Salvata parola: "+parola+" con traduzione: "+traduzione+"\n"); 
    			//txtResult.appendText("Salvata parola: "+parola+" con traduzione: "+traduzione+"\n");
    	}
    		else
    			System.out.println("non matcha");
    	}
    	else if(info.length==1) {
    		//STO CERCANDO LA TRADUZIONE DI QUELLA PAROLA
    		String parola=info[0].toLowerCase(); 
    		String traduzione=""; 
    		if(parola.matches("[a-zA-Z]+"))
    			traduzione=dizionario.translateWord(parola); 
    		txtResult.appendText(traduzione+"\n");
    	}
    	    	
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }
    
}
