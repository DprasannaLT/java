package corejava;
class board implements Runnable{
public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		
	
	try {
		Thread.sleep(2000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
		}
	
}
}
public class multithreadingsleep {
public static void main(String[] args) {
	board b=new board();
	Thread t=new Thread(b);
	t.start();
	
	board b1=new board();
	Thread t1=new Thread(b1);
	t1.start();
	
	
	board b2=new board();
	Thread t2=new Thread(b2);
	t2.start();
	
}
}

