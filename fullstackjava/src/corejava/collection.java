package corejava;
import java.util.*;
import java.util.ArrayList;

public class collection {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("prasanna");
		l.add(12);
		l.add(true);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.add(2.8f);
		System.out.println(l);
		System.out.println(l.get(2));
	
	}

}
