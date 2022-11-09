package oop_exer2;
/* ��ϰ1
 * 1.����������д�˸����еķ���������ζ�������ﶨ��ķ������׸����˸�����ͬ���ķ�����
 * ϵͳ�������ܰѸ����еķ���ת�Ƶ������С� - ���뿴��ߣ����п��ұ�
 * 2.����ʵ�������򲻴������������󡣼�ʹ�����ж������븸����ȫ��ͬ��ʵ��������
 * ���ʵ��������Ȼ�����ܸ��Ǹ����ж����ʵ�������� - �������ж������
 * 
 * */
class Base{
	int count=10;
	
	public void display() {
		System.out.println(this.count);
	}
}
class Sub extends Base{
    int count=20;
	
	public void display() {
		System.out.println(this.count);
	}
}
public class FieldMethodTest {
	public static void main(String[] args) {
		Sub s=new Sub();
		System.out.println(s.count);//20
		s.display();//20
		Base b=s;//��̬��
		//==:���������������ͣ��Ƚϵ������������������͵ı����ĵ�ֵַ�Ƿ���ͬ
		System.out.println(b==s);//true
		System.out.println(b.count);//10
		b.display();//20
	}
}
