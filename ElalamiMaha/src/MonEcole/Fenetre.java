package MonEcole;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	
	ConteneurFenetre pan;
	
	public Fenetre(ArrayList<Etudiant> etudiants) {
		super();
		proprietesFenetre(etudiants);
		
	}
	
	private void proprietesFenetre(ArrayList<Etudiant> etudiants) {
		this.setSize(400, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		pan = new ConteneurFenetre(etudiants);
		this.setContentPane(pan);
		this.setVisible(true);

	}

}
