package corejava;

public interface inheritancemultiple {
	public void silk();
	
	}
class chocolate implements inheritancemultiple
{
	public void silk() {
		System.out.println("execute silk method");
	}
	public static void main(String args[] ){
		chocolate obj=new chocolate();
		obj.silk();
	}
}
