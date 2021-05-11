package Adapters;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import Abstract.IGamerCheckService;
import Entities.Gamer;

public class MernisServiceAdapter implements IGamerCheckService{

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy ();
			try {
				return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getYearOfBirth());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;

	}

}
