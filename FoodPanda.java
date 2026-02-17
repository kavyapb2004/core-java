class FoodPanda {

    public static double search(String foodName) {

        double price = 0.0;

        if (foodName == "RajmaChawal") { price = 140; return price; }
        else if (foodName == "CholeBhature") { price = 150; return price; }
        else if (foodName == "AlooParatha") { price = 90; return price; }
        else if (foodName == "PaneerParatha") { price = 120; return price; }
        else if (foodName == "MethiThepla") { price = 80; return price; }
        else if (foodName == "Kachori") { price = 70; return price; }
        else if (foodName == "DhoklaPlate") { price = 85; return price; }
        else if (foodName == "FafdaJalebi") { price = 110; return price; }
        else if (foodName == "PohaPlate") { price = 60; return price; }
        else if (foodName == "UpmaPlate") { price = 65; return price; }

        else if (foodName == "SabudanaKhichdi") { price = 95; return price; }
        else if (foodName == "PavBhajiSpecial") { price = 130; return price; }
        else if (foodName == "MisalPav") { price = 120; return price; }
        else if (foodName == "DalBaati") { price = 160; return price; }
        else if (foodName == "KadhiChawal") { price = 110; return price; }
        else if (foodName == "PalakPaneer") { price = 170; return price; }
        else if (foodName == "MalaiKofta") { price = 190; return price; }
        else if (foodName == "ButterNaan") { price = 40; return price; }
        else if (foodName == "LachhaParatha") { price = 45; return price; }
        else if (foodName == "TandooriRoti") { price = 25; return price; }

        else if (foodName == "VegPulao") { price = 140; return price; }
        else if (foodName == "JeeraRice") { price = 100; return price; }
        else if (foodName == "CurdRiceSouth") { price = 90; return price; }
        else if (foodName == "LemonRiceSouth") { price = 95; return price; }
        else if (foodName == "TomatoRice") { price = 100; return price; }
        else if (foodName == "RasamRice") { price = 85; return price; }
        else if (foodName == "SambarRice") { price = 95; return price; }
        else if (foodName == "VegCutlet") { price = 80; return price; }
        else if (foodName == "PaneerPakoda") { price = 130; return price; }
        else if (foodName == "AlooTikki") { price = 70; return price; }

        else if (foodName == "MomosVeg") { price = 110; return price; }
        else if (foodName == "MomosChicken") { price = 140; return price; }
        else if (foodName == "SpringRollVeg") { price = 120; return price; }
        else if (foodName == "SpringRollChicken") { price = 150; return price; }
        else if (foodName == "VegHakkaNoodles") { price = 130; return price; }
        else if (foodName == "SchezwanRice") { price = 145; return price; }
        else if (foodName == "VegManchowSoup") { price = 90; return price; }
        else if (foodName == "SweetCornSoup") { price = 85; return price; }
        else if (foodName == "VegFriedMoments") { price = 120; return price; }
        else if (foodName == "PaneerChilliDry") { price = 160; return price; }

        else if (foodName == "FruitCustard") { price = 95; return price; }
        else if (foodName == "Rabdi") { price = 120; return price; }
        else if (foodName == "GulabJamun") { price = 60; return price; }
        else if (foodName == "Rasgulla") { price = 55; return price; }
        else if (foodName == "KajuKatli") { price = 150; return price; }
        else if (foodName == "BesanLadoo") { price = 80; return price; }
        else if (foodName == "MotichoorLadoo") { price = 85; return price; }
        else if (foodName == "PedaSweet") { price = 75; return price; }
        else if (foodName == "HalwaSpecial") { price = 100; return price; }
        else if (foodName == "IceCreamCup") { price = 70; return price; }

        else if (foodName == "MangoShake") { price = 110; return price; }
        else if (foodName == "LassiSweet") { price = 90; return price; }
        else if (foodName == "ButtermilkGlass") { price = 40; return price; }
        else if (foodName == "HerbalTea") { price = 50; return price; }
        else if (foodName == "GreenTeaCup") { price = 60; return price; }

        else {
            System.out.println("Food not available in FoodPanda");
            return price;
        }
    }
}
