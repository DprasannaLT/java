package corejava;

public class StringWrapper {
	public static void main(String[] args) {
		String s="145";
		int i=Integer.parseInt(s);
		i++;
		System.out.println(i);
		
		String p="45";
		byte b=Byte.parseByte(p);
		b--;
		System.out.println(b);
		
		String q="null";
		boolean c=Boolean.parseBoolean(q);
		System.out.println(c);
		
		String r="25";
		short x=Short.parseShort(r);	
		x--;
		System.out.println(x);
		
		String t="4572";
		long y=Long.parseLong(t);
		System.out.println(y);
		
		String d="25412";
		double z=Double.parseDouble(d);
		z++;
		System.out.println(z);
		
		String f="45852";
		float a=Float.parseFloat(f);
		a--;
		System.out.println(a);
		
		
		
	
	}

}
