package oop_code1;

public class Order__Test {
	public static void main(String[] args) {
		Order__ order=new Order__();
		
		order.orderDefault=1;
		order.orderProtected=2;
		order.orderPublic=3;
		
		order.methodDefalut();
		order.methodProtected();
		order.methodPublic();
		
		//ͬһ�����е������࣬�����Ե���Order__�У�˽�е����ԡ�������
		//order.orderPrivate=4;//The field Order__.orderPrivate is not visible
		//order.methodPrivate();//The method methodPrivate() from the type Order__ is not visible
	}
}
