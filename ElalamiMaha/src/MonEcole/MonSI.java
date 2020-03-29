package MonEcole;

import java.io.IOException;

public class MonSI {

	public static void main(String[] args) throws IOException {
		
		Ecole e;
		e = new Ecole();
		
		SportifHautNiveau s1, s2, s3, s4, s5;
		s1 = new SportifHautNiveau ("El Alami" , "Maha" , 1234 , 24 ,"Annecy" , "Natation");
		s2 = new SportifHautNiveau ("Belbouhali" , "Fadoua" , 3456 , 25 ,"Chambery" , "Tennis");
		s3 = new SportifHautNiveau ("Bouhaloua" , "Lina" , 5678 , 24 ,"Aix-Les-Bains" , "Football");
		s4 = new SportifHautNiveau ("Kiki" , "Amine" , 7890 , 25 ,"Annecy" , "Basketball");
		s5 = new SportifHautNiveau ("Farouki" , "Asmae" , 9012 , 24 ,"Chambery" , "Handball");
		
		Etudiant et1;
		et1 = new Etudiant ("Dupont", "Charles", 1879, 25);
		
		
		e.ajouterEtudiant(s1);
		e.ajouterEtudiant(s2);
		e.ajouterEtudiant(s3);
		e.ajouterEtudiant(s4);
		e.ajouterEtudiant(s5);
		e.ajouterEtudiant(et1);
		
		
		
		
		
		
		
		
	

	}

}
