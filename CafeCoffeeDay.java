class CafeCoffeeDay{

	int cafeId;
	String cafeName;
	String location;
	String founder;
	int establishedYear;
	int totalBranches;
	String headquarters;
	int rating;

	Coffee coffee;

	public void getCoffeeDetails(){

		System.out.println("Cafe Id: "+this.cafeId);
		System.out.println("Cafe Name: "+this.cafeName);
		System.out.println("Location: "+this.location);
		System.out.println("Founder: "+this.founder);
		System.out.println("Established Year: "+this.establishedYear);
		System.out.println("Total Branches: "+this.totalBranches);
		System.out.println("Headquarters: "+this.headquarters);
		System.out.println("Rating: "+this.rating);

		this.coffee.getCoffeeDetails();

		System.out.println("--------------------------------------");
	}
}