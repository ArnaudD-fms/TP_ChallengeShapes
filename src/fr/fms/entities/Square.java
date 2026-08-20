package fr.fms.entities;
/**
 * Représente un carré avec ses cotés
 *
 * <p>Attributs :</p>
 * <ul>
 *     <li>{@link #side} — longueur d'un coté</li>

 * </ul>
 */
public class Square extends Shape{
	/**
     * longueur d'un coté
     */
	private int side;

	/**
	 * Construit un carré à partir de la longueur d'un coté
	 * @param side
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
	 * calcule l'aire du carré
	 * @return l'aire du carré
	 */
	public double area() {
		return this.side * this.side;
	}
	/**
	 * calcule le périmètre
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
