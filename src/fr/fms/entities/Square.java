package fr.fms.entities;

public class Square extends Shape{

	private int side;

	/**
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
	
	public double area() {
		return this.side * this.side;
	}
	
	public double perimeter() {
		return 4 * side;
	}
	
	@Override
	public String toString() {
		return "Square side : " + side + super.toString();
	}
}
