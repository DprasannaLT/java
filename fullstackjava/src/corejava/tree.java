package corejava;

import java.util.TreeSet;

public class tree {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(15);
		t.add(0);
		t.add(36);

		t.add(-20);
		t.add(-36);

		System.out.println(t);
		t.remove(0);
		System.out.println(t);
		
	}

}
