package corejava;

class laxmi{
	String a="hyd";
	float b=105.5f;
	public void mangoe() {
		System.out.println(a);
	}
	public float apple() {
		b++;
		return b;
	}
}

public class encapreurunvoidkeyword {
public static void main(String[] args) {
	laxmi pr=new laxmi();
	pr.mangoe();
	float x=pr.apple();
	System.out.println(x);
}
}
