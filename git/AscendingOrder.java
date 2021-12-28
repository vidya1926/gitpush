package week1day1;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {2,4,3,5,6,7};
		 int temp;
	      //sort the array
	      for (int i = 0; i < a.length; i++) {
	         for (int j = i + 1; j < a.length; j++) {
	            if (a[i] > a[j]) {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      
	      for(int k=0;k<a.length;k++)
	      {
	    	  System.out.println(a[k]);
	      }
	}

}
