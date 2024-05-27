package corejava;

class d
{    char c='L';
	public void rice() {
		System.out.println("this is Hybrid inheritance");
	}
}

class e extends d{
	public void tiffin() {
		System.out.println("this is tiffin");
	}
}

class f extends e{
	public void lunch() {
		System.out.println("this is lunch");
	}
}


public class hybridinheritance {
public static void main(String[] args) {
	f text=new f();
	System.out.println(text.c);
	text.lunch();
	text.tiffin();
	text.rice();
	
}
}
