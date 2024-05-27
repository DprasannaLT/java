package corejava;
class x
{     String str="hello";
	public void summer() {
	
	System.out.println("this is single inheritance");
	}
}

class y extends x
{
	
}
public class singleinheritance {
public static void main(String[] args) {
	y pr=new y();
	System.out.println(pr.str);
	pr.summer();
}
}
