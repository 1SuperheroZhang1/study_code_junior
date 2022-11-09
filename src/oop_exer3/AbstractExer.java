package oop_exer3;
/*
 * ��дһ��Employee�࣬����Ϊ�����ࡣ
 * ����������������: name,age,salary
 * �ṩ��Ҫ�Ĺ������ͳ��󷽷�: work()
 * 
 * ����Manager����˵��������Ա���������н���(bonus)�����ԡ�
 * 
 * ��ʹ�ü̳е�˼�롣����CommonEmployee���Manager�࣬Ҫ�������ṩ��Ҫ�ķ����������Եķ���
 * */
public class AbstractExer {
	public static void main(String[] args) {
		//��̬
		Employee m1=new Manager("���",1001,5000,50000);
		m1.work();
		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
	}
}
abstract class Employee{
	private String name;
	private int age;
	private double salary;
	
	public abstract void work();

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
}
class Manager extends Employee{
	private double bonus;//����
	
	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("����Ա������߹�˾������Ч��");
	}
	
}
class CommonEmployee extends Employee{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Ա����һ�߳���������Ʒ");
		
	}
	
}