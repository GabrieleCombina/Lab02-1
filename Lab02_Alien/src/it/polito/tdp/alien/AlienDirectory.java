package it.polito.tdp.alien;

import java.util.*;

public class AlienDirectory {
	
	List<Word> dizionario = new LinkedList<Word>();

	public void addWord(String alienWord, String translation) {
		Word w = new Word(alienWord, translation);
		for(int i=0; i<dizionario.size(); i++) {
			if(dizionario.get(i).getAlienWord() == alienWord)
				dizionario.remove(i);
		}
		
		dizionario.add(w);
	}
	
	public String translateWord(String alienWord) {
		String traduzione = null;
		for(int i=0; i<dizionario.size(); i++) {
			if(dizionario.get(i).getAlienWord() == alienWord) {
				traduzione = dizionario.get(i).getTranslation();
				break;
			}
		}
		return traduzione;
	}
	

}
