package MonEcole;
import java.util.ArrayList;


public class Ecole {
	private ArrayList <Etudiant> etudiants = new ArrayList <Etudiant>();
	
	public ArrayList<Etudiant> getEtudiants(){
		return etudiants;
	}
	public void setEtudiants (ArrayList<Etudiant> Etudiants) {
		this.etudiants = etudiants;
	}
	public void afficherEtudiantsEcole () {
		System.out.println ("Les etudiants de l'ecole : ");
		for (int i = 0 ; i<this.getEtudiants().size() ; i++) {
			System.out.println(this.getEtudiants().get(i).toString());
		}
	}
		
	public void ajouterEtudiant (Etudiant e) {
		this.etudiants.add(e);
	}
	
}