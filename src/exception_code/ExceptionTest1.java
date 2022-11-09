package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * 异常的处理
 *  异常处理机制一:
 *  	> Java提供的是异常处理的抓抛模型
 *  	> Java程序的执行过程中如果出现异常，会生成一个异常类对象，该异常对象将被提交给Java运行时
 *  	  系统，这个过程称为抛出(throw)异常
 *  	> 异常对象的生成
 *  		>由虚拟机自动生成，程序运行过程中，虚拟机检测到程序发生了问题，如果在当前代码中没有找到
 *  		 相应的处理程序，就会在后台自动创建一个对应异常类的实例对象并抛出———— 自动抛出。
 *  		> 由开发人员手动创建: Exception exception=new ClassCastException();
 *  		  ———— 创建好的异常对象不抛出对程序没有任何影响，和创建一个普通对象一样。
 *  
 * 一、异常的处理: 抓抛模型
 * 	  过程一: "抛": 程序在正常执行的过程中，一旦出现异常，就会在异常代码处产生相应的异常对象，
 * 					并将此对象抛出。
 * 					一旦抛出对象以后，其后的代码不再执行。
 * 
 * 				关于异常对象的产生:① 系统自动生成的异常对象
 * 								  ② 手动的生成一个异常对象，并抛出(throw)
 * 
 *    过程二: "抓": 可以理解为异常的处理模式: ① try-catch-finally ② throws
 * 二、try-catch-finally的处理
 * 	try{
 * 		//可能产生异常的代码
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * ....
 * finally{
 * 		//一定会执行的代码
 * }
 * 
 * 说明:
 *   1. finally是可选的。
 *   2. 使用try将可能出现异常的代码包装起来，在执行过程中，一旦出现异常，就会对应产生一个异常类对象。
 *      根据此对象的类型，去catch中进行匹配
 *   3. 一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常处理。一旦处理完成，就跳出当前的
 *      try-catch结构(在没有写finally的情况下)，继续执行其后的代码
 *   4. catch中的异常类型，如果没有子父类关系，声明位置不做要求。
 *      catch中的异常类型，如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错。
 *   5. 常用的异常对象处理方式:
 *   	①String getMessage();
 *   	②printStackTrace();
 *   6. 在try结构中声明的变量，在出了try结构以后，就不能再被调用了。
 *   7. try-catch-finally结构可以嵌套。
 *   
 *  体会1: 使用try-catch-finally处理编译时异常，使得程序在编译时就不再报错，但运行时仍可能报错。
 *         相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。
 *  体会2: 开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally。
 *         针对于编译时异常，一定要考虑异常的处理。
 * */
public class ExceptionTest1 {
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
	public void test1() {
		String str="123";
		str="abc";
		int num=0;
		try {
			 num=Integer.parseInt(str);
			System.out.println("hello----------1");
		}catch(NullPointerException e) {
			System.out.println("出现空指针异常了，不要着急...");
		}catch(NumberFormatException e) {
//			System.out.println("出现数值转换异常了，不要着急...");
//			String getMessage();
//			System.out.println(e.getMessage());
			//printStackTrace();
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("出现异常了，不要着急...");
		}
		System.out.println(num);
		System.out.println("hello----------2");
	}
}
