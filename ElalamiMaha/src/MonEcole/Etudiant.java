package MonEcole;


import java.io.IOException;



public class Etudiant {
	private String nom, prenom ;
	private int codeEtudiant;
	private int age;
	
	public Etudiant (String n, String p, int cE, int a) throws IOException{
		try {
			controle(a);
			this.nom = n;
			this.prenom = p;
			this.codeEtudiant = cE;
			this.age = a;
		} catch (SaisieErroneeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void setNom (String n) {
		this.nom = n;
	}
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getCodeEtudiant() {
		return codeEtudiant;
	}
	public void setCodeEtudiant(int codeEtudiant) {
		this.codeEtudiant = codeEtudiant;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {  
		try {// exception
			controle(a);
		} catch (SaisieErroneeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(a>=18) {
		}
		this.age = a;
		
	}
	
	public static void controle(int a) throws SaisieErroneeException{ //exception
		if(a<=18) {
			throw new SaisieErroneeException("Saisie erronee : age incorrect");
		}
	}
		}
	
	
	
	
	
	
	
