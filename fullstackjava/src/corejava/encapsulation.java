package corejava;
class prasanna{
	char a='k';
	String b="hello";
	public void bat() {
		System.out.println("dislay the value " +" " +a);
	}
	public void ball() {
		System.out.println("dislay the value" + " " +b);
	}
	

public Integer fan() {
	
	int i=10;
	System.out.println(i);
	return i;
}
}
public class encapsulation {
	public static void main(String[] args) {
		prasanna pr=new prasanna();
		pr.bat();
		pr.ball();
		int c=pr.fan();
	}

}
