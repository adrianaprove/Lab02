package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class AlienDictionary {
	
	//Map <String,Word> dizionario=new TreeMap <String, Word>(); 
	//LinkedList <Word> dizionario; 
	LinkedList <WordEnhanced> dizionario; 
	
	public AlienDictionary() {
		//this.dizionario=new LinkedList <Word>();
		this.dizionario=new LinkedList <WordEnhanced>(); 
	}

	public void addWord(String alienWord, String translation) {
		//per la classe Word, accettata solo una traduzione
		/*
		 if(cercaParola(alienWord)==null)
			dizionario.add(new Word(alienWord, translation)); 
		 else
			cercaParola(alienWord).setTranslation(translation);
		*/
		
		//per la classe WordEnhanced
		if(cercaParola(alienWord)==null)
			dizionario.add(new WordEnhanced(alienWord, translation)); 
		else
			cercaParola(alienWord).addTranslation(translation);
	}
	
	public String translateWord(String alienWord) {
		if(cercaParola(alienWord)==null)
			return null; 
		else {
			//return cercaParola(alienWord).getTranslation(); 
			String s=""; 
			s=cercaParola(alienWord).getTranslations().toString(); 
			return s; 
		}
	}
	
	public WordEnhanced cercaParola(String alienWord) {
		for(int i=0; i<dizionario.size(); i++) {
			if(dizionario.get(i).equals(new WordEnhanced(alienWord, null))){ //funziona?
					return dizionario.get(i); 
			}
		}
		return null;
	}

}
