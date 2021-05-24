package gameProject.business.abstracts;

import gameProject.entities.concrete.Game;
import gameProject.entities.concrete.Player;


public interface GameSaleService {
   void sell(Game game , Player player);
   void add(Game game , Player player);
   void delete(Game game , Player player);
   void giveback(Game game , Player player);
   
}
