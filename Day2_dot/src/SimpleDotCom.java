import java.util.ArrayList;

public class SimpleDotCom {
    //int[] locationCells;
	ArrayList<String> locationCells = new ArrayList<String>();
	
	//Inter[] use = new Inter [3];
    public void setLocationCells(ArrayList<String> loc)
    {
        locationCells = loc;
    }

    public String checkyourself(String UserInput){
        
        String result = "miss";
        int index = locationCells.indexOf(UserInput);
       
        if(index >= 0)
        {
        	locationCells.remove(index);
        	
        	if(locationCells.isEmpty() == true)
        	{
        		result = "kill";
        	}
        	else
        	{
        		result = "hit";
        	}
        }
        return result;

    }
}
