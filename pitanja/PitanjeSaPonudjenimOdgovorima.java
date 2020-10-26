package pitanja;


public class PitanjeSaPonudjenimOdgovorima extends Pitanje{

	private String[]odgovori;
	public PitanjeSaPonudjenimOdgovorima(String t,int br,double tez,String[] kapacitet)
	{
		super(t,br,tez);
		odgovori=kapacitet;
	}

	public String toString()
	{
		StringBuilder sb= new StringBuilder(super.toString()+"\n");
		for(int i=0;i<odgovori.length;i++)
			sb.append(i+1 +" . "+odgovori[i]+" \n");
		return sb.toString();
		
	}
	
}
