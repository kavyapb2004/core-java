class FiberExecutor {

    public static void main(String[] fiber) {

        Fiber fiber1 = new Fiber();
        fiber1.name = "Optical Fiber";
        fiber1.length = 100;

        String[] vendorsForOpticalFiber = {"Airtel Fiber", "Jio Fiber", "ACT Fibernet", "BSNL Bharat Fiber"};
        fiber1.vendors = vendorsForOpticalFiber;


        Fiber fiber2 = new Fiber();
        fiber2.name = "Plastic Fiber";
        fiber2.length = 80;

        String[] vendorsForPlasticFiber = {"FiberTech Ltd", "Optic Solutions", "Global Fiber Network", "NextGen Cables"};
        fiber2.vendors = vendorsForPlasticFiber;


        Fiber fiber3 = new Fiber();
        fiber3.name = "Glass Fiber";
        fiber3.length = 120;

        String[] vendorsForGlassFiber = {"Corning Fiber", "Sterlite Technologies", "Prysmian Group", "Finolex Cables"};
        fiber3.vendors = vendorsForGlassFiber;


        Fiber fiber4 = new Fiber();
        fiber4.name = "Hybrid Fiber";
        fiber4.length = 150;

        String[] vendorsForHybridFiber = {"HybridNet Pvt Ltd", "Future Link Networks", "MegaFiber Systems", "Ultra Connect Networks"};
        fiber4.vendors = vendorsForHybridFiber;


        System.out.println("\nDetails of the first fiber connection: ");
        System.out.println("Fiber name is " + fiber1.name);
        System.out.println("The length of the fiber is " + fiber1.length + " meters ");
        System.out.println("The vendors providing this fiber are: ");
        for(String vendor : fiber1.vendors){
            System.out.println(vendor);
        }


        System.out.println("\nDetails of the second fiber connection:");
        System.out.println("Fiber name is " + fiber2.name);
        System.out.println("The length of the fiber is " + fiber2.length + " meters ");
        System.out.println("The vendors providing this fiber are: ");
        for(String vendor : fiber2.vendors){
            System.out.println(vendor);
        }


        System.out.println("\nDetails of the third fiber connection:");
        System.out.println("Fiber name is " + fiber3.name);
        System.out.println("The length of the fiber is " + fiber3.length + " meters");
        System.out.println("The vendors providing this fiber are:");
        for(String vendor : fiber3.vendors){
            System.out.println(vendor);
        }


        System.out.println("\nDetails of the fourth fiber connection:");
        System.out.println("Fiber name is " + fiber4.name);
        System.out.println("The length of the fiber is " + fiber4.length + " meters");
        System.out.println("The vendors providing this fiber are:");
        for(String vendor : fiber4.vendors){
            System.out.println(vendor);
        }
    }
}