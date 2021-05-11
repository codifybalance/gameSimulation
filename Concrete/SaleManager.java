package Concrete;

import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService{

	
	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(
				gamer.getFirstName()+ " : " +
				game.getName()+ " buyed");
		
	}

	@Override
	public void saleCampaing(Gamer gamer, Campaign campaing, Game game) {
		System.out.println(
				gamer.getFirstName()+ " : " +
				campaing.getDiscount()+ " Discount " +
				game.getPrice()+ " Price " +
				game.getName()+ " buyed");
	}






}
