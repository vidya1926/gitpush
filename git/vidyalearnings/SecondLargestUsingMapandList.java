package selenium4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="paypalindia";
		char[] cA=name.toCharArray();
		
		
Map<Character,Integer> occurCount=new HashMap<Character,Integer>();

     for(int i=0;i<cA.length;i++)
     {
            occurCount.put(cA[i],occurCount.getOrDefault(cA[i],0)+1);	
     }  
     System.out.println(occurCount); 

          List<Integer> list = new ArrayList<Integer>(occurCount.values());
	     
	      Collections.sort(list);
	      Integer sl = list.get(list.size()-2); 
	      System.out.println(sl);
	      System.out.println("Second Largest " +sl);
	      for(Entry<Character, Integer> entry: occurCount.entrySet()) {
	          if(entry.getValue() == sl) {
	            System.out.println("The key for value " + sl + " is " + entry.getKey());
	   }
	      
	    
	
	      }
	}

}
