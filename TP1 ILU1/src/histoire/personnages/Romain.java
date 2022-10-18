package histoire.personnages;

import histoire.personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement;

	public Romain(String nom, int force) {
		assert force > 0;
		this.nom = nom;
		this.force = force;
		this.equipement = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int force2=0;
		force2 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force != force2;
	}
	
	public void sEquiper(Equipement equipements) {
		if (this.nbEquipement == 2) {
			System.out.println("Le soldat " + this.nom + " est déjà bien protégé !"); 
		}else {
			switch(equipements) {
			case BOUCLIER :
				if (this.equipement[1] == Equipement.BOUCLIER) {
					System.out.println("Le soldat " + this.nom + " possède déjà un bouclier");
					break;
				}else {
					this.equipement[1]=Equipement.BOUCLIER;
					this.nbEquipement+=1;
					System.out.println("Le soldat " + this.nom + " s'équipe avec un bouclier");
					break;
				}
			case CASQUE:
				if (this.equipement[0] == Equipement.CASQUE) {
					System.out.println("Le soldat " + this.nom + " possède déjà un casque");
					break;
				}else{
						this.equipement[0]=Equipement.CASQUE;
						this.nbEquipement+=1;
						System.out.println("Le soldat " + this.nom +" s'équipe avec un casque");
						break;
					}
				}
			}
		}
	
	
	public static void main(String[] args) {
		Romain romain1 = new Romain("Minus", 6);
		romain1.prendreParole();
		romain1.parler("t'es qui même ? ");
		romain1.recevoirCoup(3);
		romain1.recevoirCoup(5);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		romain1.sEquiper(Equipement.CASQUE);
		romain1.sEquiper(Equipement.CASQUE);
		romain1.sEquiper(Equipement.BOUCLIER);
		romain1.sEquiper(Equipement.BOUCLIER);

	}
}
