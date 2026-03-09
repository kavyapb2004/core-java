class HappyDentExecutor {

    public static void main(String[] gummy) {

        HappyDent mintHappyDent = new HappyDent();

        mintHappyDent.flavor = "Mint";
        mintHappyDent.price = 10;
        mintHappyDent.quantity = 6;
        mintHappyDent.brand = "HappyDent";
        mintHappyDent.sugarFree = true;
        mintHappyDent.weight = 20;

        String[] mintIngredients = {"Xylitol", "Gum Base", "Natural Flavor", "Sweeteners"};
        mintHappyDent.ingredients = mintIngredients;

        String[] mintShops = {"Reliance Smart", "More Supermarket", "Local Kirana Store", "Medical Store"};
        mintHappyDent.shops = mintShops;

        HappyDent strawberryHappyDent = new HappyDent();

        strawberryHappyDent.flavor = "Strawberry";
        strawberryHappyDent.price = 12;
        strawberryHappyDent.quantity = 8;
        strawberryHappyDent.brand = "HappyDent";
        strawberryHappyDent.sugarFree = true;
        strawberryHappyDent.weight = 22;

        String[] strawberryIngredients = {"Xylitol", "Gum Base", "Strawberry Flavor", "Sweeteners"};
        strawberryHappyDent.ingredients = strawberryIngredients;

        String[] strawberryShops = {"Reliance Smart", "DMart", "Medical Store", "Local Kirana Store"};
        strawberryHappyDent.shops = strawberryShops;

        HappyDent orangeHappyDent = new HappyDent();

        orangeHappyDent.flavor = "Orange";
        orangeHappyDent.price = 11;
        orangeHappyDent.quantity = 7;
        orangeHappyDent.brand = "HappyDent";
        orangeHappyDent.sugarFree = true;
        orangeHappyDent.weight = 21;

        String[] orangeIngredients = {"Xylitol", "Gum Base", "Orange Flavor", "Sweeteners"};
        orangeHappyDent.ingredients = orangeIngredients;

        String[] orangeShops = {"More Supermarket", "Spar Hypermarket", "Medical Store", "Local Kirana Store"};
        orangeHappyDent.shops = orangeShops;

        HappyDent watermelonHappyDent = new HappyDent();

        watermelonHappyDent.flavor = "Watermelon";
        watermelonHappyDent.price = 13;
        watermelonHappyDent.quantity = 6;
        watermelonHappyDent.brand = "HappyDent";
        watermelonHappyDent.sugarFree = true;
        watermelonHappyDent.weight = 23;

        String[] watermelonIngredients = {"Xylitol", "Gum Base", "Watermelon Flavor", "Sweeteners"};
        watermelonHappyDent.ingredients = watermelonIngredients;

        String[] watermelonShops = {"Reliance Smart", "DMart", "Local Kirana Store", "Medical Store"};
        watermelonHappyDent.shops = watermelonShops;


        System.out.println("\nThe chewing gum brand is " + mintHappyDent.brand);
        System.out.println("The flavor of the gum is " + mintHappyDent.flavor);
        System.out.println("The price of the gum is " + mintHappyDent.price);
        System.out.println("The ingredients used in the gum are:");
        for(String ingredient : mintHappyDent.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The gum is available in the following shops:");
        for(String shop : mintHappyDent.shops){
            System.out.println(shop);
        }


        System.out.println("\nThe chewing gum brand is " + strawberryHappyDent.brand);
        System.out.println("The flavor of the gum is " + strawberryHappyDent.flavor);
        System.out.println("The price of the gum is " + strawberryHappyDent.price);
        System.out.println("The ingredients used in the gum are:");
        for(String ingredient : strawberryHappyDent.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The gum is available in the following shops:");
        for(String shop : strawberryHappyDent.shops){
            System.out.println(shop);
        }


        System.out.println("\nThe chewing gum brand is " + orangeHappyDent.brand);
        System.out.println("The flavor of the gum is " + orangeHappyDent.flavor);
        System.out.println("The price of the gum is " + orangeHappyDent.price);
        System.out.println("The ingredients used in the gum are:");
        for(String ingredient : orangeHappyDent.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The gum is available in the following shops:");
        for(String shop : orangeHappyDent.shops){
            System.out.println(shop);
        }


        System.out.println("\nThe chewing gum brand is " + watermelonHappyDent.brand);
        System.out.println("The flavor of the gum is " + watermelonHappyDent.flavor);
        System.out.println("The price of the gum is " + watermelonHappyDent.price);
        System.out.println("The ingredients used in the gum are:");
        for(String ingredient : watermelonHappyDent.ingredients){
            System.out.println(ingredient);
        }
        System.out.println("The gum is available in the following shops:");
        for(String shop : watermelonHappyDent.shops){
            System.out.println(shop);
        }

    }
}