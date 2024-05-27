package corejava;
class example implements Runnable {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class runnableinterface {
public static void main(String[] args) {
	example e=new example();
	Thread t=new Thread(e);
	t.start();
	
	example e1=new example();
	Thread t1=new Thread(e);
	t1.start();
	
	
	
}
}
