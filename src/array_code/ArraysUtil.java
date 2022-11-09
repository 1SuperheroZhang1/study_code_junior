package array_code;
/*
 * 自定义数组的工具类
 * 
 * */
public class ArraysUtil {
		//求数组的最大值
		public int getMax(int[] arr){
			int maxValue=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>maxValue) {
					maxValue=arr[i];
				}
			}
			return maxValue;
		}
		//求数组的最小值
		public int getMin(int[] arr){
			int minValue=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<minValue) {
					minValue=arr[i];
				}
			}
			return minValue;
		}
		//求数组的总和
		public int getSum(int[] arr){
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			return sum;
		}
		//求数组的平均值
		public int getAvg(int[] arr){
			return getSum(arr)/arr.length;
		}
		//如下的两个同名方法，称为重载
		//反转数组
		public void reverse(int[] arr) {
			for(int i=0,j=arr.length-1;i<j;i++,j--) {
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		public void reverse(String[] arr) {
			
		}
		//复制数组
		public int[] copy(int[] arr) {
			int[] arr1=new int[arr.length];
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=arr[i];
			}
			return arr;
		}
		//数组排序
		public void sort(int[] arr) {
			//冒泡排序
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
		//遍历数组
		public void print(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		//查找数组指定元素
		public int getIndex(int[] arr,int dest) {
			//线性查找:
			for(int i=0;i<arr.length;i++) {
				if(dest==arr[i]) {
					return i;
				}
			}
			return -1;//返回负数表示没有找到
		}
		//交换两个指定元素的值
		public void swap(int[] arr,int i,int j){
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
	}

