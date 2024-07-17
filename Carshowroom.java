public class CarShowroom{

	String car[];
	float offer[];
	long price[];
	int mailage[];
	 
	public CarShowroom(){
		String cars[]={"Toyato","Zimmy","Maruthi","Thar"};
		car=cars;
		float offers[]={8f,10f,5f,15f}; //percentages
		offer=offers;
		long prices[]={150000,180000,200000,300000};
		price=prices;
		int mailages[]={10,22,12,8};
		mailage=mailages;
		
	for(int i=0;i<car.length;i++){
	System.out.println(" - "+car[i]);
		System.out.println(" - "+offer[i]);
			System.out.println(" - "+price[i]);
				System.out.println(" - "+mailage[i]);
	
	}
	}


}