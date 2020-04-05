package MonEcole;

import java.io.IOException;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EcoleTest extends TestCase {
	Ecole e = Ecole.getInstance();
	
	public EcoleTest() {
		super();
		}
	
	
	public void testAfficherEtudiantsEcole() throws IOException {	
		Etudiant etu = new Etudiant("El Alami", "Maha", 1234, 24 ) ;
		int tailleAvant = e.getEtudiants().size();
		e.ajouterEtudiant(etu);
		assertEquals (tailleAvant+1, e.getEtudiants().size());
	}

}
