import java.lang.*;

class ErrorTest{
	private int data = 99;
	
	public static void main(String[] a){
		ErrorTest er = new ErrorTest();
		er.data = 100;
		System.out.println("ntg"+er.data);
	}
}