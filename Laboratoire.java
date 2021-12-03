/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author alexk
 */
public class Laboratoire {
    private int laboCode;
    private String labNom;
    private String labChefVente;
    
    public Laboratoire (){
    }
    
    public Laboratoire(int unLaboCode, String unLabNom, String unLabChefVente){
        
        laboCode=unLaboCode;
        labNom=unLabNom;
        labChefVente=unLabChefVente;
    
}

    /**
     * @return the laboCode
     */
    public int getLaboCode() {
        return laboCode;
    }

    /**
     * @return the labNom
     */
    public String getLabNom() {
        return labNom;
    }

    /**
     * @return the labChefVente
     */
    public String getLabChefVente() {
        return labChefVente;
    }
    
}
