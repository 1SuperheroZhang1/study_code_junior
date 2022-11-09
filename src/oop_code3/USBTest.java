package oop_code3;
/*
 * �ӿڵ�ʹ��
 * 1. �ӿ�ʹ����Ҳ�����̬��
 * 2. �ӿ�ʵ���Ͼ��Ƕ�����һ�ֹ淶
 * 3. �����У��������ӿڱ��
 * 
 * 
 * 
 * 
 * 
 * */
public class USBTest {
	public static void main(String[] args) {
		Computer com=new Computer();
		//1. �����˽ӿڵķ�����ʵ����ķ���������
		Flash flash=new Flash();
		com.transferData(flash);
		//2. �����ӿڵķ�����ʵ�������������
		com.transferData(new Printer());
		//3. �����ӿڵ�����ʵ����ķ���������
		USB phone=new USB()
				{

					@Override
					public void start() {
						// TODO Auto-generated method stub
							System.out.println("�ֻ���ʼ����");
					}

					@Override
					public void stop() {
						// TODO Auto-generated method stub
						System.out.println("�ֻ���������");
					}
				
				};
				com.transferData(phone);
	    //4. �����ӿڵ������������������
				com.transferData(new USB() {

					@Override
					public void start() {
						// TODO Auto-generated method stub
						System.out.println("mp3��ʼ����");
					}

					@Override
					public void stop() {
						// TODO Auto-generated method stub
						System.out.println("mp3��������");
					}
					
				});
	}
}
class Computer{
	
	public void transferData(USB usb) {//USB usb=new Flash();
		usb.start();
		
		System.out.println("���崫�����ݵ�ϸ��");
		
		usb.stop();
	}
}
interface USB{
	//����: �������ߡ������С�������ٶȵ�
	
	void start();
	
	void stop();
}
class Flash implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("U�̿�ʼ����");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("U�̽�������");
	}
	
}
class Printer implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ����ʼ����");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ����������");
	}
	
}