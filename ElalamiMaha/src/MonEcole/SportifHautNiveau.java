package MonEcole;

import java.io.IOException;

public class SportifHautNiveau extends Etudiant {
	private String pole;
	private String sportPratique;
	
	public SportifHautNiveau (String n, String p, int cE, int a, String po, String sp) throws IOException {
		super (n, p, cE, a);
		this.pole = po;
		this.sportPratique = sp;
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
