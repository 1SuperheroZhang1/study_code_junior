package oop_code;
/*
 * �������Ե�ʹ��
 * 
 * ����(��Ա����) VS �ֲ�����
 * 1. ��ͬ��
 * 		1.1 ��������ĸ�ʽ:
 * 				�������� ������=����ֵ;
 * 		1.2 ����������ʹ��
 * 		1.3�����������Ӧ��������
 * 2. ��ͬ��
 * 		2.1 ������������λ�ò�ͬ
 * 		����:ֱ�Ӷ��������һ��{}�С�
 * 		�ֲ�����:�����ڷ����ڡ������βΡ�������ڡ��������βΡ��������ڲ��ı�����
 * 		2.2 ����Ȩ�����η��Ĳ�ͬ
 * 		����:��������������ʱ��ָ����Ȩ�ޣ�ʹ��Ȩ�����η���
 *      Ȩ�����η�:private default(ȱʡ) protected public    --->��װ��
 *      �ֲ�����:������ʹ��Ȩ�����η���
 *      2.3 Ĭ�ϳ�ʼ��ֵ�����
 *      ����:������ԣ����������ͣ�����Ĭ�ϳ�ʼ��ֵ��
 *      	����(byte��short��int��long):0
 *      	������(float��double):0.0
 *      	�ַ���(char): 0 (��'\u0000')
 *      	������(boolean):false
 *      	������������(�ࡢ���顢�ӿ�):null
 *      �ֲ�����:û��Ĭ�ϳ�ʼ��ֵ
 *      	��ζ�ţ������ڵ��þֲ�����֮ǰ��һ��Ҫ��ʽ��ֵ��
 *       �ر�ģ��β��ڵ���ʱ�����Ǹ�ֵ���ɡ�
 *       2.4 ���ڴ��м��ص�λ��
 *       ����:���ص��ѿռ���(��static)
 *       �ֲ�����:���ص��ѿռ���
 * */
public class UserTest {
	public static void main(String[] args) {
		User u1=new User();
		System.out.println(u1.name);//null
		System.out.println(u1.age);//0
		System.out.println(u1.isMale);//false
		u1.talk("����");
		u1.eat();
	}
}

class User{
	//����(��Ա����)
	String name;
	int age;
	boolean isMale;
	//
	public void talk(String language) {//language�β�
		System.out.println("����ʹ��"+language+"���н���");
	}
	public void eat() {
		String food="pissa";//food�ֲ�����
		System.out.println("������ϲ����"+food);
	}
}
