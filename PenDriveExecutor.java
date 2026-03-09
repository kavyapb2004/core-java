class PenDriveExecutor {

    public static void main(String[] args) {

        PenDrive sandiskPenDrive = new PenDrive();

        sandiskPenDrive.brand = "SanDisk";
        sandiskPenDrive.storage = 64;
        sandiskPenDrive.price = 699;
        sandiskPenDrive.type = "USB 3.0";
        sandiskPenDrive.working = true;

        String[] sandiskColors = {"Black", "Red", "Blue"};
        sandiskPenDrive.colors = sandiskColors;

        String[] sandiskDevices = {"Laptop", "Desktop Computer", "Smart TV", "Car Audio System"};
        sandiskPenDrive.compatibleDevices = sandiskDevices;

        String[] sandiskVendors = {"Amazon", "Flipkart", "Reliance Digital", "Croma"};
        sandiskPenDrive.vendors = sandiskVendors;

        PenDrive hpPenDrive = new PenDrive();

        hpPenDrive.brand = "HP";
        hpPenDrive.storage = 32;
        hpPenDrive.price = 499;
        hpPenDrive.type = "USB 2.0";
        hpPenDrive.working = true;

        String[] hpColors = {"Silver", "Black"};
        hpPenDrive.colors = hpColors;

        String[] hpDevices = {"Laptop", "Desktop Computer", "Smart TV"};
        hpPenDrive.compatibleDevices = hpDevices;

        String[] hpVendors = {"Amazon", "Flipkart", "Reliance Digital"};
        hpPenDrive.vendors = hpVendors;

        PenDrive sonyPenDrive = new PenDrive();

        sonyPenDrive.brand = "Sony";
        sonyPenDrive.storage = 128;
        sonyPenDrive.price = 999;
        sonyPenDrive.type = "USB 3.1";
        sonyPenDrive.working = true;

        String[] sonyColors = {"Black", "Grey"};
        sonyPenDrive.colors = sonyColors;

        String[] sonyDevices = {"Laptop", "Desktop Computer", "Smart TV", "Gaming Console"};
        sonyPenDrive.compatibleDevices = sonyDevices;

        String[] sonyVendors = {"Amazon", "Croma", "Reliance Digital"};
        sonyPenDrive.vendors = sonyVendors;

        PenDrive kingstonPenDrive = new PenDrive();

        kingstonPenDrive.brand = "Kingston";
        kingstonPenDrive.storage = 256;
        kingstonPenDrive.price = 1599;
        kingstonPenDrive.type = "USB 3.2";
        kingstonPenDrive.working = true;

        String[] kingstonColors = {"Black", "Red"};
        kingstonPenDrive.colors = kingstonColors;

        String[] kingstonDevices = {"Laptop", "Desktop Computer", "Smart TV", "Car Audio System"};
        kingstonPenDrive.compatibleDevices = kingstonDevices;

        String[] kingstonVendors = {"Amazon", "Flipkart", "Croma", "Reliance Digital"};
        kingstonPenDrive.vendors = kingstonVendors;


        System.out.println("\nThe brand of the pen drive is " + sandiskPenDrive.brand);
        System.out.println("The storage capacity of the pen drive is " + sandiskPenDrive.storage + " GB");
        System.out.println("The price of the pen drive is " + sandiskPenDrive.price);
        System.out.println("The available colors are:");
        for(String color : sandiskPenDrive.colors){
            System.out.println(color);
        }
        System.out.println("The pen drive is compatible with the following devices:");
        for(String device : sandiskPenDrive.compatibleDevices){
            System.out.println(device);
        }
        System.out.println("The pen drive is sold by the following vendors:");
        for(String vendor : sandiskPenDrive.vendors){
            System.out.println(vendor);
        }


        System.out.println("\nThe brand of the pen drive is " + hpPenDrive.brand);
        System.out.println("The storage capacity of the pen drive is " + hpPenDrive.storage + " GB");
        System.out.println("The price of the pen drive is " + hpPenDrive.price);
        System.out.println("The available colors are:");
        for(String color : hpPenDrive.colors){
            System.out.println(color);
        }
        System.out.println("The pen drive is compatible with the following devices:");
        for(String device : hpPenDrive.compatibleDevices){
            System.out.println(device);
        }
        System.out.println("The pen drive is sold by the following vendors:");
        for(String vendor : hpPenDrive.vendors){
            System.out.println(vendor);
        }


        System.out.println("\nThe brand of the pen drive is " + sonyPenDrive.brand);
        System.out.println("The storage capacity of the pen drive is " + sonyPenDrive.storage + " GB");
        System.out.println("The price of the pen drive is " + sonyPenDrive.price);
        System.out.println("The available colors are:");
        for(String color : sonyPenDrive.colors){
            System.out.println(color);
        }
        System.out.println("The pen drive is compatible with the following devices:");
        for(String device : sonyPenDrive.compatibleDevices){
            System.out.println(device);
        }
        System.out.println("The pen drive is sold by the following vendors:");
        for(String vendor : sonyPenDrive.vendors){
            System.out.println(vendor);
        }


        System.out.println("\nThe brand of the pen drive is " + kingstonPenDrive.brand);
        System.out.println("The storage capacity of the pen drive is " + kingstonPenDrive.storage + " GB");
        System.out.println("The price of the pen drive is " + kingstonPenDrive.price);
        System.out.println("The available colors are:");
        for(String color : kingstonPenDrive.colors){
            System.out.println(color);
        }
        System.out.println("The pen drive is compatible with the following devices:");
        for(String device : kingstonPenDrive.compatibleDevices){
            System.out.println(device);
        }
        System.out.println("The pen drive is sold by the following vendors:");
        for(String vendor : kingstonPenDrive.vendors){
            System.out.println(vendor);
        }

    }
}