package MonEcole;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Musicien extends Etudiant {
	
	private String instrumentJoue ;
	
	
	public Musicien (String n, String p, int cE, int a, String iJ) throws IOException {
		super (n, p, cE, a);
		this.instrumentJoue = iJ;
	
		
		JSONObject jsonob = new JSONObject ();
		jsonob.put ("nom", n);
		jsonob.put ("prenom", p);
		jsonob.put ("codeEtudiant", cE);
		jsonob.put ("age", a);
		jsonob.put("instrumentJoue", iJ);
		
		FileWriter file = new FileWriter(n+".json");
		file.write(jsonob.toString());
		file.flush();
		file.close();
		System.out.println(jsonob);
	}


	public String getInstrumentJoue() {
		return instrumentJoue;
	}


	public void setInstrumentJoue(String instrumentJoue) {
		this.instrumentJoue = instrumentJoue;
	}
	

}
