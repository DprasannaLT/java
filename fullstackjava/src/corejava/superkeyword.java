package corejava;
class animal{
	
	String s="white";
}
class dog extends animal{
	String s="black";


void lucky() {
	System.out.println(super.s);
	System.out.println(s);
}
}

public class superkeyword {
	public static void main(String[] args) {
		dog d=new dog();
		d.lucky();
		
	}


}
