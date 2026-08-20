package fr.fms.entities;
/**
 * Représente un carré avec ses côtés
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link #side} — longueur d'un côté</li>
 * </ul>
 */
public class Square extends Shape{
	/**
     * Longueur d'un côté
     */
	private int side;

	/**
	 * Construit un carré à partir de la longueur d'un côté
	 *
	 * @param side longueur d'un côté
	 */
	public Square(int side, int x, int y) {
		super(x, y);
		this.side = side;
	}

	/**
	 * @return the side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(int side) {
		if(side < 0) {
			side = 1;
		} else {
		this.side = side;
		}
	}
	/**
	 * Calcule l'aire du carré
	 *
	 * @return l'aire du carré
	 */
	public double area() {
		return this.side * this.side;
	}
	/**
	 * Calcule le périmètre
	 *
	 * @return le périmètre
	 */
	public double perimeter() {
		return 4 * side;
	}
	/**
	 * Methode toString()
	 */
	@Override
	public String toString() {
		return "Square side : " + side + super.toString();
	}
}
