package corejava;

public class arrayindexexception {
public static void main(String[] args) {
	
	try {
	int xyz[]= {70,80,90};
	System.out.println(xyz[5]);
	}
	
	catch(ArrayIndexOutOfBoundsException ee) {
		System.out.println("enter the index number properly"+ee);
	}
}
}
