package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService{

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		return true;
	}


}
