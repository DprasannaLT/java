package corejava;

import java.util.LinkedList;

public class linked {
	public static void main(String[] args) {
		LinkedList L=new LinkedList();
		L.addFirst(25);
		L.addFirst('D');
		L.addFirst("prasanna");
		L.addLast(60);
		L.addLast("laxmi");
		L.addLast(12.85f);
		System.out.println(L);
		
		String s=(String)L.getFirst();
		System.out.println(s);
		
		L.removeLast();
		L.removeFirst();
		System.out.println(L);
		
	}

}
