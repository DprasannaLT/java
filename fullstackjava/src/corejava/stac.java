package corejava;

import java.util.Stack;

public class stac {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(9);
	s.push("lucky");
	s.push('s');
	System.out.println(s);
	
	s.pop();
	System.out.println(s.get(1));
}
}
