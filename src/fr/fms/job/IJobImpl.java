package fr.fms.job;

import fr.fms.entities.Circle;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Représente l'implementation de l'interface IJob.
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link } — point représentant le centre de la forme</li>
 * </ul>
 */
public class IJobImpl implements IJob {

	/**
     * représente une hashMap de forme.
     */
    private final Map<Integer, Shape> shapes;

    /**
     * Construit une nouvelle hashMap de formes.
     *
     */
    public IJobImpl() {
        shapes = new HashMap<>();
    }
    /**
     * Ajoute une forme dans la hashMap.
     *
     * @param id : identifiant de la forme dans la hashMap.
     * @param shape : la forme 
     */
    @Override
    public void addShape(int id, Shape shape) {
        shapes.put(id, shape);
    }
    /**
     * Efface une forme dans la hashMap.
     *
     * @param id : identifiant de la forme dans la hashMap. 
     */
    @Override
    public void deleteShape(int id) {
        shapes.remove(id);
    }
    /**
     * Obtenir une forme dans la hashMap à partir de son id.
     *
     * @param id : identifiant de la forme dans la hashMap.
     * @return la forme contenue dans la hashMap
     */
    @Override
    public Shape getShapeById(int id) {
        return shapes.get(id);
    }
    /**
     * Déplacer une forme par ses coordonnées.
     *
     * @param id : identifiant de la forme dans la hashMap. 
     * @param x : coordonnée horizontale du point
     * @param y : coordonnée verticale du point
     */
    @Override
    public void moveShape(int id, int x, int y) {
        Shape shape = shapes.get(id);
        shape.getCenter().setX(x);
        shape.getCenter().setY(y);
    }
    /**
     * Dessiner une forme quelque soit son type par ses coordonnées.
     *
     * @param shape : le type de la forme
     * @param g : contexte graphique utilisé pour dessiner les formes
     */
    @Override
    public void drawShape(Shape shape, Graphics g) {
        int x = shape.getCenter().getX();
        int y = shape.getCenter().getY();

        if (shape instanceof Square) {

            int side = ((Square) shape).getSide();
            g.fillRect(x - side / 2, y - side / 2, side, side);

        } else if (shape instanceof Circle) {

            double radius = ((Circle) shape).getRadius();
            g.fillOval((int) (x - radius / 2), (int) (y - radius / 2), (int) radius, (int) radius);

        }
    }
    /**
     * Afficher toutes les formes
     */
    @Override
    public void displayAll() {
        for(Shape s : shapes.values()) {
            System.out.println(s);
        }
    }
}
