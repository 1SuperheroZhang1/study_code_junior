package array_exer;
/* ��ϰ4
 * 4.����������Ŀ:
 *   ������Student�������������ԣ�ѧ��number(int)���꼶state(int),�ɼ�score(int).
 *   ����20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ����
 *  ����һ:��ӡ��3�꼶(stateֵΪ3)��ѧ����Ϣ��
 *  �����:ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ��
 *  
 *  ��ʾ:
 *  1) ���������:Math.random(),����ֵ����double
 *  2) ��������ȡ��:Math.round(double d),����ֵ����long
 *  
 *  �˴����Ƕ�ClassTest3_Array.java�ĸĽ�:����������Ĺ��ܷ�װ�������С�
 * */
public class ClassTest3_ArrayImprove {
	public static void main(String[] args) {
		//����Student���͵�����
		Student1 stus[]=new Student1[20];
		
		for(int i=0;i<stus.length;i++) {
			//������Ԫ�ظ�ֵ
			stus[i]=new Student1();
			//��Student��������Ը�ֵ
			stus[i].number=(i+1);
			//�꼶:[1,6]
			stus[i].state=(int)(Math.random()*(6-1+1)+1);
			//�ɼ�:[0,100]
			stus[i].score=(int)(Math.random()*(100+0+1));
		}
		ClassTest3_ArrayImprove c=new ClassTest3_ArrayImprove();
		//����ѧ������
		c.print(stus);
		System.out.println("*******************************");
		//����һ:��ӡ��3�꼶(stateֵΪ3)��ѧ����Ϣ��
		c.searchState(stus, 3);
		System.out.println("*******************************");
		//�����:ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ��
		c.sort(stus);
		//����
		c.print(stus);
	}
	//����Student1[]����Ĳ���
	public void print(Student1[] stus) {
		for(int i=0;i<stus.length;i++) {
//			System.out.print(stus[i].number+","+stus[i].state
//					+","+stus[i].score+"\n");
			System.out.println(stus[i].info());
		}
	}
	//����Student1[]������ָ���꼶��ѧ����Ϣ
	public void searchState(Student1[] stus,int state) {
			for(int i=0;i<stus.length;i++) {
				if(stus[i].state==state) {
					System.out.println(stus[i].info());
				}
			}
	}
	//��Student1[]��������
	public void sort(Student1[] stus) {
		for(int i=0;i<stus.length;i++) {
			for(int j=0;j<stus.length-1-i;j++) {
				//�����Ҫ���򣬽������������Ԫ�أ�Student���󣡣���
				if(stus[j].score>stus[j+1].score) {
					Student1 tmp=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=tmp;
				}
			}
		}
	}
}
class Student1{
	int number;//ѧ��
	int state;//�꼶
	int score;//�ɼ�
	
	//��ʾѧ����Ϣ�ķ���
	public String info() {
		return "ѧ�ţ�"+number+",�꼶��"+state+",�ɼ���"+score;
	}
}

