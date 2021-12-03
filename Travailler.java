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
public class Travailler {
    
    private int visMatricule;
    private Date JJMMAA;
    private int regCode;
    private String traRole;
    
    public Travailler(){
        
    }
    public Travailler(int unVisMat, Date unJJMMAA, int unRegCode, String unTraRole){
        
        visMatricule=unVisMat;
        JJMMAA=unJJMMAA;
        regCode=unRegCode;
        traRole=unTraRole;
        
    }
    public Travailler(int unRegCode){
        regCode=unRegCode;
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
     * @return the JJMMAA
     */
    public Date getJJMMAA() {
        return JJMMAA;
    }

    /**
     * @param JJMMAA the JJMMAA to set
     */
    public void setJJMMAA(Date JJMMAA) {
        this.JJMMAA = JJMMAA;
    }

    /**
     * @return the regCode
     */
    public int getRegCode() {
        return regCode;
    }

    /**
     * @param regCode the regCode to set
     */
    public void setRegCode(int regCode) {
        this.regCode = regCode;
    }

    /**
     * @return the traRole
     */
    public String getTraRole() {
        return traRole;
    }

    /**
     * @param traRole the traRole to set
     */
    public void setTraRole(String traRole) {
        this.traRole = traRole;
    }
    
}
