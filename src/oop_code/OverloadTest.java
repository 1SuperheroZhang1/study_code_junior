package oop_code;
/*
 *����������(overload): loading...
 *1.����: ��ͬһ�����У��������һ������ͬ���ķ�����ֻҪ�����Ĳ���������ͬ��������Ͳ�ͬ��
 *		"��ͬһ��ͬ":
 *			"��ͬ": ͬһ���ࡢ��ͬ������
 *			"һ��ͬ": �����б�ͬ(����������ͬ���������Ͳ�ͬ)
 *2.����: 
 *   Arrays�������ص�sort() / binarySearch()
 *3.�ж��Ƿ�������:
 *		�ͷ����ķ���ֵ���͡�Ȩ�����η����βα������������嶼û�й�ϵ��
 *4.��ͨ��������÷���ʱ�����ȷ��ĳһ��ָ���ķ�����
 *	�ٷ�����
 *	�ڲ����б�
 */
public class OverloadTest {
	public static void main(String[] args) {
		OverloadTest test=new OverloadTest();
		test.getSum(1, 2);
	}
	//���µ�4���������͹���������
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
