package personnages;

import java.util.Iterator;

public class Chaudron {

	private int quantitePotion;
	private int forcePotion;
	
	
	
	public Chaudron() {
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		return quantitePotion != 0;
	}
	
	public int prendreLouche() {
		if (quantitePotion <= 0) {
			forcePotion = 0;
		}
		else {
			quantitePotion -= 1;
		}
		return forcePotion;
	}

	public int getQuantitePotion() {
		return quantitePotion;
	}

	public int getForcePotion() {
		return forcePotion;
	}
	
	
}
