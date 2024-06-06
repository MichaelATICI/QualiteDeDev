package main;

public class Voiture {
    public String marque;
    public Double prix;

    public Voiture(String marque, Double prix){
        this.marque=marque;
        this.prix=prix;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String newMarque) {
        if (newMarque == null) {
            return;}
        this.marque=newMarque;
    }

    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double newPrix) {
        if (newPrix<0) {
            return;
        }
        this.prix=newPrix;
    }

}
