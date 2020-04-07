package mesInterfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import MonEcole.Fenetre;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
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
	public Accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(450, 315);
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
		
		JLabel lblNewLabel_1 = new JLabel("Gestion administrative");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 160, 122));
		lblNewLabel_1.setBounds(148, 35, 182, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ajouter un nouvel \u00E9tudiant Sportif");
		btnNewButton.setForeground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AjouterEtudiantSportif();
			}
		});
		btnNewButton.setBounds(25, 62, 383, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAjouterUnNouvel = new JButton("Ajouter un nouvel \u00E9tudiant Musicien");
		btnAjouterUnNouvel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAjouterUnNouvel.setForeground(new Color(220, 20, 60));
		btnAjouterUnNouvel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AjouterEtudiantMusicien();
			}
		});
		btnAjouterUnNouvel.setBounds(25, 126, 383, 36);
		frame.getContentPane().add(btnAjouterUnNouvel);
		
		JButton btnListeDestudiants = new JButton("Liste des \u00E9tudiants");
		btnListeDestudiants.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnListeDestudiants.setForeground(new Color(220, 20, 60));
		btnListeDestudiants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Fenetre(null);
			}
		});
		btnListeDestudiants.setBounds(25, 190, 383, 36);
		frame.getContentPane().add(btnListeDestudiants);
		
		
	}
}
