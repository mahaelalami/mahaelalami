package mesInterfaces;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import MonEcole.Etudiant;

public class ConteneurFenetre extends JPanel {
	
	private JLabel etiquette;
	private JTable table;
	
	public ConteneurFenetre(ArrayList<Etudiant> etudiants) {
		super();
		this.proprietesConteneur(etudiants);
	}
	
	private void proprietesConteneur(ArrayList<Etudiant> etudiants) {
		this.proprietesEtiquette();	
		this.propTable(etudiants);
	}
	
	private void proprietesEtiquette(){
		etiquette = new JLabel();
		this.etiquette.setBounds(20, 10, 350, 20);
		this.etiquette.setText("Liste des etudiants de l'ecole");
		this.add(etiquette);
	}
	
	private void propTable(ArrayList<Etudiant> etudiants) {
		MyTableModel model = new MyTableModel (etudiants);
		table = new JTable(model);
		this.table.setBounds(20, 10, 350, 500);
		this.add(table.getTableHeader());
		this.add(table);
	}
	
	}
	


