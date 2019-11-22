package examples;

public abstract class Shape {// SE la classe ha almeno un metodo ABSTRACT ALLORA acnhe essa è ABSTRACT 
	                         //e si deve usare la KEYWORD anche per la classe
	
	//CLASSE ASTRATTA:
	//Uno o più metodi non sono implementati (almeno un metodo) ma solo dichiarati
	
	//Non si possono creare istanze di classi astratte
	
	public abstract double area(); //un metodo astratto è marcato con la porola chiave ABSTRACT
	//il metodo non fa niente in particolare --> non è implementato
	//Sono consapevole che per ogni forma posso calcolare un'area
	//ma calcolo l'area in maniera differente a seconda della forma geometrica

	public abstract double perimeter();
	

}
