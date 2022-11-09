package oop_exer2;
/* 定义三个类，父类GeometricObject代表几何形状，子类Circle表示圆形，MyRectangle表示矩形
 * 定义测试类GeometricTest，编写equalsArea()方法测试两个对象的面积是否相等(注意方法的参数类型，使用动态绑定技术)
 * 编写displayGeometricObject方法显示对象的面积(注意方法的参数类型，使用动态绑定技术)
 * */
public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test=new GeometricTest();
		Circle c1=new Circle(2.3,"white",1.0);
		test.displayGeometricObject(c1);
		Circle c2=new Circle(3.3,"white",1.0);
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalsAreas(c1, c2);
		System.out.println("c1和c2的面积是否相等:"+isEquals);
	}
	//判断两个对象面积是否相等
	public boolean equalsAreas(GeometricObject o1,GeometricObject o2){
		return o1.findArea()==o2.findArea();
	}
	//
	public void displayGeometricObject(GeometricObject obj) {//GeometricObject obj =new Circle(...);
		System.out.println("面积为:"+obj.findArea());
	}
}
