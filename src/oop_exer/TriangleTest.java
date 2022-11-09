package oop_exer;
/* 练习9
 * 编写两个类:Triangle和TriangleTest,其中Triangle类中声明私有的底边长base和高height，
 * 			 同时声明公共方法访问私有变量，此外，提供类必要的构造器，另一个类中使用这些公共方法，
 *           计算三角形面积
 * 
 * */
public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.setBase(2.0);
		t1.setHeight(2.4);
		//t1.base=2.0;
		//t1.height=2.4;//
		System.out.println("base:"+t1.getBase()+"height:"+t1.getHeight());
	}
}
