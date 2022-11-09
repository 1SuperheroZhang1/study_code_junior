package oop_exer2;

public class GeometricObject_ {
	protected String color;
	protected double weight;
	
	public GeometricObject_() {
		super();
		this.color="white";
		this.weight=1.0;
	}

	public GeometricObject_(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	
}
