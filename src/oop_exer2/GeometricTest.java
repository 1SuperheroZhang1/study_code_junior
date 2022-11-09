package oop_exer2;
/* ���������࣬����GeometricObject��������״������Circle��ʾԲ�Σ�MyRectangle��ʾ����
 * ���������GeometricTest����дequalsArea()���������������������Ƿ����(ע�ⷽ���Ĳ������ͣ�ʹ�ö�̬�󶨼���)
 * ��дdisplayGeometricObject������ʾ��������(ע�ⷽ���Ĳ������ͣ�ʹ�ö�̬�󶨼���)
 * */
public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test=new GeometricTest();
		Circle c1=new Circle(2.3,"white",1.0);
		test.displayGeometricObject(c1);
		Circle c2=new Circle(3.3,"white",1.0);
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalsAreas(c1, c2);
		System.out.println("c1��c2������Ƿ����:"+isEquals);
	}
	//�ж�������������Ƿ����
	public boolean equalsAreas(GeometricObject o1,GeometricObject o2){
		return o1.findArea()==o2.findArea();
	}
	//
	public void displayGeometricObject(GeometricObject obj) {//GeometricObject obj =new Circle(...);
		System.out.println("���Ϊ:"+obj.findArea());
	}
}
