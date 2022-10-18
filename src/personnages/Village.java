package personnages;

public class Village {
	private Gaulois[] villageois;
	private int nbvillageois = 0;
	private String nom;
	private Chef chef;
	private int numvillage;
	

	public Village(String nom, int nbvillageoisMaximum) {
		this.nom = nom;
		villageois= new Gaulois[nbvillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterGaulois(Gaulois gauloisajouter) {
		if (nbvillageois < villageois.length){
			villageois[nbvillageois] = gauloisajouter;
			nbvillageois++;
		}

	}

	public  Gaulois trouverHabitant(int numvillage){
		 Gaulois gaulois = villageois[numvillage];
		 return gaulois;
		 
		
		}
	
}

	public static void main(String[] args) {

	}
}
