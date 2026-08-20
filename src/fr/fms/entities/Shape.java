package fr.fms.entities;

/**
 * Représente une forme géométrique abstraite définie par un point central.
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link #center} — point représentant le centre de la forme</li>
 * </ul>
 */
public abstract class Shape {
    /**
     * Point représentant le centre de la forme.
     */
    private Point center;

    /**
     * Construit une forme à partir des coordonnées de son centre.
     *
     * @param x coordonnée horizontale du centre
     * @param y coordonnée verticale du centre
     */
    public Shape(int x, int y) {
        this.center = new Point(x, y);
    }

    /**
     * Construit une forme à partir d'une instance de Point permettant de définir les coordonnées du centre de la forme.
     *
     * @param center instance de Point.
     */
    public Shape(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    /**
     * Calcule l'aire de la forme.
     *
     * @return l'aire de la forme
     */
    public abstract double area();

    /**
     * Représentation textuelle de la forme indiquant son centre.
     *
     * @return une chaîne de caractères représentant la forme
     */
    @Override
    public String toString() {
        return "Shape [center = " + center + "]";
    }
}
