package corejava;
abstract class fact{
	abstract public void ntr();
	abstract public void arjun();
}
class male {
	public void ntr() {
		System.out.println("exectue ntr method");
	}
}

class female extends male{
	public void arjun() {
		System.out.println("exectue arjun method");
	}
}

public class abstraction1 {
public static void main(String[] args) {
	female  obj=new female ();
	obj.arjun();
}
}
