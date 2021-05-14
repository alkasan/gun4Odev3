package gun4Odev3.concretes;

import gun4Odev3.abstracts.ICampaignService;
import gun4Odev3.entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanyan�z eklenmi�tir.Kampanya ad�: " +campaign.getCampaignName() );
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanyan�z g�ncellenmi�tir.Kampanya ad�: " +campaign.getCampaignName() );
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanyan�z silinmi�tir.Kampanya ad�: " +campaign.getCampaignName() );
		
	}

	
}
