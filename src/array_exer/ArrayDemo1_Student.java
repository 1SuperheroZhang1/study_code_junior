package array_exer;
/*��ϰ2

 * �Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ�
 * >�ɼ�>=��߷�-10 �ȼ�Ϊ'A'
 * >�ɼ�>=��߷�-20 �ȼ�Ϊ'B'
 * >�ɼ�>=��߷�-30 �ȼ�Ϊ'C'
 * >����            �ȼ�Ϊ'D'
 * ��ʾ:�ȶ���ѧ������������ѧ����������int���飬���ѧ���ɼ�
 * */
import java.util.Scanner;
public class ArrayDemo1_Student {
	public static void main(String[] args) {
		//1.ʹ��Scanner��ȡѧ������
		Scanner sc=new Scanner(System.in);
		System.out.print("������ѧ������:");
		int size=sc.nextInt();
		//2.�������飬�洢ѧ���ɼ�����̬��ʼ��
		int scores[]=new int[size];
		//3.������Ԫ�ظ�ֵ
		System.out.println("������"+size+"��ѧ���ĳɼ�:");
		int maxScore=0;
		for(int i=0;i<scores.length;i++) {
			scores[i]=sc.nextInt();
			//4.��ȡ����Ԫ�ص����ֵ
			if(scores[i]>maxScore) {
				maxScore=scores[i];
			}
		}
//		//4.��ȡ����Ԫ�ص����ֵ
//		int maxScore=0;
//		for(int i=0;i<scores.length;i++) {
//			if(scores[i]>maxScore) {
//				maxScore=scores[i];
//			}
//		}
		//5.����ÿ��ѧ���ɼ�����߷ֵĲ�ֵ���õ�ÿ��ѧ���ĵȼ���������ȼ��ͳɼ���
		for(int i=0;i<scores.length;i++)
		{
			if(scores[i]>=maxScore-10) {
				System.out.println("student "+i+" score is "+scores[i]+",grade is "+'A');
			}else if(scores[i]>=maxScore-20) {
				System.out.println("student  "+i+" score is "+scores[i]+",grade is "+'B');
			}else if(scores[i]>=maxScore-30) {
				System.out.println("student"+i+" score is "+scores[i]+",grade is "+'C');
			}else {
				System.out.println("student "+i+" score is "+scores[i]+",grade is "+'D');
			}
		}
	}
}
