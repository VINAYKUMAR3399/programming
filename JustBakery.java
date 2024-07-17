public class JustBakery{

	String cake[];
	float offer[];
	long price[];
	int minweight[];
	 
	public JustBakery(){
		String cakes[]={"Paestry","Black Forest","Honey","Apple"};
		cake= cakes;
		float offers[]={30f,30f,40f,40f}; //percentages
		offer=offers;
		long prices[]={600,500,300,100};
		price=prices;
		int minweights[]={1,2,10,5};
		minweight=minweights;
		
	for(int i=0;i<cake.length;i++){
	System.out.println(" - "+cake[i]);
		System.out.println(" - "+offer[i]);
			System.out.println(" - "+price[i]);
				System.out.println(" - "+minweight[i]);
	
	}
	}


}