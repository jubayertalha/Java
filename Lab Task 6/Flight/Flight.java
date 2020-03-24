public class Flight{
	String flightId;
	int capacity;
	Airport departureFrom;
	Schedule departureTime;
	Airport flyingTo;
	Schedule arrivalTime;
	
	public void setFlightId(String flightId){
		this.flightId = flightId;
	}
	public String getFlightId(){
		return flightId;
	}
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public int getCapacity(){
		return capacity;
	}
	
	public void setDepartureFrom(Airport departureFrom){
		this.departureFrom = departureFrom;
	}
	public Airport getDepartureFrom(){
		return departureFrom;
	}
	
	public void setDepartureTime(Schedule departureTime){
		this.departureTime = departureTime;
	}
	public Schedule getDepartureTime(){
		return departureTime;
	}
	
	public void setFlyingTo(Airport flyingTo){
		this.flyingTo = flyingTo;
	}
	public Airport getFlyingTo(){
		return flyingTo;
	}
	
	public void setArrivalTime(Schedule arrivalTime){
		this.arrivalTime = arrivalTime;
	}
	public Schedule getArrivalTime(){
		return arrivalTime;
	}
}