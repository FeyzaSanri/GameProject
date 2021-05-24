package gameProject.entities.concrete;

import gameProject.entities.abstracts.Entity;

public class Campaign implements Entity{
     private int id;
     private String campaingName;
     private double discount;
     private String bulkPurchase;
    
     public Campaign() {
    	 
     }

	public Campaign(int id, String campaingName , double discount, String bulkPurchase) {
		super();
		this.id = id;
		this.campaingName=campaingName;
		this.discount = discount;
		this.bulkPurchase = bulkPurchase;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getBulkPurchase() {
		return bulkPurchase;
	}

	public void setBulkPurchase(String bulkPurchase) {
		this.bulkPurchase = bulkPurchase;
	}
     
     
     
}
