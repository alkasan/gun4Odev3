package gun4Odev3.abstracts;

import gun4Odev3.entities.Gamer;

public interface IGamerService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
