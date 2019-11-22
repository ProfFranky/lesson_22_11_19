package examples;

public interface Drawable {
	
	//un INTERFACE simile ad una classe BASTRACT 
	
	//DIFFERENZE:
	//TUTTI i METODI NON sono IMPLEMENTATI
	//
	
	public void setColor(int c);

	public void setPosition(double x, double y);

	public void draw();
}