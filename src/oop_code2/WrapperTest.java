package oop_code2;

import org.junit.Test;

/*
 * ��װ��(Wrapper)��ʹ��:
 * 1.���8�ֻ����������Ͷ�������Ӧ�������������� ---> ��װ��(��װ��)
 *   ��������ص㣬�Ϳ��Ե�����ķ�����Java�����������������
 * 2.��װ��ķ���:
 * 		������������ 			��װ��
 * 		byte					Byte               ����:Number
 * 		short					Short			   ����:Number
 * 		int						Integer			   ����:Number
 * 		long					Long			   ����:Number
 * 		float					Float			   ����:Number
 * 		double					Double			   ����:Number
 * 		boolean					Boolean		
 * 		char					Character
 * 3.����: �����������͡���װ�ࡢString��������֮���ת��
 * */
public class WrapperTest {

	//String����--- >�����������͡���װ��: ���ð�װ���parseXxx(String s)����
	//ע��: ת��ʱ�����ܻᱨ��NumberFormatException�쳣
	@Test
	public void test5() {
		String str="123";
		//��������:
//		int num1=(int)str;
//		Integer in1=(Integer)str;
		//���ܻᱨNumberFormatException�쳣
		int num2=Integer.parseInt(str);
		System.out.println(num2+1);
		
		String str1="true";
		boolean b1 = Boolean.parseBoolean(str1);
		System.out.println(b1);//true
		
		String str2="true1";
		boolean b2 = Boolean.parseBoolean(str2);
		System.out.println(b2);//false
	}
	
	//�����������͡���װ��--- >String����: ����String���ص�valueOf(Xxx xxx)
	@Test
	public void test4() {
		int num1=10;
		//��ʽ1:��������
		String str1=num1+"";
		//��ʽ2:����String���valueOf(Xxx xxx)����
		float f1=12.3f;
		String str2=String.valueOf(f1);
		System.out.println(str2);//12.3
		
		Double d1=new Double(12.4);
		String str3=String.valueOf(d1);
		System.out.println(d1);//12.4
	}
	/*
	 * JDK 5.0 ������: �Զ�װ�����Զ�����
	 * 
	 * */
	@Test
	public void test3() {
		int num1=10;
		//������������--- >��װ�����
//		method(num1);
//		System.out.println(num1);
		//�Զ�װ��: ������������--- >��װ��
		int num2=10;
		Integer in1=num2;//�Զ�װ��
		
		boolean b1=true;
		Boolean b2=b1;//�Զ�װ��
		
		//�Զ�����: ��װ��--- >������������
		System.out.println(in1.toString());
		int num3 = in1;
		
	}
	public void method(Object obj) {
		
	}
	//��װ��--- >������������: ���ð�װ���xxxValue()
	@Test
	public void test2() {
		Integer in1=new Integer(12);
		
		int i1=in1.intValue();
		System.out.println(i1+1);
		
		Float f1=new Float(12.3f);
		float f2=f1.floatValue();
		System.out.println(f2+1);
		
	}
	//������������--- >��װ��: ���ð�װ��Ĺ�����
	@Test
	public void test1() {
		int num1=10;
		
		Integer in1=new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2=new Integer("123");
		System.out.println(in2.toString());
		
		//���쳣
//		Integer in3=new Integer("123abc");
//		System.out.println(in3.toString());//NumberFormatException
		
		Float f1=new Float(12.3f);
		Float f2=new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1=new Boolean(true);
		
		Boolean b2=new Boolean("tRuE");
		System.out.println(b2);//true
		Boolean b3=new Boolean("true123");
		System.out.println(b3);//false
		
		_Order_ order=new _Order_();
		System.out.println(order.isMale);//false
		System.out.println(order.isFemale);//null
		
	}
}
class _Order_{
	boolean isMale;
	Boolean isFemale;
}
