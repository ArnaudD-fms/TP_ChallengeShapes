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
    void addShape(int id, Shape shape);

    /**
     *
     * Supprime une forme de la map
     *
     * @param id identifiant de la forme à supprimer
     */
    void deleteShape(int id);

    /**
     *
     * Récupère une forme via son identifiant
     *
     * @param id clé de le map
     * @return la forme correspondant à l'id
     */
    Shape getShapeById(int id);

    /**
     *
     * Déplace une forme depuis son centre
     *
     * @param id identifiant de la forme
     * @param x coordonnée horizontale du centre
     * @param y coordonnée verticale du centre
     */
    void moveShape(int id, int x, int y);

    /**
     * Affiche toutes les formes
     */
    void displayAll();

    /**
     * Dessine une forme dans le contexte graphique donné
     *
     * @param shape la forme à desssiner
     * @param g le contexte graphique dans lequel dessiner la forme
     */
    void drawShape(Shape shape, Graphics g);

    /**
     * Dessine toutes les formes présentent dans la map
     *
     * @param g le contexte graphique dans lequel dessiner les forme
     */
    void drawShapes(Graphics2D g);
}
