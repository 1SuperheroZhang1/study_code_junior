package oop_code3;
/*
 * �������Ӧ��: ģ�巽�������ģʽ(TemplateMethod)
 * 			���������ֵľ���һ��ģ��ģʽ����ƣ���������Ϊ��������ͨ��ģ�壬
 *     �����ڳ�����Ļ����Ͻ�����չ�����졣�����������ϻᱣ�����������Ϊ��ʽ��
 *   ���������:
 *   	> �������ڲ�һ����ʵ����ȷ���ģ�һ����ʵ���ǲ�ȷ���ġ�
 *        ��ʱ���԰Ѳ�ȷ���Ĳ��ֱ�¶��ȥ��������ȥʵ�֡�
 *   	> ���仰˵�������������ʵ��һ���㷨ʱ�����岽��̶ܹ���ͨ�ã���Щ�����Ѿ��ڸ�����д����
 *        ����ĳЩ�����ױ䣬�ױ䲿�ֿ��Գ������������ͬ����ʵ�֣������һ��ģ��ģʽ��
 * */
public class TemplateTest {
	public static void main(String[] args) {
		Template t=new SubTemplate();
		t.spendTime();
	}
}
abstract class Template{
	//����ĳ�δ���ִ�������ѵ�ʱ��
	public void spendTime() {
		long start = System.currentTimeMillis();
		
		code();//��ȷ���Ĳ��֡��ױ�Ĳ���
		
		long end = System.currentTimeMillis();
		
		System.out.println("���ѵ�ʱ��Ϊ:"+(end-start));
	}
	
	public abstract void code();
}
class SubTemplate extends Template{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		for(int i=2;i<1000;i++) {
			boolean isFlag=false;
			for(int j=2;j<=Math.sqrt(i);j++) {
				
				if(i%j==0) {
					isFlag=true;
					break;
				}
			}
			if(isFlag) {
				System.out.println(i);
			}
		}
	}
	
}