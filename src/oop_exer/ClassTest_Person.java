package oop_exer;
/* ��ϰ1
 * Ҫ��:
 * (1) ����Person��Ķ������øö����name��age��sex���ԣ�����study������
 *     ����ַ���"studying",����showAge()������ʾageֵ
 *     ����addAge()�����������age����ֵ����2�ꡣ
 * (2) �����ڶ�������ִ���������������ͬһ����Ĳ�ͬ����֮��Ĺ�ϵ��
 * */
public class ClassTest_Person {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Tom";
		p1.age=18;
		p1.sex=1;
		
		p1.study();
		p1.showAge();
		int newAge=p1.addAge(2);
		System.out.println(p1.name+"��������Ϊ"+newAge);
		
		System.out.println(p1.age);//20
		//*********************************
		Person p2=new Person();
		p2.showAge();//0
		p2.addAge(10);//10
		p2.showAge();
		
		p1.showAge();//20
	}
}
class Person{
	//����
	String name;
	int age;
	/**
	 * sex:1 ����������
	 * sex:0 ������Ů��
	 * */
	int sex;
	//����
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println("age:"+age);
	}
	public int addAge(int i) {
		age+=i;
		return age;
	}
	
}