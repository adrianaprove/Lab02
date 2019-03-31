package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class AlienDictionary {
	
	//Map <String,Word> dizionario=new TreeMap <String, Word>(); 
	LinkedList <Word> dizionario; 
	
	public AlienDictionary() {
		this.dizionario=new LinkedList <Word>();
	}

	public void addWord(String alienWord, String translation) {
		if(cercaParola(alienWord)==null)
			dizionario.add(new Word(alienWord, translation)); 
		else
			cercaParola(alienWord).setTranslation(translation);
	}
	
	public String translateWord(String alienWord) {
		if(cercaParola(alienWord)==null)
			return null; 
		else
			return cercaParola(alienWord).getTranslation(); 
	}
	
	public Word cercaParola(String alienWord) {
		for(int i=0; i<dizionario.size(); i++) {
			if(dizionario.get(i).equals(new Word(alienWord, null))){ //funziona?
					return dizionario.get(i); 
			}
		}
		return null;
	}

}
