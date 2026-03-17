class Coffee{

	int coffeeId;
	String coffeeName;
	String type;
	double price;
	String size;
	String ingredients;
	boolean hot;
	String speciality;

	public void getCoffeeDetails(){

		System.out.println("Coffee Id: "+this.coffeeId);
		System.out.println("Coffee Name: "+this.coffeeName);
		System.out.println("Type: "+this.type);
		System.out.println("Price: "+this.price);
		System.out.println("Size: "+this.size);
		System.out.println("Ingredients: "+this.ingredients);
		System.out.println("Hot: "+this.hot);
		System.out.println("Speciality: "+this.speciality);
	}
}