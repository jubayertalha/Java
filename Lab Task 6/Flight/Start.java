public class Start{
	public static void main(String args[]){
		Schedule departureTime = new Schedule();
		Schedule arrivalTime = new Schedule();
		Coordinate departureLocation = new Coordinate();
		Coordinate arrivalLocation = new Coordinate();
		Airport departureFrom = new Airport();
		Airport flyingTo = new Airport();
		Flight flight = new Flight();
		
		departureTime.setHour(10);
		departureTime.setMinute(30);
		
		arrivalTime.setHour(11);
		arrivalTime.setMinute(10);
		
		departureLocation.setLongitude(90.399452);
		departureLocation.setLatitude(23.777176);
		
		arrivalLocation.setLongitude(91.96765);
		arrivalLocation.setLatitude(21.45388);
		
		departureFrom.setName("Dhaka");
		departureFrom.setLocation(departureLocation);
		
		flyingTo.setName("Cox's Bazar");
		flyingTo.setLocation(arrivalLocation);
		
		flight.setFlightId("10A20375HR");
		flight.setCapacity(70);
		flight.setDepartureFrom(departureFrom);
		flight.setDepartureTime(departureTime);
		flight.setFlyingTo(flyingTo);
		flight.setArrivalTime(arrivalTime);
		
		System.out.println("Flight Id: "+flight.getFlightId());
		System.out.println("Flight Capacity: "+flight.getCapacity());
		System.out.println("Departure Time: "+flight.getDepartureTime().getHour()+":"+flight.getDepartureTime().getMinute());
		System.out.println("Arrival Time: "+flight.getArrivalTime().getHour()+":"+flight.getArrivalTime().getMinute());
		System.out.println("Departure From: "+flight.getDepartureFrom().getName()+" (Lat:"+flight.getDepartureFrom().getLocation().getLatitude()+" Long:"+flight.getDepartureFrom().getLocation().getLongitude()+")");
		System.out.println("Flying To: "+flight.getFlyingTo().getName()+" (Lat:"+flight.getFlyingTo().getLocation().getLatitude()+" Long:"+flight.getFlyingTo().getLocation().getLongitude()+")");
	}
}