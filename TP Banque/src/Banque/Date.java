package Banque;

class Date {

  private int jour;
  private int mois;
  private int an;
  private int heure;
  private int minute;
  private int seconde;

  public Date (int day, int month, int year, int hour){
    this.jour = day;
    this.mois = month;
    this.an = year;
    this.heure = hour;
    this.minute = 0;
    this.seconde = 0;
  }

  public String toString(){
    String sJour = String.valueOf(this.jour);
    String sMois = String.valueOf(this.mois);
    String sAn = String.valueOf(this.an);
    String sHeure = String.valueOf(this.heure);
    String sMinute = String.valueOf(this.minute);
    String sSeconde = String.valueOf(this.seconde);

    String sDate = '[' + sHeure + ':' + sMinute + ':';
    sDate = sDate + sSeconde + ' ' + sJour;
    sDate = sDate + '/' + sMois + '/' + sAn + ']';
    return sDate;
  }
  
  public int getJour() {
		return this.jour;
	}
	public int getMois() {
		return this.mois;
	}
	public int getAn() {
		return this.an;
	}
}








