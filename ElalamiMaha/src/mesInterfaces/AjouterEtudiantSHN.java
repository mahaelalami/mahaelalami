package mesInterfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import MonEcole.Sportif;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AjouterEtudiantSHN {

	private JFrame frame;
	private JTextField nom;
	private JTextField prenom;
	private JTextField codeEtudiant;
	private JTextField age;
	private JTextField pole;
	private JTextField sportPratique;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterEtudiantSHN window = new AjouterEtudiantSHN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AjouterEtudiantSHN() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(450, 311);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Ecole de Haute-Savoie");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Ecole de Haute-Savoie");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 127, 80));
		lblNewLabel.setBounds(128, 11, 206, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nouvel Etudiant Sportif de Haut Niveau");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 160, 122));
		lblNewLabel_1.setBounds(86, 38, 282, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNom.setForeground(new Color(205, 92, 92));
		lblNom.setBounds(10, 60, 46, 14);
		frame.getContentPane().add(lblNom);
		
		nom = new JTextField();
		nom.setBounds(120, 60, 109, 20);
		frame.getContentPane().add(nom);
		nom.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom :");
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrenom.setForeground(new Color(205, 92, 92));
		lblPrenom.setBounds(10, 90, 62, 14);
		frame.getContentPane().add(lblPrenom);
		
		prenom = new JTextField();
		prenom.setBounds(120, 90, 109, 20);
		frame.getContentPane().add(prenom);
		prenom.setColumns(10);
		
		JLabel lblCodeEtudiant = new JLabel("Code d'\u00E9tudiant :");
		lblCodeEtudiant.setForeground(new Color(205, 92, 92));
		lblCodeEtudiant.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodeEtudiant.setBounds(10, 120, 109, 14);
		frame.getContentPane().add(lblCodeEtudiant);
		
		JLabel lblAge = new JLabel("Age : ");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setForeground(new Color(205, 92, 92));
		lblAge.setBounds(10, 150, 46, 14);
		frame.getContentPane().add(lblAge);
		
		JLabel lblPole = new JLabel("P\u00F4le :");
		lblPole.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPole.setForeground(new Color(205, 92, 92));
		lblPole.setBounds(10, 185, 46, 14);
		frame.getContentPane().add(lblPole);
		
		JLabel lblSportPratique = new JLabel("Sport pratiqu\u00E9 :");
		lblSportPratique.setForeground(new Color(205, 92, 92));
		lblSportPratique.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSportPratique.setBounds(10, 210, 100, 14);
		frame.getContentPane().add(lblSportPratique);
		
		codeEtudiant = new JTextField();
		codeEtudiant.setBounds(120, 120, 109, 20);
		frame.getContentPane().add(codeEtudiant);
		codeEtudiant.setColumns(10);
		
		age = new JTextField();
		age.setBounds(120, 150, 109, 20);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		pole = new JTextField();
		pole.setBounds(119, 180, 110, 20);
		frame.getContentPane().add(pole);
		pole.setColumns(10);
		
		sportPratique = new JTextField();
		sportPratique.setBounds(120, 210, 109, 20);
		frame.getContentPane().add(sportPratique);
		sportPratique.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	
					Sportif sp = new Sportif (nom.getText(),prenom.getText(), 
							Integer.parseInt(codeEtudiant.getText()), 
							Integer.parseInt(age.getText()), pole.getText(), sportPratique.getText());
				} catch (NumberFormatException | IOException e1) {
					
					e1.printStackTrace();
				
				}
			}
		}
		);
		
		
		
		btnValider.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnValider.setForeground(new Color(128, 0, 0));
		btnValider.setBounds(312, 227, 112, 23);
		frame.getContentPane().add(btnValider);
		
		JButton btnNewButton_1 = new JButton("R\u00E9initialiser");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nom.setText("");
				prenom.setText("");
				codeEtudiant.setText("");
				age.setText("");
				pole.setText("");
				sportPratique.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setForeground(new Color(178, 34, 34));
		btnNewButton_1.setBounds(312, 201, 112, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
