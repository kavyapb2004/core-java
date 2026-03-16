class Laptop {

    int ram;
    int storage;
    int price;
    int weight;
    int battery;
    int warranty;
    int screenSize;
    int ports;
    int cores;
    int speed;
    int year;
    int modelNo;

   
    Laptop() {
        System.out.println("Default Constructor Called");
    }

   
    Laptop(int ram, int storage, int price, int weight, int battery, int warranty,
           int screenSize, int ports, int cores, int speed, int year, int modelNo) {

        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.weight = weight;
        this.battery = battery;
        this.warranty = warranty;
        this.screenSize = screenSize;
        this.ports = ports;
        this.cores = cores;
        this.speed = speed;
        this.year = year;
        this.modelNo = modelNo;
    }
}