package Business.Concrete;

import Adapters.E_DevletValidationServiceAdapter;
import Business.Abstract.IGamerCheckService;
import Business.Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {

    IGamerCheckService iGamerCheckService;
    public GamerManager(IGamerCheckService iGamerCheckService) {
        this.iGamerCheckService = iGamerCheckService;
    }

    @Override
    public void add(Gamer gamer) {
        System.out.println(gamer.firstName + " added.");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.firstName + " deleted.");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.firstName + " updated.");
    }
}
