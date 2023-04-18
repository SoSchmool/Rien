package Banque;

import Banque.paiement.Carte;

class Banque {
  
  private int nbClients;
  private Client [] clients = new Client [100];

  public Banque (){
    this.nbClients = 0;
  }

  public int addClient (String nom, Date date){
    this.nbClients += 1;
    this.clients [this.nbClients-1] = new Client (nom, date);
    return this.nbClients;
  }

  public void afficherBilanBanque(){
    for (int i=0; i<this.nbClients; i++){
      System.out.println("Client nÂ°"+ i+1+ ":\n");
      this.clients[i].afficherBilan();
    }
  }

  public Client getClient(int numClient){
    if ((numClient <= this.nbClients)&&(numClient >= 1)){
      return this.clients[numClient-1];
    }
    return null;
  }
  
  public boolean genererAutorisation(Carte carte,float montant) {
		if(montant>1000) {
			System.out.println("montant trop grand");
			return false;
		}
		else if(carte.date_valide()==false) {
			System.out.println("carte périmée");
			return false;
		}
		else {
			System.out.println("OK");
			return true;
		}
	}


}