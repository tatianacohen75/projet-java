/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Secteur;
import Entity.Visiteur;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alexk
 */
public class ModelVisiteur extends AbstractTableModel{
    
    private String[] nomsColonnes ;
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
    public void loadDatas(ArrayList<Visiteur> lesVisiteurs)
    {
        rows = new Vector<>();
        nomsColonnes = new String[]{"Matricule", "Nom", "Prenom", "Adresse", "CP", "Ville", "Secteur","Laboratoire"};
        for(Visiteur vis : lesVisiteurs)
        {
            rows.add(new String[]{String.valueOf(vis.getVisMatricule()),vis.getVisNom(),vis.getVisPrenom(),vis.getVisAdresse(),String.valueOf(vis.getVisCp()),vis.getVisVille(),vis.getSecteur(),vis.getLabo()});
        }
        fireTableChanged(null);
    }
     public void loadDatas3Colonnes(ArrayList<Visiteur> lesVisiteurs)
    {
        rows = new Vector<>();
        nomsColonnes = new String[]{"Matricule","Nom", "Prénom"};
        for(Visiteur vis : lesVisiteurs)
        {
            rows.add(new String[]{String.valueOf(vis.getVisMatricule()),vis.getVisNom(),vis.getVisPrenom()});
        } // j'ai pas mis le secteur et le laboratoire vu que c'est en sec sa fait erreur vu qu'ici on est en vis signée NA mdr
        fireTableChanged(null);
    }
}


