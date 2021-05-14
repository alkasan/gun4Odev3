package gun4Odev3.abstracts;

import gun4Odev3.entities.Campaign;

public interface ICampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
