package gameProject.adapter;

import java.rmi.RemoteException;

import gameProject.business.abstracts.PlayerCheckService;
import gameProject.entities.concrete.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result= false;
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getDateofBirth().getYear());
		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
  
}
