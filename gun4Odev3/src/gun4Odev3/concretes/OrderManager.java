package gun4Odev3.concretes;

import gun4Odev3.abstracts.IOrderService;
import gun4Odev3.entities.Order;

public class OrderManager implements IOrderService {

	@Override
	public void add(Order order) {
		System.out.println("Sipariş eklendi, toplam tutar:" +order.getTotalAmount());
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipariş güncellendi, toplam tutar:" +order.getTotalAmount());
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Siparişiniz silinmiştir.");
		
	}

}
