package array_exer;
/* �������漰�ĳ����㷨
 * 1.����Ԫ�صĸ�ֵ(������ǡ���������)��
 * 2.����ֵ��������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵ȡ�
 * 3.����ĸ��ơ���ת������(���Բ��ҡ����ַ�����)��
 * 4.����Ԫ�ص������㷨��
 * */
/* ��ϰ5 - ����ֵ��������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵�
 * ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������Ȼ���������Ԫ�ص����ֵ����Сֵ����ֵ��ƽ��ֵ�������������
 * Ҫ��:���������������λ��
 * ��ʾ:
 * 	[0,1)*90 ->[0,90)+10 ->[10,100) ->[10,99)
 *  (int)(Math.random()*90+10)
 * */
public class ArrayAlg {
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*(99-10+1)+10);
		}
		//��������
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//������Ԫ�ص����ֵ
		int maxValue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
		}
		System.out.println("���ֵΪ:"+maxValue);
		//������Ԫ�ص���Сֵ
		int minValue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		System.out.println("��СֵΪ:"+minValue);
		//������Ԫ�صĺ�ֵ
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("��ֵΪ:"+sum);
		//������Ԫ�ص�ƽ��ֵ
		int avgValue=sum/arr.length;
		System.out.println("ƽ��ֵΪ:"+avgValue);
		
	}
}
