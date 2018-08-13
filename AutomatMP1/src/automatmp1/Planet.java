package automatmp1;

import java.util.ArrayList;

public class Planet {
    ArrayList<String> occupants;
    
    public Planet(){
    	occupants = new ArrayList();
    }
    
    public void addOccupant(String name) {
    	occupants.add(name);
    }
    
    public void removeOccupant(String name) {
    	
    	for(int i = 0; i < occupants.size(); i++)
    	{
    		if(occupants.get(i).equals(name))
    			occupants.remove(i);
    	}
    }
    
    public ArrayList<String> getOccupants(){
    	return occupants;
    }
    
    public boolean check() {
    	
    	int lion = 0;
    	int cow = 0;
    	int grains = 0;
    	int human1 = 0;
    	int human2 = 0;
    	int scientist = 0;
    	
    	for(int i = 0; i < occupants.size(); i++)
    	{
    		if(occupants.get(i).equals("Lion"))
    			lion = 1;
    		if(occupants.get(i).equals("Cow"))
    			cow = 1;
    		if(occupants.get(i).equals("Grains"))
    			grains = 1;
    		if(occupants.get(i).equals("Human 1"))
    			human1 = 1;
    		if(occupants.get(i).equals("Human 2"))
    			human2 = 1;
    		if(occupants.get(i).equals("Scientist"))
    			scientist = 1;
    	}
    	
    	System.out.println("Lion: " + lion);
    	System.out.println("Cow: " + cow);
    	System.out.println("Grains: " + grains);
    	System.out.println("Human 1: " + human1);
    	System.out.println("Human 2: " + human2);
    	System.out.println("Scientist: " + scientist);

    	if(scientist == 0)
    	{
    	if(lion == 1 && cow == 1)
    		return false;
    	else if(cow == 1 && grains == 1)
    			return false;
    		else if(human1 == 1 && lion == 1)
    				return false;
    			else if(human2 == 1 && lion == 1)
    				return false;
    				else if(human1 == 1 && cow == 1)
    					return false;
    					else if(human2 == 1 && lion == 1)
    						return false;
    						else
    							return true;
    	}
    	else
    		return true;
    }
}