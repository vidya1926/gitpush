package week1day1;

public class pallindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=454;//It is the number variable to be checked for palindrome  
		  
     	int temp=n,  sum = 0,r;  
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    //0+4=>4, 4*10+5=>45,
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	
	
	
	
	
	

}
