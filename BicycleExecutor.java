class BicycleExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + Bicycle.getBrand());
        System.out.println("Type: " + Bicycle.getType());
        System.out.println("Gear Count: " + Bicycle.getGearCount());
        System.out.println("Disc Brakes: " + Bicycle.hasDiscBrakes());
        System.out.println("Price: ₹" + Bicycle.getPrice());
    }
}
