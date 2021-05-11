package Abstract;

import Entities.Gamer;
import Entities.Campaign;
import Entities.Game;



public interface ISaleService {
	void sale(Gamer gamer,Game game);

	void saleCampaing(Gamer gamer,Campaign campaing,Game game);
}
