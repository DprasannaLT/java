package corejava;

class a
{
	String s="Inheritance";
	public void apple() {
		System.out.println("this is multilevel inheritance");
	}
}

class b extends a
{
	public void mangoe() {
		System.out.println("this is class y");
	}
}

class c extends b
{
	
}

public class multilevelinheritance {
public static void main(String[] args) {
	c la=new c();
	System.out.println(la.s);
	la.apple();
	la.mangoe();
	

}
}
