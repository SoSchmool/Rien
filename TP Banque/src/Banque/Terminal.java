package Banque;

import java.util.Scanner;

import Banque.paiement.Carte;

class Tpe {
	private Banque banque;

public Tpe(Banque banque) {
	this.banque=banque;
}	

public boolean payer(float montant,Carte carte) {
	int[] code;
	code=entrerCode();
	if(carte.codeValide(code)==true) {
		if(banque.genererAutorisation(carte, montant)==true) {
			return true;
		}
		else {
			return false;
		}
	}
	else { 
		return false;
	}
}

public int[] entrerCode() {
	int[] code= new int[4];
	int elem;
	Scanner clavier = new Scanner(System.in);
	System.out.println("entrer le code chiffre par chiffre");
	for(int i=0;i<=3;i++) {
    	elem=clavier.nextInt();
    	code[i]=elem;
	}
	clavier.close();
	return code;
	
}
}