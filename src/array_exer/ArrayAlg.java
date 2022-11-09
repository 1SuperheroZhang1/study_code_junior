package array_exer;
/* 数组中涉及的常见算法
 * 1.数组元素的赋值(杨辉三角、回型数等)。
 * 2.求数值型数组中元素的最大值、最小值、平均数、总和等。
 * 3.数组的复制、反转、查找(线性查找、二分法查找)。
 * 4.数组元素的排序算法。
 * */
/* 练习5 - 求数值型数组中元素的最大值、最小值、平均数、总和等
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求:所有随机数都是两位数
 * 提示:
 * 	[0,1)*90 ->[0,90)+10 ->[10,100) ->[10,99)
 *  (int)(Math.random()*90+10)
 * */
public class ArrayAlg {
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*(99-10+1)+10);
		}
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//求数组元素的最大值
		int maxValue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
		}
		System.out.println("最大值为:"+maxValue);
		//求数组元素的最小值
		int minValue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		System.out.println("最小值为:"+minValue);
		//求数组元素的和值
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("和值为:"+sum);
		//求数组元素的平均值
		int avgValue=sum/arr.length;
		System.out.println("平均值为:"+avgValue);
		
	}
}
