import java.lang.*;

class Question{
	private int q1;
	private static int q2;
	
	public void add(int i){
		q2 = q1+i;
		q1 = q2-q1+i;
	}
	public void show(){
		System.out.println("Q : "+q1+" & "+q2);
	}
	
	public static void main(String args[]){
		Question q = new Question();
		q.q1 = 4;
		q.show();
		q.add(2);
		q.show();
		Question qqq = q;
		qqq.add(0);
		q.show();
		qqq.show();
	}
}