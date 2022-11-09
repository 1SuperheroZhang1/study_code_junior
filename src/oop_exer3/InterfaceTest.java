package oop_exer3;
/*
 * 定义一个接口，用来实现两个对象的比较。
 * 
 * interface CompareObject{
 * 		public int CompareTo(Object o);//若返回值是0，代表相等。若为正数，代表前对象大。
 * 			若为负数，代表前对象小。
 * }
 * 
 * 定义一个Circle类，声明radius属性，提供getter和setter方法。
 * 
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在ComparableCircle类中
 * 给出接口中方法CompareTo的实现体，用来比较两个圆的半径大小。
 * 
 * 定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用CompareTo方法比较两个类的半径大小。
 * */
public class InterfaceTest {
	public static void main(String[] args) {
		ComparableCircle c1=new ComparableCircle(2.3);
		ComparableCircle c2=new ComparableCircle(2.1);
		int compareValue = c1.CompareTo(c2);
		if(compareValue>0) {
			System.out.println("c1对象大");
		}else if(compareValue<0) {
			System.out.println("c2对象大");
		}else {
			System.out.println("c1对象和c2对象一样大");
		}
		int compareValue1=c1.CompareTo(new String("AA"));
		System.out.println(compareValue1);
		
	}
}
interface CompareObject{
	//若返回值是0，代表相等。若为正数，代表前对象大。若为负数，代表前对象小。
	public int CompareTo(Object o);
}
class Circle_{
	private  Double radius;
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Circle_(Double radius) {
		super();
		this.radius = radius;
	}

	public Circle_() {
		super();
	}
	
	
}
class ComparableCircle extends Circle_ implements CompareObject{

	public ComparableCircle(Double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int CompareTo(Object o) {
		if(this==o) {
			return 0;
		}
		if(o instanceof ComparableCircle) {
			ComparableCircle c=(ComparableCircle)o;
			//错误的
//			return (int) (this.getRadius()-c.getRadius());
			//正确的方式一:
//			if(this.getRadius()>c.getRadius()) {
//				return 1;
//			}else if(this.getRadius()>c.getRadius()){
//				return -1;
//			}else {
//				return 0;
//			}
			//正确的方式一:
			//当属性radius声明为Double类型时，可以使用包装类的方法
			return this.getRadius().compareTo(c.getRadius());
		}
		else {
//			return 0;
			throw new RuntimeException("传入的数据类型不匹配");
		}
		
	}
	
}