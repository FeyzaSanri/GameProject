package gameProject.business.concrete;

import gameProject.business.abstracts.GameSaleService;
import gameProject.entities.concrete.Game;
import gameProject.entities.concrete.Player;

public class GameSaleManager implements GameSaleService{

	
	@Override
	public void sell(Game game, Player player ) {
		System.out.println(game.getGameName() + "isimli oyun " + game.getGamePrice() + "�creti kar��l���nda sat�n al�nd�.");
		
	}

	@Override
	public void add(Game game, Player player) {
		System.out.println(game.getGameName() + "isimli oyun " + player.getFirstName() + "traf�ndan eklendi.");
		
	}

	@Override
	public void delete(Game game, Player player) {
		System.out.println(game.getGameName() + "isimli oyun silindi ");
		
	}

	@Override
	public void giveback(Game game, Player player) {
		System.out.println(game.getGameName() + "isimli oyun " + player.getFirstName() + "traf�ndan iade edildi.");
		
	}

}
