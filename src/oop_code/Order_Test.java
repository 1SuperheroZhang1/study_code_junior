package oop_code;

public class Order_Test {
	public static void main(String[] args) {
		Order_ order=new Order_();
		order.orderDefault=2;
		order.orderPublic=3;
		//����order��֮��˽�е����Բ��ɵ���
		//order.orderPrivate=1;//The field Order_.orderPrivate is not visible
		
		order.methodDefault();
		order.methodPublic();
		//����order��֮��˽�еķ������ɵ���
		//order.methodPrivate();//The method methodPrivate() from the type Order_ is not visible
	}
}
