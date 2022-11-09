package oop_code3;
/*
 * final:���յ�
 * 1. final�����������εĽṹ: �ࡢ������������
 * 2. final��������һ����:���಻�ܱ�������̳С�
 *  		����: String�ࡢSystem�ࡢStringBuffer��
 * 
 * 3. final�������η���: �����˷��������Ա���д
 * 			����: Object���е�getClass()����
 * 4.final�������α���: ��ʱ��"����"�ͳ�Ϊ��һ������
 * 		4.1 final��������: ���Կ��Ǹ�ֵ��λ����: ��ʽ��ʼ����������ʼ�����������г�ʼ��
 * 		4.2 final���ξֲ�����:
 * 				������ʹ��final�����β�ʱ���������β���һ��������
 *              �����ǵ��ô˷���ʱ���������βθ�һ��ʵ�Σ�
 *              һ����ֵ�Ժ󣬾�ֻ���ڷ������ڽ���ʹ�ô��βΣ������ܽ������¸�ֵ��
 *              
 *  static final ��������:��������(ȫ�ֳ���)�����η���
 * */
public class FinalTest {
	final int WIDTH=10;
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	{
		LEFT=1;//final���ε����Կ����ڴ�����и�ֵ
	}
	public FinalTest(){
		RIGHT=2;//final���ε����Կ����ڹ������г�ʼ��
	}
	public FinalTest(int n){
		RIGHT=n;
	}
	public void show() {
		final int NUM=10;//����
//		NUM+=20;//The final local variable NUM cannot be assigned. It must be blank and not using a compound assignment
	}
	public void show(final int num) {
//		num=20;//���벻ͨ��
		System.out.println(num);
	}
//	public void doWidth() {
//		width=20;//The final field FinalTest.width cannot be assigned
//	}
//	public void setDown(int down) {
//		this.DOWN=down;
//	}
	public static void main(String[] args) {
		int num=10;
		num=num+5;
		
		FinalTest test=new FinalTest();
//		test.setDown(4);
		test.show(10);
	}
}
final class FinalA{
	
}
//class B extends FinalA{//The type B cannot subclass the final class FinalA
//	
//}
//class C extends String{//The type C cannot subclass the final class String
//	
//}
class AA{
	public final void show() {
		
	}
}
class BB extends AA{
//	public void show() {//Cannot override the final method from AA
//			
//	}
}