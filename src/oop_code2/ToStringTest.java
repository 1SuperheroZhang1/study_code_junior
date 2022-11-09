package oop_code2;

import java.util.Date;

/*
 * Object����toString()������ʹ��:
 * 1. ���������һ�����������ʱ��ʵ���Ͼ��ǵ��õ�ǰ�����toString()����
 * 
 * 2.Object����toString()�����Ķ���:
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    3.��String��Date��File����װ��ȶ���д��Object���е�toString()������
      ʹ���ڵ��ö����toString()����ʱ�����ض����"ʵ������"��Ϣ��
    4.�Զ�����Ҳ������д�����toString()�����������ô˷���ʱ�����ض����"ʵ������"��	
 * */
public class ToStringTest {
	public static void main(String[] args) {
		Customer cust1=new Customer("Tom",21);
		System.out.println(cust1.toString());//customer[name =Tom,age =21]
		System.out.println(cust1);//customer[name =Tom,age =21]
		
		String str=new String("MM");
		System.out.println(str);
		
		Date date=new Date(4233746585764L);
		System.out.println(date.toString());
	}
}
