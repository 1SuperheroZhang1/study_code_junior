package oop_code2;

import org.junit.jupiter.api.Test;

/*
 * Java中的JUnit单元测试:
 * 步骤：
 * 1.选中当前工程 - 右键选择 - build path - addLibraries -JUnit 4 - 下一步
 * 2.创建Java类，进行单元测试。
 *   此时的Java类要求: 
 *       ①此类是公共的。
 *       ②该类要提供一个公共的无参的构造器。
 *3.在此类中声明单元测试方法。
 *	 此时的单元测试方法: 方法的权限是public,没有返回值,没有形参 
 *   一般方法名为 testXXX()
 *4.此单元测试方法上，需要声明一个注解: @Test,并在单元测试类中导入:
 *5.声明好单元测试方法以后，就可以在方法体内测试相关代码。
 *6.写完代码以后，左键双击方法名 - 右键RunAs - JUnit Test
 *
 *说明:
 *	1.如果执行结果没有异常:绿条。
 *  2.如果执行结果出现异常:出现红条。
 * */
public class JUnitTest {
	@Test
	public void testEquals() {
		String s1="MM";
		String s2="MM";
		System.out.println(s1.equals(s2));
		show();
	}
	public void show() {
		System.out.println("show()...");
	}
}
