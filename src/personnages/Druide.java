package personnages;

public class Druide {

	private String nom;
	private int force;
	private Chaudron chaudron;
	
	
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
		chaudron = new Chaudron();
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}
	
	private String prendreParole() {
		
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concocté "+ chaudron.getQuantitePotion()+
				" doses de potion magique. Elle a une force de "+
				chaudron.getForcePotion()+".");
	}

	public void booster(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		
		if (contientPotion) {
			if (nomGaulois == "Obélix") {
				this.parler("Non, "+gaulois.getNom() +
						" Non !... Et tu le sais très bien !");
			}
			else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				this.parler("Tiens "+ gaulois.getNom() +
						" un peu de potion magique.");
				
			}
		}
		else {
			this.parler("Désolé "+gaulois.getNom() +
					" il n'y a plus une seule goutte de potion.");
		}
	}
	
	public String getNom() {
		return nom;
	}
}
