package oop_code;
/*
 *方法的重载(overload): loading...
 *1.定义: 在同一个类中，允许存在一个以上同名的方法，只要方法的参数个数不同或参数类型不同。
 *		"两同一不同":
 *			"两同": 同一个类、相同方法名
 *			"一不同": 参数列表不同(参数个数不同、参数类型不同)
 *2.举例: 
 *   Arrays类中重载的sort() / binarySearch()
 *3.判断是否是重载:
 *		和方法的返回值类型、权限修饰符、形参变量名、方法体都没有关系！
 *4.在通过对象调用方法时，如何确定某一个指定的方法？
 *	①方法名
 *	②参数列表
 */
public class OverloadTest {
	public static void main(String[] args) {
		OverloadTest test=new OverloadTest();
		test.getSum(1, 2);
	}
	//如下的4个方法，就构成了重载
	public void getSum(int i,int j) {
		System.out.println(i+j);
		System.out.println("1");
	}
	public void getSum(double d1,double d2) {
		System.out.println("2");
	}
	public void getSum(String s,int i) {
		System.out.println("3");
	}
	public void getSum(int i,String s) {
		System.out.println("4");
	}
//	public int getSum(int i,int j) {
//		return i+j;
//	}
//	public void getSum(int m,int n) {
//		
//	}
//	private void getSum(int i,int j) {
//		
//	}
}
