package fr.fms.entities;

public class Circle extends Shape {

	/**
	 * Attribut radius est le rayon du cercle.
	 */
	private double radius;
	
	/**
	 * Construit un cercle à partir des coordonnées de son centre.
	 * @param radius
	 * @param x
	 * @param y
	 */
	public Circle(double radius, int x, int y) {
		super(x, y);
		this.radius = radius;
	}
	
	/**
	 * Construit un cercle à partir des coordonnées d'un point.
	 * @param radius
	 * @param center
	 */
	public Circle(double radius, Point center) {
		super(center);
		this.radius = radius;
	}
	
	/**
	 * Construit un cercle à partir des données.
	 */
	public Circle() {
		super(0, 0);
		this.radius = 1;
	}
	
	/**
	 * Getter du rayon d'un cercle.
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Setter du rayon d'un cercle. Si le rayon est négatif alors le rayon est égale à 1. Sinon, le rayon est égale à la donnée mis en paramètre de la méthode.
	 * @param radius
	 */
	public void setRadius(double radius) {
		if(radius < 0) {
			radius = 1;
		} else {
			this.radius = radius;
		}
	}
	
	/**
	 * Méthode permettant d'avoir la surface d'un cercle.
	 * @return double
	 */
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	/**
	 * Méthode permettant d'avoir le périmétre d'un cercle.
	 * @return l'aire d'un cercle.
	 */
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	/**
	 * Représentation textuelle d'un cercle indiquant son rayon.
	 * @return une chaîne de caractères représentant un cercle.
	 */
	@Override
	public String toString() {
		return "Circle : radius = " + radius + super.toString();
	}
	
}
