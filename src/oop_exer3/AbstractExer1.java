package oop_exer3;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 定义一个Employee_类，该类包含:
 * private成员变量name,number,birthday,其中birthday为MyDate类的对象;abstract方法earning()
 * toString()方法输出对象的name,number和birthday。
 * 
 * MyDate类包含:
 * private成员变量 year,month,day
 * toDateString()方法返回日期对应的字符串: XXXX年XX月XX日
 * 
 * 实现SalariedEmployee继承Employee_类。实现按月计算工资的员工处理。
 * 该类包括:private成员变量monthlySalary;
 * 实现父类的抽象方法earning(),该方法返回monthlySalary值;
 * toString()方法输出员工类型信息及员工的name，number，birthday
 * 
 * 参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。
 * 该类包括: private成员变量wage和hour;
 *          实现父类的抽象方法earnings(),该方法返回wage*hour的值。
 *          toString()方法输出员工类型信息及员工的name，number，birthday
 * 定义AbstractExer1(PayrollSystem)类,创建Employee_变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 当对象输入本月月份值时，如果本月是某个Employee_对象的生日，还要输出增加工资信息。
 * */
public class AbstractExer1 {
	public static void main(String[] args) {
		//方式一:
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入当前月份:");
//		int month = sc.nextInt();
		//方式二:
		Calendar calendar = Calendar.getInstance();
		int month=calendar.get(Calendar.MONTH);//获取当前月份
		System.out.println(month);//一月份 0
		
		Employee_ emps[]=new Employee_[2];
		emps[0]=new SalariedEmployee("马森",1001,new MyDate(1998,9,28),10000);
		emps[1]=new HourlyEmployee("潘玉生",2001,new MyDate(1991,5,6),60,240);
		
		for(int i=0;i<emps.length;i++) {
			System.out.println(emps[i].toString());
			double salary = emps[i].earnings();
			System.out.println("月薪为:"+salary);
			if(month+1==emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！");
				salary+=100;
				System.out.println(salary);
			}
		}
	}
}
abstract class Employee_{
	private String name;
	private int number;
	private MyDate birthday;
	
	
	public Employee_() {
		super();
	}

	public Employee_(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	public abstract double earnings();
	
	@Override
	public String toString() {
		return  name + ", number=" + number + ", birthday=" + birthday.toDateString() ;
	}
	
}
class SalariedEmployee extends Employee_{

	private double monthlySalary;
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}
	public String toString() {
		return "SalariedEmployee [name="+super.toString()+"]";
	}
	
}
class MyDate{
	private int year;
	private int month;
	private int day;
	
	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}


	public String toDateString() {
		return year+"年"+month+"月"+day+"日";
	}
}
class HourlyEmployee extends Employee_{

	private double wage;//每小时的工资
	private int hour;//月工作的小时数
	
	
	public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return wage*hour;
	}
	public String toString() {
		return "HourlyEmployee["+super.toString()+"]";
	}
	
	
}