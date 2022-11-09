package oop_code3;
/*
* 对属性可以赋值的位置:
* ①默认初始化
* ②显式初始化/⑤代码块初始化
* ③构造器初始化
* ④有了对象以后，通过使用"对象.属性"或"对象.方法"的方式，进行赋值。
* 
* 执行的先后顺序: ① - ②/⑤ - ③ - ④
*/
public class OrderTest {
	public static void main(String[] args) {
		Order_ order=new Order_();
		System.out.println(order.orderId);
	}
}
class Order_{
	int orderId=3;
	{
		orderId=4;
	}
}