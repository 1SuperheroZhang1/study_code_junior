package oop_exer;
/* 练习6 将对象作为参数传递给方法
 * (1)定义一个Circle类，包含一个double型的radius属性代表圆的半径。
 *    一个findArea()方法求面积。
 * (2)定义一个类PassObject,在类中定义一个方法printAreas(),该方法的定义如下:
 *    public void printAreas(Circle c,int time)
 *    在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *    例如，time为5，则输出半径为1，2，3，4，5，以及对应的圆面积
 * (3)在main方法中调用printAreas()方法，调用完毕后输出当前半径值，程序运行结果。
 * */
public class ValueTransferExer {
	public static void main(String[] args) {
		PassObject test=new PassObject();
		Circle_ c=new Circle_();
		test.printAreas(c, 5);
		System.out.println("now radius is:"+c.radius);
	}
}

class Circle_{
	double radius;//半径
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
class PassObject{
	public void printAreas(Circle_ c,int time) {
		System.out.println("Radius\t\tArea");
		int i=0;
		for(i=1;i<=time;i++) {
			//设置圆的半径
			c.radius=i;
			System.out.println(c.radius+"\t\t"+c.findArea());
		}
		c.radius=i;
	}
}
