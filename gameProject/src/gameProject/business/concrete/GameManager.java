package gameProject.business.concrete;

import gameProject.business.abstracts.GameService;

import gameProject.entities.concrete.Game;

public class GameManager implements GameService{

	
	
	@Override
	public void add(Game game) {
		if(game.getGameName().length()<1 ) 
		{
			System.out.println("Hatalý oyun ekleme iþlemi lütfen tekrar deneyiniz.");
		}
		else 
		{
			System.out.println("Oyun baþarýyla sisteme eklendi : " + game.getGameName());
		}
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun baþarýyla silindi : " + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun baþarýyla güncellendi : " + game.getGameName());
		
	}

}
