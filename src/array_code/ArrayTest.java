package array_code;

/*����
 * 1.1����ĸ���
 * ����:�Ƕ����ͬ�������ݰ�һ��˳�����еļ��ϣ���ʹ��һ������������
 *     ��ͨ����ŵķ�ʽ������Щ���ݽ���ͳһ����
 *     
 * 1.2������صĸ���
 * >������
 * >����Ԫ��
 * >�����±ꡢ����
 * >���鳤�� - ����Ԫ�صĸ���
 * 
 * 1.3������ص�:
 * 1)�������������еġ�
 * 2)�������������������͵ı�����
 *   �����Ԫ�أ��ȿ����ǻ����������ͣ�Ҳ�����������������͡�
 * 3)���������������ڴ��п���һ���������Ŀռ�
 * 4)����ĳ���һ��ȷ�����Ͳ����޸ġ�
 * 
 * 1.4����ķ���:
 * 1)����ά��:һά���顢��ά����......
 * 2)��������Ԫ�ص�����:������������Ԫ�ص����顢������������Ԫ�ص�����
 * 
 * 1.5һά�����ʹ��
 * 1)һά����������ͳ�ʼ��
 * 2)��ε�������ָ��λ�õ�Ԫ��
 * 3)��λ�ȡ����ĳ���
 * 4)��α�������
 * 5)����Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
 *  	>����Ԫ��������:0 byte/short/int
 *      >����Ԫ���Ǹ�����:0.0 float/double
 *      >����Ԫ����char��:0��"\u0000",����'0'
 *      >����Ԫ����boolean��:false
 *      
 *      >����Ԫ����������������:null
 * 6)������ڴ����
 * */
public class ArrayTest {
	public static void main(String[] args) {
		//1.һά����������ͳ�ʼ��
		int num;//����
		num=10; //��ʼ��
		int id=1001;//����+��ʼ��
		//1.1��̬��ʼ��:����ĳ�ʼ��������Ԫ�صĸ�ֵ����ͬʱ����
		int[] ids;//����
		ids=new int[] {1001,1002,1003,1004};//��ʼ��
		//1.2��̬��ʼ��:����ĳ�ʼ��������Ԫ�صĸ�ֵ�����ֿ�����
		String[] names= new String[5];
		//�ܽ�:����һ����ʼ����ɣ�����ĳ���ȷ��
		
		//2.��ε�������ָ��λ�õ�Ԫ��:ͨ���±�ķ�ʽ����
		//Java�������������0��ʼ��������ĳ���-1������
		names[0]= "wangming";
		names[1]="wanghe";
		names[2]="zhangxueliang";
		names[3]="wanghongzhi";
		names[4]="songjulong";
		//names[5]="zhouyang";//err - ArrayIndexOutOfBounds - �����±�Խ���쳣
		
		//3.��λ�ȡ����ĳ��ȡ�
		//����:length
		System.out.println(names.length);//5
		System.out.println(ids.length);//4
		
		//4.��α�������
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		//5.����Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
		int[] arr=new int[4];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------------------");
		short[] arr1=new short[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("---------------------------");
		float[] arr2=new float[4];
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("---------------------------");
		char[] arr3=new char[4];
		for(int i=0;i<arr3.length;i++) {
			System.out.println("----"+arr3[i]+"****");
		}
		if(arr3[0]==0) {
			System.out.println("���");
		}
		System.out.println("---------------------------");
		boolean[] arr4=new boolean[4];
		System.out.println(arr4[0]);
		
		System.out.println("---------------------------");
		String[] arr5=new String[5];
		System.out.println(arr5[0]);
		if(arr5[0]==null) {
			System.out.println("������������!");
		}
		
		//6.������ڴ����
		
	}
}
