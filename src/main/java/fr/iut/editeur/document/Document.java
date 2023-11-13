package fr.iut.editeur.document;

import java.util.Locale;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String s = texte.substring(start, end);
        String sModif = s.toUpperCase();
        remplacer(start, end, sModif);
    }

    public void effacer(int start, int end){
        String sModif = "";
        remplacer(start, end, sModif);
    }

    public void clear(){
        String sModif = "";
        remplacer(0, texte.length(), sModif );
    }
}
