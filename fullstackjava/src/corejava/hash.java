package corejava;

import java.util.HashSet;

public class hash {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add("hello");
	h.add("hello");
	h.add(11);
	h.add(12.041f);
	
	System.out.println(h);
	h.remove(12.041f);
	
	System.out.println(h);
	}
}
