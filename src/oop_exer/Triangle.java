package oop_exer;

public class Triangle {
	private double base;//
	private double height;//
	
	public Triangle() {
		
	}
	public Triangle(double b,double h) {
		base=b;
		height=h;
	}
	
	public void setBase(double b) {
		base=b;
	}
	public double getBase() {
		return base;
	}
	public void setHeight(double h) {
		height=h;
	}
	public double getHeight() {
		return height;
	}
}
