package MonEcole;
import java.util.ArrayList;


public class Ecole {
	static Ecole e = new Ecole();//design pattern
	private ArrayList <Etudiant> etudiants = new ArrayList <Etudiant>();
	private Ecole() {//design patt // constructeur prive vide
	}
	
	
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

	public static Ecole getInstance() {//design pattern
		return e;
	}
}