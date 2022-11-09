package oop_exer3;

import java.util.Calendar;
import java.util.Scanner;

/*
 * ����һ��Employee_�࣬�������:
 * private��Ա����name,number,birthday,����birthdayΪMyDate��Ķ���;abstract����earning()
 * toString()������������name,number��birthday��
 * 
 * MyDate�����:
 * private��Ա���� year,month,day
 * toDateString()�����������ڶ�Ӧ���ַ���: XXXX��XX��XX��
 * 
 * ʵ��SalariedEmployee�̳�Employee_�ࡣʵ�ְ��¼��㹤�ʵ�Ա������
 * �������:private��Ա����monthlySalary;
 * ʵ�ָ���ĳ��󷽷�earning(),�÷�������monthlySalaryֵ;
 * toString()�������Ա��������Ϣ��Ա����name��number��birthday
 * 
 * ����SalariedEmployee�ඨ��HourlyEmployee�࣬ʵ�ְ�Сʱ���㹤�ʵ�Ա������
 * �������: private��Ա����wage��hour;
 *          ʵ�ָ���ĳ��󷽷�earnings(),�÷�������wage*hour��ֵ��
 *          toString()�������Ա��������Ϣ��Ա����name��number��birthday
 * ����AbstractExer1(PayrollSystem)��,����Employee_�������鲢��ʼ�����������Ÿ����Ա��������á�
 * ����ѭ���ṹ��������Ԫ�أ�����������������,name,number,birthday,�Լ��ö������ա�
 * ���������뱾���·�ֵʱ�����������ĳ��Employee_��������գ���Ҫ������ӹ�����Ϣ��
 * */
public class AbstractExer1 {
	public static void main(String[] args) {
		//��ʽһ:
//		Scanner sc=new Scanner(System.in);
//		System.out.println("�����뵱ǰ�·�:");
//		int month = sc.nextInt();
		//��ʽ��:
		Calendar calendar = Calendar.getInstance();
		int month=calendar.get(Calendar.MONTH);//��ȡ��ǰ�·�
		System.out.println(month);//һ�·� 0
		
		Employee_ emps[]=new Employee_[2];
		emps[0]=new SalariedEmployee("��ɭ",1001,new MyDate(1998,9,28),10000);
		emps[1]=new HourlyEmployee("������",2001,new MyDate(1991,5,6),60,240);
		
		for(int i=0;i<emps.length;i++) {
			System.out.println(emps[i].toString());
			double salary = emps[i].earnings();
			System.out.println("��нΪ:"+salary);
			if(month+1==emps[i].getBirthday().getMonth()) {
				System.out.println("���տ��֣�");
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
		return year+"��"+month+"��"+day+"��";
	}
}
class HourlyEmployee extends Employee_{

	private double wage;//ÿСʱ�Ĺ���
	private int hour;//�¹�����Сʱ��
	
	
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