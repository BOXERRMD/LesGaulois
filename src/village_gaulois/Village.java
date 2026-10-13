package village_gaulois;

import personnages.Gaulois;

public class Village {

	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	

	public Village(String nom, Gaulois chef, final int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > nbVillageois || numVillageois < 1) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		
		return villageois[numVillageois-1];
	}
	
	public void afficherVillage() {
	
		System.out.println("Dans le village \""+ nom +"\" du chef "+chef.getNom()+" vivent les légendaires gaulois :");
		for (int i = 0; i<nbVillageois; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
		
	}
	
	public static void main(String argv[]) {
		
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibes", abraracourcix, 30);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.trouverVillageois(30);
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
		
	}
	
	
	
}
