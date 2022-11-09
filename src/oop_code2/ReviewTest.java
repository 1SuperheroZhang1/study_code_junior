package oop_code2;

import org.junit.Test;

public class ReviewTest {

	//����toString()
	@Test
	public void test3() {
		String str="abc";
		System.out.println(str);
		System.out.println(str.toString());
		
		System.out.println("*****************************");
		str=null;
		System.out.println(str);//null
		System.out.println("*****************************");
		System.out.println(str.toString());//NullPointerException
	}
	//�����ֶ�д�ĺ��Զ����ɵ�equals()����
	@Test
	public void test2() {
		Person p=new Person("Tom",12);
		Man man=new Man("Tom",12);
		
		System.out.println(p.equals(man));
	}
	//����Ҳ��ΪObject���������֣����Ե���Object���������ķ�����
	@Test
	public void test1() {
		int arr[]=new int[] {1,2,3};
		print(arr);//[I@4803b726
		
		System.out.println(arr.getClass());//class [I
		System.out.println(arr.getClass().getSuperclass());//class java.lang.Object
		
	}
	public void print(Object obj) {
		System.out.println(obj);
	}
}
