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
		
		
		new Accueil();
		
	

	}

}
