package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private  Gaulois[] villagois;
	private int nombrevillagois;

	public Village(String nom, int nombremaximum) {
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterGaulois(Gaulois gauloisajouter) {
		if (nombremaximum > villagois.length {
			villagois[nombrevillagois] = gauloisajouter; 
		}

	}
	
	public class TrouverHabibtant {
		
	}
}

