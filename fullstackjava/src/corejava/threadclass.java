package corejava;
class pen extends Thread{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class threadclass {
public static void main(String[] args) {
	pen p=new pen();
	p.start();
	
	pen p1=new pen();
	p1.start();
}
}
