package gun4Odev3;

import java.time.LocalDate;

import gun4Odev3.concretes.CampaignManager;
import gun4Odev3.concretes.GameManager;
import gun4Odev3.concretes.GamerManager;
import gun4Odev3.concretes.OrderManager;
import gun4Odev3.concretes.SalesManager;
import gun4Odev3.entities.Campaign;
import gun4Odev3.entities.Game;
import gun4Odev3.entities.Gamer;
import gun4Odev3.entities.Order;

public class Main {

	public static void main(String[] args) {
		
	Game game = new Game(1, "OYUN1", 100);
	Gamer gamer = new Gamer(1, "a@hotmail.com", "123", "Esra", "Alkasan", LocalDate.of(1234, 1, 1), "12345678900");
	Campaign campaign = new Campaign(1, 50, "BAHAR ÝNDÝRÝMÝ");
	Order order = new Order(1, 1, 1, 500);
	Order campaingOrder = new Order(1, 1, 1,game.getPrice() - (game.getPrice()* campaign.getPercentageOfDiscount()/100));
	
	GameManager gameManager = new GameManager();
	gameManager.add(game);
	
	GamerManager gamerManager = new GamerManager(); 
	gamerManager.add(gamer);
	
	CampaignManager campaignManager = new CampaignManager();
	campaignManager.add(campaign);
	
	OrderManager orderManager = new OrderManager();
	orderManager.add(order);
	
	SalesManager salesManager = new SalesManager();
	salesManager.sale(order, game, gamer);
	salesManager.campaignSale(campaingOrder, game, gamer, campaign);
	
	
	
	}

}
