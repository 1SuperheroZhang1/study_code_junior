package oop_code2;
/* Object���ʹ��
 * java.lang.Object��
 * 1.Object��������Java��ĸ�����
 * 2.��������������δʹ��extends�ؼ���ָ���丸�࣬��Ĭ�ϸ���Ϊjava.lang.Object��
 * 3.Object���еĹ���(���ԡ�����)�;���ͨ���ԡ�
 * 
 * 4.Object��ֻ������һ���ղεĹ�����
 * 
 * ������:
 * 	final��finally��finalize������
 * */
public class ObjectTest {
	public static void main(String[] args) {
		Order_ order=new Order_();
		System.out.println(order.getClass().getSuperclass());
	}
}
class Order_{
	
}