package corejava;

class lucky{
	
	public void summer(int i, String string, float f, char c, double d, boolean b) {
		System.out.println(i);
		System.out.println(string);
		System.out.println(f);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b);
		
	}
	
	
}
public class callbyvalue {
public static void main(String[] args) {
	lucky ky=new lucky();
	ky.summer(9,"lucky",12.5f,'S',128.5,false);
	
}
}
