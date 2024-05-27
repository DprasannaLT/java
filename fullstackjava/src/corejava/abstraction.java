package corejava;

abstract class actors{
	abstract public void ntr();
	abstract public void arjun();
}
class heros {
	public void ntr() {
		System.out.println("exectue ntr method");
	}
}

class heros1 extends heros{
	public void arjun() {
		System.out.println("exectue arjun method");
	}
}




public interface abstraction {
	public static void main(String[] args) {
		heros1 obj=new heros1();
		obj.arjun();
		obj.ntr();
	}

}
