package objets;

public enum Equipement {
	
	CASQUE("casque"),
	BOUCLIER("bouclier");
	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		//System.out.println(nom);
		return nom;
	}
	
}
