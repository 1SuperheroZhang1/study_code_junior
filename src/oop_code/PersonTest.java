package oop_code;
/* ������������Ƶ��ص���������
 * һ������࣬���������ĳ�Ա
 * 	����=��Ա����=Field(���ֶ�)
 *  ����=��Ա����=����=Method
 * ������Ͷ����ʹ��(�������˼����ص�ʵ��)
 *  1.�����ࡢ�����ĳ�Ա
 *  2.������Ķ���
 *  3.ͨ��"����.����"��"����.����"���ö���Ľṹ
 * �������������һ����Ķ��������ÿ�����󶼶�����ӵ��һ���������(��static��)
 * 	   ��ζ�ţ���������޸�һ�����������a����Ӱ����һ�����������a��ֵ��
 * �ġ�������ڴ����
 * */
//������
public class PersonTest {
	public static void main(String[] args) {
		//����Person��Ķ��� - ���ʵ����
		Person p1=new Person();
		//Scanner sc=new Scanner(System.in);
		
		//���ö���Ľṹ:���ԡ�����
		//��������:"����.����"
		p1.name="Tom";
		p1.isMale=true;
		System.out.println(p1.name);
		
		//���÷���:"����.����"
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		//***************************
		Person p2=new Person();
		System.out.println(p2.name);//null
		System.out.println(p2.isMale);//false
		//***************************
		//��p1��������Ķ����ֵַ����p3������p1��p3ָ���˶ѿռ��е�ͬһ������ʵ�塣
		
		Person p3=p1;
		System.out.println(p3.name);//Tom
		p3.age=10;
		System.out.println(p1.age);//10
	}
}
class Person{
	//(Field)����:��Ա����
	String name;
	int age=1;
	boolean isMale;
	//(Method)(��Ա)����:����
	public void eat() {
		System.out.println("�˿��ԳԷ���");
	}
	public void sleep() {
		System.out.println("�˿���˯����");
	}
	public void talk(String language) {
		System.out.println("�˿���˵����ʹ�õ���:"+language);
	}
}