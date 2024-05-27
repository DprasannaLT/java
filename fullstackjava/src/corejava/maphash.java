package corejava;

import java.util.HashMap;

public class maphash {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put('a', 25);
		h.put('b', 12);
		h.put('c', -5);
		h.put('d', -0);
		
		System.out.println(h);
		System.out.println(h.get('c'));
	}

}
