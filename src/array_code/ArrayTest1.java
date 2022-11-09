package array_code;
/*
 * Java语言里提供了支持多维数组的用法。
 * 1.6二维数组
 * 规定:二维数组分为外层数组元素，内层数组元素
 * 	int[] arr[]=new int[4][3];
 *  外层元素:arr[0],arr[1]等
 *  内层元素:arr[0][0],arr[1][2]...等
 * 1.理解:对于二维数组的理解，我们可以看成是一维数组array1又做为另一个
 * 		  一维数组array2的元素而存在。
 *    其实，从数组底层的运行机制来看，其实没有多维数组。
 * 2.二维数组的使用:
 * 1)二维数组的声明和初始化
 * 2)如何调用数组指定位置的元素
 * 3)如何获取数组的长度
 * 4)如何遍历数组
 * 5)数组元素的默认初始化值
 *   >针对于初始化方式一:比如:int[] arr[]=new int[4][3];
 *   	>外层元素的初始化值:地址值
 *   	>内层元素的初始化值:与一维数组的初始化情况相同
 *   >针对于初始化方式二:比如:int[] arr[]=new int[4][];
 *   	>外层元素的初始化值:null
 *   	>内层元素的初始化值:不能调用，否则报错
 * 6)数组的内存解析
 * */
public class ArrayTest1 {
	public static void main(String[] args) {
		//1.二维数组的声明和初始化
		int[] arr=new int[] {1,2,3};//一维数组
		//静态初始化
		int[][] arr1=new int[][] {{1,2,3},{4,5},{7,8,9}};
		//动态初始化1
		String[][] arr2=new String[3][2];
		//动态初始化2
		String[][] arr3=new String[3][];
		//错误情况
		//String[][] arr4=new String[][4];
		//String[4][3] arr5=new String[][];
		//int[][] arr6=new int[4][3] {{1,2,3},{4,5},{7,8,9}};
		//正确:
		int[] arr4[]=new int[][] {{1,2,3},{4,5},{7,8,9}};
		int[] arr5[]= {{1,2,3},{4,5},{7,8,9}};//类型推断
		
		//2.如何调用数组指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		arr3[1]=new String[4];
		System.out.println(arr3[1][0]);
		
		//3.如何获取数组的长度
		System.out.println(arr4.length);//3
		System.out.println(arr4[0].length);//3
		System.out.println(arr4[1].length);//2
		
		//4.如何遍历数组
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+"  ");
			}
			System.out.println();
		}
		
		//5.数组元素的默认初始值
		int[] a[]=new int[4][3];
		System.out.println(a[0]);//地址值 - [I@7de26db8
		System.out.println(a[0][0]);//0
		//System.out.println(a);//[[I@1175e2db
		System.out.println("*****************************");
		float[] a1[]=new float[4][3];
		System.out.println(a1[0]);//地址值 - [F@1175e2db
		System.out.println(a1[0][0]);//0.0
		System.out.println("*****************************");
		String[] a2[]=new String[4][3];
		System.out.println(a2[0]);//地址值 - [Ljava.lang.String;@7637f22
		System.out.println(a2[0][0]);//null
		System.out.println("*****************************");
		double[] a3[]=new double[4][];
		System.out.println(a3[1]);//null
		//System.out.println(a3[1][0]);//java.lang.NullPointerException
	
	}
}
