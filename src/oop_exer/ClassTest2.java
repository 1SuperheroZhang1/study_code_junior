package oop_exer;
/* ��ϰ3
 * 3.1 ��д��������һ��method�������ڷ����д�ӡһ��10*8��*�;��Σ���main�����е��ø÷�����
 * 3.2 �޸���һ��������method�����У�����ӡһ��10*8��*�;����⣬�ټ���þ��ε������
 *     ��������Ϊ��������ֵ����main�����е��ø÷��������շ��ص����ֵ��
 * 3.3 �޸���һ��������method�����ṩm��n���������������д�ӡһ��m*n��*�;��Ρ�
 *     ������þ��ε������������Ϊ��������ֵ����main�����е��ø÷��������շ��ص����ֵ����ӡ��
 * */
public class ClassTest2 {
	public static void main(String[] args) {
		ClassTest2 c=new ClassTest2();
		//3.1����
//	    c.method();
		//3.2����
		//��ʽһ
//		int area=c.method();
//		System.out.println("���Ϊ:"+area);
		//��ʽ��
//		System.out.println(c.method());
		//3.3����
		System.out.println(c.method(12,10));
	}
	//3.1
//	public void method() {
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<8;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	//3.2
//	public int method() {
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<8;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		return 10*8;
//	}
	//3.3
	public int method(int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m*n;
	}
}
