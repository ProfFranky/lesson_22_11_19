package examples;

public class Circle extends Shape {

	//la classe CIRCLE deve implementare tutti i mtodi ABSTRACT di SHAPE
	
	protected double r;

	public Circle(double r) {
		this.r = r;
	}

	public double area() {//sulla sotto-classe CIRCLE posso invocare il METHOD della classe SHAPE
		return Math.PI * r * r;
	}

	public double perimeter() {//classe di SHAPE
		return 2 * r * Math.PI;
	}

	public double getRadius() {//il raggio è una proprietà del cerchio 
		                       //e non di tutte le forme geometriche
		return r;
	}



}
     
