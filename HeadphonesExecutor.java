class HeadphonesExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + Headphones.getBrand());
        System.out.println("Type: " + Headphones.getType());
        System.out.println("Battery Life: " + Headphones.getBatteryLife() + " hours");
        System.out.println("Noise Cancellation: " + Headphones.hasNoiseCancellation());
        System.out.println("Bluetooth Version: " + Headphones.getBluetoothVersion());
        System.out.println("Price: ₹" + Headphones.getPrice());
    }
}
