package fr.fms.job;

import fr.fms.entities.Shape;

import java.awt.*;

/**
 * Définit les méthodes métiers
 */
public interface IJob {
    /**
     * Ajoute une forme dans une map
     *
     * @param id clé de la map
     * @param shape la forme à ajouter
     */
    public void addShape(int id, Shape shape);

    /**
     *
     * Supprime une forme de la map
     *
     * @param id identifiant de la forme à supprimer
     */
    public void deleteShape(int id);

    /**
     *
     * Récupère une forme via son identifiant
     *
     * @param id clé de le map
     * @return la forme correspondant à l'id
     */
    public Shape getShapeById(int id);

    /**
     *
     * Déplace une forme depuis son centre
     *
     * @param id identifiant de la forme
     * @param x coordonnée horizontale du centre
     * @param y coordonnée verticale du centre
     */
    public void moveShape(int id, int x, int y);

    /**
     * Dessine la forme
     */
    public void drawShape(Shape shape, Graphics g);

    /**
     * Affiche toutes les formes
     */
    public void displayAll();
}
