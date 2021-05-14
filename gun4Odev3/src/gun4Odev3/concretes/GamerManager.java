package gun4Odev3.concretes;

import gun4Odev3.abstracts.IGamerService;
import gun4Odev3.entities.Gamer;

public class GamerManager implements IGamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi: " +gamer.getFirstName() +" "+gamer.getLastName() );
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi: " +gamer.getFirstName() +" "+gamer.getLastName() );
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi: " +gamer.getFirstName() +" "+gamer.getLastName() );
		
	}

}
