package corejava;
class demo extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
	
}
public class join {
public static void main(String[] args) {
	demo obj=new demo();
	obj.start();
	try {
	obj.join(2000);
	} catch (InterruptedException e1) {
		
		e1.printStackTrace();
	}
	
	demo obj1=new demo();
	obj1.start();
	try {
		obj1.join(2000);
		} catch (InterruptedException e2) {
			
			e2.printStackTrace();
		}
	
	demo obj2=new demo();
	obj2.start();
		
	
}
}
