class Factory{

	int factoryId;
	String factoryName;
	String location;
	int workers;
	String owner;
	String productType;
	double revenue;
	int rating;

	Machine machine;

	public void getMachineDetails(){

		System.out.println("Factory Id: "+this.factoryId);
		System.out.println("Factory Name: "+this.factoryName);
		System.out.println("Location: "+this.location);
		System.out.println("Workers: "+this.workers);
		System.out.println("Owner: "+this.owner);
		System.out.println("Product Type: "+this.productType);
		System.out.println("Revenue: "+this.revenue);
		System.out.println("Rating: "+this.rating);

		this.machine.getMachineDetails();

		System.out.println("------------------------------------");
	}
}