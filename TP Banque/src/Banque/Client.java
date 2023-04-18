package Banque;

class Client {
  
  private String nom;
  private Date date;
  private int nbCompte;
  private Compte[] compte = new Compte[100];

  public Client (String nom, Date date){
    this.nom = nom;
    this.date = date;
    this.nbCompte = 0;
  }

  public String getNom(){
    return this.nom;
  }

  public Date getDate(){
    return this.date;
  }

  public Compte getCompte(int numero){
    if ((numero <= this.nbCompte)&&(numero >= 1)){
      return this.compte[numero-1];
    }
    return null;
  }

  public void afficherBilan(){
    for (int i=0; i<this.nbCompte; i++){
      System.out.println("Compte n°" + i+1 + " : " + this.compte[0].getSolde());
    }
  }

  public float soldeTotal(){
    float total = 0;

    for (int i=0; i<this.nbCompte; i++){
      total = total + this.compte[i].getSolde();
    }
    return total;
  }

  public void afficherSolde(){
    System.out.println(this.soldeTotal());
  }

  public int ajouterCompte (){
    this.nbCompte ++;
    this.compte[nbCompte-1] = new Compte();
    return nbCompte;
  }
}