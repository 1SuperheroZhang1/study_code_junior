package array_exer;
/*练习2

 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级
 * >成绩>=最高分-10 等级为'A'
 * >成绩>=最高分-20 等级为'B'
 * >成绩>=最高分-30 等级为'C'
 * >其余            等级为'D'
 * 提示:先读入学生人数，根据学生人数创建int数组，存放学生成绩
 * */
import java.util.Scanner;
public class ArrayDemo1_Student {
	public static void main(String[] args) {
		//1.使用Scanner读取学生个数
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入学生人数:");
		int size=sc.nextInt();
		//2.创建数组，存储学生成绩，动态初始化
		int scores[]=new int[size];
		//3.给数组元素赋值
		System.out.println("请输入"+size+"个学生的成绩:");
		int maxScore=0;
		for(int i=0;i<scores.length;i++) {
			scores[i]=sc.nextInt();
			//4.获取数组元素的最大值
			if(scores[i]>maxScore) {
				maxScore=scores[i];
			}
		}
//		//4.获取数组元素的最大值
//		int maxScore=0;
//		for(int i=0;i<scores.length;i++) {
//			if(scores[i]>maxScore) {
//				maxScore=scores[i];
//			}
//		}
		//5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩。
		for(int i=0;i<scores.length;i++)
		{
			if(scores[i]>=maxScore-10) {
				System.out.println("student "+i+" score is "+scores[i]+",grade is "+'A');
			}else if(scores[i]>=maxScore-20) {
				System.out.println("student  "+i+" score is "+scores[i]+",grade is "+'B');
			}else if(scores[i]>=maxScore-30) {
				System.out.println("student"+i+" score is "+scores[i]+",grade is "+'C');
			}else {
				System.out.println("student "+i+" score is "+scores[i]+",grade is "+'D');
			}
		}
	}
}
