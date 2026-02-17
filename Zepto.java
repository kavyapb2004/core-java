class Zepto {

    public static double search(String foodName) {

        double price = 0.0;

        if (foodName == "Poha") { price = 40; return price; }
        else if (foodName == "Upma") { price = 45; return price; }
        else if (foodName == "Pongal") { price = 60; return price; }
        else if (foodName == "RavaKesari") { price = 35; return price; }
        else if (foodName == "KhamanDhokla") { price = 50; return price; }
        else if (foodName == "Thepla") { price = 30; return price; }
        else if (foodName == "MisalPav") { price = 70; return price; }
        else if (foodName == "SabudanaKhichdi") { price = 65; return price; }
        else if (foodName == "PavBhaji") { price = 80; return price; }
        else if (foodName == "VadaMisal") { price = 75; return price; }

        else if (foodName == "CholeKulche") { price = 85; return price; }
        else if (foodName == "RajmaRice") { price = 90; return price; }
        else if (foodName == "DalMakhaniRice") { price = 95; return price; }
        else if (foodName == "VegPulao") { price = 100; return price; }
        else if (foodName == "CurdRice") { price = 55; return price; }
        else if (foodName == "LemonRice") { price = 50; return price; }
        else if (foodName == "TomatoRice") { price = 60; return price; }
        else if (foodName == "CoconutRice") { price = 65; return price; }
        else if (foodName == "MasalaRice") { price = 70; return price; }
        else if (foodName == "JeeraRice") { price = 75; return price; }

        else if (foodName == "AlooParatha") { price = 60; return price; }
        else if (foodName == "GobiParatha") { price = 65; return price; }
        else if (foodName == "MethiParatha") { price = 55; return price; }
        else if (foodName == "PaneerParatha") { price = 85; return price; }
        else if (foodName == "StuffedKulcha") { price = 80; return price; }
        else if (foodName == "PlainRoti") { price = 15; return price; }
        else if (foodName == "ButterRoti") { price = 20; return price; }
        else if (foodName == "TandooriRoti") { price = 25; return price; }
        else if (foodName == "LacchaParatha") { price = 35; return price; }
        else if (foodName == "RoomaliRoti") { price = 30; return price; }

        else if (foodName == "PalakPaneer") { price = 120; return price; }
        else if (foodName == "KadaiPaneer") { price = 130; return price; }
        else if (foodName == "AlooGobi") { price = 90; return price; }
        else if (foodName == "BhindiMasala") { price = 95; return price; }
        else if (foodName == "BainganBharta") { price = 100; return price; }
        else if (foodName == "MatarPaneer") { price = 125; return price; }
        else if (foodName == "ChanaMasala") { price = 85; return price; }
        else if (foodName == "DalTadka") { price = 75; return price; }
        else if (foodName == "VegKofta") { price = 110; return price; }
        else if (foodName == "MalaiKofta") { price = 135; return price; }

        else if (foodName == "FruitSalad") { price = 60; return price; }
        else if (foodName == "Custard") { price = 50; return price; }
        else if (foodName == "GulabJamun") { price = 40; return price; }
        else if (foodName == "Rasgulla") { price = 35; return price; }
        else if (foodName == "Jalebi") { price = 45; return price; }
        else if (foodName == "KajuKatli") { price = 150; return price; }
        else if (foodName == "BesanLadoo") { price = 120; return price; }
        else if (foodName == "MilkPeda") { price = 130; return price; }
        else if (foodName == "SoanPapdi") { price = 110; return price; }
        else if (foodName == "RavaLadoo") { price = 100; return price; }

        else if (foodName == "Buttermilk") { price = 25; return price; }
        else if (foodName == "Lassi") { price = 40; return price; }
        else if (foodName == "MangoJuice") { price = 60; return price; }
        else if (foodName == "OrangeJuice") { price = 55; return price; }
        else if (foodName == "AppleJuice") { price = 65; return price; }

        else {
            System.out.println("Food not available in Zepto");
            return price;
        }
    }
}
