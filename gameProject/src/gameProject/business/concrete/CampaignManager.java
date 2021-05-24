package gameProject.business.concrete;

import gameProject.business.abstracts.CampaignService;
import gameProject.entities.concrete.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya : "+ campaign.getCampaingName() +" " +campaign.getDiscount() +  "oranýyla eklenmiþtir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi : "+campaign.getCampaingName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi : "+campaign.getCampaingName());
		
	}

}
