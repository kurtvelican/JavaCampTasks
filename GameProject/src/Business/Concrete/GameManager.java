package Business.Concrete;

import Business.Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

    @Override
    public void add(Game game) {
        System.out.println(game.name + " added.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.name + " deleted.");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.name + " updated.");
    }
}
