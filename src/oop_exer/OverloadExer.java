package oop_exer;
/* ��ϰ
 * 1.��д����: �����������ط��������á�������ΪmOL
 * 			  ���������ֱ����һ��int�Ͳ���������int�Ͳ�����һ���ַ���������
 * 			  �ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
 * 			  �������main()�����зֱ��ò��������������������
 * 2.��д����:�����������ط���max()
 * 			  ��һ������������intֵ�е����ֵ
 * 			  �ڶ�������������doubleֵ�е����ֵ
 * 			  ����������������doubleֵ�е����ֵ
 * 			  ���ֱ������������
 * */
public class OverloadExer {
	//1. ���µ�����������������
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	public void mOL(String str) {
		System.out.println(str);
	}
	//2. ��������������������
	public int max(int x,int y) {
		return (x>y)?x:y;
	}
	public double max(double d1,double d2) {
		return (d1>d2)?d1:d2;
	}
	public double max(double d1,double d2,double d3) {
		return (d1>d2)?((d1>d3)?d1:d3):((d2>d3)?d2:d3);
	}
}
