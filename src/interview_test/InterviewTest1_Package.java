package interview_test;

import org.junit.Test;

/* ���ڰ�װ��ʹ�õ�������
 * 
 * 
 * */
public class InterviewTest1_Package{
	@Test
	public void test1() {
		Object o1=true?new Integer(1):new Double(2.0);
		System.out.println(o1);//1.0 --- >����ʱ�Զ���������
	}
	@Test
	public void test2() {
		Object o2;
		if(true) {
			o2=new Integer(1);
		}else {
			o2=new Double(2.0);
		}
		System.out.println(o2);//1
	}
	@Test
	public void test3() {
		Integer i=new Integer(1);
		Integer j=new Integer(1);
		System.out.println(i==j);//false
		
		Integer m=1;
		Integer n=1;
		System.out.println(m==n);//true
		
		/* 	Integer�ڲ�������IntegerCache�ṹ��IntegerCache�ж�����Integer[]���飬
		 * ������-128~127��Χ���������������ʹ���Զ�װ��ķ�ʽ����Integer��ֵ�ķ�Χ��
		 * -128~127��Χ��ʱ������ֱ��ʹ�������е�Ԫ�أ�������ȥnew�ˡ�Ŀ��:���Ч��
		 * */
		Integer x=128;//�൱��new��һ��Integer����
		Integer y=128;//�൱��new��һ��Integer����
		System.out.println(x==y);//false
	}
}
