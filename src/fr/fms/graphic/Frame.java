package fr.fms.graphic;

import javax.swing.*;
/**
 * Représente une fenetre d'affichage.
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link} — Identifiant de version utilisé lors 
 *     						 de la sérialisation de la classe.</li>
 * </ul>
 */
public class Frame extends JFrame {

    /**
	 * Identifiant de version utilisé lors de la sérialisation de la classe.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Crée et affiche la fenêtre principale de l'application.
	 * Configure le titre, les dimensions, le panneau principal
	 * et la fermeture de l'application.
	 */
	public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Shapes challenge");
        setSize(350, 250);

        add(new Panel());

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
