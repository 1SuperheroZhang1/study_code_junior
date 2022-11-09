package oop_code2;

import java.util.Date;

/*
 * ������������֮�� - ��̬�� - ��̬��������ʱ��Ϊ
 * 
 * 1.����̬��:һ������Ķ�����̬��(����ת��)
 * 2.��Ϊ��̬��:
 * 		���������ָ������Ķ���(������Ķ��󸳸����������)
 * 3.��̬��ʹ��:
 * 		���˶���Ķ�̬���Ժ������ڱ����ڣ�ֻ�ܵ��ø����������ķ�����
 * 		���������ڣ�����ʵ��ִ�е���������д����ķ�����
 *   �ܽ�: ���룬����ߡ�ִ�У����ұߡ�
 * 4.��̬�Ե�ʹ��ǰ��: �� ��ļ̳й�ϵ���� ��������д��
 * 5.����Ķ�̬��: ֻ�����ڷ�����������������(��������ж������)��
 * 6.�Զ�̬�Ե����: ʵ�ִ����ͨ���ԡ�
 * */
public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.eat();
		
		Man man=new Man();
		man.eat();
		man.age=25;
		man.earnMoney();
		
		//************************************************
		//����Ķ�̬��:���������ָ������Ķ���
		System.out.println("****************************************");
		Person p2=new Man();
//		Person p3=new Woman();
		//��̬��ʹ��:�������Ӹ���ͬ��ͬ�����ķ���ʱ��ʵ��ִ�е���������д����ķ�����--- ���ⷽ������ 
		p2.eat();
		p2.walk();
		
	    //p2.earnMoney();//The method earnMoney() is undefined for the type Person
//		System.out.println(p2.id);//1001
		
		System.out.println("****************************************");
		//���ܵ������������еķ���: ����ʱ��p2��Person���͡�
		
		p2.name="Tom";
		//p2.earnMoney();//The method earnMoney() is undefined for the type Person
		//p2.isSmoking=true;//isSmoking cannot be resolved or is not a field
		/* ���˶���Ķ�̬���Ժ��ڴ���ʵ�����Ǽ��������������е����Ժͷ����ģ��������ڱ�������Ϊ�������ͣ�
		 * ���±���ʱ��ֻ�ܵ��ø������������Ի򷽷����������е����Ժͷ������ܵ��á�
		 * */
		//��β��ܵ����������е����Ժͷ�����
		/* ����ת��:
		 * 		����ת�͵�ʵ��: ʹ��ǿ������ת����()
		 * 		��Ҫע�������: ���ܻ��׳�ClassCastException�쳣
		 * 		���������ķ���: ʹ��instanceof�ؼ���������ת��֮ǰ�����ж�
		 * */
		Man m1=(Man)p2;
		m1.earnMoney();
//		m1.isSmoking=true;
		
		//ʹ��ǿתʱ���п��ܻ����ClassCastException�쳣
//		Woman w1=(Woman)p2;
//		w1.goShopping();
		/*
		 * instanceof �ؼ��ֵ�ʹ��:
		 * 1.a instanceof A: �ж϶���a�Ƿ�����A��ʵ��������ǣ�����true��������ǣ�����false
		 * 
		 * 2.ʹ���龰: Ϊ�˱���������ת��ʱ����ClassCastException�쳣��
		 * ����������ת��֮ǰ���Ƚ���instanceof���жϣ�һ������true���ͽ�������ת�͡�
		 * �������false������������ת�͡�
		 * 
		 * 3.��� a instanceof A ����true���� a instanceof BҲ����true
		 *  ���У���B����A�ĸ��ࡣ
		 * 4.Ҫ��a������������A����������͸���Ĺ�ϵ������������
		 * */
		if(p2 instanceof Woman) {
			Woman w1=(Woman)p2;
			w1.goShopping();
			System.out.println("*******Woman********");
		}
		if(p2 instanceof Man) {
			Man m2=(Man)p2;
			m2.earnMoney();
			System.out.println("*******Man********");
		}
		if(p2 instanceof Person) {
			System.out.println("*******Person********");
		}
		if(p2 instanceof Object) {
			System.out.println("*******Object*******");
		}
		//��ϰ
		//����һ:����ʱͨ��������ʱ��ͨ��
		//����һ:
//		Person p3=new Woman();
//		Man m3=(Man)p3;
		//������:
//		Person p4=new Person();
//		Man m4=(Man)p4;
		//�������:ʹ��instanceof�ؼ���
		
		
		//�����:����ʱͨ��������ʱҲͨ��
		Object obj=new Woman();
		Person p=(Person)obj;
		
		//������:���벻ͨ��
//		Man m5=new Woman();
		
//		String str=new Date();
		
		Object o=new Date();
		String str=(String)o;
	}
}
