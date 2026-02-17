class BlinkIt {

    public static double search(String foodName) {

        double price = 0.0;

        if (foodName == "ChickenBiryani") { price = 180; return price; }
        else if (foodName == "MuttonBiryani") { price = 250; return price; }
        else if (foodName == "FishFry") { price = 160; return price; }
        else if (foodName == "PrawnMasala") { price = 220; return price; }
        else if (foodName == "EggCurry") { price = 120; return price; }
        else if (foodName == "ChickenCurry") { price = 200; return price; }
        else if (foodName == "MuttonCurry") { price = 280; return price; }
        else if (foodName == "FishCurry") { price = 190; return price; }
        else if (foodName == "ChickenFriedRice") { price = 150; return price; }
        else if (foodName == "EggFriedRice") { price = 130; return price; }

        else if (foodName == "ChickenNoodles") { price = 140; return price; }
        else if (foodName == "EggNoodles") { price = 120; return price; }
        else if (foodName == "ChickenManchurian") { price = 170; return price; }
        else if (foodName == "GobiManchurian") { price = 110; return price; }
        else if (foodName == "ChilliChicken") { price = 180; return price; }
        else if (foodName == "Chicken65") { price = 190; return price; }
        else if (foodName == "ChickenLollipop") { price = 210; return price; }
        else if (foodName == "TandooriChicken") { price = 260; return price; }
        else if (foodName == "GrilledChicken") { price = 240; return price; }
        else if (foodName == "ChickenKebab") { price = 200; return price; }

        else if (foodName == "MuttonKebab") { price = 300; return price; }
        else if (foodName == "FishTikka") { price = 230; return price; }
        else if (foodName == "ChickenTikka") { price = 220; return price; }
        else if (foodName == "SeekhKebab") { price = 270; return price; }
        else if (foodName == "ChickenShawarma") { price = 150; return price; }
        else if (foodName == "FalafelWrap") { price = 130; return price; }
        else if (foodName == "ChickenWrap") { price = 140; return price; }
        else if (foodName == "PaneerWrap") { price = 120; return price; }
        else if (foodName == "VegSandwich") { price = 90; return price; }
        else if (foodName == "ChickenSandwich") { price = 120; return price; }

        else if (foodName == "ClubSandwich") { price = 150; return price; }
        else if (foodName == "FrenchFries") { price = 100; return price; }
        else if (foodName == "CheeseFries") { price = 130; return price; }
        else if (foodName == "OnionRings") { price = 110; return price; }
        else if (foodName == "ChickenBurger") { price = 140; return price; }
        else if (foodName == "VegBurger") { price = 100; return price; }
        else if (foodName == "DoubleChickenBurger") { price = 180; return price; }
        else if (foodName == "HotDog") { price = 120; return price; }
        else if (foodName == "ChickenHotDog") { price = 150; return price; }
        else if (foodName == "Nachos") { price = 130; return price; }

        else if (foodName == "CheeseNachos") { price = 160; return price; }
        else if (foodName == "Taco") { price = 140; return price; }
        else if (foodName == "ChickenTaco") { price = 170; return price; }
        else if (foodName == "Burrito") { price = 180; return price; }
        else if (foodName == "ChickenBurrito") { price = 200; return price; }
        else if (foodName == "Pancakes") { price = 120; return price; }
        else if (foodName == "Waffles") { price = 140; return price; }
        else if (foodName == "Donut") { price = 60; return price; }
        else if (foodName == "Cupcake") { price = 50; return price; }
        else if (foodName == "Brownie") { price = 80; return price; }

        else if (foodName == "Milkshake") { price = 110; return price; }
        else if (foodName == "Smoothie") { price = 130; return price; }
        else if (foodName == "EnergyDrink") { price = 90; return price; }
        else if (foodName == "ColdDrinkBottle") { price = 70; return price; }
        else if (foodName == "SparklingWater") { price = 60; return price; }

        else {
            System.out.println("Food not available in BlinkIt");
            return price;
        }
    }
}
