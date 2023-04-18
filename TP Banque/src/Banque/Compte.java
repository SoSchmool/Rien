package Banque;

class Compte {
  private float solde;

  public Compte (){
    this.solde = 0;
  }

  public void depot(float valeur){
    this.solde += valeur;
  }

  public void retrait(float valeur){
    this.solde -= valeur;
  }

  public float getSolde(){
    return this.solde;
  }

  public void afficherSolde(){
    System.out.println(this.solde);
  }

  public void virer (float valeur, Compte destinataire){
    this.solde -= valeur;
    destinataire.solde += valeur;
  }
}