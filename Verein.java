/**
* @author T. Hammersen
* @version April 2020
*/
public class Verein
{
  private String zName;
  private int zGruendungsjahr;
  
  public Verein(String pName, int pGruendungsjahr)
  {
    zName = pName;
    zGruendungsjahr = pGruendungsjahr;
  }
  
  public String gibName()
  {
	  return zName;
  }  
  
  public int gibGruendungsjahr()
  {
	  return zGruendungsjahr;
  }
}
