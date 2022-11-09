package oop_code2;

import java.util.Date;
import java.util.Objects;

/*
 * ������: ==��equals()������
 * 
 * һ���ع�==��ʹ��:
 * ==: �����
 * 1.����ʹ���ڻ����������ͱ����������������ͱ������С�
 * 2.����Ƚϵ��ǻ����������ͱ������Ƚ�������������������Ƿ���ȡ�(��һ������Ҫ��ͬ)
 * 3.����Ƚϵ��������������ͱ������Ƚ���������ĵ�ֵַ�Ƿ���ͬ(�����������Ƿ�ָ��ͬһ������ʵ��)��
 *  ����:==����ʹ��ʱ�����뱣֤�����������ߵı�������һ�¡�
 *  
 * ����equals()������ʹ��:
 * 1.��һ�������������������
 * 2.ֻ�������������������͡�
 * 3.Object����equals()�����Ķ���:
	    public boolean equals(Object obj) {
	        return (this == obj);
	    }
	 ˵��:Object���ж����equals()������==������ͬ���Ƚϵ�����������ĵ�ֵַ�Ƿ���ͬ(����������ָ��ͬһ������ʵ��)��
   4.��String��Date��File����װ��ȶ���д��Object���е�equals()������
     ��д�Ժ󣬱ȽϵĲ����������õĵ�ַ�Ƿ���ͬ�����ǱȽ����������"ʵ������"�Ƿ���ͬ��
   5.ͨ������£������Զ���������ʹ��equals()�����Ļ���
     Ҳͨ���ǱȽ����������"ʵ������"�Ƿ���ͬ,
     ��ô���Ǿ���Ҫ��Object���е�equals()����������д��
   ��д��ԭ��:�Ƚ����������"ʵ������"�Ƿ���ͬ
 * */
public class EqualsTest {
	public static void main(String[] args) {
		//������������
		int i=10;
		int j=10;
		System.out.println(i==j);//true
		double d=10.0;
		System.out.println(i==d);//true
		
		boolean b=true;
//		System.out.println(i==b);
		
		char c=10;
		System.out.println(i==c);//true
		
		char c1='A';
		char c2=65;
		System.out.println(c1==c2);
		
		System.out.println("*****************************");
		
		//��������
		Customer cust1=new Customer("Tom",21);
		Customer cust2=new Customer("Tom",21);
		System.out.println(cust1==cust2);//false
		
		String str1=new String("hello");
		String str2=new String("hello");
		System.out.println(str1==str2);//false
		System.out.println("*****************************");
		System.out.println(cust1.equals(cust2));//false--->true
		System.out.println(str1.equals(str2));//true
		
		Date date1=new Date(32465743289L);
		Date date2=new Date(32465743289L);
		System.out.println(date1.equals(date2));//true
	}
}
class Customer{
	private String name;
	private int age;
	
	public Customer() {
		super();
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//��д��ԭ��:�Ƚ����������"ʵ������"(name��age)�Ƿ���ͬ
	//�ֶ�ʵ��
//	 public boolean equals(Object obj) {
////		 System.out.println("Customer equals()...");
//	        if(this==obj) {
//	        	return true;
//	        }
//	        if(obj instanceof Customer) {
//	        	Customer cust=(Customer)obj;
//	        	//�Ƚ����������ÿ�������Ƿ���ͬ
////	        	if(this.age==cust.age&& this.name.equals(cust.name)) {
////	        		return true;
////	        	}else {
////	        		return false;
////	        	}
//	        	return this.age==cust.age&& this.name.equals(cust.name);
//	        }else {	        	
//	        	return false;
//	        }
//	    }

	//�Զ����ɵ�equals() Alt+Shift+S
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	//�ֶ�ʵ��
//	 public String toString() {
//		 return "customer[name ="+name+",age ="+age+"]";
//	 } 
	//�Զ�ʵ��
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
	
}
