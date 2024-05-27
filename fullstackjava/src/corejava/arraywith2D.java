package corejava;

public class arraywith2D {
	public static void main(String[] args) {
		
		//with giving size
		/*char obj[][]=new char['a']['b'];
		obj[0][4]='x';
		obj[2][3]='y';
		obj[1][2]='z';
		obj[2][1]='p';
		obj[1][1]='q';
		obj[3][2]='r';
		System.out.println(obj[1][2]);
		System.out.println(obj[3][2]);
		System.out.println(obj[2][3]);*/
		
		
		
		//without giving size
		char obj[][]= {{'a','b'},{'c','d'},{'e','f'},{'g','h'},{'i','j'}};
		System.out.println(obj[1][0]);
		System.out.println(obj[1][1]);
		System.out.println(obj[2][0]);
		System.out.println(obj.length);
		
	}

}
