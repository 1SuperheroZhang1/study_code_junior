package oop_exer;
/* ��ϰ9
 * ��д������:Triangle��TriangleTest,����Triangle��������˽�еĵױ߳�base�͸�height��
 * 			 ͬʱ����������������˽�б��������⣬�ṩ���Ҫ�Ĺ���������һ������ʹ����Щ����������
 *           �������������
 * 
 * */
public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.setBase(2.0);
		t1.setHeight(2.4);
		//t1.base=2.0;
		//t1.height=2.4;//
		System.out.println("base:"+t1.getBase()+"height:"+t1.getHeight());
	}
}
