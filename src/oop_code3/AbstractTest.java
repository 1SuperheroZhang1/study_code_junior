package oop_code3;
/*
 * abstract�ؼ��ֵ�ʹ��
 * 1. abstract:�����
 * 2. abstract�������εĽṹ:�ࡢ����
 * 
 * 3. abstract������:������
 * 		> ���಻��ʵ����
 * 		> ��������һ���й���������������ʵ��������(�漰: �������ʵ������ȫ����)
 * 		> �����У������ṩ����������࣬���������ʵ�����������صĲ����� --->�����ʹ��ǰ��: �̳���
 * 
 * 4. abstract���η���:���󷽷�
 * 		> ���󷽷�ֻ�з�����������û�з����塣
 * 		> �������󷽷����࣬һ���ǳ����ࡣ��֮���������п���û�г��󷽷���
 * 		> ��������д�˸��������еĳ��󷽷��󣬴����෽��ʵ������
 * 		  ������û����д�����е����г��󷽷����������Ҳ��һ�������࣬��Ҫ��abstract����
 * 5. �������Ӧ��
 * 		������������ģ�ͻ���Щ�����޷�ȷ��ʵ�֣��������������ṩ����ʵ�ֵĶ�����ࡣ
 * 
 * abstractʹ���ϵ�ע���:
 * 1. abstract������������: ���ԡ��������Ƚṹ
 * 
 * 2. abstract������������: ˽�з�������̬������final�ķ�����final���ࡣ
 * */
public class AbstractTest {
	public static void main(String[] args) {
		//һ��Person�౻abstract���Σ����ɱ�ʵ����
//		_Person_ p1=new _Person_();//Cannot instantiate the type _Person_
//		p1.eat();
	}
}
abstract class Creature{
	public abstract void breath();
}
abstract class _Person_ extends Creature{
	String name;
	int age;
	
	public _Person_() {
		
	}
	public _Person_(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//���ǳ��󷽷�
//	public void eat() {
//		 
//	}
	//���󷽷�
	public abstract void eat();
	
	public void walk() {
		System.out.println("����·");
	}
}
class Student extends _Person_{
	public Student(String name,int age) {
		super(name,age);
	}
	public Student() {
		
	}
	//��д�������еĳ��󷽷�
	public void eat() {
		System.out.println("ѧ��Ӧ�ö����Ӫ����ʳ��");
	}
	@Override
	public void breath() {
		System.out.println("ѧ��Ӧ�ú������ʵ�û�������Ŀ���");
		
	}
}