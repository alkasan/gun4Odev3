package gun4Odev3.abstracts;

import gun4Odev3.entities.Order;

public interface IOrderService {

		void add(Order order);
		void update(Order order);
		void delete(Order order);
}
