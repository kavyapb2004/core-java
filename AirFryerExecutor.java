class AirFryerExecutor {
    public static void main(String[] args){
        System.out.println("Brand: " + AirFryer.getBrand());
        System.out.println("Capacity: " + AirFryer.getCapacity() + " Litres");
        System.out.println("Timer Available: " + AirFryer.hasTimer());
        System.out.println("Price: ₹" + AirFryer.getPrice());
    }
}
