package oop_code;
/*
 * this�ؼ��ֵ�ʹ��
 * 1.this�����������Ρ�����:���ԡ�������������
 * 2.this�������Ժͷ���:
 * 	this���Ϊ:��ǰ���� �� ��ǰ���ڴ����Ķ���
 *  2.1 ����ķ����У����ǿ���ʹ��"this.����"��"this.����"�ķ�ʽ�����õ�ǰ��������Ժͷ�����
 *  ���ǣ�ͨ������£����Ƕ�ѡ��ʡ��"this."��
 *  ��������£�����������βκ��������ͬ��ʱ�����Ǳ�����ʾ��ʹ��"this.����"�ķ�ʽ��
 *  �����˱��������ԣ������βΡ�
 *  2.2 ����Ĺ������У����ǿ���ʹ��"this.����"��"this.����"�ķ�ʽ�����õ�ǰ���ڴ����Ķ�������Ժͷ�����
 *  ���ǣ�ͨ������£����Ƕ�ѡ��ʡ��"this."��
 *  ��������£�����������βκ��������ͬ��ʱ�����Ǳ�����ʾ��ʹ��"this.����"�ķ�ʽ��
 *  �����˱��������ԣ������βΡ�
 *  2.3 this���ù�����
 *   ����������Ĺ������У�������ʽ��ʹ��"this(�β��б�)"�ķ�ʽ�����ñ����е�������������
 *   �ڹ������У�����ʹ��"this(�β��б�)"�ķ�ʽ�����Լ���
 *   �����һ��������n���������������n-1����������ʹ����"this(�β��б�)"��
 *   �ܹ涨:"this(�β��б�)"���������ڵ�ǰ������������
 *   �ݹ������ڲ�:���ֻ������һ��"this(�β��б�)"��������������������
 * */
public class Keywords_this {
	public static void main(String[] name) {
		Person___ p1=new Person___();
		p1.setAge(1);
		System.out.println(p1.getAge());
		p1.eat();
		System.out.println();
		
		Person___ p2=new Person___("Jerry",21);
	}
}
class Person___{
	private String name;
	private int age;
	
	public Person___() {
		//this.eat();
		String info="Person___��ʼ��ʱ����Ҫ�������µ�1��2��3��4...(����40�д���)";
		System.out.println(info);
		//Person___��ʼ��ʱ����Ҫ�������µ�1��2��3��4...(����40�д���)
	}
	public Person___(String name) {
		this();
		this.name=name;
		//Person___��ʼ��ʱ����Ҫ�������µ�1��2��3��4...(����40�д���)
	}
	public Person___(int age) {
		this();
		this.age=age;
		//Person___��ʼ��ʱ����Ҫ�������µ�1��2��3��4...(����40�д���)
	}
	public Person___(String name,int age) {
		this(age);
		this.name=name;
		this.age=age;
		//Person___��ʼ��ʱ����Ҫ�������µ�1��2��3��4...(����40�д���)
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void eat() {
		System.out.println("�˳Է�");
		this.study();
	}
	public void study() {
		System.out.println("��ѧϰ");
	}
	
}