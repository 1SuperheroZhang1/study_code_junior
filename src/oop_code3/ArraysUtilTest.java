package oop_code3;

public class ArraysUtilTest {
	public static void main(String[] args) {
//		ArraysUtil util=new ArraysUtil();
		int[] arr=new int[] {1,5,4,98,3,7,8,9};
		int max=ArraysUtil.getMax(arr);
//		System.out.println("���ֵΪ:"+max);
		
		System.out.println("����ǰ:");
		ArraysUtil.print(arr);
		System.out.println("�����:");
		ArraysUtil.sort(arr);
		ArraysUtil.print(arr);
//		System.out.println("����:");
//		int index=util.getIndex(arr, 5);
//		if(index>0) {
//			System.out.println("�ҵ��ˣ�����Ϊ"+index);
//		}else {
//			System.out.println("δ�ҵ�");
//		}
		
	}
}
