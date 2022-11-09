package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * try-catch-finally当中finally的使用:
 * 1. finally是可选的。
 * 2. finally中声明的是一定会被执行的代码。即使catch中有出现异常、try中有return语句、
 *    catch中有return语句等情况。
 * 3. 向数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动的回收的，我们需要自己
 *    手动的进行资源的释放。此时的资源释放就需要写在finally当中。
 * */
public class FinallyTest {
	@Test
	public void test2() {
		FileInputStream fis=null;
		try {
			File file=new File("test.txt");
			fis = new FileInputStream(file);
			
			int data=fis.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)//避免出现NullPointerException异常
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Test
	public void methodTest() {
		method();
	}
	public int method() {
		try {
			int arr[]=new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("我一定会被执行");
		}
	}
	@Test
	public void test1() {
		int a=10;
		int b=0;
		try {			
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("我好帅呀！哈哈哈哈哈哈哈哈哈~~");
		}
	}
}
