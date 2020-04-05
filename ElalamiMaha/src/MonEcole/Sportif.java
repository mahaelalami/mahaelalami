package MonEcole;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Sportif extends Etudiant {
	private String pole;
	private String sportPratique;
	
	public Sportif (String n, String p, int cE, int a, String po, String sp) throws IOException{
		super (n, p, cE, a);
		this.pole = po;
		this.sportPratique = sp;
		
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
	
	

	public String getPole() {
		return pole;
	}

	public void setPole(String pole) {
		this.pole = pole;
	}

	public String getSportPratique() {
		return sportPratique;
	}

	public void setSportPratique(String sportPratique) {
		this.sportPratique = sportPratique;
	}
	
}
