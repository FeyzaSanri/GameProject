package gameProject.business.concrete;

import gameProject.business.abstracts.GameService;

import gameProject.entities.concrete.Game;

public class GameManager implements GameService{

	
	
	@Override
	public void add(Game game) {
		if(game.getGameName().length()<1 ) 
		{
			System.out.println("Hatal� oyun ekleme i�lemi l�tfen tekrar deneyiniz.");
		}
		else 
		{
			System.out.println("Oyun ba�ar�yla sisteme eklendi : " + game.getGameName());
		}
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun ba�ar�yla silindi : " + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ba�ar�yla g�ncellendi : " + game.getGameName());
		
	}

}
