package oop_code4;
/*
 * �����оֲ��ڲ����ʹ��
 * */
public class InnerClassTest1 {
	
	
	//�����к��ټ�
	public void method1() {
		//�������ڲ���
		class AA{
			
		}
	}
	//������ʵ��Comparable�ӿڵ���Ķ���
	public Comparable getComparable() {
		//����һ��ʵ����Comparable�ӿڵ���
		//��ʽһ: ����һ��ʵ����Comparable�ӿڵķ�����ʵ�������������
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		}
//		return new MyComparable();
		//��ʽ��: ����һ��ʵ����Comparable�ӿڵ����������������
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
	
}

