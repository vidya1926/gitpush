package selenium4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class LearnCollection {

	public static void main(String[] args) {
             
		String str="We are learning java session in java doubt clarification session";
		
		String[] split = str.split(" ");
		
		//System.out.print(Arrays.toString(split).hashCode());
		List<String> stringsen=new ArrayList<String>(Arrays.asList(split));		
		Set<String> duplicates=new LinkedHashSet<String>(stringsen);		
		System.out.println(duplicates);
		System.out.println(" *******************");

		Set<String> newSet=new LinkedHashSet<String>();		
		for(String newSentence : split) {
			newSet.add(newSentence);
		}
		System.out.println(newSet.toString());
		
		System.out.println(" *******************");
		
		
		List<String> list1=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();

		for(int i=0;i<split.length;i++)
		
		{	
			if(list1.contains(split[i]))
			{
				list2.add(split[i]);
			}
			else
			{
				list1.add(split[i]);
			}
		}
		System.out.println(list1);	
		
		String string = list1.toString();
	    String replace = string.replace(",", "");
		System.out.println(replace.toString());
		System.out.println(" *******************");
	
		StringBuilder st=new StringBuilder();
		for(String replacest:list1) {
			st.append(replacest);
			st.append(" ");
		}
		System.out.println(st );
		System.out.println(" *******************");

		System.out.println(StringUtils.join(list1, " "));
		System.out.println(" *******************");
		
	
		
		int[] arr = { 3, 4, 5, 2, 2 };
		int[] arr1 = { 4, 2, 1, 4 };
	List<Integer> num1=	new ArrayList<Integer>();
	List<Integer> num2=new ArrayList<Integer>();
	
	//List<Integer> num= new ArrayList<Integer>();
 
	for(Integer n:arr)
	{
		num1.add(n);
	}
	

	for(Integer n1:arr1)
	{
		num2.add(n1);
	}
	     
	     num2.removeAll(num1);
		
		System.out.println("Unique Values" +num2);
		
		System.out.println(" *******************");
	
		Integer arr2[] = { 3, 4, 5, 2};
		Integer arr3[] = { 4, 2, 1, 4 };
	List<Integer> num3=	new ArrayList<Integer>();
	List<Integer> num4=new ArrayList<Integer>();
		
	num3.addAll(Arrays.asList(arr2));
	num4.addAll(Arrays.asList(arr3));
	
	num4.retainAll(num3);
	System.out.println("Duplicated values " +num4);
		
		
		
	}}


