import java.lang.*;

public class Student{
	private int id;
	private String name;
	private double cgpa;
	
	public Student(){}
	
	public static void main(String args[]){
		
		Student s1;
		s1 = new Student();
		
		s1.setName("Talha Jubayer");
		s1.setId(19414683);
		s1.setCgpa(3.65);
		
		s1.showDetails();
		
	}
	
	public void showDetails(){
		System.out.println("Name : "+getName());
		System.out.println("ID : "+getId());
		System.out.print("CGPA : "+getCgpa());
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setCgpa(double cgpa){
		this.cgpa = cgpa;
	}
	public double getCgpa(){
		return cgpa;
	}
}