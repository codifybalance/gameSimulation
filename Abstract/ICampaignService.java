package Abstract;

import Entities.Campaign;


public interface ICampaignService {
	void Save(Campaign campaign);
	void Delete(Campaign campaign);
	void Update(Campaign campaign);
}
