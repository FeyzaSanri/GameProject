package gameProject.business.concrete;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.entities.concrete.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		
		return false;
	}

}
