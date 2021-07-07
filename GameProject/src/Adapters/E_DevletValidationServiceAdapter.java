package Adapters;

import Business.Abstract.IGamerCheckService;
import Entities.Gamer;

public class E_DevletValidationServiceAdapter implements IGamerCheckService {

    @Override
    public boolean CheckIfRealPerson(Gamer gamer) {
        System.out.println("Validated by E-Devlet" + gamer.firstName);
        return true;
    }
}
