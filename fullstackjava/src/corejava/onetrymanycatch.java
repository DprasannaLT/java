package corejava;

public class onetrymanycatch {
	public static void main(String[] args) {
		try {
			int a[]= {12,15,17};
			System.out.println(a[6]);
			
			int b=50;int c;
			c=b/0;
			System.out.println(c);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("provide proper index value"+e);
		}
		
		catch(ArithmeticException ee) {
			System.out.println("provide proper index value"+ee);
		}
		
		
	}

}
