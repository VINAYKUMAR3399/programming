public class PrimeCheck{
	public static void main(String args[]){
	int count=0;
	int number=44;
	if(number<2)
	{
		System.out.println("the given number is prime number");
	}
	for(int i=2;i<=number;i++){
		if(number%i==0){
			count++;
		
		}
	
		
	}
		if(count<2){
		System.out.println("the given number is prime number");
		
		}
	else{
	System.out.println("the given number is not prime number");
	}
	}

}