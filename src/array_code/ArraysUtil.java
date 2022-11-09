package array_code;
/*
 * �Զ�������Ĺ�����
 * 
 * */
public class ArraysUtil {
		//����������ֵ
		public int getMax(int[] arr){
			int maxValue=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>maxValue) {
					maxValue=arr[i];
				}
			}
			return maxValue;
		}
		//���������Сֵ
		public int getMin(int[] arr){
			int minValue=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<minValue) {
					minValue=arr[i];
				}
			}
			return minValue;
		}
		//��������ܺ�
		public int getSum(int[] arr){
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			return sum;
		}
		//�������ƽ��ֵ
		public int getAvg(int[] arr){
			return getSum(arr)/arr.length;
		}
		//���µ�����ͬ����������Ϊ����
		//��ת����
		public void reverse(int[] arr) {
			for(int i=0,j=arr.length-1;i<j;i++,j--) {
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		public void reverse(String[] arr) {
			
		}
		//��������
		public int[] copy(int[] arr) {
			int[] arr1=new int[arr.length];
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=arr[i];
			}
			return arr;
		}
		//��������
		public void sort(int[] arr) {
			//ð������
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j]>arr[j+1]) {
//						int tmp=arr[j];
//						arr[j]=arr[j+1];
//						arr[j+1]=tmp;
						swap(arr,j,j+1);
					}
				}
			}
		}
		//��������
		public void print(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		//��������ָ��Ԫ��
		public int getIndex(int[] arr,int dest) {
			//���Բ���:
			for(int i=0;i<arr.length;i++) {
				if(dest==arr[i]) {
					return i;
				}
			}
			return -1;//���ظ�����ʾû���ҵ�
		}
		//��������ָ��Ԫ�ص�ֵ
		public void swap(int[] arr,int i,int j){
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
	}

