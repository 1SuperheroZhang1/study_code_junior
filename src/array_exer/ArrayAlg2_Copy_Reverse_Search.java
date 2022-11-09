package array_exer;
/* 数组的复制、反转、查找(线性查找、二分法查找)。
 * 
 * */
public class ArrayAlg2_Copy_Reverse_Search {
	public static void main(String[] args) {
		String[] arr= {"JJ","GG","BB","MM","AA"};
		
		//数组的复制(区别于数组变量的赋值:arr1=arr)
		String[] arr1=new String[arr.length];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr[i];
		}
		
		//数组的反转
		//方法一:
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
		//遍历
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//查找(搜索)
		//线性查找:
		String dest="CC";
		boolean isFlag=true;
		for(int i=0;i<arr.length;i++) {
			if(dest.equals(arr[i])) {
				System.out.println("找到了指定位置的元素，位置为:"+i);
				isFlag=false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("很遗憾，没有找到哦！");
		}
		//二分法查找:
		//前提:所要查找的数组必须有序。
		int[] a=new int[] {-98,-34,2,34,54,66,79,105,210,333};
		boolean isFlag1=true;
		int dest1=-34;
		int head=0;//初始的首索引
		int end=a.length-1;//初始的尾索引
		while(head<end) {
			int mid=(head+end)/2;
			if(dest1==a[mid]) {
				System.out.println("找到了指定位置的元素，位置为:"+mid);
				isFlag1=false;
				break;
			}else if(dest1<a[mid]) {
				end=mid-1;
			}else {//dest1>a[mid]
				head=mid+1;
			}
		}
		if(isFlag1) {
			System.out.println("很遗憾，没有找到哦！");
		}

	}
}
