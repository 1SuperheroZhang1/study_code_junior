package oop_exer;
/* 
 * 练习2 利用面向对象的编程方法，设计类Circle计算圆的面积。
 * */
public class ClassTest1_Circle {
	public static void main(String[] args) {
		Circle c1=new Circle();
		
		c1.radius=2.1;
		//对应方式一:
//		double area=c1.findArea();
//		System.out.println(area);
		//对应方式二:
		c1.findArea();
	}
}
//圆
class Circle{
	//属性
	double radius;
	
	//求圆的面积
	//方法一:
//	public double findArea() {
//		double area=Math.PI*radius*radius;
//		return area;
//	}
	//方法二:
	public void findArea() {
		double area=Math.PI*radius*radius;
		System.out.println("面积为"+area);
	}
}
