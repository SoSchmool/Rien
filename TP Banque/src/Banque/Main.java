package Banque;

class Main {
  public static void main(String[] args) {
    Date date = new Date (9,2,2021,8);
    Banque banque = new Banque();

    banque.addClient("gens1", date);
    int nb = banque.getClient(1).ajouterCompte();
    banque.getClient(1).getCompte(1).depot(6450);
    banque.getClient(1).getCompte(1).retrait(543);
    banque.afficherBilanBanque();
  }
}