package pitanja;

import java.util.ArrayList;
public class IteratorPitanja {

	ArrayList<Pitanje>itr;
	
	int trenutni;
	
	public IteratorPitanja(ArrayList<Pitanje>i)
	{
		itr=i;
		trenutni=0;
	}
	
	public void sledece()throws GNemaPitanja
	{
		trenutni++;
		if(trenutni>=itr.size())
		{
			itr.remove(trenutni-1);
			throw new GNemaPitanja();
		}
	}
	
	public boolean postoji()
	{
		return itr.get(trenutni)!=null;
	}
	
	
	public Pitanje dohvati() throws GNemaPitanja
	{
		if(itr.get(trenutni)==null)
			throw new GNemaPitanja();
		return itr.get(trenutni);
	}
	


}
