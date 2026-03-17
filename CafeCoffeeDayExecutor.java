class CafeCoffeeDayExecutor{

	public static void main(String[] args){

	CafeCoffeeDay c1=new CafeCoffeeDay();
	c1.cafeId=1;
	c1.cafeName="Cafe Coffee Day";
	c1.location="Bangalore";
	c1.founder="V G Siddhartha";
	c1.establishedYear=1996;
	c1.totalBranches=1700;
	c1.headquarters="Bangalore";
	c1.rating=5;

	Coffee cf1=new Coffee();
	cf1.coffeeId=101;
	cf1.coffeeName="Cappuccino";
	cf1.type="Hot Coffee";
	cf1.price=180;
	cf1.size="Medium";
	cf1.ingredients="Milk, Coffee";
	cf1.hot=true;
	cf1.speciality="Foam Milk";

	c1.coffee=cf1;


	CafeCoffeeDay c2=new CafeCoffeeDay();
	c2.cafeId=2;
	c2.cafeName="Cafe Coffee Day";
	c2.location="Mysore";
	c2.founder="V G Siddhartha";
	c2.establishedYear=1996;
	c2.totalBranches=1700;
	c2.headquarters="Bangalore";
	c2.rating=5;

	Coffee cf2=new Coffee();
	cf2.coffeeId=102;
	cf2.coffeeName="Latte";
	cf2.type="Hot Coffee";
	cf2.price=190;
	cf2.size="Large";
	cf2.ingredients="Espresso, Milk";
	cf2.hot=true;
	cf2.speciality="Creamy Taste";

	c2.coffee=cf2;


	CafeCoffeeDay c3=new CafeCoffeeDay();
	c3.cafeId=3;
	c3.cafeName="Cafe Coffee Day";
	c3.location="Hyderabad";
	c3.founder="V G Siddhartha";
	c3.establishedYear=1996;
	c3.totalBranches=1700;
	c3.headquarters="Bangalore";
	c3.rating=5;

	Coffee cf3=new Coffee();
	cf3.coffeeId=103;
	cf3.coffeeName="Mocha";
	cf3.type="Hot Coffee";
	cf3.price=200;
	cf3.size="Medium";
	cf3.ingredients="Coffee, Chocolate";
	cf3.hot=true;
	cf3.speciality="Chocolate Flavor";

	c3.coffee=cf3;


	CafeCoffeeDay c4=new CafeCoffeeDay();
	c4.cafeId=4;
	c4.cafeName="Cafe Coffee Day";
	c4.location="Chennai";
	c4.founder="V G Siddhartha";
	c4.establishedYear=1996;
	c4.totalBranches=1700;
	c4.headquarters="Bangalore";
	c4.rating=5;

	Coffee cf4=new Coffee();
	cf4.coffeeId=104;
	cf4.coffeeName="Cold Coffee";
	cf4.type="Cold";
	cf4.price=170;
	cf4.size="Large";
	cf4.ingredients="Milk, Ice";
	cf4.hot=false;
	cf4.speciality="Chilled Coffee";

	c4.coffee=cf4;


	CafeCoffeeDay c5=new CafeCoffeeDay();
	c5.cafeId=5;
	c5.cafeName="Cafe Coffee Day";
	c5.location="Mumbai";
	c5.founder="V G Siddhartha";
	c5.establishedYear=1996;
	c5.totalBranches=1700;
	c5.headquarters="Bangalore";
	c5.rating=5;

	Coffee cf5=new Coffee();
	cf5.coffeeId=105;
	cf5.coffeeName="Espresso";
	cf5.type="Hot Coffee";
	cf5.price=150;
	cf5.size="Small";
	cf5.ingredients="Pure Coffee";
	cf5.hot=true;
	cf5.speciality="Strong Taste";

	c5.coffee=cf5;
	
		CafeCoffeeDay c6=new CafeCoffeeDay();
	c6.cafeId=6;
	c6.cafeName="Cafe Coffee Day";
	c6.location="Pune";
	c6.founder="V G Siddhartha";
	c6.establishedYear=1996;
	c6.totalBranches=1700;
	c6.headquarters="Bangalore";
	c6.rating=5;

	Coffee cf6=new Coffee();
	cf6.coffeeId=106;
	cf6.coffeeName="Americano";
	cf6.type="Hot Coffee";
	cf6.price=160;
	cf6.size="Medium";
	cf6.ingredients="Espresso, Water";
	cf6.hot=true;
	cf6.speciality="Smooth Taste";
	c6.coffee=cf6;


	CafeCoffeeDay c7=new CafeCoffeeDay();
	c7.cafeId=7;
	c7.cafeName="Cafe Coffee Day";
	c7.location="Delhi";
	c7.founder="V G Siddhartha";
	c7.establishedYear=1996;
	c7.totalBranches=1700;
	c7.headquarters="Bangalore";
	c7.rating=5;

	Coffee cf7=new Coffee();
	cf7.coffeeId=107;
	cf7.coffeeName="Caramel Latte";
	cf7.type="Hot Coffee";
	cf7.price=210;
	cf7.size="Large";
	cf7.ingredients="Milk, Caramel";
	cf7.hot=true;
	cf7.speciality="Sweet Flavor";
	c7.coffee=cf7;


	CafeCoffeeDay c8=new CafeCoffeeDay();
	c8.cafeId=8;
	c8.cafeName="Cafe Coffee Day";
	c8.location="Kolkata";
	c8.founder="V G Siddhartha";
	c8.establishedYear=1996;
	c8.totalBranches=1700;
	c8.headquarters="Bangalore";
	c8.rating=5;

	Coffee cf8=new Coffee();
	cf8.coffeeId=108;
	cf8.coffeeName="Hazelnut Coffee";
	cf8.type="Hot Coffee";
	cf8.price=220;
	cf8.size="Medium";
	cf8.ingredients="Coffee, Hazelnut";
	cf8.hot=true;
	cf8.speciality="Nutty Flavor";
	c8.coffee=cf8;


	CafeCoffeeDay c9=new CafeCoffeeDay();
	c9.cafeId=9;
	c9.cafeName="Cafe Coffee Day";
	c9.location="Jaipur";
	c9.founder="V G Siddhartha";
	c9.establishedYear=1996;
	c9.totalBranches=1700;
	c9.headquarters="Bangalore";
	c9.rating=5;

	Coffee cf9=new Coffee();
	cf9.coffeeId=109;
	cf9.coffeeName="Irish Coffee";
	cf9.type="Hot Coffee";
	cf9.price=230;
	cf9.size="Large";
	cf9.ingredients="Coffee, Cream";
	cf9.hot=true;
	cf9.speciality="Rich Cream";
	c9.coffee=cf9;


	CafeCoffeeDay c10=new CafeCoffeeDay();
	c10.cafeId=10;
	c10.cafeName="Cafe Coffee Day";
	c10.location="Ahmedabad";
	c10.founder="V G Siddhartha";
	c10.establishedYear=1996;
	c10.totalBranches=1700;
	c10.headquarters="Bangalore";
	c10.rating=5;

	Coffee cf10=new Coffee();
	cf10.coffeeId=110;
	cf10.coffeeName="Vanilla Latte";
	cf10.type="Hot Coffee";
	cf10.price=200;
	cf10.size="Medium";
	cf10.ingredients="Milk, Vanilla";
	cf10.hot=true;
	cf10.speciality="Vanilla Flavor";
	c10.coffee=cf10;


	CafeCoffeeDay c11=new CafeCoffeeDay();
	c11.cafeId=11;
	c11.cafeName="Cafe Coffee Day";
	c11.location="Nagpur";
	c11.founder="V G Siddhartha";
	c11.establishedYear=1996;
	c11.totalBranches=1700;
	c11.headquarters="Bangalore";
	c11.rating=5;

	Coffee cf11=new Coffee();
	cf11.coffeeId=111;
	cf11.coffeeName="Chocolate Coffee";
	cf11.type="Hot Coffee";
	cf11.price=210;
	cf11.size="Large";
	cf11.ingredients="Coffee, Chocolate";
	cf11.hot=true;
	cf11.speciality="Chocolate Taste";
	c11.coffee=cf11;


	CafeCoffeeDay c12=new CafeCoffeeDay();
	c12.cafeId=12;
	c12.cafeName="Cafe Coffee Day";
	c12.location="Lucknow";
	c12.founder="V G Siddhartha";
	c12.establishedYear=1996;
	c12.totalBranches=1700;
	c12.headquarters="Bangalore";
	c12.rating=5;

	Coffee cf12=new Coffee();
	cf12.coffeeId=112;
	cf12.coffeeName="Filter Coffee";
	cf12.type="Hot Coffee";
	cf12.price=120;
	cf12.size="Small";
	cf12.ingredients="Coffee, Milk";
	cf12.hot=true;
	cf12.speciality="South Indian Style";
	c12.coffee=cf12;


	CafeCoffeeDay c13=new CafeCoffeeDay();
	c13.cafeId=13;
	c13.cafeName="Cafe Coffee Day";
	c13.location="Trivandrum";
	c13.founder="V G Siddhartha";
	c13.establishedYear=1996;
	c13.totalBranches=1700;
	c13.headquarters="Bangalore";
	c13.rating=5;

	Coffee cf13=new Coffee();
	cf13.coffeeId=113;
	cf13.coffeeName="Cold Latte";
	cf13.type="Cold Coffee";
	cf13.price=190;
	cf13.size="Large";
	cf13.ingredients="Milk, Ice";
	cf13.hot=false;
	cf13.speciality="Chilled Latte";
	c13.coffee=cf13;


	CafeCoffeeDay c14=new CafeCoffeeDay();
	c14.cafeId=14;
	c14.cafeName="Cafe Coffee Day";
	c14.location="Patna";
	c14.founder="V G Siddhartha";
	c14.establishedYear=1996;
	c14.totalBranches=1700;
	c14.headquarters="Bangalore";
	c14.rating=5;

	Coffee cf14=new Coffee();
	cf14.coffeeId=114;
	cf14.coffeeName="Iced Americano";
	cf14.type="Cold Coffee";
	cf14.price=170;
	cf14.size="Medium";
	cf14.ingredients="Coffee, Ice";
	cf14.hot=false;
	cf14.speciality="Cool Drink";
	c14.coffee=cf14;


	CafeCoffeeDay c15=new CafeCoffeeDay();
	c15.cafeId=15;
	c15.cafeName="Cafe Coffee Day";
	c15.location="Mangalore";
	c15.founder="V G Siddhartha";
	c15.establishedYear=1996;
	c15.totalBranches=1700;
	c15.headquarters="Bangalore";
	c15.rating=5;

	Coffee cf15=new Coffee();
	cf15.coffeeId=115;
	cf15.coffeeName="Cafe Mocha";
	cf15.type="Hot Coffee";
	cf15.price=210;
	cf15.size="Large";
	cf15.ingredients="Coffee, Chocolate";
	cf15.hot=true;
	cf15.speciality="Sweet Coffee";
	c15.coffee=cf15;
	
		CafeCoffeeDay c6=new CafeCoffeeDay();
	c6.cafeId=6;
	c6.cafeName="Cafe Coffee Day";
	c6.location="Pune";
	c6.founder="V G Siddhartha";
	c6.establishedYear=1996;
	c6.totalBranches=1700;
	c6.headquarters="Bangalore";
	c6.rating=5;

	Coffee cf6=new Coffee();
	cf6.coffeeId=106;
	cf6.coffeeName="Americano";
	cf6.type="Hot Coffee";
	cf6.price=160;
	cf6.size="Medium";
	cf6.ingredients="Espresso, Water";
	cf6.hot=true;
	cf6.speciality="Smooth Taste";
	c6.coffee=cf6;


	CafeCoffeeDay c7=new CafeCoffeeDay();
	c7.cafeId=7;
	c7.cafeName="Cafe Coffee Day";
	c7.location="Delhi";
	c7.founder="V G Siddhartha";
	c7.establishedYear=1996;
	c7.totalBranches=1700;
	c7.headquarters="Bangalore";
	c7.rating=5;

	Coffee cf7=new Coffee();
	cf7.coffeeId=107;
	cf7.coffeeName="Caramel Latte";
	cf7.type="Hot Coffee";
	cf7.price=210;
	cf7.size="Large";
	cf7.ingredients="Milk, Caramel";
	cf7.hot=true;
	cf7.speciality="Sweet Flavor";
	c7.coffee=cf7;


	CafeCoffeeDay c8=new CafeCoffeeDay();
	c8.cafeId=8;
	c8.cafeName="Cafe Coffee Day";
	c8.location="Kolkata";
	c8.founder="V G Siddhartha";
	c8.establishedYear=1996;
	c8.totalBranches=1700;
	c8.headquarters="Bangalore";
	c8.rating=5;

	Coffee cf8=new Coffee();
	cf8.coffeeId=108;
	cf8.coffeeName="Hazelnut Coffee";
	cf8.type="Hot Coffee";
	cf8.price=220;
	cf8.size="Medium";
	cf8.ingredients="Coffee, Hazelnut";
	cf8.hot=true;
	cf8.speciality="Nutty Flavor";
	c8.coffee=cf8;


	CafeCoffeeDay c9=new CafeCoffeeDay();
	c9.cafeId=9;
	c9.cafeName="Cafe Coffee Day";
	c9.location="Jaipur";
	c9.founder="V G Siddhartha";
	c9.establishedYear=1996;
	c9.totalBranches=1700;
	c9.headquarters="Bangalore";
	c9.rating=5;

	Coffee cf9=new Coffee();
	cf9.coffeeId=109;
	cf9.coffeeName="Irish Coffee";
	cf9.type="Hot Coffee";
	cf9.price=230;
	cf9.size="Large";
	cf9.ingredients="Coffee, Cream";
	cf9.hot=true;
	cf9.speciality="Rich Cream";
	c9.coffee=cf9;


	CafeCoffeeDay c10=new CafeCoffeeDay();
	c10.cafeId=10;
	c10.cafeName="Cafe Coffee Day";
	c10.location="Ahmedabad";
	c10.founder="V G Siddhartha";
	c10.establishedYear=1996;
	c10.totalBranches=1700;
	c10.headquarters="Bangalore";
	c10.rating=5;

	Coffee cf10=new Coffee();
	cf10.coffeeId=110;
	cf10.coffeeName="Vanilla Latte";
	cf10.type="Hot Coffee";
	cf10.price=200;
	cf10.size="Medium";
	cf10.ingredients="Milk, Vanilla";
	cf10.hot=true;
	cf10.speciality="Vanilla Flavor";
	c10.coffee=cf10;


	CafeCoffeeDay c11=new CafeCoffeeDay();
	c11.cafeId=11;
	c11.cafeName="Cafe Coffee Day";
	c11.location="Nagpur";
	c11.founder="V G Siddhartha";
	c11.establishedYear=1996;
	c11.totalBranches=1700;
	c11.headquarters="Bangalore";
	c11.rating=5;

	Coffee cf11=new Coffee();
	cf11.coffeeId=111;
	cf11.coffeeName="Chocolate Coffee";
	cf11.type="Hot Coffee";
	cf11.price=210;
	cf11.size="Large";
	cf11.ingredients="Coffee, Chocolate";
	cf11.hot=true;
	cf11.speciality="Chocolate Taste";
	c11.coffee=cf11;


	CafeCoffeeDay c12=new CafeCoffeeDay();
	c12.cafeId=12;
	c12.cafeName="Cafe Coffee Day";
	c12.location="Lucknow";
	c12.founder="V G Siddhartha";
	c12.establishedYear=1996;
	c12.totalBranches=1700;
	c12.headquarters="Bangalore";
	c12.rating=5;

	Coffee cf12=new Coffee();
	cf12.coffeeId=112;
	cf12.coffeeName="Filter Coffee";
	cf12.type="Hot Coffee";
	cf12.price=120;
	cf12.size="Small";
	cf12.ingredients="Coffee, Milk";
	cf12.hot=true;
	cf12.speciality="South Indian Style";
	c12.coffee=cf12;


	CafeCoffeeDay c13=new CafeCoffeeDay();
	c13.cafeId=13;
	c13.cafeName="Cafe Coffee Day";
	c13.location="Trivandrum";
	c13.founder="V G Siddhartha";
	c13.establishedYear=1996;
	c13.totalBranches=1700;
	c13.headquarters="Bangalore";
	c13.rating=5;

	Coffee cf13=new Coffee();
	cf13.coffeeId=113;
	cf13.coffeeName="Cold Latte";
	cf13.type="Cold Coffee";
	cf13.price=190;
	cf13.size="Large";
	cf13.ingredients="Milk, Ice";
	cf13.hot=false;
	cf13.speciality="Chilled Latte";
	c13.coffee=cf13;


	CafeCoffeeDay c14=new CafeCoffeeDay();
	c14.cafeId=14;
	c14.cafeName="Cafe Coffee Day";
	c14.location="Patna";
	c14.founder="V G Siddhartha";
	c14.establishedYear=1996;
	c14.totalBranches=1700;
	c14.headquarters="Bangalore";
	c14.rating=5;

	Coffee cf14=new Coffee();
	cf14.coffeeId=114;
	cf14.coffeeName="Iced Americano";
	cf14.type="Cold Coffee";
	cf14.price=170;
	cf14.size="Medium";
	cf14.ingredients="Coffee, Ice";
	cf14.hot=false;
	cf14.speciality="Cool Drink";
	c14.coffee=cf14;


	CafeCoffeeDay c15=new CafeCoffeeDay();
	c15.cafeId=15;
	c15.cafeName="Cafe Coffee Day";
	c15.location="Mangalore";
	c15.founder="V G Siddhartha";
	c15.establishedYear=1996;
	c15.totalBranches=1700;
	c15.headquarters="Bangalore";
	c15.rating=5;

	Coffee cf15=new Coffee();
	cf15.coffeeId=115;
	cf15.coffeeName="Cafe Mocha";
	cf15.type="Hot Coffee";
	cf15.price=210;
	cf15.size="Large";
	cf15.ingredients="Coffee, Chocolate";
	cf15.hot=true;
	cf15.speciality="Sweet Coffee";
	c15.coffee=cf15;
	
	c1.getCoffeeDetails();
c2.getCoffeeDetails();
c3.getCoffeeDetails();
c4.getCoffeeDetails();
c5.getCoffeeDetails();
c6.getCoffeeDetails();
c7.getCoffeeDetails();
c8.getCoffeeDetails();
c9.getCoffeeDetails();
c10.getCoffeeDetails();
c11.getCoffeeDetails();
c12.getCoffeeDetails();
c13.getCoffeeDetails();
c14.getCoffeeDetails();
c15.getCoffeeDetails();
c16.getCoffeeDetails();
c17.getCoffeeDetails();
c18.getCoffeeDetails();
c19.getCoffeeDetails();
c20.getCoffeeDetails();
	}
}