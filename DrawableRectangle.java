package examples;

public class DrawableRectangle extends Rectangle implements Drawable {
	
	//Si può IMPLEMENTARE PIU' DI UNA INTERFACCIA
	
	//RECTANGLE --> ABSTRACT CLASS
	//DRAWABLE  --> INTERFACE
	 
	protected int c;
	protected double x, y;

	//EXTENDS
	
	public DrawableRectangle(double w, double h) { 
		super(w, h);
	}

	public double area() {
		return w * h;
	}

	public double perimeter() {
		return 2 * (w + h);
	}


	//IMPLEMENTS

	public void setColor(int c) {
		this.c = c;
	}

	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	

	public void draw() {

	}
	
}