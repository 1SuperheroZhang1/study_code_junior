package oop_exer2;

public class Circle_Test {

	public static void main(String[] args) {
		Circle_ c1=new Circle_(2.3);
		Circle_ c2=new Circle_(2.3,"white",2.0);
		
		System.out.println("��ɫ�Ƿ����:"+c1.getColor().equals(c2.getColor()));
//		System.out.println("�뾶�Ƿ����:"+(c1.getRadius()==(c2.getRadius())));
		System.out.println("�뾶�Ƿ����:"+c1.equals(c2));
		System.out.println(c1.toString(c1));
		System.out.println(c2.toString(c2));
	}

}
