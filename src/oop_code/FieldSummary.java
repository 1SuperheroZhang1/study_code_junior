package oop_code;
/*
 * �ܽ�:���Ը�ֵ���Ⱥ�˳��
 * 
 * ��Ĭ�ϳ�ʼ��
 * ����ʽ��ʼ��
 * �۹�������ֵ
 * ��ͨ��"����.����"��"����.����"�ķ�ʽ����ֵ
 * 
 * ���ϲ������Ⱥ�˳��:��-��-��-��
 * */
public class FieldSummary {
	public static void main(String[] args) {
		Field f=new Field(2);
		f.setAge(3);
		System.out.println(f.age);
	}
}
class Field{
	String name;
	int age=1;
	
	public Field(int a) {
		age=a;
	}
	public void setAge(int a) {
		age=a;
	}
}
