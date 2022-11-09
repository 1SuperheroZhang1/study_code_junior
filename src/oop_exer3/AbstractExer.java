package oop_exer3;
/*
 * 编写一个Employee类，声明为抽象类。
 * 包含如下三个属性: name,age,salary
 * 提供必要的构造器和抽象方法: work()
 * 
 * 对于Manager类来说，他即是员工，还具有奖金(bonus)的属性。
 * 
 * 请使用继承的思想。设置CommonEmployee类和Manager类，要求类中提供必要的方法进行属性的访问
 * */
public class AbstractExer {
	public static void main(String[] args) {
		//多态
		Employee m1=new Manager("库克",1001,5000,50000);
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
	private double bonus;//奖金
	
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
		System.out.println("管理员工，提高公司的运行效率");
	}
	
}
class CommonEmployee extends Employee{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("员工在一线车间生产产品");
		
	}
	
}