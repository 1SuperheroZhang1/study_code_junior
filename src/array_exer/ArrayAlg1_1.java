package array_exer;
/* ��ϰ6
 * ʹ�ü�����
 * ��չ:�޸���Ŀ��ʵ��array2��array1����ĸ���
 * */
public class ArrayAlg1_1 {
	public static void main(String[] args) {
		int[] array1,array2;
		array1=new int[] {2,3,5,7,11,13,17,19};
		//��ʾarray1������
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		//����ĸ���
		array2=new int[array1.length];
		for(int i=0;i<array2.length;i++) {
			array2[i]=array1[i];
		}
		//�޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ(��array[0]=0,array[2]=2)
		for(int i=0;i<array2.length;i++) {
			if(i%2==0) {
				array2[i]=array1[i];
			}
		}
		//��ӡ��array1
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
	}
}

