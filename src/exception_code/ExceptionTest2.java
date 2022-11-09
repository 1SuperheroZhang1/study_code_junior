package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 异常处理机制二: throws + 异常类型
 * 
 * 1. "throws+异常类型"写在方法的声明处，指明执行此方法时，可能会抛出的异常类型。
 * 	   一旦当方法体执行时出现异常，仍会在异常代码处产生相应的异常对象，此对象满足throws后面
 *     声明的异常类型时，就会被抛出。异常代码后续的代码，就不再执行！
 *     
 * 2. 体会: try-catch-finally: 真正将异常处理掉了。
 *          throws+异常类型: 只是将异常抛给了方法的调用者。并没有真正的将异常处理掉。
 * 
 * 3. 开发中如何选择使用try-catch-finally 还是使用throws？
 * 		3.1 如果父类中被重写的方法没有throws方式抛出异常，则子类重写的方法也不能使用throws，
 *          意味着，如果子类重写的方法中如果有异常，则必须使用try-catch-finally方式处理。
 *      3.2 如果执行的方法中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。
 *          建议这几个方法使用throws的方式进行处理。而执行的方法可以考虑使用try-catch-finally
 *          方式进行处理。
 * */
public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			method2();			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void method2() throws FileNotFoundException, IOException {
		method1();
	}
	public static void method1() throws FileNotFoundException,IOException{
		File file=new File("test.txt");
		FileInputStream fis=new FileInputStream(file);
		
		int data=fis.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=fis.read();
		}
		fis.close();
	}
}
