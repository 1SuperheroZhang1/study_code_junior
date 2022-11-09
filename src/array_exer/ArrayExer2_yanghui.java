package array_exer;
/*
 * 练习3
 * 声明: int[]x,y[];在x,y变量赋值以后，以下选项允许通过编译的是:
 * a) x[0]=y; - no
 * b) y[0]=x; - yes
 * c) y[0][0]=x; - no
 * d) x[0][0]=y; - no
 * e) y[0][0]=x[0]; - yes
 * f) x=y; - no
 * 提示:
 * 一维数组: int[]x 或 intx[]
 * 二维数组: int[][]y 或 int y[][]
 * */
/*
 * 练习4
 * 使用二维数组打印一个10行的杨辉三角。
 * 提示:
 * 1.第一行有1个元素，第n行有n个元素
 * 2.每一行的第一个元素和最后一个元素都是1
 * 3.从第三行开始，对于非第一个元素和最后一个元素的元素。
 * 即: yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
 * 
 * */
public class ArrayExer2_yanghui {
	public static void main(String[] args) {
		//1.声明并初始化二维数组
		int[][] yanghui=new int[10][];
		//2.给数组的元素赋值
		for(int i=0;i<yanghui.length;i++) {
			yanghui[i]=new int[i+1];
			//2.1 给首末元素赋值
			yanghui[i][0]=1;
		    yanghui[i][i]=1;
		    //2.2 给非首末元素赋值
		    //if(i>1) {
		    	for(int j=1;j<yanghui[i].length-1;j++) {
		    		yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
		    	}
		    //}
		}
		//3.遍历二维数组
		for(int i=0;i<yanghui.length;i++) {
			for(int j=0;j<yanghui[i].length;j++) {
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*
 * 拓展之笔试题
 * 创建一个长度为6的int型数组，要求数组元素的值都在1~30之间，且是随机赋值。
 * 同时，要求元素的值各不相同
 * */