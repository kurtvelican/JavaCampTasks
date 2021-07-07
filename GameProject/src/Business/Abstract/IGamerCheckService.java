package Business.Abstract;

import Entities.Gamer;

public interface IGamerCheckService {
    boolean CheckIfRealPerson(Gamer gamer);
}
