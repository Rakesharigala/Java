package javaprojectfirstpackage;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int calculateArea() {
		if (side <= 0) {
			return -1;
		} else {
			return side * side;
		}
	}

	public int calculatePerimeter() {
		if (side <= 0) {
			return -1;
		} else {
			return 4 * side;
		}

	}

	public static void main(String args[]) {
		Square s = new Square(5);
		System.out.println("the areea of the square=" + s.calculateArea());
		System.out.println("the perimeter of the square=" + s.calculatePerimeter());
	}

}
