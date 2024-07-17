public class BikeShowroom{

	String bike[];
	float offer[];
	long price[];
	int mailage[];
	 
	public BikeShowroom(){
		String bikes[]={"xpulse","Honda","shine","Dio"};
		bike= bikes;
		float offers[]={10f,25f,15f,18f}; //percentages
		offer=offers;
		long prices[]={80000,90000,70000,60000};
		price=prices;
		int mailages[]={50,30,40,60};
		mailage=mailages;
		
	for(int i=0;i<bike.length;i++){
	System.out.println(" - "+bike[i]);
		System.out.println(" - "+offer[i]);
			System.out.println(" - "+price[i]);
				System.out.println(" - "+mailage[i]);
	
	}
	}


}