package oop_code3;
/*
 * �ӿڵ�Ӧ��: ����ģʽ
 * 
 * 
 * */
public class NetWorkTest {
	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		proxyServer.browse();
	}
}
interface NetWork{
	public void browse();
}
//��������
class Server implements NetWork{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("��ʵ�ķ�������������");
	}
	
}
//������
class ProxyServer implements NetWork{

	private NetWork work;
	public ProxyServer(NetWork work) {
		this.work=work;
	}
	public void check() {
		System.out.println("����֮ǰ�ļ�鹤��");
	}
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		check();
		
		work.browse();
	}
	
}
