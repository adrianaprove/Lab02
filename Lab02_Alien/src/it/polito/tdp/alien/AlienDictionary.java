package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	
	List <Word> lista=new LinkedList<Word>();
	
	public void addWord(String alienWord, String translation) {
		boolean trovato=false; 
		Word w=new Word(alienWord, translation); 
		for(int i=0; i<lista.size() && !trovato; i++) {
			if(lista.get(i).getAlienWord().compareTo(alienWord)==0) {
				trovato=true; 
				lista.get(i).setTranslation(translation);
				}
		}
		if(!trovato)
			lista.add(w); 
		}
	
	public String translateWord(String word) {
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getAlienWord().compareTo(word)==0)
				return lista.get(i).getTranslation(); 
		}
		return null; 
	}
			
	}


