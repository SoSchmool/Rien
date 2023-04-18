package Banque.paiement;

import Banque.Banque;
import Banque.Date;

class Carte{
  private int[] code = new int[4];
  private Banque banque;
  private int numClient;
  private int numCompte;
  private Date dateValid = new Date(100,100,100,0);
  private Date dateAjd= new Date(21,02,2022,0);
  private Date dateValidite;
  private int cmptBloquage;

  public Carte (Banque banqueCrea, String nom, Date date, Date dateValidite){
    this.banque = banqueCrea;
    this.numClient = this.banque.addClient(nom, date);
    this.numCompte = this.banque.getClient(this.numClient).ajouterCompte();
    this.cmptBloquage = 3;
    this.dateValidite=dateValidite;
    
  }

  public boolean codeValide(int[] codeEntre){
    for (int i=0; i<4; i++){
      if ((cmptBloquage==0)||(code[i]!=codeEntre[i])){
        if (cmptBloquage!=0){
          cmptBloquage-=1;
        }
        return false;
      }
    }
    return true;
  }
  
  public boolean date_valide() {
		if (dateAjd.getAn()>dateValidite.getAn()) {
			return false;
		}
		else if(dateAjd.getAn()==dateValidite.getAn() && dateAjd.getMois()>dateValidite.getMois()) {
			return false;
		}
		else if (dateAjd.getAn()==dateValidite.getAn() && dateAjd.getMois()==dateValidite.getMois() && dateAjd.getJour()>dateValidite.getJour()) {
			return false;
		}
		else {
			return true;
		}
	}

  public void payer(Banque b, int numClient, int numCompte, float montant){
    this.banque.getClient(this.numClient).getCompte(this.numCompte).retrait(montant);
    b.getClient(numClient).getCompte(numCompte).depot(montant);
  }
  
  public Banque getBanque(){
    return this.banque;
  }

  public Date getDateValid(){
    return this.dateValid;
  }

}