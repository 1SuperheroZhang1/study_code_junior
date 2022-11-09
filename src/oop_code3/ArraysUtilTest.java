package oop_code3;

public class ArraysUtilTest {
	public static void main(String[] args) {
//		ArraysUtil util=new ArraysUtil();
		int[] arr=new int[] {1,5,4,98,3,7,8,9};
		int max=ArraysUtil.getMax(arr);
//		System.out.println("最大值为:"+max);
		
		System.out.println("排序前:");
		ArraysUtil.print(arr);
		System.out.println("排序后:");
		ArraysUtil.sort(arr);
		ArraysUtil.print(arr);
//		System.out.println("查找:");
//		int index=util.getIndex(arr, 5);
//		if(index>0) {
//			System.out.println("找到了，索引为"+index);
//		}else {
//			System.out.println("未找到");
//		}
		
	}
}
