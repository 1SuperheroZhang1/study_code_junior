package interview_test;

public class interviewTest3_interface {

}
interface Playable{
	void play();
}
interface Bounceable{
	void play();
}
interface Rollable extends Playable,Bounceable{
	Ball ball=new Ball("PingPang");// °¬‘¡À public static final
}
class Ball implements Rollable{
	private String name;
	
	public String getName() {
		return name;
	}
	public Ball(String name) {
		this.name=name;
	}
	public void play() {
//		ball=new Ball("Football");//The final field Rollable.ball cannot be assigned
		System.out.println(ball.getName());
	}
}