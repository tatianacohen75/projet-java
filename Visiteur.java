/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author alexk
 */
public class Visiteur {

    /**
     * @return the leSecteur
     */
    public int getLeSecteur() {
        return leSecteur;
    }

    /**
     * @return the leLaboratoire
     */
    public int getLeLaboratoire() {
        return leLaboratoire;
    }
    private int visMatricule;
    private String visNom;
    private String visPrenom;
    private String visAdresse;
    private String visCp;
    private String visVille;
    private Date visDateEmbauche;
    private int leSecteur;
    private int leLaboratoire;
    private String Secteur;
    private String Labo;
    
    public Visiteur(){
        
    }
    public Visiteur(int unVisMat, String unVisNom, String unVisPre, String unVisAd, String unVisCp, String unVisVille, Date uneDateEmb, int unSecteur, int unLabo){
        
        visMatricule=unVisMat;
        visNom=unVisNom;
        visPrenom=unVisPre;
        visAdresse=unVisAd;
        visCp=unVisCp;
        visVille=unVisVille;
        visDateEmbauche=uneDateEmb;
        leSecteur=unSecteur;
        leLaboratoire=unLabo;
        
        
    }
    
    public Visiteur(int unVisMat, String unVisNom, String unVisPre){
        visMatricule=unVisMat;
        visNom=unVisNom;
        visPrenom=unVisPre;
    }
    public Visiteur(int unVisMat, String unVisNom, String unVisPre, String unVisAd, String unVisCp, String unVisVille, Date uneDateEmb, String unSecteur, String unLabo){
        
        visMatricule=unVisMat;
        visNom=unVisNom;
        visPrenom=unVisPre;
        visAdresse=unVisAd;
        visCp=unVisCp;
        visVille=unVisVille;
        visDateEmbauche=uneDateEmb;
        Secteur=unSecteur;
        Labo=unLabo;
        
        
    }

    /**
     * @return the visMatricule
     */
    public int getVisMatricule() {
        return visMatricule;
    }

    /**
     * @param visMatricule the visMatricule to set
     */
    public void setVisMatricule(int visMatricule) {
        this.visMatricule = visMatricule;
    }

    /**
     * @return the visNom
     */
    public String getVisNom() {
        return visNom;
    }

    /**
     * @param visNom the visNom to set
     */
    public void setVisNom(String visNom) {
        this.visNom = visNom;
    }

    /**
     * @return the visPrenom
     */
    public String getVisPrenom() {
        return visPrenom;
    }

    /**
     * @param visPrenom the visPrenom to set
     */
    public void setVisPrenom(String visPrenom) {
        this.visPrenom = visPrenom;
    }

    /**
     * @return the visAdresse
     */
    public String getVisAdresse() {
        return visAdresse;
    }

    /**
     * @param visAdresse the visAdresse to set
     */
    public void setVisAdresse(String visAdresse) {
        this.visAdresse = visAdresse;
    }

    /**
     * @return the visCp
     */
    public String getVisCp() {
        return visCp;
    }

    /**
     * @param visCp the visCp to set
     */
    public void setVisCp(String visCp) {
        this.visCp = visCp;
    }

    /**
     * @return the visVille
     */
    public String getVisVille() {
        return visVille;
    }

    /**
     * @param visVille the visVille to set
     */
    public void setVisVille(String visVille) {
        this.visVille = visVille;
    }

    /**
     * @param leSecteur the leSecteur to set
     */
    public void setLeSecteur(int leSecteur) {
        this.leSecteur = leSecteur;
    }

    
    /**
     * @param leLaboratoire the leLaboratoire to set
     */
    public void setLeLaboratoire(int leLaboratoire) {
        this.leLaboratoire = leLaboratoire;
    }

    /**
     * @return the Secteur
     */
    public String getSecteur() {
        return Secteur;
    }

    /**
     * @return the Labo
     */
    public String getLabo() {
        return Labo;
    }

    /**
     * @param Labo the Labo to set
     */
    public void setLabo(String Labo) {
        this.Labo = Labo;
    }

    
}
  

