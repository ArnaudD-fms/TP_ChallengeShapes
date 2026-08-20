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
	public static final double FRAME_WIDTH = 350.0;
	public static final double FRAME_HEIGHT = 250.0;

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
        setSize((int) Math.round(FRAME_WIDTH), (int) Math.round(FRAME_HEIGHT));

        add(new Panel());

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
