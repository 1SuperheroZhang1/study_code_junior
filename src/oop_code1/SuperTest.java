package oop_code1;
/*
 * super�ؼ��ֵ�ʹ��:
 * 1.super���Ϊ: �����
 * 2.super������������: ���ԡ�������������
 * 
 * 3.super��ʹ�ã��������Ժͷ���
 * 		3.1 ���ǿ���������ķ����������У�ͨ��ʹ��"super.����"��"super.����"����ʾ��
 *          ���ø��������������ԡ����������ǣ�ͨ������£�����ϰ��ʡ��"super."
 *      3.2 �������: ������͸����ж�����ͬ��������ʱ������Ҫ���������е��ø��������������ԣ�
 *                    �������ʽ��ʹ��"super.����"�ķ�ʽ������ʹ�õ��Ǹ��������������ԡ�
 *      3.3 �������: ��������д�˸���ķ����Ժ�������Ҫ�������е��ø����б���д�ķ���ʱ��
 *                    �������ʽ������"super.����"�ķ�ʽ���������õ��Ǹ����б���д�ķ�����
 * 4.super���ù�����
 *      4.1 ���ǿ���������Ĺ���������ʾ��ʹ��"super(�β��б�)"�ķ�ʽ�����ø�����������ָ���Ĺ�����
 *      4.2 "super(�β��б�)"��ʹ�ã��������������๹���������С�
 *      4.3 ��������Ĺ������У������"this(�β��б�)"��"super(�β��б�)"ֻ�ܶ�ѡһ������ͬʱ����
 *      4.4 �ڹ����������У�û������"this(�β��б�)"��"super(�β��б�)"����Ĭ�ϵ��õ��Ǹ����пղεĹ�����:super()
 *      4.5 ����Ķ���������У�������һ����Ĺ�����ʹ����"super(�β��б�)"�����ø���Ĺ�����
 * */
public class SuperTest {
	public static void main(String[] args) {
		_Student_ student=new _Student_();
		student.show();
		student.study();
		
		_Student_ s1=new _Student_("Tom",21,"IT");
		s1.show();
		System.out.println("*********************************");
		_Student_ s2=new _Student_();
	}
}
class __Person_{
	String name;
	int age;
	int id=1001;//���֤��
	
	public __Person_() {
		System.out.println("���޴����ڣ�");
	}

	public __Person_(int age) {
		super();
		this.age = age;
	}

	public __Person_(String name, int age) {
		this(age);
		this.name = name;
	}
	public void eat() {
		System.out.println("��:�Է�");
	}
	public void walk() {
		System.out.println("��:��·");
	}
	
}
class _Student_ extends __Person_{

	String major;
	int id=1002;//ѧ��
	
	public _Student_(){
		
	}

	public _Student_(int age, String major) {
		super();
		this.major = major;
	}
	
	public _Student_(String name,int age,String major) {
		super(name,age);
		this.major=major;
	}
	public void eat() {
		System.out.println("ѧ��:�����Ӫ����ʳ��");
	}
	public void study() {
			System.out.println("ѧ��:ѧϰ֪ʶ");
			this.eat();
			super.eat();
			super.walk();
	}
	public void show() {
		System.out.println("name="+this.name+",age="+super.age);
		System.out.println("id="+this.id);
		System.out.println("id="+super.id);
	}
}
