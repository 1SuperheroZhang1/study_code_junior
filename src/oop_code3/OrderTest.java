package oop_code3;
/*
* �����Կ��Ը�ֵ��λ��:
* ��Ĭ�ϳ�ʼ��
* ����ʽ��ʼ��/�ݴ�����ʼ��
* �۹�������ʼ��
* �����˶����Ժ�ͨ��ʹ��"����.����"��"����.����"�ķ�ʽ�����и�ֵ��
* 
* ִ�е��Ⱥ�˳��: �� - ��/�� - �� - ��
*/
public class OrderTest {
	public static void main(String[] args) {
		Order_ order=new Order_();
		System.out.println(order.orderId);
	}
}
class Order_{
	int orderId=3;
	{
		orderId=4;
	}
}