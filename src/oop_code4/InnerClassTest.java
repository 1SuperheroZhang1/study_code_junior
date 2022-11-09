package oop_code4;
/*
 * ����ڲ���ĳ�Ա֮��: �ڲ���
 * 1.Java������һ����A��������һ����B�У�����A�����ڲ��࣬��B�����ⲿ�ࡣ
 * 
 * 2.�ڲ���ķ���: ��Ա�ڲ��� VS �ֲ��ڲ���(�����ڡ�������ڡ���������)
 * 
 * 3. ��Ա�ڲ���:
 * 		һ���棬��Ϊ�ⲿ��ĳ�Ա:
 * 			> �����ⲿ��Ľṹ
 * 			> ���Ա�static����
 * 			> ���Ա�4�ֲ�ͬ��Ȩ������
 * 
 * 		��һ���棬��Ϊ�ڲ���:
 * 			> ���ڿ��Զ������ԡ��������������ȡ�
 * 			> ���Ա�final���Σ���ʾ���಻�ܱ��̳С�����֮�⣬��ʹ��final�Ϳ��Ա��̳�
 * 			> ���Ա�abstract���Σ���ʾ���಻�ܱ�ʵ������
 * 
 * 4. ��ע���µ�3������:
 * 	4.1 ���ʵ������Ա�ڲ���Ķ���
 * 		4.1.1 ʵ������̬�ĳ�Ա�ڲ���
 * 				�ⲿ��.�ڲ��� ������=new �ⲿ��.�ڲ���();
 * 		4.1.2 ʵ�����Ǿ�̬�ĳ�Ա�ڲ���
 * 				�ⲿ��.�ڲ��� ������=new �ⲿ��().new �ڲ���();
 * 	4.2 ����ڳ�Ա�ڲ��������ֵ����ⲿ��Ľṹ
 * 		4.2.1 ���÷������β�
 * 				������.������(�β�);
 * 		4.2.2 �����ڲ���Ľṹ
 * 				this.������;
 * 		4.2.3 �����ⲿ��Ľṹ
 * 				�ⲿ��.this.������;
 * 	4.3 �����оֲ��ڲ����ʹ��: ��InnerClassTest1.java
 * 
 * �ܽ�: ��Ա�ڲ���;ֲ��ڲ����ڱ����Ժ󣬶������ɶ�Ӧ���ֽ����ļ���
 * 	  ��ʽ:	��Ա�ڲ���:  �ⲿ��$�ڲ�����.class
 * 			�ֲ��ڲ���:  �ⲿ��$(����)�ڲ�����.class
 * */
public class InnerClassTest {
	public static void main(String[] args) {
		//����Dogʵ��(��̬�ĳ�Ա�ڲ���):
		Person.Dog dog=new Person.Dog();
		dog.show();
		//����Birdʵ��(�Ǿ�̬�ĳ�Ա�ڲ���):
//		Person.Bird bird=new Person.Bird();//�����
		Person p=new Person();
		Person.Bird bird=p.new Bird();
		bird.sing();
		System.out.println();
		bird.display("���");
	}
}
class Person{
	
	String name="С��";
	int age;
	
	public void eat() {
		System.out.println("��: �Է�");
	}
	//��̬��Ա�ڲ���
	static class Dog{
		String name;
		int age;
		
		public void show() {
			System.out.println("����������");
//			eat();//Cannot make a static reference to the non-static method eat() from the type Person
			//��̬���в��ܵ��÷Ǿ�̬�Ľṹ
		}
	}
	//�Ǿ�̬��Ա�ڲ���
	class Bird{
		String name="�ž�";
		
		public Bird() {
			
		}
		
		public void sing() {
			System.out.println("����һֻСССС��");
			Person.this.eat();//�����ⲿ��ķǾ�̬����
		}
		
		public void display(String name) {
			System.out.println(name);//�������β�
			System.out.println(this.name);//�ڲ��������
			System.out.println(Person.this.name);//�ⲿ�������
		}
	}
	//�ֲ��ڲ���
	/*
	 * �ھֲ��ڲ���ķ�����(����show()) 
	 * ������þֲ��ڲ����������ķ���(����method1())�еľֲ�����(����num)�Ļ���
	 * Ҫ��˾ֲ���������Ϊfinal��
	 * 
	 * jdk7��֮ǰ�İ汾: Ҫ��˾ֲ�������ʽ������Ϊfinal��
	 * jdk8��֮��İ汾: ����ʡ��final������
	 * */
	public void method1() {
		int num=10;
		//�������ڲ���
		class AA{
			public void show() {
//				num=20;
				System.out.println(num);
			}
		}
	}
	
	{
		//������ڲ���
		class BB{
			
		}
	}
	
	public Person() {
		//�������ڲ���
		class CC{
			
		}
	}
	
}