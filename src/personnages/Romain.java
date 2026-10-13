package personnages;

import objets.Equipement;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert this.isInvariantVerified();
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}


	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		
		assert forceCoup > 0;
		int force_avant_modification = force;
		
		force = force - forceCoup;
		if (force < 1) {
			this.parler("J'abandonne !");
		}
		else {
			this.parler("Aie");
		}
		assert this.isInvariantVerified();
		assert force<force_avant_modification;
	}
	
	private boolean isInvariantVerified() {
		return force >= 0;
	}
	
	private void ajouterEquipement(Equipement equipement) {
		
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldate "+nom+" s'équipe avec un "+equipement.toString());
		
	}
	
	public void sEquiper(Equipement equipement) {
		
		if (nbEquipement >= 2) {
			System.out.println("Le soldate "+nom+" est déjà bien protégé");
			return;
		}
		
		if (nbEquipement == 0) {
			this.ajouterEquipement(equipement);
		}
		else {
		
			for (int i = 0; i<nbEquipement; i++) {
			
				switch (equipement.compareTo(equipements[i])) {
				case 0:
					System.out.println("Le soldat "+nom+" possède déjà un "+equipement.toString());
					return;
		
				default:
					break;
				}
			}
			this.ajouterEquipement(equipement);
		}
		
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
	
}














