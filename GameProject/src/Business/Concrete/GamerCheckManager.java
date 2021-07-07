package Business.Concrete;

import Business.Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

    @Override
    public boolean CheckIfRealPerson(Gamer gamer) {
        return true;
    }
}
