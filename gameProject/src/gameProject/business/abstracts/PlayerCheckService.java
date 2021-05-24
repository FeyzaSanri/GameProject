package gameProject.business.abstracts;

import gameProject.entities.concrete.Player;

public interface PlayerCheckService {
	boolean CheckIfRealPerson(Player player);
}
