package gun4Odev3.abstracts;

import gun4Odev3.entities.Campaign;
import gun4Odev3.entities.Game;
import gun4Odev3.entities.Gamer;
import gun4Odev3.entities.Order;

public interface ISaleService {
	void sale(Order order, Game game, Gamer gamer);
	void campaignSale(Order order, Game game, Gamer gamer, Campaign campaign);
}
