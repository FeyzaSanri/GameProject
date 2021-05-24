package gameProject.business.abstracts;

import gameProject.entities.concrete.Player;

public interface PlayerService {

	
	void register(Player player);
	void update(Player player);
	void delete(Player player);
}
