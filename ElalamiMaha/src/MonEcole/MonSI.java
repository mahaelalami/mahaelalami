package MonEcole;

import java.io.IOException;

import javax.swing.JTable;

import mesInterfaces.Accueil;
import mesInterfaces.AjouterEtudiantMusicien;
import mesInterfaces.AjouterEtudiantSportif;

public class MonSI {

	public static void main(String[] args) throws IOException{
		
		
		Ecole e;
		e = Ecole.getInstance();
		e.afficherEtudiantsEcole();
		
		Sportif s1, s2, s3, s4, s5;
			s1 = new Sportif ("El Alami" , "Maha" , 1234 , 24 ,"Annecy" , "Natation");
			s2 = new Sportif ("Belbouhali" , "Fadoua" , 3456 , 25 ,"Chambery" , "Tennis");
			s3 = new Sportif ("Bouhaloua" , "Lina" , 5678 , 24 ,"Aix-Les-Bains" , "Football");
			s4 = new Sportif ("Kiki" , "Amine" , 7890 , 25 ,"Annecy" , "Basketball");
			s5 = new Sportif ("Farouki" , "Asmae" , 9012 , 24 ,"Chambery" , "Handball");
			
		Musicien m1, m2;
		m1 = new Musicien ("Ennouini", "Sofia", 8542, 25, "Piano");
		m2 = new Musicien ("Dupont", "Charles", 2589, 24, "Guitare");
		
		
			
		
		
		
		e.ajouterEtudiant(s1);
		e.ajouterEtudiant(s2);
		e.ajouterEtudiant(s3);
		e.ajouterEtudiant(s4);
		e.ajouterEtudiant(s5);
		e.ajouterEtudiant(m1);
		e.ajouterEtudiant(m2);
		
		
		
		
		//MyTableModel model = new MyTableModel(e.getEtudiants());
		
		//JTable tableau = new JTable(model);
		
		Fenetre fenetrePrincipale = new Fenetre(e.getEtudiants());
		//fenetrePrincipale.add(tableau);
		fenetrePrincipale.setVisible(true);

		

		
		
		new Accueil();
		//new AjouterEtudiantSportif ();
		//new AjouterEtudiantMusicien();
		
		
	

	}

}
