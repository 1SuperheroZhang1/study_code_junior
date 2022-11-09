package oop_exer1;
/* 3.��CylinderTest���д���Cylinder��Ķ���
 *   ����Բ���ĵ���뾶�͸ߣ������Բ���������
 * */
public class ExtendsExer1 {
	public static void main(String[] args) {
		Cylinder cy=new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume();
		System.out.println("Բ�������Ϊ"+volume);
		//û����дfindArea()������ʱ��
//		double area = cy.findArea();
//		System.out.println("Բ���ĵ����Ϊ"+area);
		//��дfindArea()������ʱ��
		double area = cy.findArea();
		System.out.println("Բ���ı����Ϊ"+area);
	}
}
class __Circle__{
	private double radius;//�뾶

	public __Circle__() {
		radius=1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//����Բ�����
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
class Cylinder extends __Circle__{
	private double length;//��

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