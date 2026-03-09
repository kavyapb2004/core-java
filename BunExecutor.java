class BunExecutor {

    public static void main(String[] burger) {

        Bun burgerBun = new Bun();

        burgerBun.name = "Burger Bun";
        burgerBun.brand = "Britannia";
        burgerBun.price = 40;
        burgerBun.weight = 200;
        burgerBun.fresh = true;
        burgerBun.quantity = 4;
        burgerBun.manufactureDate = "05-March-2026";
        burgerBun.expiryDate = "10-March-2026";

        String[] burgerBunIngredients = {"Wheat Flour", "Yeast", "Salt", "Sugar", "Butter"};
        burgerBun.ingredients = burgerBunIngredients;

        String[] burgerBunOutlets = {"Reliance Smart", "DMart", "Local Bakery", "More Supermarket"};
        burgerBun.outlets = burgerBunOutlets;

        Bun milkBun = new Bun();

        milkBun.name = "Milk Bun";
        milkBun.brand = "Harvest Gold";
        milkBun.price = 35;
        milkBun.weight = 180;
        milkBun.fresh = true;
        milkBun.quantity = 6;
        milkBun.manufactureDate = "06-March-2026";
        milkBun.expiryDate = "11-March-2026";

        String[] milkBunIngredients = {"Refined Flour", "Milk Powder", "Yeast", "Sugar", "Salt"};
        milkBun.ingredients = milkBunIngredients;

        String[] milkBunOutlets = {"Reliance Smart", "Nilgiris Supermarket", "Local Bakery", "Spar Hypermarket"};
        milkBun.outlets = milkBunOutlets;

        Bun sweetBun = new Bun();

        sweetBun.name = "Sweet Bun";
        sweetBun.brand = "Modern";
        sweetBun.price = 30;
        sweetBun.weight = 170;
        sweetBun.fresh = true;
        sweetBun.quantity = 5;
        sweetBun.manufactureDate = "06-March-2026";
        sweetBun.expiryDate = "12-March-2026";

        String[] sweetBunIngredients = {"Wheat Flour", "Sugar", "Yeast", "Butter", "Salt"};
        sweetBun.ingredients = sweetBunIngredients;

        String[] sweetBunOutlets = {"More Supermarket", "Local Bakery", "DMart", "Reliance Smart"};
        sweetBun.outlets = sweetBunOutlets;

        Bun coconutBun = new Bun();
		
        coconutBun.name = "Coconut Bun";
        coconutBun.brand = "Local Bakery Special";
        coconutBun.price = 45;
        coconutBun.weight = 190;
        coconutBun.fresh = true;
        coconutBun.quantity = 4;
        coconutBun.manufactureDate = "07-March-2026";
        coconutBun.expiryDate = "12-March-2026";

        String[] coconutBunIngredients = {"Refined Flour", "Coconut", "Sugar", "Yeast", "Butter"};
        coconutBun.ingredients = coconutBunIngredients;

        String[] coconutBunOutlets = {"Local Bakery", "Reliance Smart", "More Supermarket", "DMart"};
        coconutBun.outlets = coconutBunOutlets;


        System.out.println("\nThe name of the bun is " + burgerBun.name);
        System.out.println("The brand of the bun is " + burgerBun.brand);
        System.out.println("The price of the bun is " + burgerBun.price);
        System.out.println("The ingredients used in the bun are:");
        for(String ingredient : burgerBun.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The bun is available in the following outlets:");
        for(String outlet : burgerBun.outlets){
            System.out.println(outlet);
        }


        System.out.println("\nThe name of the bun is " + milkBun.name);
        System.out.println("The brand of the bun is " + milkBun.brand);
        System.out.println("The price of the bun is " + milkBun.price);
        System.out.println("The ingredients used in the bun are:");
        for(String ingredient : milkBun.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The bun is available in the following outlets:");
        for(String outlet : milkBun.outlets){
            System.out.println(outlet);
        }


        System.out.println("\nThe name of the bun is " + sweetBun.name);
        System.out.println("The brand of the bun is " + sweetBun.brand);
        System.out.println("The price of the bun is " + sweetBun.price);
        System.out.println("The ingredients used in the bun are:");
        for(String ingredient : sweetBun.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The bun is available in the following outlets:");
        for(String outlet : sweetBun.outlets){
            System.out.println(outlet);
        }


        System.out.println("\nThe name of the bun is " + coconutBun.name);
        System.out.println("The brand of the bun is " + coconutBun.brand);
        System.out.println("The price of the bun is " + coconutBun.price);
        System.out.println("The ingredients used in the bun are:");
        for(String ingredient : coconutBun.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The bun is available in the following outlets:");
        for(String outlet : coconutBun.outlets){
            System.out.println(outlet);
        }

    }
}