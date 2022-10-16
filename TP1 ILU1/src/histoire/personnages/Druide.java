package histoire.personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	protected int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "+ effetPotionMax + ".");
}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return forcePotion;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	
	public void preparerPotion() {
		Random rnd = new Random();
		int alea = rnd.nextInt(effetPotionMax - effetPotionMin +1) + effetPotionMin;
		if (alea > 7) {
			parler("J'ai pr�par� une super potion de force ");
		}else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force");
		}
		this.forcePotion = alea;	
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Ob�lix") {
			parler("Non, Ob�lix !... Tu n�auras pas de potion magique !");
		}else {
			gaulois.boirePotion(null);
		}
		
	}
	
	public static void main(String[] args) {
		Druide d1 = new Druide("Panoramix",5,10);
		for(int i=0; i<10; i++) {
			d1.preparerPotion();
		}
	}
}
