package oop_exer2;

public class Circle_ extends GeometricObject_ {
	private double radius;

	public Circle_() {
		super();
		this.radius=1.0;
	}

	public Circle_(double radius) {
		super();
		this.radius = radius;
	}

	public Circle_(double radius,String color,double weight) {
		super(color,weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Circle) {
			Circle c=(Circle)obj;
			
			return this.radius==c.getRadius();
		}
		return false;
	}
	public String toString(Object obj) {
		return "Circle[radius="+radius+"]";
	}
	
}
