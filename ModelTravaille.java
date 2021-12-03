/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Travailler;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alexk
 */
public class ModelTravaille extends AbstractTableModel
{
    private String[] nomsColonnes ;
    private Vector<Object[]> rows;
    @Override
    public int getRowCount() {
        return rows.size();    
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex];
    }

    /**
     * @return the nomsColonnes
     */
    public String[] getNomsColonnes() {
        return nomsColonnes;
    }

    /**
     * @param nomsColonnes the nomsColonnes to set
     */
    public void setNomsColonnes(String[] nomsColonnes) {
        this.nomsColonnes = nomsColonnes;
    }

    /**
     * @return the rows
     */
    public Vector<Object[]> getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(Vector<Object[]> rows) {
        this.rows = rows;
    }
    
    public void LoadDataTravailleVisiteur(ArrayList<Travailler> lesTravaux)
    {
        nomsColonnes = new String[]{"Régions","Selectionner"};
        rows = new Vector<>();
        for (Travailler trav : lesTravaux)
        {
            rows.add(new Object[]{trav.getRegCode()});
        }
        fireTableChanged(null);
    
    }
}
