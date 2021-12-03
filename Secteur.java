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
public class Secteur {
    
    private int secCode;
    private String secLibelle;
    
    public Secteur(){
        
    }
    
    public Secteur(int unSecCode, String unSecLibelle){
        
        secCode=unSecCode;
        secLibelle=unSecLibelle;
        
    }

    /**
     * @return the secCode
     */
    public int getSecCode() {
        return secCode;
    }

    /**
     * @return the secLibelle
     */
    public String getSecLibelle() {
        return secLibelle;
    }
    
    
    
    
}
