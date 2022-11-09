package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 1.�쳣: ��Java�����У�������ִ���з����Ĳ����������Ϊ"�쳣"
 * 2.Java������ִ�й��������������쳣�¼��ɷ�Ϊ����:
 * 		>Error: Java������޷�������������⡣ ��:JVMϵͳ�ڲ�������Դ�ľ������ش���
 * 			����: StackOverflowError��OOM(OutOfMemoryError)��һ�㲻��д����ԵĴ�����д���
 * 		>Exception: �������̴����żȻ���������ص��µ�һ�������⣬����ʹ������ԵĴ�����д���
 * 			����: 
 * 			>��ָ�����
 * 			>��ͼ��ȡ�����ڵ��ļ�
 * 			>���������ж�
 * 			>����Ǳ�Խ��
 * 		>������Щ����һ�������ֽ������: һ�������������ֹ��������С�
 * 			��һ�ַ������ɳ���Ա�ڱ�д����ʱ���Ϳ��ǵ�����ļ�⡢������Ϣ����ʾ���Լ�����Ĵ���
 * 		>�����������������ڱ����ڼ䣬���еĴ���ֻ��������ʱ�Żᷢ��������: ����Ϊ0�������±�Խ���
 * 			>����: ����ʱ�쳣������ʱ�쳣
 * һ���쳣����ϵ�ṹ
 * 
 * 	java.lang.Throwable
 * 		|------java.lang.Error: һ�㲻��д����ԵĴ�����д���
 * 		|------java.lang.Exception: ���Խ����쳣�Ĵ���
 * 				|------����ʱ�쳣(checked)
 * 						 |------IOException
 * 								 |------FileNotFoundException
 * 						 |------ClassNotFoundException
 * 				|------����ʱ�쳣(unchecked RunTimeException)
 * 						 |------NullPointerException
 * 						 |------ArrayIndexOutOfBoundsException
 * 						 |------ClassCastException
 * 						 |------NumberFormatException
 * 						 |------InputMismatchException
 * 						 |------ArithmeticException
 *   ����ʱ�쳣: ִ��javac.exe����ʱ�����ܳ��ֵ��쳣
 *   ����ʱ�쳣: ִ��java.exe����ʱ�����ܳ��ֵ��쳣
 * ������: �������쳣������Щ������˵��
 * 
 * */
public class ExceptionTest {
	
	//*****************�����Ǳ���ʱ�쳣****************
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
	 
	//*****************����������ʱ�쳣****************
	//6.ArithmeticException - �����쳣
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
	//4.NumberFormatException - ��ֵת���쳣
	@Test
	public void test4() {
		String str="123";
		str="abc";
		int num=Integer.parseInt(str);
		System.out.println(num);
	}
	//3.ClassCastException - ����ת���쳣
	@Test
	public void test3() {
		Object obj=new Date();
		String str=(String)obj;
	}
	//2.ArrayIndexOutOfBoundsException - ����Ǳ�Խ���쳣
	@Test
	public void test2() {
//		int[] arr=new int[10];
//		System.out.println(arr[10]);
		
		String str="abc";
		System.out.println(str.charAt(3));//StringIndexOutOfBounds
	}
	//1.NullPointerException - ��ָ���쳣
	@Test
	public void test1() {
//		int[] arr=null;
//		System.out.println(arr[3]);
		
		String str="abc";
		str=null;
		System.out.println(str.charAt(0));
	}
}
