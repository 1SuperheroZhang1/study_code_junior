package oop_code1;
/*
 * ������������֮��:�̳���
 * һ���̳��Եĺô�
 * 1.�����˴�������࣬����˴���ĸ����ԡ�
 * 2.���ڹ��ܵ���չ��
 * 3.Ϊ��̬�Ե�ʹ���ṩ��ǰ�ᡣ
 * 
 * �����̳��Եĸ�ʽ : class A extends B{}
 * 	A: ���ࡢ�����ࡢsubClass
 * 	B: ���ࡢ���ࡢ���ࡢsuperClass
 * 
 *  2.1 ����:һ������A�̳и���B֮������A�оͻ�ȡ�˸���B�����������еĽṹ�����ԡ�����
 *       �ر�أ�����������Ϊprivate�����Ժͷ�����
 *       ����̳и����Ժ���Ȼ��Ϊ��ȡ�˸�����˽�еĽṹ��
 *       ֻ����Ϊ��װ�Ե�Ӱ�죬ʹ�����಻��ֱ�ӵ��ø���Ľṹ���ѡ�
 *  2.2 ����̳и����Ժ����໹���������Լ����е����Ժͷ���: ʵ�ֹ��ܵ���չ��
 *  2.3 ����͸���: ��ͬ���Ӽ��ͼ��ϵĹ�ϵ��
 *  	extends ��չ����չ
 *  
 *  ����Java�й��ڼ̳��ԵĹ涨:
 *  1. һ������Ա��������̳�
 *  2.  Java����ĵ��̳���: һ����ֻ����һ������.
 *  3. �Ӹ�������Եĸ��
 *  4. ����ֱ�Ӽ̳еĸ���,��Ϊֱ�Ӹ��ࡣ��Ӽ̳еĸ��࣬��Ϊ��Ӹ��ࡣ
 *  5. ����̳��˸����Ժ󣬾ͻ�ȡ��ֱ�Ӹ����Լ����еļ�Ӹ������������Ժͷ�����
 *  
 *  �ġ�Object��
 *  1. �������û����ʾ������һ����ĸ��࣬�����̳���java.lang.Object��
 *  2. ���е�java��(��java.lang.Object��֮��)����ֱ�ӻ��ӵؼ̳���java.lang.Object�ࡣ
 *  3. ��ζ�����е�Java�඼����java.lang.Object�������Ĺ��ܡ�
 * */
public class ExtendsTest {
	public static void main(String[] args) {
		_Person_ p1=new _Person_();
		p1.age=1;
		p1.eat();
		
		Student s1=new Student();
		s1.age=2;
		s1.study();
		s1.breath();
	}
}
class Creature{
	public void breath() {
		System.out.println("����");
	}
}
class _Person_ extends Creature{
	String name;
	int age;
	
	public _Person_() {
		
	}
	public _Person_(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
}
class Student extends _Person_{
//	String name;
//	int age;
	String major;
	
	public Student() {
		
	}
	public Student(String name,int age,String major){ 
		this.name=name;
		this.age=age;
		this.major=major;
	}
	
//	public void eat() {
//		System.out.println("�Է�");
//	}
//	public void sleep() {
//		System.out.println("˯��");
//	}
	public void study() {
		System.out.println("ѧϰ");
	}
}
