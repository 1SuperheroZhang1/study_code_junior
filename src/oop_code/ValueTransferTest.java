package oop_code;
/*
 * 一、关于变量的赋值
 * 		如果变量是基本数据类型，则此时赋值的是变量所保存的数据值
 *      如果变量是引用数据类型，则此时赋值的是变量所保存的数据的地址值
 * 二、方法形参的传递机制
 *        1.形参: 方法定义时，声明的小括号内的参数
 *        2.实参: 调用方法时，实际传递给形参的数据。
 *     2.1 值传递机制:
 *      如果参数是基本数据类型，则此时实参赋给形参的是实参真实存储的数据值。
 *      如果参数是引用数据类型，则此时实参赋给形参的是实参存储数据的地址值。
 *      
 * */
public class ValueTransferTest {
	public static void main(String[] args) {
		//一、关于变量的赋值
//		System.out.println("***************基本数据类型****************");
//		int m=10;
//		int n=m;
//		System.out.println("m="+m+" n="+n);
//		
//		n=20;
//		System.out.println("m="+m+" n="+n);
//		System.out.println("***************引用数据类型****************");
//		Order o1=new Order();
//		o1.orderid=1001;
//		Order o2=o1;//赋值以后，o1和o2地址值相同，都指向了堆空间中同一个对象实体。
//		System.out.println("o1.orderid="+o1.orderid+",o2.orderid="+o2.orderid);
//		o2.orderid=1002;
//		System.out.println("o1.orderid="+o1.orderid+",o2.orderid="+o2.orderid);
		//二、方法形参的传递机制
		//2.1 值传递机制
		//交换两个变量值的操作
//		int m=10;
//		int n=20;
//		System.out.println("m="+m+",n="+n);
//		
////		int tmp=m;
////		m=n;
////		n=tmp;
//		
//		ValueTransferTest test=new ValueTransferTest();
//		test.swap(m,n);
//		System.out.println("m="+m+",n="+n);
		//2.2 址传递机制
		Data data=new Data();
		
		data.m=10;
		data.n=20;
		System.out.println("m="+data.m+",n="+data.n);
		//交换m和n的值
//		int tmp=data.m;
//		data.m=data.n;
//		data.n=tmp;
		ValueTransferTest test1=new ValueTransferTest();
		test1.swap(data);
		System.out.println("m="+data.m+",n="+data.n);
		
	}
//	public void swap(int m,int n) {
//		int tmp=m;
//		m=n;
//		n=tmp;
//	}
	public void swap(Data data) {
		int tmp=data.m;
		data.m=data.n;
		data.n=tmp;
	}
}
class Order{
	int orderid;
}
class Data{
	int m;
	int n;
}
