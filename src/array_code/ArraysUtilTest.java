package array_code;

public class ArraysUtilTest {
	public static void main(String[] args) {
		ArraysUtil util=new ArraysUtil();
		int[] arr=new int[] {1,5,4,98,3,7,8,9};
		int max=util.getMax(arr);
//		System.out.println("���ֵΪ:"+max);
		
		System.out.println("����ǰ:");
		util.print(arr);
		System.out.println("�����:");
		util.sort(arr);
		util.print(arr);
//		System.out.println("����:");
//		int index=util.getIndex(arr, 5);
//		if(index>0) {
//			System.out.println("�ҵ��ˣ�����Ϊ"+index);
//		}else {
//			System.out.println("δ�ҵ�");
//		}
		
	}
}
