package entities;

import entities.enums.Color;

public abstract class Shape {
	//Classes abstratas n�o podem ser instanciadas
	
	private Color color;
	
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	//Metodos abstratos s�o implementados apenas nas classes filhas
}
