package gameProject.business.abstracts;

import gameProject.entities.concrete.Game;

public interface GameService {
     void add(Game game);
     void delete(Game game);
     void update(Game game);
     
}
