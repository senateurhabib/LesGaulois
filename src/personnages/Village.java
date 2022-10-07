package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villagois;
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

	public void ajouterHabitant() {

	}
}
