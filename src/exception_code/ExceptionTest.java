package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 1.异常: 在Java语言中，将程序执行中发生的不正常情况称为"异常"
 * 2.Java程序在执行过程中所发生的异常事件可分为两类:
 * 		>Error: Java虚拟机无法解决的严重问题。 如:JVM系统内部错误，资源耗尽等严重错误
 * 			比如: StackOverflowError和OOM(OutOfMemoryError)。一般不编写针对性的代码进行处理。
 * 		>Exception: 其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。
 * 			例如: 
 * 			>空指针访问
 * 			>试图读取不存在的文件
 * 			>网络连接中断
 * 			>数组角标越界
 * 		>对于这些错误，一般有两种解决方法: 一是遇到错误就终止程序的运行。
 * 			另一种方法是由程序员在编写程序时，就考虑到错误的检测、错误信息的提示，以及错误的处理。
 * 		>捕获错误最理想的是在编译期间，但有的错误只有在运行时才会发生。比如: 除数为0、数组下标越界等
 * 			>分类: 编译时异常和运行时异常
 * 一、异常的体系结构
 * 
 * 	java.lang.Throwable
 * 		|------java.lang.Error: 一般不编写针对性的代码进行处理
 * 		|------java.lang.Exception: 可以进行异常的处理
 * 				|------编译时异常(checked)
 * 						 |------IOException
 * 								 |------FileNotFoundException
 * 						 |------ClassNotFoundException
 * 				|------运行时异常(unchecked RunTimeException)
 * 						 |------NullPointerException
 * 						 |------ArrayIndexOutOfBoundsException
 * 						 |------ClassCastException
 * 						 |------NumberFormatException
 * 						 |------InputMismatchException
 * 						 |------ArithmeticException
 *   编译时异常: 执行javac.exe命令时，可能出现的异常
 *   运行时异常: 执行java.exe命令时，可能出现的异常
 * 面试题: 常见的异常都有哪些？举例说明
 * 
 * */
public class ExceptionTest {
	
	//*****************以下是编译时异常****************
	//@Test
//	public void test7() {
//		File file=new File("test.txt");
//		FileInputStream fis=new FileInputStream(file);
//		
//		int data=fis.read();
//		while(data!=-1) {
//			System.out.print((char)data);
//			data=fis.read();
//		}
//		fis.close();
//	}
	 
	//*****************以下是运行时异常****************
	//6.ArithmeticException - 算术异常
	@Test
	public void test6() {
		int a=10;
		int b=2;
		b=0;
		System.out.println(a/b);
	}
	//5.InputMismatchException
	@Test
	public void test5() {
		Scanner sc=new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println(score);
		sc.close();
	}
	//4.NumberFormatException - 数值转换异常
	@Test
	public void test4() {
		String str="123";
		str="abc";
		int num=Integer.parseInt(str);
		System.out.println(num);
	}
	//3.ClassCastException - 类型转换异常
	@Test
	public void test3() {
		Object obj=new Date();
		String str=(String)obj;
	}
	//2.ArrayIndexOutOfBoundsException - 数组角标越界异常
	@Test
	public void test2() {
//		int[] arr=new int[10];
//		System.out.println(arr[10]);
		
		String str="abc";
		System.out.println(str.charAt(3));//StringIndexOutOfBounds
	}
	//1.NullPointerException - 空指针异常
	@Test
	public void test1() {
//		int[] arr=null;
//		System.out.println(arr[3]);
		
		String str="abc";
		str=null;
		System.out.println(str.charAt(0));
	}
}
