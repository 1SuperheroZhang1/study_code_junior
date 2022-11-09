package oop_code3;
/* 
 * static�ؼ��ֵ�ʹ��:
 * 1.static:��̬��
 * 2.static������������:���ԡ�����������顢�ڲ��ࡣ
 * 3.ʹ��static��������:��̬����(�������)
 * 			3.1 ����:���Ƿ�ʹ��static���Σ��ַ�Ϊ: ��̬���� VS �Ǿ�̬����(ʵ������)
 * 				 ʵ������: ���Ǵ�������Ķ������ÿ�����󶼶�����ӵ��һ�����еķǾ�̬���ԣ�
 * 						���޸�����һ������ķǾ�̬����ʱ�����ᵼ������������ͬ��������ֵ���޸ġ�
 * 				 ��̬����: ���Ǵ�������Ķ�����󣬶��������ͬһ����̬������
 *                      ��ͨ��ĳһ�������޸ľ�̬����ʱ���ᵼ������������ô˾�̬����ʱ�����޸Ĺ��˵ġ�
 *          3.2 static�������Ե�����˵����
 *          	�پ�̬����������ļ��ض����ء�����ͨ��"��.��̬����"�ķ�ʽ���е��á�
 *              �ھ�̬�����ļ���Ҫ���ڶ���Ĵ�����
 *              ��������ֻ����һ�Σ���̬����������Ҳֻ�����һ��:���ڷ������ľ�̬���С�
 *              
 *              ��       �����          ʵ������
 *                 ��   yes				no
 *                ����  yes				yes
 *          3.3 ��̬���Ծ���: System.out,Math.PI;
 *              
 * 4.ʹ��static���η���:��̬����
 * 		��������ļ��ض����أ�����ͨ��"��.��̬����"�ķ�ʽ���е��á�
 * 		��              ��̬����         �Ǿ�̬����
 *                ��    yes				no
 *                ����  yes				yes
 *      �۾�̬�����У�ֻ�ܵ��þ�̬������̬���ԡ�
 *       �Ǿ�̬�����У��ȿ��Ե��÷Ǿ�̬���������ԣ�Ҳ���Ե��þ�̬���������ԡ�
 * 5.staticʹ��ע���:
 * 		5.1 �ھ�̬�ķ����У�����ʹ��this�ؼ���,super�ؼ���
 * 		5.2 ���ھ�̬���Ժ;�̬������ʹ�ã����������ڵĽǶ�ȥ��⡣
 * 
 * 6. �����У����ȷ��һ�������Ƿ�Ҫ����Ϊstatic��?
 * 		> ���Կ����Ƕ������������ģ��������Ŷ���Ĳ�ͬ����ͬ��
 * 		> ���еĳ���Ҳ��������Ϊstatic��
 *    �����У����ȷ��һ�������Ƿ�Ҫ����Ϊstatic��?
 *    	> ������̬���Եķ�����ͨ������Ϊstatic��
 *    	> �������еķ�����ͨ������Ϊstatic�ģ�����:Math��Arrays��Collections
 * */
public class StaticTest {
	public static void main(String[] args) {
		Chinese.nation="�й�";
		Chinese c1=new Chinese();
		c1.name="Ҧ��";
		c1.age=40;
		c1.nation="CHN";
		
		Chinese c2=new Chinese();
		c2.name="����";
		c2.age=30;
		c2.nation="CHINA";
		System.out.println(c2.nation);
		System.out.println(c1.nation);
		
		//���벻ͨ��
//		Chinese.name="�ż̿�";
		c1.eat();
		Chinese.show();
		//���벻ͨ��
//		Chinese.eat();
	}
}
//�й���
class Chinese{
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("�й��˳��в�");
		//���÷Ǿ�̬�ṹ
		info();
		System.out.println("name:"+name);
		//���þ�̬�ṹ
		walk();
		System.out.println("nation:"+nation);
	}
	public static void show() {
		System.out.println("����һ���й���");
		//���ܵ��÷Ǿ�̬�Ľṹ
//		eat();
//		name="Tom";
		//���Ե��þ�̬�Ľṹ
		System.out.println(Chinese.nation);
		walk();
	}
	public void info() {
		System.out.println("name:"+name+",age:"+age);
	}
	public static void walk() {
		
	}
}