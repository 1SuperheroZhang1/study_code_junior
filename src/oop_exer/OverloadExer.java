package oop_exer;
/* 练习
 * 1.编写程序: 定义三个重载方法并调用。方法名为mOL
 * 			  三个方法分别接收一个int型参数、两个int型参数、一个字符串参数。
 * 			  分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 			  在主类的main()方法中分别用参数区别调用三个方法。
 * 2.编写程序:定义三个重载方法max()
 * 			  第一个方法求两个int值中的最大值
 * 			  第二个方法求两个double值中的最大值
 * 			  第三个方法求三个double值中的最大值
 * 			  并分别调用三个方法
 * */
public class OverloadExer {
	//1. 如下的三个方法构成重载
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	public void mOL(String str) {
		System.out.println(str);
	}
	//2. 如下三个方法构成重载
	public int max(int x,int y) {
		return (x>y)?x:y;
	}
	public double max(double d1,double d2) {
		return (d1>d2)?d1:d2;
	}
	public double max(double d1,double d2,double d3) {
		return (d1>d2)?((d1>d3)?d1:d3):((d2>d3)?d2:d3);
	}
}
