package corejava;

public class arithematicexception {
	public static void main(String[] args) {
		try {
			float f=1580.45f;
			int a=(int)f/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException ee) {
			System.out.println("assign proper integer"+ee);
		}
	}

}
