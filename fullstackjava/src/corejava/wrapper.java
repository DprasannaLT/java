package corejava;

public class wrapper {
public static void main(String[] args) {
	float f=25.45f; float a;
	Float obj=new Float(f);
	System.out.println(obj);
	a=obj;
	System.out.println(a);
	
	boolean b=true; boolean c;
	Boolean pra=new Boolean(b);
	System.out.println(pra);
	c=pra;
	System.out.println(c);
	
	long l=158024l;long d;
	Long lax=new Long(l);
	System.out.println(lax);
	d=lax;
	System.out.println(d);
	
	short st=85; short x;
	Short sc=new Short(st);
	System.out.println(sc);
	x=sc;
	System.out.println(x);
	
	byte g=12;byte y;
	Byte tt=new Byte(g);
	System.out.println(tt);
	y=tt;
	System.out.println(y);
	
	
}
}
