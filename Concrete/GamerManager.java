package Concrete;
import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;



//public class GamerManager extends BaseCustomerManager{
public class GamerManager implements IGamerService{
	public IGamerCheckService _gamerCheckService;
	
	public GamerManager (IGamerCheckService gamerCheckService) {
		this._gamerCheckService = gamerCheckService;
	};
	
	@Override
	public void Save(Gamer gamer) {
		if(_gamerCheckService.CheckIfRealGamer(gamer)) {
			System.out.println("Saved to system: " +gamer.getFirstName());
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	public void Delete(Gamer gamer) {
		System.out.println("Deleted from the system:" +gamer.getFirstName());
	}
	
	public void Update(Gamer gamer) {
		System.out.println("Updated  in the system:" +gamer.getFirstName());
	}




}
