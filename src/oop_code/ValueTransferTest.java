package oop_code;
/*
 * һ�����ڱ����ĸ�ֵ
 * 		��������ǻ����������ͣ����ʱ��ֵ���Ǳ��������������ֵ
 *      ��������������������ͣ����ʱ��ֵ���Ǳ�������������ݵĵ�ֵַ
 * ���������βεĴ��ݻ���
 *        1.�β�: ��������ʱ��������С�����ڵĲ���
 *        2.ʵ��: ���÷���ʱ��ʵ�ʴ��ݸ��βε����ݡ�
 *     2.1 ֵ���ݻ���:
 *      ��������ǻ����������ͣ����ʱʵ�θ����βε���ʵ����ʵ�洢������ֵ��
 *      ��������������������ͣ����ʱʵ�θ����βε���ʵ�δ洢���ݵĵ�ֵַ��
 *      
 * */
public class ValueTransferTest {
	public static void main(String[] args) {
		//һ�����ڱ����ĸ�ֵ
//		System.out.println("***************������������****************");
//		int m=10;
//		int n=m;
//		System.out.println("m="+m+" n="+n);
//		
//		n=20;
//		System.out.println("m="+m+" n="+n);
//		System.out.println("***************������������****************");
//		Order o1=new Order();
//		o1.orderid=1001;
//		Order o2=o1;//��ֵ�Ժ�o1��o2��ֵַ��ͬ����ָ���˶ѿռ���ͬһ������ʵ�塣
//		System.out.println("o1.orderid="+o1.orderid+",o2.orderid="+o2.orderid);
//		o2.orderid=1002;
//		System.out.println("o1.orderid="+o1.orderid+",o2.orderid="+o2.orderid);
		//���������βεĴ��ݻ���
		//2.1 ֵ���ݻ���
		//������������ֵ�Ĳ���
//		int m=10;
//		int n=20;
//		System.out.println("m="+m+",n="+n);
//		
////		int tmp=m;
////		m=n;
////		n=tmp;
//		
//		ValueTransferTest test=new ValueTransferTest();
//		test.swap(m,n);
//		System.out.println("m="+m+",n="+n);
		//2.2 ַ���ݻ���
		Data data=new Data();
		
		data.m=10;
		data.n=20;
		System.out.println("m="+data.m+",n="+data.n);
		//����m��n��ֵ
//		int tmp=data.m;
//		data.m=data.n;
//		data.n=tmp;
		ValueTransferTest test1=new ValueTransferTest();
		test1.swap(data);
		System.out.println("m="+data.m+",n="+data.n);
		
	}
//	public void swap(int m,int n) {
//		int tmp=m;
//		m=n;
//		n=tmp;
//	}
	public void swap(Data data) {
		int tmp=data.m;
		data.m=data.n;
		data.n=tmp;
	}
}
class Order{
	int orderid;
}
class Data{
	int m;
	int n;
}
