package gun4Odev3.concretes;

import gun4Odev3.abstracts.IGameService;
import gun4Odev3.entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyununuz baþarýlý þekilde eklendi. Oyun adý: "+game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyununuz baþarýlý þekilde güncellendi. Oyun adý: "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyununuz baþarýlý þekilde silindi. Oyun adý: "+game.getGameName());
		
	}

}
