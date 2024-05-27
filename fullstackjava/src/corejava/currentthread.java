package corejava;

class pencil extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}

public class currentthread {
	public static void main(String[] args) {
		pencil obj=new pencil();
		obj.start();
		
		pencil obj1=new pencil();
		obj1.start();
		
		pencil obj2=new pencil();
		obj2.start();
		
		
	}

}
