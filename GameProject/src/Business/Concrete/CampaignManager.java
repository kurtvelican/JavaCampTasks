package Business.Concrete;

import Business.Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Gamer;

public class CampaignManager implements ICampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.name + " added.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.name + " deleted.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.name + " updated.");
    }

}
