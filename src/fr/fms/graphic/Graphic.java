/**
 * Programme permettant l'affichage de plusieurs formes g�om�triques
 * 
 * @author El babili - 2023
 * 
 */

package fr.fms.graphic;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Graphic extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Graphic() {
		super("Voici nos formes géométriques !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);		
		setLocationRelativeTo(null);	
		setVisible(true);			
	}
	
	@Override	//le repère x,y commence en haut à gauche (0,0)
	public void paint(Graphics g) {	
		super.paint(g);
	}
}
