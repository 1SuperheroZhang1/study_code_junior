package oop_exer;

import oop_code.Order_;

public class Order_Test {
	public static void main(String[] args) {
		Order_ order=new Order_();
		order.orderPublic=3;
		//����order�������İ�֮��˽�е����ԡ�ȱʡ�����Բ��ɵ���
		//order.orderDefault=2;//The field Order_.orderDefault is not visible
		//order.orderPrivate=1;//The field Order_.orderPrivate is not visible
		
		order.methodPublic();
		//����order�������İ�֮��˽�еķ�����ȱʡ�ķ������ɵ���
		//order.methodDefault();//The method methodDefault() from the type Order_ is not visible
		//order.methodPrivate();//The method methodPrivate() from the type Order_ is not visible
	}
}
