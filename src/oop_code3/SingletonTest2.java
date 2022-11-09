package oop_code3;
/*
 * ����������ʽʵ��
 * 
 * */
public class SingletonTest2 {
	public static void main(String[] args) {
		 Order order1 = Order.getInstance();
		 Order order2 = Order.getInstance();
		 
		System.out.println(order1==order2);//true
		System.out.println(order1.hashCode());
		System.out.println(order2.hashCode());
	}
}
class Order{
	//1.˽�л���Ĺ�����
	private Order() {
		
	}
	
	//2.������ǰ�����
	//4.�˶���Ҳ��������Ϊstatic��
	private static Order instance=null;
	
	//3.����public��static�ķ��ص�ǰ�����ķ���
	public static Order getInstance() {
		if(instance==null) {			
			instance=new Order();
		}
		return instance;
	}
}