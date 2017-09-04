package Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> list = new ArrayList<>();
	
	public void takeOrder (Order order) {
		list.add(order);
	}
	
	public void placeOders () {
		for(Order order: list) {
			order.execute();
		}
		list.clear();
	}
	
}
