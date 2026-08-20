package fr.fms.entities;

/**
 * Représente un point avec ses coordonnées
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link #x} — coordonnée horizontale du point</li>
 *     <li>{@link #y} — coordonnée verticale du point</li>
 * </ul>
 */
public class Point {
    /**
     * Coordonnée horizontale du point
     */
    private int x;

    /**
     * Coordonnée verticale du point
     */
    private int y;

    /**
     * Construit un point à partir de coordonnées x, y
     *
     * @param x coordonnée horizontale du point
     * @param y coordonnée verticale du point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Réprésentation textuelle des coordonnées d'un point.
     *
     * @return une chaîne de caractères indiquant les coordonnées x/y
     */
    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}
