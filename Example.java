package examples;

public class Example {
	
	//GRAZIE alla classe astratta SHAPE 
	//si può creare un ARRAY che CONTIENE indifferentemente ISTANZE delle classi CIRCLE e RECTANGLE
	
	//una classe può estendere (EXTENDS) solo una e una sola classe
	
	//class DrawableCircle extends Circle, DrawableShape---->WRONG!!!!
	
	
	//public class DrawableRectangle
	//extends Rectangle
	//implements Drawable, Sizeable, Draggable     ----->IT'S OK!!!!!!
	
	public static void main(String args[]) {
		
		//ABSTRACT CLASSES
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(2.5);
		shapes[1] = new Rectangle(1.2, 3.0);
		shapes[2] = new Rectangle(5.5, 3.8);
		double totalArea = 0;
		for (int i = 0; i < shapes.length; i++)
			totalArea = totalArea + shapes[i].area();
		
		
		//INTERFACES
		
		Drawable[] drawables = new Drawable[3];
		drawables[0] = new DrawableRectangle(1.2, 3.0);
		drawables[1] = new DrawableRectangle(5.5, 3.8);
		for (int i = 0; i < drawables.length; i++) {
			drawables[i].setPosition(i * 10.0, i * 20.0);
			drawables[i].draw();
	}
		
	}
	
	
	
}