package oop_code3;
/*
 * 3.2 JDK8 :���˶��徲̬�����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ�����
 * 		3.2.1 �ӿ��е�Ĭ�Ϸ���
 * 				>��һ���ӿ��ж�����һ��Ĭ�Ϸ���������һ���ӿ���Ҳ������һ��ͬ��ͬ�����ķ���
 * 				 (���ܴ˷����Ƿ���Ĭ�Ϸ���)����ʵ����ͬʱʵ�����������ӿ�ʱ�������--->�ӿڳ�ͻ
 * 				>��һ���ӿ��ж�����һ��Ĭ�Ϸ�������������Ҳ������һ��ͬ��ͬ�����ķǳ��󷽷���
 *               �򲻻���ֳ�ͻ���⡣��Ϊ��ʱ����: ������ԭ�򡣽ӿ��о�����ͬ���ƺͲ�����Ĭ�Ϸ���������
 * 
 * 
 * */
public class InterfaceTest1 {
	public static void main(String[] args)
	{
		Subclass s=new Subclass();
//		s.method1();//The method method1() is undefined for the type Subclass
//		Subclass.method1();
		//֪ʶ��1: �ӿ��ж���ľ�̬������ֻ��ͨ���ӿ������á�
		CompareA.method1();
		//֪ʶ��2: ͨ��ʵ����Ķ��󣬿��Ե��ýӿ��ж����Ĭ�Ϸ����� 
		//         ���ʵ������д�˽ӿ��е�Ĭ�Ϸ���������ʱ�����õ���ʵ��������д��Ĭ�Ϸ�����
		s.method2();
		//֪ʶ��3: �������(��ʵ����)�̳еĸ����ʵ�ֵĽӿ���������ͬ��ͬ������Ĭ�Ϸ�����
		//         ��ô������û����д�˷���������£�Ĭ�ϵ��õ��Ǹ�����ͬ��ͬ������Ĭ�Ϸ�����--->������ԭ��
		//֪ʶ��4: ���ʵ����ʵ���˶���ӿڣ��������ӿ��ж�����ͬ��ͬ������Ĭ�Ϸ�����
		//         ��ô��ʵ����û����д�˷���������£�����  --->�ӿڳ�ͻ
		//         �����Ҫ���Ǳ�����ʵ��������д�˷�����
		s.method3();
	}
}
 interface CompareA {
	//��̬����
	public static void method1() {
		System.out.println("CompareA:����");
	}
	//Ĭ�Ϸ���
	public default void method2() {
		System.out.println("CompareA:�Ϻ�");
	}
	default void method3() {
		System.out.println("CompareA:�Ϻ�");
	}
}
interface CompareB{
	default void method3() {
		System.out.println("CompareB:�Ϻ�");
	}
}
class Superclass{
	public void method3() {
		System.out.println("Superclass: �Ϻ�");
	}
}
class Subclass extends Superclass implements CompareA,CompareB{
	
	public void method2() {
		System.out.println("Subclass:�Ϻ�");
	}
	public void method3() {
		System.out.println("Subclass:����");
	}
	//֪ʶ��5: ���������(ʵ����)�ķ����е��ø��ࡢ�ӿ��б���д�ķ�����
	public void MyMethod() {
		method3();//�����Լ��������д�ķ���
		super.method3();//���ø���ķ���
		//���ýӿ��ж����Ĭ�Ϸ���
		CompareA.super.method3();
		CompareB.super.method3();
	}
}