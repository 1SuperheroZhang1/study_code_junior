package interview_test;

/* ��̬��������:
 * 1.̸̸��Զ�̬�Ե���⣿
 *   ��ʵ�ִ����ͨ���ԡ�
 *   �ھ���: Object���ж����public boolean equals(Object obj){}
 *   ��JDBC: ʹ��Java����(��ȡ���ݿ⡢CRUD(ʵ�ֶ����ݿ������ɾ���ġ���))�������ݿ�(MySQL��Oracle��DB2��SQL Server)
 *   �ܳ����ࡢ�ӿڵ�ʹ�ÿ϶������˶�̬��(�����ࡢ�ӿڲ���ʵ����)
 * 2.��̬�Ǳ���ʱ��Ϊ��������ʱ��Ϊ��
 *   ����ʱ��Ϊ
 * ������:
 * 	1.final��finally��finalize������
 *  2.==��equals()������
 * */
public class InterviewTest_extends {
	public static void main(String[] args) {
		Base_ base=new Sub_();
		base.add(1,2,3);//Sub_1
		
		Sub_ sub=new Sub_();
		sub.add(1,2,3);//Sub_2
	}
}
class Base_{
	public void add(int a,int...arr) {
		System.out.println("Base_");
	}
}
class Sub_ extends Base_{
	public void add(int a,int[] arr) {
		System.out.println("Sub_1");
	}
	public void add(int a,int b,int c) {
		System.out.println("Sub_2");
	}
}