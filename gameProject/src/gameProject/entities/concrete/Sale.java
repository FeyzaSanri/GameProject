package gameProject.entities.concrete;

import gameProject.entities.abstracts.Entity;

public class Sale implements Entity {
    private int id;
    private int gameStock;
    private Game game;
    private Player player;
    
    public Sale() {
    	
    }

	public Sale(int id, int gameStock, Game game, Player player) {
		
		this.id = id;
		this.gameStock = gameStock;
		this.game = game;
		this.player = player;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getGameStock() {
		return gameStock;
	}

	public void setGameStock(int gameStock) {
		this.gameStock = gameStock;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
    
    
}
