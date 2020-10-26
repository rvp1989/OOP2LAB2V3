package pitanja;



public class Pitanje implements Cloneable{

	private String tekst;
	private int brojPoena;
	private double tezina;
	private static int posId=1;
	private int Id=posId++;
	
	public Pitanje(String t,int br,double tez)
	{
		tekst=t;
		brojPoena=br;
		if(tez>=0 && tez<=10)
		   tezina=tez;
		
	}

	public String getTekst() {
		return tekst;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public double getTezina() {
		return tezina;
	}
	public Pitanje clone()
	{
		try
		{
			Pitanje kopija = (Pitanje)super.clone();
			return kopija;
		}catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
	
	public String toString()
	{
		return "Pitanje " + Id + ":" + tekst;
	}
	
	
}
