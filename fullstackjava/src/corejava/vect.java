package corejava;

import java.util.Vector;

public class vect {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(128);
		v.addElement(true);
		v.addElement(45.05);
		System.out.println(v);
		v.removeElement(true);
		System.out.println(v.get(1));
		v.addElement("prasanna");
		System.out.println(v);
		
	}

}
