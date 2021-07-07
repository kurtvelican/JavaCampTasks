import Adapters.E_DevletValidationServiceAdapter;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gamer gamer = new Gamer(1,"Veli Can","Kurt","75698423154", LocalDate.of(2001,10,21));
        Game game = new Game(1,"Witcher 3",30.5F);
        Campaign campaign = new Campaign(1,"Summer Sale",20F);

        GamerManager gamerManager = new GamerManager(new E_DevletValidationServiceAdapter());
        gamerManager.add(gamer);
        gamerManager.delete(gamer);
        gamerManager.update(gamer);

        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.delete(game);
        gameManager.update(game);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.delete(campaign);
        campaignManager.update(campaign);

        System.out.println(gamer.firstName + " bought the " + game.name + " on " + campaign.name + " for " + (game.price - campaign.discountAmount) + " $");
    }
}
