package array_exer;
/* ����ĸ��ơ���ת������(���Բ��ҡ����ַ�����)��
 * 
 * */
public class ArrayAlg2_Copy_Reverse_Search {
	public static void main(String[] args) {
		String[] arr= {"JJ","GG","BB","MM","AA"};
		
		//����ĸ���(��������������ĸ�ֵ:arr1=arr)
		String[] arr1=new String[arr.length];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr[i];
		}
		
		//����ķ�ת
		//����һ:
//		for(int i=0;i<arr.length/2;i++) {
//			String tmp=arr[i];
//			arr[i]=arr[arr.length-1-i];
//			arr[arr.length-1-i]=tmp;
//		}
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			String tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
		//����
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//����(����)
		//���Բ���:
		String dest="CC";
		boolean isFlag=true;
		for(int i=0;i<arr.length;i++) {
			if(dest.equals(arr[i])) {
				System.out.println("�ҵ���ָ��λ�õ�Ԫ�أ�λ��Ϊ:"+i);
				isFlag=false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("���ź���û���ҵ�Ŷ��");
		}
		//���ַ�����:
		//ǰ��:��Ҫ���ҵ������������
		int[] a=new int[] {-98,-34,2,34,54,66,79,105,210,333};
		boolean isFlag1=true;
		int dest1=-34;
		int head=0;//��ʼ��������
		int end=a.length-1;//��ʼ��β����
		while(head<end) {
			int mid=(head+end)/2;
			if(dest1==a[mid]) {
				System.out.println("�ҵ���ָ��λ�õ�Ԫ�أ�λ��Ϊ:"+mid);
				isFlag1=false;
				break;
			}else if(dest1<a[mid]) {
				end=mid-1;
			}else {//dest1>a[mid]
				head=mid+1;
			}
		}
		if(isFlag1) {
			System.out.println("���ź���û���ҵ�Ŷ��");
		}

	}
}
