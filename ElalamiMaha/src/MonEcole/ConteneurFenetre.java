package MonEcole;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ConteneurFenetre extends JPanel {
	
	private JLabel etiquette;
	private JButton bouton;	
	private JTextField champTexte;
	private JLabel imageLbl;
	private ImageIcon iconPhoto;
	private JTable table;
	
	public ConteneurFenetre(ArrayList<Etudiant> etudiants) {
		super();
		this.proprietesConteneur(etudiants);

		
	}
	
	private void proprietesConteneur(ArrayList<Etudiant> etudiants) {
		//this.setLayout(null); //pour n'utiliser aucun gestionnaire de disposition, c ns qui choisissons ou mettre quoi
		this.proprietesEtiquette();
		//this.propBouton();
		//this.propChampTexte();
		//this.affichImage();		
		this.propTable(etudiants);
	}
	
	private void proprietesEtiquette(){
		etiquette = new JLabel();
		this.etiquette.setBounds(20, 10, 350, 20);
		this.etiquette.setText("Liste des etudiants de l'ecole");
		this.add(etiquette);
	}
	
	//private void propBouton() {
		//this.bouton = new JButton();
		//this.bouton.setText("Appuyer");
		//this.bouton.setBounds(30, 50, 90, 20);
		//this.add(bouton);
		
	//}
	
	//private void propChampTexte() {
		//champTexte = new JTextField();
		//this.champTexte.setBounds(130, 50, 100, 20);
		//this.add(champTexte);
	//}
	
	private void propTable(ArrayList<Etudiant> etudiants) {
		MyTableModel model = new MyTableModel (etudiants);
		table = new JTable(model);
		this.table.setBounds(20, 10, 350, 500);
		this.add(table.getTableHeader());
		this.add(table);
	}
	
	//private void affichImage() {
		//imageLbl = new JLabel();
		//iconPhoto = new ImageIcon("images/imagejava.jpg");
		//this.imageLbl.setBounds(100, 100, 66, 66);
		//this.imageLbl.setIcon(iconPhoto); // pr mettre l'image dans le conteneur
		//this.add(imageLbl);
		
		
			
		//}
	}
	


