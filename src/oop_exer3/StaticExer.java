package oop_exer3;
/*
 * static�ؼ��ֵ�Ӧ��:
 * */
public class StaticExer {
	public static void main(String[] args) {
		Circle c1=new Circle();
		
		Circle c2=new Circle();
		Circle c3=new Circle(3.4);
		System.out.println("c1��id:"+c1.getId());
		System.out.println("c2��id:"+c2.getId());
		System.out.println("c3��id:"+c3.getId());
		System.out.println("������Բ�ĸ���Ϊ:"+Circle.getTotal());
	}
}
class Circle{
	private double radius;
	private int id;//�Զ���ֵ
	
	private static int total;//��¼������Բ�ĸ���
	private static int init=1001;//static���������Ա����ж���������
	
	public Circle() {
		id=init++;
		total++;
	}
	public Circle(double radius) {
		this();
//		id=init++;
//		total++;
		this.radius=radius;
	}
	
	public double findArea() {
		return Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static int getTotal() {
		return total;
	}

	public int getId() {
		return id;
	}
	
}