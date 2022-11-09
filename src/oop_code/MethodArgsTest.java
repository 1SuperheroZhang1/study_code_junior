package oop_code;
/* 
 * 可变个数形参: 允许直接定义能和多个实参相匹配的形参
 * 可变个数形参的方法
 * 1.JDK 5.0 新增的内容
 * 2.具体使用
 * 		2.1 可变个数形参的格式: 数据类型 ... 变量名
 * 		2.2 当调用可变个数形参的方法时，传入的参数可以是0个，1个或多个
 *      2.3 可变个数形参的方法，与本类中，方法名相同，形参不同的方法之间，构成重载。
 *      2.4 可变个数形参的方法，与本类中，方法名相同，形参类型相同的方法之间，不构成重载。
 *          换句话说，二者不能共存
 *      2.5 可变个数形参在方法的形参中，必须声明在末尾
 *      2.6 可变个数形参在方法的形参中，最多只能声明一个可变个数形参
 * */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test=new MethodArgsTest();
		test.show(12);
//		test.show("Hello");
//		test.show(new String[] {"AA","BB","CC"});//--->参数为数组的情况
		test.show("AA","BB","CC");
	}
	public void show(int i) {
		
	}
//	public void show(String s) {
//		System.out.println("show(String s)");
//	}
	public void show(String ... strs) {
		System.out.println("show(String ... strs)");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
//	public void show(String[] strs) {
//		
//	}
	public void show(int i,String ... strs) {
		
	}
//    public void show(String ... strs,int i) {
//		//err
//	//The variable argument type String of the method show must be the last parameter
//	}
}
