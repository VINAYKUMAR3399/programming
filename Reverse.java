public class Reverse{

	public static void main(String args[]){
	 long number=628150063l;
	 long reverse=0l;
	 long remainder=0l;
	 while(number!=0){
		 remainder=number%10;
		 reverse=reverse*10+remainder;
		 
		 number=number/10;
		 
		 
	 }
	System.out.println("the reverse number is:"+reverse);
	
	
	}
}