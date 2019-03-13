package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	private String AlienWord;
	protected List<String> traduzioni = new LinkedList<String>();
	
	public String getAlienWord() {
		return AlienWord;
	}
	public void setAlienWord(String alienWord) {
		AlienWord = alienWord;
	}
	public List<String> getTraduzioni() {
		return traduzioni;
	}
	public void setTraduzioni(List<String> traduzioni) {
		this.traduzioni = traduzioni;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AlienWord == null) ? 0 : AlienWord.hashCode());
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
		if (AlienWord == null) {
			if (other.AlienWord != null)
				return false;
		} else if (!AlienWord.equals(other.AlienWord))
			return false;
		return true;
	}

}
