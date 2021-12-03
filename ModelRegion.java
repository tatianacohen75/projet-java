/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Laboratoire;
import Entity.Region;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alexk
 */
public class ModelRegion extends AbstractTableModel {
    
    private String[] nomsColonnes= {"Regions"};
    private Vector<String[]> rows;

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

    @Override
    public String getColumnName(int column) {
        return nomsColonnes[column]; 
    }
    public void loadDatas(ArrayList<Region> lesRegions)
    {
        rows = new Vector<>();
        for(Region reg : lesRegions)
        {
            rows.add(new String[]{reg.getRegNom()});
        }
        fireTableChanged(null);
    }
}


