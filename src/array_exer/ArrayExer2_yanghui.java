package array_exer;
/*
 * ��ϰ3
 * ����: int[]x,y[];��x,y������ֵ�Ժ�����ѡ������ͨ���������:
 * a) x[0]=y; - no
 * b) y[0]=x; - yes
 * c) y[0][0]=x; - no
 * d) x[0][0]=y; - no
 * e) y[0][0]=x[0]; - yes
 * f) x=y; - no
 * ��ʾ:
 * һά����: int[]x �� intx[]
 * ��ά����: int[][]y �� int y[][]
 * */
/*
 * ��ϰ4
 * ʹ�ö�ά�����ӡһ��10�е�������ǡ�
 * ��ʾ:
 * 1.��һ����1��Ԫ�أ���n����n��Ԫ��
 * 2.ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
 * 3.�ӵ����п�ʼ�����ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ء�
 * ��: yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
 * 
 * */
public class ArrayExer2_yanghui {
	public static void main(String[] args) {
		//1.��������ʼ����ά����
		int[][] yanghui=new int[10][];
		//2.�������Ԫ�ظ�ֵ
		for(int i=0;i<yanghui.length;i++) {
			yanghui[i]=new int[i+1];
			//2.1 ����ĩԪ�ظ�ֵ
			yanghui[i][0]=1;
		    yanghui[i][i]=1;
		    //2.2 ������ĩԪ�ظ�ֵ
		    //if(i>1) {
		    	for(int j=1;j<yanghui[i].length-1;j++) {
		    		yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
		    	}
		    //}
		}
		//3.������ά����
		for(int i=0;i<yanghui.length;i++) {
			for(int j=0;j<yanghui[i].length;j++) {
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*
 * ��չ֮������
 * ����һ������Ϊ6��int�����飬Ҫ������Ԫ�ص�ֵ����1~30֮�䣬���������ֵ��
 * ͬʱ��Ҫ��Ԫ�ص�ֵ������ͬ
 * */