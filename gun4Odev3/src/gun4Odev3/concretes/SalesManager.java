package gun4Odev3.concretes;

import gun4Odev3.abstracts.ISaleService;
import gun4Odev3.entities.Campaign;
import gun4Odev3.entities.Game;
import gun4Odev3.entities.Gamer;
import gun4Odev3.entities.Order;

public class SalesManager implements ISaleService {

	@Override
	public void sale(Order order, Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+  gamer.getLastName() + " "+ "isimli kullanici"+ " " + game.getGameName()
		                  + " isimli oyunu"+ " " + order.getTotalAmount() + "  TL'ye satin almistir");
		
	}

	@Override
	public void campaignSale(Order order, Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName()+ " "+ "isimli kullanici"+ " " + game.getGameName() +" " 
         + " isimli oyunu " + " " +campaign.getCampaignName()+" kampanyasiyla" + " "+ 
				order.getTotalAmount() + "TL'ye satin almistir");

	}

}
