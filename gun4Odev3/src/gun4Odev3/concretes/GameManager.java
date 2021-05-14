package gun4Odev3.concretes;

import gun4Odev3.abstracts.IGameService;
import gun4Odev3.entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyununuz ba�ar�l� �ekilde eklendi. Oyun ad�: "+game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyununuz ba�ar�l� �ekilde g�ncellendi. Oyun ad�: "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyununuz ba�ar�l� �ekilde silindi. Oyun ad�: "+game.getGameName());
		
	}

}
