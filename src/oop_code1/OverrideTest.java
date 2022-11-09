package oop_code1;
/*
 * ��������д(override/overwrite)
 * 1.��д: ����̳��˸����Ժ󣬿��ԶԸ�����ͬ��ͬ�����ķ��������и��ǲ�����
 * 
 * 2.Ӧ��: ��д�Ժ󣬵�������������Ժ�
 *         ͨ����������Ӹ�����ͬ��ͬ�����ķ���ʱ��ʵ��ִ�е��������е���д������
 * 3.��д�Ĺ涨:
 * 			����������: Ȩ�����η� ����ֵ���� ������(�����б�) throws �쳣����{       
 * 							//������;
 * 						}
 * 			Լ���׳�:�����еķ�������д�����������еķ����Ǳ���д������
 *       ��������д�ķ����ķ������Ͳ����б��븸���б���д�ķ����ķ������Ͳ����б���ͬ��
 *       ��������д�ķ�����Ȩ�����η���С�ڸ��౻��д�ķ�����Ȩ�����η���
 *       	>�������: ���಻����д����������ΪprivateȨ�޵ķ���
 *       �� ����ֵ����:
 *       	>������౻��д�ķ����ķ���ֵ������void����������д�ķ����ķ���ֵ����ֻ����void
 *       	>������౻��д�ķ����ķ���ֵ������A���ͣ���������д�ķ����ķ���ֵ���Ϳ�����A���A�������
 *       	>������౻��д�ķ����ķ���ֵ�����ǻ�����������(����: double)����������д�ķ����ķ���ֵ��������ͬ�Ļ�����������(����Ҳ��double)
 *       �� �쳣����:
 *           ������д�ķ����׳����쳣���Ͳ����ڸ��౻��д�ķ����׳����쳣���͡�
 *    *************************************************************************
 *    ����͸����е�ͬ��ͬ�����ķ�����Ҫô������Ϊ��static��(������д)��Ҫô������Ϊstatic��(������д)��       
 * ������: ���ַ�������������д
 * */
public class OverrideTest {
	public static void main(String[] args) {
		Student_ student=new Student_("�������ѧ�뼼��");
		student.eat();
		student.walk(10);
		
		student.study();
	}
}
class Person____{
	String name;
	int age;
	
	public Person____() {
		
	}
	public Person____(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("�Է�");
	}
	public void walk(int distance) {
		System.out.println("��·������"+distance+"����");
	}
	private void show() {
		System.out.println("����һ����");
	}
	public Object info() {
		return null;
	}
}
class Student_ extends Person____{
	String major;
	
	public Student_(){
		
	}
	public Student_(String major) {
		this.major=major;
	}
	
	public void study() {
		System.out.println("ѧϰ��רҵ��"+major);
	}
	//�Ը����е�eat()������������д
	public void eat() {
		System.out.println("ѧ��Ӧ�ö����Ӫ����ʳ��");
	}
	public void show() {
		System.out.println("����һ��ѧ��");
	}
	public String info() {
		return null;
	}
}
