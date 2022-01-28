package week1day1;

public class Learnthis {

	int x=5;
	
	Learnthis(){
System.out.println("I am in default Constructor");	
 }
	
	Learnthis(int x){
		this();
		System.out.println(x);
		System.out.println(this.x); ;
	}
		
	public static  void main(String[] args) {
		
		Learnthis n=new Learnthis(10);
		
	}
	
		}


