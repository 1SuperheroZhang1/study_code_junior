package array_exer;
/*��ϰ1
 * ������������ڳ���4���£�550Ԫ/��(ˮ��ú��̯������35Ԫ/��)���յ��������䡢������ȫ�����ھ���IT��ҵ��ʿ��ϲ��������
 * ����Ҫ�������������ͬ�л��߸ձ�ҵ�������ˣ����ɾ���������
 * */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr=new int[] {8,2,1,0,3};
		int[] index=new int[] {2,0,3,2,4,0,1,3,2,3,3};
		String tel="";
		for(int i=0;i<index.length;i++) {
			tel+=arr[index[i]];
		}
		System.out.println("��ϵ��ʽ:"+tel);//18013820100
	}
}
