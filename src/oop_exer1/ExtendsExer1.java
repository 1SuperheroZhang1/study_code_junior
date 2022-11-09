package oop_exer1;
/* 3.在CylinderTest类中创建Cylinder类的对象，
 *   设置圆柱的底面半径和高，并输出圆柱的体积。
 * */
public class ExtendsExer1 {
	public static void main(String[] args) {
		Cylinder cy=new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume();
		System.out.println("圆柱的体积为"+volume);
		//没有重写findArea()方法的时候
//		double area = cy.findArea();
//		System.out.println("圆柱的底面积为"+area);
		//重写findArea()方法的时候
		double area = cy.findArea();
		System.out.println("圆柱的表面积为"+area);
	}
}
class __Circle__{
	private double radius;//半径

	public __Circle__() {
		radius=1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//返回圆的面积
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
class Cylinder extends __Circle__{
	private double length;//高

	public Cylinder() {
		length=1.0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double findVolume() {
//		return Math.PI*getRadius()*getRadius()*getLength();
		return super.findArea()*getLength();
	}
	public double findArea() {
		return Math.PI*getRadius()*getRadius()*2+2*Math.PI*getRadius()*getLength();
	}
	
}