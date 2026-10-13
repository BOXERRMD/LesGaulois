package personnages;

public class Romain {

	private String nom;
	private int force;
	
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
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
	}
	
}














