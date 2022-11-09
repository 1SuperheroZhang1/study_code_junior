package oop_exer;
/* ��ϰ6 ��������Ϊ�������ݸ�����
 * (1)����һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��
 *    һ��findArea()�����������
 * (2)����һ����PassObject,�����ж���һ������printAreas(),�÷����Ķ�������:
 *    public void printAreas(Circle c,int time)
 *    ��printAreas�����д�ӡ���1��time֮���ÿ�������뾶ֵ���Լ���Ӧ�������
 *    ���磬timeΪ5��������뾶Ϊ1��2��3��4��5���Լ���Ӧ��Բ���
 * (3)��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ���������н����
 * */
public class ValueTransferExer {
	public static void main(String[] args) {
		PassObject test=new PassObject();
		Circle_ c=new Circle_();
		test.printAreas(c, 5);
		System.out.println("now radius is:"+c.radius);
	}
}

class Circle_{
	double radius;//�뾶
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
class PassObject{
	public void printAreas(Circle_ c,int time) {
		System.out.println("Radius\t\tArea");
		int i=0;
		for(i=1;i<=time;i++) {
			//����Բ�İ뾶
			c.radius=i;
			System.out.println(c.radius+"\t\t"+c.findArea());
		}
		c.radius=i;
	}
}
