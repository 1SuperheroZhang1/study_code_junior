package oop_exer;

import oop_code1.Order__;

public class Order__Test {
	public static void main() {
		Order__ order=new Order__();
		
		order.orderPublic=1;
		order.methodPublic();
		
		//�ڲ�ͬ���µ���ͨ��(������)��Ҫʹ��Order__�࣬ �����Ե�������Ϊprivate��ȱʡ��protectedȨ�޵����ԡ�������
//		order.orderPrivate=2;//The field Order__.orderPrivate is not visible
//		order.orderDefault=3;//The field Order__.orderDefault is not visible
//		order.orderProtected=4;//The field Order__.orderProtected is not visible
//		order.methodPrivate();//The method methodPrivate() from the type Order__ is not visible
//		order.methodDefault();//The method methodDefault() is undefined for the type Order__
//		order.methodProtected();//The method methodProtected() from the type Order__ is not visible
	}
	public void show(Order__ order) {
		
		order.orderPublic=1;
		order.methodPublic();
		
		//�ڲ�ͬ���µ���ͨ��(������)��Ҫʹ��Order__�࣬ �����Ե�������Ϊprivate��ȱʡ��protectedȨ�޵����ԡ�������
//		order.orderPrivate=2;//The field Order__.orderPrivate is not visible
//		order.orderDefault=3;//The field Order__.orderDefault is not visible
//		order.orderProtected=4;//The field Order__.orderProtected is not visible
//		order.methodPrivate();//The method methodPrivate() from the type Order__ is not visible
//		order.methodDefault();//The method methodDefault() is undefined for the type Order__
//		order.methodProtected();//The method methodProtected() from the type Order__ is not visible
	}
}
