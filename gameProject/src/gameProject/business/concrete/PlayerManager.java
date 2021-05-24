package gameProject.business.concrete;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.business.abstracts.PlayerService;
import gameProject.entities.concrete.Player;

public class PlayerManager implements PlayerService {

private PlayerCheckService _playerCheckService;
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		_playerCheckService = playerCheckService;
	}
	
	@Override
	public void register(Player player)  {
		if(_playerCheckService.CheckIfRealPerson(player))
		{
			System.out.println("Oyuncu eklendi : " + player.getFirstName());
		}
		else
		{
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + "kayýt baþarýyla güncellendi");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + "kayýt baþarýyla silindi.");
		
	}
	
   
}
