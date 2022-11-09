package oop_code3;
/*
 * ��ĳ�Ա֮��:�����(���ʼ����)
 * 1. ����������: ������ʼ���ࡢ����
 * 2. �������������εĻ���ֻ��ʹ��static.
 * 3. ����: ��̬����� VS �Ǿ�̬�����
 * 
 * 4.��̬�����
 * 		>�ڲ�������������
 * 		>������ļ��ض�ִ��,����ִֻ��һ��
 * 		>����: ��ʼ����ǰ�����Ϣ
 * 		>���һ�����ж����˶����̬����飬�����������Ⱥ�˳��ִ�С�
 * 		>��̬������ִ�������ڷǾ�̬������ִ�С�
 * 		>��̬�������ֻ�ܵ��þ�̬�����ԡ���̬�ķ��������ܵ��÷Ǿ�̬�Ľṹ��
 * 5.�Ǿ�̬�����
 * 		>�ڲ�������������
 * 		>���Ŷ���Ĵ�����ִ��
 * 		>ÿ����һ�����󣬾�ִ��һ�ηǾ�̬�����
 * 		>����: �����ڴ�������ʱ���Զ�������ԵȽ��г�ʼ����
 *      >���һ�����ж����˶���Ǿ�̬����飬�����������Ⱥ�˳��ִ�С�
 *      >�Ǿ�̬������ڿ��Ե��þ�̬�����ԡ���̬�ķ�����Ҳ���Ե��÷Ǿ�̬�����ԣ��Ǿ�̬�ķ�����
 * 
 * */
public class BlockTest {
	public static void main(String[] args) {
		String desc = Person.desc;
		System.out.println(desc);
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person.info();
	}
}
class Person{
	//����
	String name;
	int age;
	static String desc="����һ����";
	//������
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//static�Ĵ����
	static{
		System.out.println("hello,static block-1");
		//���þ�̬�ṹ
		desc="����һ����ѧϰ����";
		info();
		//���ܵ��÷Ǿ�̬�ṹ
//		name="Tom";
//		eat();
	}
	static{
		System.out.println("hello,static block-2");
	}
	//��static�Ĵ����
	{
		System.out.println("hello,block-1");
		//���÷Ǿ�̬�ṹ
		age=1;
		eat();
		//���þ�̬�ṹ
		info();
		desc="����һ����ѧϰ����1";
	}
	{
		System.out.println("hello,block-2");
	}
	//����
	public void eat() {
		System.out.println("�Է�");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void info() {
		System.out.println("����һ�����ֵ��ˣ�");
	}
	
}