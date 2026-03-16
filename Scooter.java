class Scooter{

    int price;
    int weight;
    int speed;
    int modelNo;
    int year;
    int stock;
    int code;
    int warranty;
    int fuelCapacity;
    int mileage;
    int seats;
    int engineCC;

    Scooter(){
        System.out.println("Default Constructor Called");
    }

    Scooter(int price,int weight,int speed,int modelNo,int year,int stock,
            int code,int warranty,int fuelCapacity,int mileage,int seats,int engineCC){

        this.price=price;
        this.weight=weight;
        this.speed=speed;
        this.modelNo=modelNo;
        this.year=year;
        this.stock=stock;
        this.code=code;
        this.warranty=warranty;
        this.fuelCapacity=fuelCapacity;
        this.mileage=mileage;
        this.seats=seats;
        this.engineCC=engineCC;
    }
}