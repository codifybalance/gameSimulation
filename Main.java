import java.time.LocalDate;

import Abstract.IGamerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {
	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("Ayca","Aydemir",1993,"20000086488");
		
		Game game1 = new Game("GameOne",100);

		Campaign campaign1 = new Campaign(1,"%50 Campaign",50);

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.Save(gamer1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Save(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer1, game1);
		saleManager.saleCampaing(gamer1,campaign1, game1);
		
	}
}
