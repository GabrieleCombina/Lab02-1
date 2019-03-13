package it.polito.tdp.alien;

import java.util.*;

public class AlienDirectory {
	
	List<Word> dizionario = new LinkedList<Word>();
	
	List<WordEnhanced> dizionarioM = new LinkedList<WordEnhanced>();

	//public void addWord(String alienWord, String translation) {
		//Word w = new Word(alienWord, translation);
		//for(int i=0; i<dizionario.size(); i++) {
			//if(dizionario.get(i).getAlienWord() == alienWord) {
				//dizionario.remove(i);
			//}
		//}
		
		//dizionario.add(w);
	//}
	
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
	
	
	public void addWord(String alienWord, String translation) {
		int flag = 0;
		for(int i=0; i<dizionarioM.size(); i++) {
			if(dizionarioM.get(i).getAlienWord() == alienWord) {
				for(int j=0; j<dizionarioM.get(i).getTraduzioni().size(); j++) {
					if(dizionarioM.get(i).getTraduzioni().get(j)==translation) {
						flag = 1;
						break;
					}
				}
				if(flag==0) {
					dizionarioM.get(i).getTraduzioni().add(translation);
				}
			}
		}
	}
	

}
