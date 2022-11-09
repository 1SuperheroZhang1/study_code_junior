package oop_exer3;
/*
 * ����һ���ӿڣ�����ʵ����������ıȽϡ�
 * 
 * interface CompareObject{
 * 		public int CompareTo(Object o);//������ֵ��0��������ȡ���Ϊ����������ǰ�����
 * 			��Ϊ����������ǰ����С��
 * }
 * 
 * ����һ��Circle�࣬����radius���ԣ��ṩgetter��setter������
 * 
 * ����һ��ComparableCircle�࣬�̳�Circle�ಢ��ʵ��CompareObject�ӿڡ���ComparableCircle����
 * �����ӿ��з���CompareTo��ʵ���壬�����Ƚ�����Բ�İ뾶��С��
 * 
 * ����һ��������InterfaceTest����������ComparableCircle���󣬵���CompareTo�����Ƚ�������İ뾶��С��
 * */
public class InterfaceTest {
	public static void main(String[] args) {
		ComparableCircle c1=new ComparableCircle(2.3);
		ComparableCircle c2=new ComparableCircle(2.1);
		int compareValue = c1.CompareTo(c2);
		if(compareValue>0) {
			System.out.println("c1�����");
		}else if(compareValue<0) {
			System.out.println("c2�����");
		}else {
			System.out.println("c1�����c2����һ����");
		}
		int compareValue1=c1.CompareTo(new String("AA"));
		System.out.println(compareValue1);
		
	}
}
interface CompareObject{
	//������ֵ��0��������ȡ���Ϊ����������ǰ�������Ϊ����������ǰ����С��
	public int CompareTo(Object o);
}
class Circle_{
	private  Double radius;
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Circle_(Double radius) {
		super();
		this.radius = radius;
	}

	public Circle_() {
		super();
	}
	
	
}
class ComparableCircle extends Circle_ implements CompareObject{

	public ComparableCircle(Double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int CompareTo(Object o) {
		if(this==o) {
			return 0;
		}
		if(o instanceof ComparableCircle) {
			ComparableCircle c=(ComparableCircle)o;
			//�����
//			return (int) (this.getRadius()-c.getRadius());
			//��ȷ�ķ�ʽһ:
//			if(this.getRadius()>c.getRadius()) {
//				return 1;
//			}else if(this.getRadius()>c.getRadius()){
//				return -1;
//			}else {
//				return 0;
//			}
			//��ȷ�ķ�ʽһ:
			//������radius����ΪDouble����ʱ������ʹ�ð�װ��ķ���
			return this.getRadius().compareTo(c.getRadius());
		}
		else {
//			return 0;
			throw new RuntimeException("������������Ͳ�ƥ��");
		}
		
	}
	
}