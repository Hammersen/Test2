public class Sportler
{
	private String zName;
	private String zVorname;
	
	public Sportler(String pName, String pVorname)
	{
		zName = pName;
		zVorname = pVorname;
	}
	
	public String gibName()
	{
		return zName;
	}
	
	public String gibVorname()
	{
		return zVorname;
	}
}