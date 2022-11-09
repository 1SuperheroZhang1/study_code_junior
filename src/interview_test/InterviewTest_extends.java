package interview_test;

/* 多态性面试题:
 * 1.谈谈你对多态性的理解？
 *   ①实现代码的通用性。
 *   ②举例: Object类中定义的public boolean equals(Object obj){}
 *   ③JDBC: 使用Java程序(获取数据库、CRUD(实现对数据库的增、删、改、查))操作数据库(MySQL、Oracle、DB2、SQL Server)
 *   ④抽象类、接口的使用肯定体现了多态性(抽象类、接口不能实例化)
 * 2.多态是编译时行为还是运行时行为？
 *   运行时行为
 * 面试题:
 * 	1.final、finally、finalize的区别
 *  2.==和equals()的区别
 * */
public class InterviewTest_extends {
	public static void main(String[] args) {
		Base_ base=new Sub_();
		base.add(1,2,3);//Sub_1
		
		Sub_ sub=new Sub_();
		sub.add(1,2,3);//Sub_2
	}
}
class Base_{
	public void add(int a,int...arr) {
		System.out.println("Base_");
	}
}
class Sub_ extends Base_{
	public void add(int a,int[] arr) {
		System.out.println("Sub_1");
	}
	public void add(int a,int b,int c) {
		System.out.println("Sub_2");
	}
}