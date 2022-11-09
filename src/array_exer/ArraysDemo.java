package array_exer;

import java.util.Arrays;

/*
 *  java.util.Arrays:��������Ĺ�����
 *  java.util.Arrays�༴Ϊ��������Ĺ����࣬������������������(�������������)�ĸ��ַ���
 *  1. boolean equals(int[] a,int[] b)  �ж����������Ƿ����
 *  2. String toString(int[] a)         ���������Ϣ
 *  3. void fill(int[] a,int val)       ��ָ��ֵ��䵽����֮��
 *  4. void sort(int[] a)               �������������
 *  5. int binarySearch(int[] a,int key)��������������ж��ַ�����ָ����ֵ
 * */
public class ArraysDemo {
	public static void main(String[] args) {
		//1. boolean equals(int[] a,int[] b)  �ж����������Ƿ����
		int[] arr1=new int[] {1,2,3,4};
		int[] arr2=new int[]{1,3,2,4};
		boolean isEquals=Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		//2. String toString(int[] a)         ���������Ϣ
		System.out.println(Arrays.toString(arr1));
		//3. void fill(int[] a,int val)       ��ָ��ֵ��䵽����֮��
		Arrays.fill(arr1,10);
		System.out.println(Arrays.toString(arr1));
		//4. void sort(int[] a)               �������������
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		//5.int binarySearch(int[] a,int key)��������������ж��ַ�����ָ����ֵ
		int[] arr3=new int[] {-98,-34,2,34,54,66,79,105,210,333};
		int index=Arrays.binarySearch(arr3, 210);
		if(index>0) {
			System.out.println(index);
		}else {
			System.out.println("δ�ҵ���");
		}
		
	}
}
