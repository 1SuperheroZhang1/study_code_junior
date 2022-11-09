package array_code;
/*
 * Java�������ṩ��֧�ֶ�ά������÷���
 * 1.6��ά����
 * �涨:��ά�����Ϊ�������Ԫ�أ��ڲ�����Ԫ��
 * 	int[] arr[]=new int[4][3];
 *  ���Ԫ��:arr[0],arr[1]��
 *  �ڲ�Ԫ��:arr[0][0],arr[1][2]...��
 * 1.���:���ڶ�ά�������⣬���ǿ��Կ�����һά����array1����Ϊ��һ��
 * 		  һά����array2��Ԫ�ض����ڡ�
 *    ��ʵ��������ײ�����л�����������ʵû�ж�ά���顣
 * 2.��ά�����ʹ��:
 * 1)��ά����������ͳ�ʼ��
 * 2)��ε�������ָ��λ�õ�Ԫ��
 * 3)��λ�ȡ����ĳ���
 * 4)��α�������
 * 5)����Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
 *   >����ڳ�ʼ����ʽһ:����:int[] arr[]=new int[4][3];
 *   	>���Ԫ�صĳ�ʼ��ֵ:��ֵַ
 *   	>�ڲ�Ԫ�صĳ�ʼ��ֵ:��һά����ĳ�ʼ�������ͬ
 *   >����ڳ�ʼ����ʽ��:����:int[] arr[]=new int[4][];
 *   	>���Ԫ�صĳ�ʼ��ֵ:null
 *   	>�ڲ�Ԫ�صĳ�ʼ��ֵ:���ܵ��ã����򱨴�
 * 6)������ڴ����
 * */
public class ArrayTest1 {
	public static void main(String[] args) {
		//1.��ά����������ͳ�ʼ��
		int[] arr=new int[] {1,2,3};//һά����
		//��̬��ʼ��
		int[][] arr1=new int[][] {{1,2,3},{4,5},{7,8,9}};
		//��̬��ʼ��1
		String[][] arr2=new String[3][2];
		//��̬��ʼ��2
		String[][] arr3=new String[3][];
		//�������
		//String[][] arr4=new String[][4];
		//String[4][3] arr5=new String[][];
		//int[][] arr6=new int[4][3] {{1,2,3},{4,5},{7,8,9}};
		//��ȷ:
		int[] arr4[]=new int[][] {{1,2,3},{4,5},{7,8,9}};
		int[] arr5[]= {{1,2,3},{4,5},{7,8,9}};//�����ƶ�
		
		//2.��ε�������ָ��λ�õ�Ԫ��
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		arr3[1]=new String[4];
		System.out.println(arr3[1][0]);
		
		//3.��λ�ȡ����ĳ���
		System.out.println(arr4.length);//3
		System.out.println(arr4[0].length);//3
		System.out.println(arr4[1].length);//2
		
		//4.��α�������
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+"  ");
			}
			System.out.println();
		}
		
		//5.����Ԫ�ص�Ĭ�ϳ�ʼֵ
		int[] a[]=new int[4][3];
		System.out.println(a[0]);//��ֵַ - [I@7de26db8
		System.out.println(a[0][0]);//0
		//System.out.println(a);//[[I@1175e2db
		System.out.println("*****************************");
		float[] a1[]=new float[4][3];
		System.out.println(a1[0]);//��ֵַ - [F@1175e2db
		System.out.println(a1[0][0]);//0.0
		System.out.println("*****************************");
		String[] a2[]=new String[4][3];
		System.out.println(a2[0]);//��ֵַ - [Ljava.lang.String;@7637f22
		System.out.println(a2[0][0]);//null
		System.out.println("*****************************");
		double[] a3[]=new double[4][];
		System.out.println(a3[1]);//null
		//System.out.println(a3[1][0]);//java.lang.NullPointerException
	
	}
}
