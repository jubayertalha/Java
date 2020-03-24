public class Airport{
	String name;
	Coordinate location;
	
	public void setName(String name){
		this.name  = name;
	}
	public String getName(){
		return name;
	}
	
	public void setLocation(Coordinate location){
		this.location = location;
	}
	public Coordinate getLocation(){
		return location;
	}
}