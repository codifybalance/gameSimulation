package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void Save(Campaign campaign) {
		System.out.println("Saved  :" +campaign.getName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Delete :" +campaign.getName());
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Update :" +campaign.getName());
		
	}

}
