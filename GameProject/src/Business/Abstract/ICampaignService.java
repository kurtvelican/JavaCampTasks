package Business.Abstract;

import Entities.Campaign;
import Entities.Gamer;

public interface ICampaignService {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
}
