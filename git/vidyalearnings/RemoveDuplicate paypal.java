package assignmentcodesweek3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		/*
		 * 1.Convert it into a character array
		 * 
		 * 2.Declare a Set as charSet for Character
		 * 
		 * 3.Declare a Set as dupCharSet for duplicate Character
		 * 
		 * 4.Iterate character array and add it into charSet Note: add() method in a set
		 * returns boolean value. Duplicate values will not be added and hence will
		 * return "false" So, we can find out if an element is added to the set or not
		 * using IF condition.
		 * 
		 * 5. If the element is not added in the step 4, it means the character is a
		 * duplicate and the character is already in the charSet Then, add it to the
		 * dupCharSet
		 * 
		 * 6.Check the dupCharSet elements and remove those in the charSet Note: use
		 * removeAll()
		 * 
		 * 7.Iterate using charSet
		 * 
		 * 8.Check the iterator variable isn't equals to an empty space
		 * 
		 * 9.print it
		 */
		
		
String cname= "Paypal";
//Paypl,Pypl
		
String str=cname.toLowerCase();
//paypal yl
char[] ch=str.toCharArray();

Set<Character> charSet =new HashSet<Character>();
 Set<Character> dupcharSet =new HashSet<Character>();

for (Character eachChar : ch) 
{
if(!charSet.add(eachChar))
{
	dupcharSet.add(eachChar);
}

}
System.out.println(dupcharSet);
//charSet.retainAll(dupcharSet);

charSet.removeAll(dupcharSet);

// yl 

System.out.println("Charset");

for (Character eachCh : charSet) {
	if(eachCh!=' ')
		System.out.println(eachCh);
}




	}

}
