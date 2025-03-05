/*
	Write a class named Rectangle to represent 
	a rectangle. It contains following members:
	Data: width (double) and height (double) 
	that specify the width and height of the 
	rectangle.
	Methods: 
	1. A no-arg (default) constructor that creates 
	a default rectangle.
	2. A constructor that creates a rectangle 
	with the specified width and height.
	3. A method named getArea() that returns 
	the area of this rectangle.
	4. A method named getPerimeter() that 
	returns the perimeter. 


*/

class Rectangle{
	double width;
	double height;

	public Rectangle(){
		this.width = 5;
		this.height = 5;
	}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double getArea(){
		return this.width * this.height;
	}

	public double getPerimeter(){
		return 2 * this.width + 2 * this.height;
	}
}
public class FinalExample1{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10,5);

		r1.getArea();
		r2.getPerimeter();
	}
}