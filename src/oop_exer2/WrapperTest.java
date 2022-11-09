package oop_exer2;

import java.util.Scanner;
import java.util.Vector;

/* 
 * ����Vector�������鴦��: �Ӽ��̶���ѧ���ɼ�(�Ը��������������)���ҳ���߷֣������ѧ���ȼ���
 * 	��ʾ:����һ�����������Ⱦ͹̶����䣬�����ڴ�������ǰ����Ҫ֪�����ȡ�
 *  ��������java.util.Vector����Ը�����Ҫ��̬������
 *  
 *  ����	Vector����: Vector v=new Vector();
 *  ���������Ԫ��: v.addElement(Object obj);//obj�����Ƕ���
 *  ȡ�������е�Ԫ��: Object obj=v.elementAt(0);
 *  ע��: ��һ��Ԫ�ص��±���0������ֵ��Object���͵ġ�
 *  ���������ĳ���: v.size();
 *    ������߷����10�����ڣ�A�ȣ�20�����ڣ�B�ȡ�
 *    30�����ڣ�C�ȣ�������D��
 * 
 * */
public class WrapperTest {
	public static void main(String[] args) {
		//1.ʵ����Scanner�����ڴӼ��̻�ȡѧ���ɼ�
		Scanner sc=new Scanner(System.in);
		//2.����	Vector����: Vector v=new Vector();�൱��ԭ��������
		Vector v=new Vector();
		//3.ͨ��for(;;)��(while(true))�ķ�ʽ����Vector���������
		int maxScore=0;
		for(;;) {
			System.out.println("������ѧ���ĳɼ�(�����븺��ʱ����ʾ����)");
			int score = sc.nextInt();
			//3.2 �����븺��ʱ������ѭ��
			if(score<0) {
				break;
			}
			if(score>100) {
				System.out.println("����ĳɼ��Ƿ�������������:");
				continue;
			}
			
			//3.1 ��Ӳ���  v.addElement(Object obj);//obj�����Ƕ���
			//JDK 5.0 ֮ǰ:
//			Integer inScore=new Integer(score);
//		    v.addElement(inScore);//��̬
			//JDK 5.0֮��:
			v.addElement(score);//�Զ�װ��
		    //4. ��ȡѧ���ɼ������ֵ
		    if(maxScore<score) {
		    	maxScore=score;
		    }
		}
		//5. ����Vector���õ�ÿ��ѧ���ĳɼ����������ֵ�Ƚϣ��õ�ÿ��ѧ���ĵȼ���
		char level;
		for(int i=0;i<v.size();i++) {
			Object obj = v.elementAt(i);
			//JDK 5.0֮ǰ:
//			Integer inScore=(Integer)obj;
//			int score=inScore.intValue();
			//JDK 5.0֮��:
			int score=(int)obj;//�Զ�����
			
			if(maxScore -score<=10) {
				level='A';
			}else if(maxScore - score<=20) {
				level='B';
			}else if(maxScore - score<=30) {
				level='C';
			}else {
				level='D';
			}
		System.out.println("student - "+i+" score is "+score+",level is "+level);
		}
	}
}
