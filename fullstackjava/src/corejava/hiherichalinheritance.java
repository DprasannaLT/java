package corejava;

class p
{       float f=18.05f;
	public void top() {
		System.out.println("this is class p");
	}
}

class q extends p
{
	public void jeans() {
		System.out.println("this is class q");
	}
}

class r extends p
{
	public void skirts()
	{
		System.out.println("this is class r");
	}
} 

class s extends p{
	public void saree() {
		System.out.println("this is class r");
	}
}



public class hiherichalinheritance {
	public static void main(String[] args) {
		s xyz=new s();
		System.out.println(xyz.f);
		xyz.top();
		xyz.saree();
		
		r abc=new r();
		abc.top();
		abc.skirts();
		
		q bob=new q();
		bob.top();
		bob.jeans();
		
		p lol=new p();
		lol.top();
		
	}

}
