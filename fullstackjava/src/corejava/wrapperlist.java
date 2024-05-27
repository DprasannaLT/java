package corejava;

import java.util.ArrayList;

public class wrapperlist {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Hi");
		l.add("Myself");
		l.add("laxmi");
		l.add("laxmi");
		l.add("Prasanna");
		System.out.println(l);
		l.remove(1);
		System.out.println(l.get(2));
	}

}
