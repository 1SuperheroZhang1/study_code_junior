package oop_code3;
/*
 * main()������ʹ��˵��:
 * 1. main()������Ϊ�������ڳ���
 * 2. main()����Ҳ��һ����ͨ�ľ�̬������
 * 3. main()����������Ϊ���������̨���н����ķ�ʽ��(֮ǰʹ��Scanner)
 * */
public class MainTest {
	public static void main(String[] args) {//���
		Main.main(new String[100]);
		
		MainTest test=new MainTest();
		test.show();
	}
	public void show() {
		
	}
}
class Main{
	public static void main(String[] args) {
			for(int i=0;i<args.length;i++) {
				args[i]="args_"+i;
				System.out.println(args[i]);
			}
	}
}
