package array_code;
/*	�ݹ鷽����ʹ��:
 *  1.�ݹ鷽��: һ���������ڵ���������
 *  2.�����ĵݹ������һ����ʽ��ѭ���������ظ�ִ��ĳ�δ��룬�������ظ�ִ������ѭ�����ơ�
 *  3.�ݹ�һ��Ҫ����֪����ݹ飬�������ֵݹ�ͱ��������ݹ飬��������ѭ����
 * 
 * */
public class RecursionTest {
	public static void main(String[] args) {
		//��1:����1-100֮��������Ȼ��֮��
		//��ʽ1
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//��ʽ2
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
	//��1:����1-n֮��������Ȼ��֮��
	public int getSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}
	//��2:����1-n֮��������Ȼ��֮��:n!
	public int getMul(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*getMul(n-1);
		}
	}
	//��3:��֪��һ������,f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n);
	//����n�Ǵ��������������f(10)��ֵ
	public int f(int n) {
		if(n==0) {
			return 1;
		}else if(n==1) {
			return 4;
		}else {
			return 2*f(n-1)+f(n-2);
		}
	}
	//��4:쳲���������
	public int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
	//��5:��ŵ������
	//��6:����
}
