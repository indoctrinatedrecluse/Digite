import java.util.List;

import com.digite.bean.Flight;
import com.digite.service.FlightService;
import com.digite.service.FlightServiceImpl;

public class FlightClient {
	public static void main(String[] args) {
		
		FlightService service = new FlightServiceImpl();
		Flight f = new Flight(103, "SpiceJet", "Kolkata", "Leh");
		service.save(f);
		
		Flight f2 = service.get(103);
		System.out.println(f2);
		
		List<Flight> flights = service.getAll();
		flights.forEach(System.out::println);
		
		System.out.println(service.remove(103)?"Deleted":"Error");
	}
}
