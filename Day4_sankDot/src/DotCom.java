import java.util.ArrayList;

public class DotCom {
	private String name;
	private ArrayList<String> locationCells = new ArrayList<String> ();
	
	public void setName(String Name)
	{
		name = Name;
	}
	
	public void setLocationCells(ArrayList<String> loc)
	{
		locationCells = loc;
	}
	
	public String checkYourself(String userInput)
	{
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if(index >= 0)
		{
			locationCells.remove(index);
			
			if(locationCells.isEmpty() == true)
			{
				result = "kill";
				System.out.println("Ouch! You sank " + name + "   :   (");
				
			}
			else
			{
				result = "hit";
				
			}
		}
		return result;
	}

}
