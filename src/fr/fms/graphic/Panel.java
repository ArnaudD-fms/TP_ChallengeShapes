package fr.fms.graphic;

import fr.fms.entities.Circle;
import fr.fms.entities.Square;
import fr.fms.job.IJob;
import fr.fms.job.IJobImpl;

import javax.swing.*;
import java.awt.*;

/**
 * Représente un panneau d'affichage.
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link} — Identifiant de version utilisé lors 
 *     						 de la sérialisation de la classe.</li>
 * </ul>
 */
public class Panel extends JPanel {
	
    /**
	 * Identifiant de version utilisé lors de la sérialisation de la classe.
	 */
	private static final long serialVersionUID = 1L;
	IJob job = new IJobImpl();

    public Panel() {
        job.addShape(1, new Square(50, 100, 100));
        job.addShape(2, new Circle(20, 150, 150));
    }

    /**
     * Redessine le composant et affiche les formes associées aux identifiants 1 et 2.
     *
     * @param g : contexte graphique utilisé pour dessiner les formes
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        job.drawShape(job.getShapeById(1), g);
        job.drawShape(job.getShapeById(2), g);
    }
}