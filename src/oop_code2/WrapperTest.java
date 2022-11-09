package oop_code2;

import org.junit.Test;

/*
 * 包装类(Wrapper)的使用:
 * 1.针对8种基本数据类型定义了相应的引用数据类型 ---> 包装类(封装类)
 *   有了类的特点，就可以调用类的方法，Java才是真正的面向对象
 * 2.包装类的分类:
 * 		基本数据类型 			包装类
 * 		byte					Byte               父类:Number
 * 		short					Short			   父类:Number
 * 		int						Integer			   父类:Number
 * 		long					Long			   父类:Number
 * 		float					Float			   父类:Number
 * 		double					Double			   父类:Number
 * 		boolean					Boolean		
 * 		char					Character
 * 3.掌握: 基本数据类型、包装类、String类型三者之间的转换
 * */
public class WrapperTest {

	//String类型--- >基本数据类型、包装类: 调用包装类的parseXxx(String s)方法
	//注意: 转换时，可能会报出NumberFormatException异常
	@Test
	public void test5() {
		String str="123";
		//错误的情况:
//		int num1=(int)str;
//		Integer in1=(Integer)str;
		//可能会报NumberFormatException异常
		int num2=Integer.parseInt(str);
		System.out.println(num2+1);
		
		String str1="true";
		boolean b1 = Boolean.parseBoolean(str1);
		System.out.println(b1);//true
		
		String str2="true1";
		boolean b2 = Boolean.parseBoolean(str2);
		System.out.println(b2);//false
	}
	
	//基本数据类型、包装类--- >String类型: 调用String重载的valueOf(Xxx xxx)
	@Test
	public void test4() {
		int num1=10;
		//方式1:连接运算
		String str1=num1+"";
		//方式2:调用String类的valueOf(Xxx xxx)方法
		float f1=12.3f;
		String str2=String.valueOf(f1);
		System.out.println(str2);//12.3
		
		Double d1=new Double(12.4);
		String str3=String.valueOf(d1);
		System.out.println(d1);//12.4
	}
	/*
	 * JDK 5.0 新特性: 自动装箱与自动拆箱
	 * 
	 * */
	@Test
	public void test3() {
		int num1=10;
		//基本数据类型--- >包装类对象
//		method(num1);
//		System.out.println(num1);
		//自动装箱: 基本数据类型--- >包装类
		int num2=10;
		Integer in1=num2;//自动装箱
		
		boolean b1=true;
		Boolean b2=b1;//自动装箱
		
		//自动拆箱: 包装类--- >基本数据类型
		System.out.println(in1.toString());
		int num3 = in1;
		
	}
	public void method(Object obj) {
		
	}
	//包装类--- >基本数据类型: 调用包装类的xxxValue()
	@Test
	public void test2() {
		Integer in1=new Integer(12);
		
		int i1=in1.intValue();
		System.out.println(i1+1);
		
		Float f1=new Float(12.3f);
		float f2=f1.floatValue();
		System.out.println(f2+1);
		
	}
	//基本数据类型--- >包装类: 调用包装类的构造器
	@Test
	public void test1() {
		int num1=10;
		
		Integer in1=new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2=new Integer("123");
		System.out.println(in2.toString());
		
		//报异常
//		Integer in3=new Integer("123abc");
//		System.out.println(in3.toString());//NumberFormatException
		
		Float f1=new Float(12.3f);
		Float f2=new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1=new Boolean(true);
		
		Boolean b2=new Boolean("tRuE");
		System.out.println(b2);//true
		Boolean b3=new Boolean("true123");
		System.out.println(b3);//false
		
		_Order_ order=new _Order_();
		System.out.println(order.isMale);//false
		System.out.println(order.isFemale);//null
		
	}
}
class _Order_{
	boolean isMale;
	Boolean isFemale;
}
