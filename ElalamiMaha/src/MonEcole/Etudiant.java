package MonEcole;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Etudiant {
	private String nom, prenom ;
	private int codeEtudiant;
	private int age;
	
	public Etudiant (String n, String p, int cE, int a) throws IOException{
		this.nom = n;
		this.prenom = p;
		this.codeEtudiant = cE;
		this.age = a;
		
		JSONObject jsonob = new JSONObject ();
		jsonob.put ("nom", n);
		jsonob.put ("prenom", p);
		jsonob.put ("codeEtudiant", cE);
		jsonob.put ("age", a);
		
		FileWriter file = new FileWriter(n+".json");
		file.write(jsonob.toString());
		file.flush();
		file.close();
		System.out.println(jsonob);
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
		if(a>=18) {
		}
		this.age = a;
	}
	
	
	
	
	
	
	
}
