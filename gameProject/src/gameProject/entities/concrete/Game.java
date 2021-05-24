package gameProject.entities.concrete;

import gameProject.entities.abstracts.Entity;

public class Game implements Entity {
   private int id;
   private String gameName;
   private String description;
   private String category;
   private double gamePrice;
   
   public Game() {
	   
   }

public Game(int id, String gameName, String description, String category ,double gamePrice) {
	
	this.id = id;
	this.gameName = gameName;
	this.description = description;
	this.category = category;
	this.gamePrice=gamePrice;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getGameName() {
	return gameName;
}

public void setGameName(String gameName) {
	this.gameName = gameName;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public double getGamePrice() {
	return gamePrice;
}

public void setGamePrice(double gamePrice) {
	this.gamePrice = gamePrice;
}


   
}
