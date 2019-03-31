package it.polito.tdp.alien;

import java.util.LinkedList;

public class WordEnhanced {

	private String alienWord; 
	private LinkedList <String> translations;
	
	public WordEnhanced(String alienWord, String translation){
		this.alienWord=alienWord; 
		translations=new LinkedList<String>(); 
		translations.add(translation); 
	}
	
	public LinkedList<String> getTranslations() {
		return translations;
	}
	
	public void addTranslation(String tr) {
		translations.add(tr); 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordEnhanced other = (WordEnhanced) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
