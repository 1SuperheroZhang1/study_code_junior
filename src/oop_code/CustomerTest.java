package oop_code;
/* ���з�����������ʹ��
 * ����:������Ӧ�þ��еĹ��ܡ�
 * ����:Math��:sqrt()\random()\...
 * 	    Scanner��:nextXxx() ...
 * 		Arrays��: sort()\binarySearch()\toString()\fill()\equals()\...
 * 1.����:
 * 			public void eat() {}
 * 			public void sleep(int hour) {}
 * 			public String getName() {}
 * 			public String getNation(String nation) {}
 * 2.����������: Ȩ�����η� ����ֵ���� ������(�β��б�) {
 * 					������
 * 				}
 * 3.˵��
 * 		3.1 ����Ȩ�����η�
 * 			Java�涨��Ȩ�����η�:private default protected public --->��װ��
 *      3.2 ����ֵ���� �з���ֵ VS û�з���ֵ
 *      	3.2.1 ��������з���ֵ��������ڷ�������ʱ��ָ������ֵ�����͡�
 *      		  ͬʱ��������Ҫʹ��return�ؼ���������ָ�����͵ı����ͳ���"return ����"��
 *                �������û�з���ֵ���򷽷�����ʱ��ʹ��void����ʾ��
 *          	  ͨ����û�з���ֵ�ķ����У��Ͳ���Ҫʹ��return��
 *                ���ǣ����ʹ�õĻ�����ֻ��"return;"��ʾ�����˷�������˼��
 *          3.2.2 ���Ƕ��巽��ʱ�����׸ò����з���ֵ��
 *          		����ĿҪ��
 *                  ��ƾ����:��������������
 *      3.3 ������:���ڱ�ʶ������ѭ��ʶ���Ĺ���͹淶��"����֪��"
 *      3.4 �β��б�: ������������0����1�������βΡ�
 *      	 3.4.1 ��ʽ: ��������1 �β�1,��������2 �β�2,...
 *           3.4.2 ���Ƕ��巽��ʱ���ò��ö����βΣ�
 *           		����ĿҪ��
 * 					��ƾ����:��������������
 * 		3.5 ������: �������ܵ�����
 * 4.return�ؼ��ֵ�ʹ��:
 *  	4.1ʹ�÷�Χ: ʹ���ڷ�������
 *      4.2����:  �ٽ���������
 *      		 ��������з���ֵ���͵ķ�����ʹ��"return ����"����������Ҫ�����ݡ�
 *      4.3ע���: return�ؼ��ֺ��治��������ִ����䡣
 * 5.������ʹ���У����Ե��õ�ǰ������Ի򷽷���
 * 		�����: ����A���ֵ����˷���A:�ݹ鷽�� 
 *   �����У������Զ��巽����
 * */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1=new Customer();
		cust1.eat();
		//�����β��Ƿ���Ҫ���õ�����
		int[] arr=new int[] {1,6,4,3,5,7,8,10};
		cust1.sort(arr);
	}
}
class Customer{
	//����
	String name;
	int age;
	boolean isMale;
	
	//����
	public void eat() {
		System.out.println("�ͻ��Է���");
		return;
		//return���治�ܶ�����ʽ
		//System.out.println("HelloWorld!");
	}
	public void sleep(int hour) {
		System.out.println("��Ϣ��"+hour+"��Сʱ");
		eat();
		sleep(10);
	}
	public String getName() {
		return name;
	}
	public String getNation(String nation) {
		String info="�ҵĹ�����"+nation;
		return info;
	}
	//����β��Ƿ���Ҫ���õ�����
	public void sort(int[] arr) {
		
	}
	public void sort( ) {
		int arr[]=new int[] {1,6,4,3,5,7,8,10};
		//...
	}
	public void info() {
		//�����
//		public void swim() {
//			
//		}
	}
}