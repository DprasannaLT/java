package corejava;

public class foreach {
public static void main(String[] args) {
	int[] num = new int[50];

    
    for (int i = 0; i < num.length; i++) {
        num[i] = i + 1;
    }

    
    for (int values : num) {
        System.out.println(values);
	}
}
}
