package pitanja;

import java.util.ArrayList;


public class ZbirkaPitanja {

	public ArrayList<Pitanje>zbirkaPitanja=new ArrayList<Pitanje>();
	

	
	public void dodaj(Pitanje p)
	{
		zbirkaPitanja.add(p);
	}
	
	public IteratorPitanja iterator()
	{
		IteratorPitanja iter = new IteratorPitanja(zbirkaPitanja);
		return iter;
	}
	
	
	public Pitanje dohvati(int i) throws GNemaPitanja
	{
		if(i<0 ||zbirkaPitanja.get(i)==null||zbirkaPitanja.isEmpty()==true||i>=zbirkaPitanja.size())
		     throw new GNemaPitanja();
		return zbirkaPitanja.get(i);
	}
	
	public int kapacitet()throws GNemaPitanja
	{
		if(zbirkaPitanja.size()==0)
			throw new GNemaPitanja();
		return zbirkaPitanja.size();
	}
	
	
	public String toString()
	{
	    StringBuilder sb = new StringBuilder();
		for(Pitanje ptnj:zbirkaPitanja)
			sb.append(ptnj+"\n");
		return sb.toString();
	}
	
	
}
