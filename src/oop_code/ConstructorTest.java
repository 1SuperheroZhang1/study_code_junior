package oop_code;
/* ��Ľṹ֮��: ������(���췽��)(constructor)��ʹ��
 * construct:���衢����  construction:CCB  constructor:������
 * һ��������������:
 *  1.��������
 *  2.��ʼ�����������
 * ����˵��
 * 1.���û����ʽ�Ķ�����Ĺ������Ļ�����ϵͳĬ���ṩһ���ղεĹ�������
 * 2.���幹�����ĸ���: Ȩ�����η� ��������(�β��б�){}
 * 3.һ�����ж���Ķ�����������˴˳�Ϊ���ء�
 * 4.һ��������ʾ�Ķ�������Ĺ�����֮��ϵͳ�Ͳ����ṩĬ�ϵĿղι�������
 * 5.һ�����У�����Ҫ��һ����������
 * */
public class ConstructorTest {
	public static void main(String[] args) {
		//������Ķ���:new +������
		Person__ p1=new Person__();
		
		p1.eat();
		Person__ p2=new Person__("Tom");
	}
}
class Person__{
	//����
	String name;
	int age;
	//������
	public Person__() {
		System.out.println("Person__()...");
	}
	public Person__(String n) {
		name=n;
	}
	public Person__(String n,int a) {
		name=n;
		age=a;
	}
	//����
	public void eat() {
		System.out.println("�˳Է�");
	}
	public void study() {
		System.out.println("�˿���ѧϰ");
	}
}
