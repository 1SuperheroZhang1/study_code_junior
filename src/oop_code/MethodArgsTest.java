package oop_code;
/* 
 * �ɱ�����β�: ����ֱ�Ӷ����ܺͶ��ʵ����ƥ����β�
 * �ɱ�����βεķ���
 * 1.JDK 5.0 ����������
 * 2.����ʹ��
 * 		2.1 �ɱ�����βεĸ�ʽ: �������� ... ������
 * 		2.2 �����ÿɱ�����βεķ���ʱ������Ĳ���������0����1������
 *      2.3 �ɱ�����βεķ������뱾���У���������ͬ���ββ�ͬ�ķ���֮�䣬�������ء�
 *      2.4 �ɱ�����βεķ������뱾���У���������ͬ���β�������ͬ�ķ���֮�䣬���������ء�
 *          ���仰˵�����߲��ܹ���
 *      2.5 �ɱ�����β��ڷ������β��У�����������ĩβ
 *      2.6 �ɱ�����β��ڷ������β��У����ֻ������һ���ɱ�����β�
 * */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test=new MethodArgsTest();
		test.show(12);
//		test.show("Hello");
//		test.show(new String[] {"AA","BB","CC"});//--->����Ϊ��������
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
