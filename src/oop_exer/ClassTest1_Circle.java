package oop_exer;
/* 
 * ��ϰ2 �����������ı�̷����������Circle����Բ�������
 * */
public class ClassTest1_Circle {
	public static void main(String[] args) {
		Circle c1=new Circle();
		
		c1.radius=2.1;
		//��Ӧ��ʽһ:
//		double area=c1.findArea();
//		System.out.println(area);
		//��Ӧ��ʽ��:
		c1.findArea();
	}
}
//Բ
class Circle{
	//����
	double radius;
	
	//��Բ�����
	//����һ:
//	public double findArea() {
//		double area=Math.PI*radius*radius;
//		return area;
//	}
	//������:
	public void findArea() {
		double area=Math.PI*radius*radius;
		System.out.println("���Ϊ"+area);
	}
}
