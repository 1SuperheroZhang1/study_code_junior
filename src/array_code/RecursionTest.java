package array_code;
/*	递归方法的使用:
 *  1.递归方法: 一个方法体内调用它自身
 *  2.方法的递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制。
 *  3.递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 * 
 * */
public class RecursionTest {
	public static void main(String[] args) {
		//例1:计算1-100之内所有自然数之和
		//方式1
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//方式2
		RecursionTest test=new RecursionTest();
		int add=test.getSum(100);
		System.out.println(add);
		int mul=test.getMul(5);
		System.out.println(mul);
		int f=test.f(10);
		System.out.println(f);
		int fib=test.fib(8);
		System.out.println(fib);
	}
	//例1:计算1-n之内所有自然数之和
	public int getSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}
	//例2:计算1-n之内所有自然数之积:n!
	public int getMul(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*getMul(n-1);
		}
	}
	//例3:已知有一个数列,f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n);
	//其中n是大于零的整数，求f(10)的值
	public int f(int n) {
		if(n==0) {
			return 1;
		}else if(n==1) {
			return 4;
		}else {
			return 2*f(n-1)+f(n-2);
		}
	}
	//例4:斐波那契数列
	public int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
	//例5:汉诺塔问题
	//例6:快排
}
