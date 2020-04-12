package mesInterfaces;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import MonEcole.Etudiant;

public class MyTableModel extends AbstractTableModel {
	
	private final String[] entetes = { "Code d'Etudiant", "Nom", "Prenom", "Age"};
	private List<Etudiant> listEtudiants = new ArrayList <Etudiant> ();

	public MyTableModel (List<Etudiant> etudiants) {
		this.listEtudiants = etudiants ;
		
	}
	
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listEtudiants.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Etudiant et = listEtudiants.get(rowIndex);
		
		switch(columnIndex) {
		case 0 : 
			return et.getCodeEtudiant();
		case 1 :
			return et.getNom();
		case 2 :
			return et.getPrenom();
		case 3 :
			return et.getAge();
		default :
		
		return null;
		}
		
		
	}
		

}
