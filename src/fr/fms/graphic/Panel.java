package fr.fms.graphic;

import fr.fms.entities.Circle;
import fr.fms.entities.Square;
import fr.fms.job.IJob;
import fr.fms.job.IJobImpl;

import javax.swing.*;
import java.awt.*;

import static fr.fms.graphic.Frame.FRAME_HEIGHT;
import static fr.fms.graphic.Frame.FRAME_WIDTH;

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
     * Redéfinit le composant graphique et affiche les formes.
     *
     * @param graphics : contexte graphique utilisé pour dessiner les formes
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        double scaleX = getWidth() / FRAME_WIDTH;
        double scaleY = getHeight() / FRAME_HEIGHT;

        // On récupère la valeur minimale afin de ne pas avoir de déformation lors du redimensionnement.
        double scale = Math.min(scaleX, scaleY);

        Graphics2D graphics2D = (Graphics2D) graphics.create();

        // Permet d'adapter la taille des formes lors du redimensionnement de la fenêtre
        graphics2D.scale(scale, scale);

        job.drawShapes(graphics2D);

        graphics2D.dispose(); // Supprime le contexte graphique et libère les ressources systèmes attribuées
    }
}