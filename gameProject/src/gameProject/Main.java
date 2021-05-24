package gameProject;

import java.time.LocalDate;

import gameProject.adapter.MerniceServiceAdapter;
import gameProject.business.concrete.GameManager;
import gameProject.business.concrete.GameSaleManager;
import gameProject.business.concrete.PlayerManager;
import gameProject.entities.concrete.Campaign;
import gameProject.entities.concrete.Game;
import gameProject.entities.concrete.Player;
import gameProject.entities.concrete.Sale;

public class Main {

	public static void main(String[] args) {
		Player player=new Player();
		player.setId(1);
		player.setFirstName("Feyza Nur");
		player.setLastName("Sanrý");
		player.setEmail("feyzasanri@outlook.com");
		player.setDateofBirth(LocalDate.of(1999, 1, 4));
		player.setNationalityId("98765432198");
		player.setPassword("654322");
		
		Game game=new Game();
		game.setId(2);
		game.setGameName("PUBG");
		game.setGamePrice(70);
		game.setCategory("Fight");
		game.setDescription(null);
		
		Campaign campaign = new Campaign();
		campaign.setId(4);
		campaign.setBulkPurchase("3 adet alýndýðý için 3 Al 2 Öde kampanyasý uygulanmýþtýr.");
        campaign.setDiscount(60);
        
        Sale sale=new Sale();
        sale.setGame(game);
        sale.setPlayer(player);
        sale.setId(5);
        sale.setGameStock(81);
        
        PlayerManager playerManager = new PlayerManager(new MerniceServiceAdapter());
		playerManager.register(player);	
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		GameSaleManager gamesaleManager = new GameSaleManager();
		gamesaleManager.giveback(game, player);
	}

}
