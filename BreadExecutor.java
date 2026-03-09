class BreadExecutor {

    public static void main(String[] eat) {

        Bread wholeWheatBread = new Bread();
        wholeWheatBread.type = "Whole Wheat Bread";
        wholeWheatBread.shape = "Rectangle";

        String[] wholeWheatOutlets = {"Reliance Smart", "DMart", "More Supermarket", "Spar Hypermarket"};
        wholeWheatBread.outletNames = wholeWheatOutlets;

        String[] wholeWheatIngredients = {"Whole Wheat Flour", "Yeast", "Salt", "Sugar", "Vegetable Oil"};
        wholeWheatBread.ingredients = wholeWheatIngredients;


        Bread brownBread = new Bread();
        brownBread.type = "Brown Bread";
        brownBread.shape = "Square";

        String[] brownBreadOutlets = {"Reliance Smart", "Nilgiris Supermarket", "FoodWorld", "Local Bakery"};
        brownBread.outletNames = brownBreadOutlets;

        String[] brownBreadIngredients = {"Wheat Flour", "Yeast", "Salt", "Brown Sugar", "Vegetable Oil"};
        brownBread.ingredients = brownBreadIngredients;


        Bread multigrainBread = new Bread();
        multigrainBread.type = "Multigrain Bread";
        multigrainBread.shape = "Rectangle";

        String[] multigrainOutlets = {"DMart", "Reliance Smart", "More Supermarket", "Spar Hypermarket"};
        multigrainBread.outletNames = multigrainOutlets;

        String[] multigrainIngredients = {"Wheat Flour", "Oats", "Flax Seeds", "Yeast", "Salt"};
        multigrainBread.ingredients = multigrainIngredients;


        Bread garlicBread = new Bread();
        garlicBread.type = "Garlic Bread";
        garlicBread.shape = "Oval";

        String[] garlicOutlets = {"Dominos Outlet", "Pizza Hut Outlet", "Local Bakery", "Reliance Smart"};
        garlicBread.outletNames = garlicOutlets;

        String[] garlicIngredients = {"Refined Flour", "Garlic", "Butter", "Yeast", "Salt"};
        garlicBread.ingredients = garlicIngredients;



        System.out.println("\nThe type of bread is " + wholeWheatBread.type);
        System.out.println("The shape of the bread is " + wholeWheatBread.shape);
        System.out.println("The bread is available in the following outlets:");
        for(String outlet : wholeWheatBread.outletNames){
            System.out.println(outlet);
        }
        System.out.println("The ingredients used to prepare the bread are:");
        for(String ingredient : wholeWheatBread.ingredients){
            System.out.println(ingredient);
        }


        System.out.println("\nThe type of bread is " + brownBread.type);
        System.out.println("The shape of the bread is " + brownBread.shape);
        System.out.println("The bread is available in the following outlets:");
        for(String outlet : brownBread.outletNames){
            System.out.println(outlet);
        }
        System.out.println("The ingredients used to prepare the bread are:");
        for(String ingredient : brownBread.ingredients){
            System.out.println(ingredient);
        }


        System.out.println("\nThe type of bread is " + multigrainBread.type);
        System.out.println("The shape of the bread is " + multigrainBread.shape);
        System.out.println("The bread is available in the following outlets:");
        for(String outlet : multigrainBread.outletNames){
            System.out.println(outlet);
        }
        System.out.println("The ingredients used to prepare the bread are:");
        for(String ingredient : multigrainBread.ingredients){
            System.out.println(ingredient);
        }


        System.out.println("\nThe type of bread is " + garlicBread.type);
        System.out.println("The shape of the bread is " + garlicBread.shape);
        System.out.println("The bread is available in the following outlets:");
        for(String outlet : garlicBread.outletNames){
            System.out.println(outlet);
        }
        System.out.println("The ingredients used to prepare the bread are:");
        for(String ingredient : garlicBread.ingredients){
            System.out.println(ingredient);
        }

    }
}