package corejava;

public class nullpointerexception {
public static void main(String[] args) {
	String s=null;
	
	try {
		
		float a=s.length();
		System.out.println(a);
		
	}
	catch(NullPointerException ee){
		System.out.println("please enter the string value"+ee);
	}
	
}
}
