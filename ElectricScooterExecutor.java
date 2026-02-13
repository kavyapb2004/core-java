class ElectricScooterExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + ElectricScooter.getBrand());
        System.out.println("Model: " + ElectricScooter.getModel());
        System.out.println("Range: " + ElectricScooter.getRange() + " km");
        System.out.println("Top Speed: " + ElectricScooter.getTopSpeed() + " km/h");
        System.out.println("Fast Charging: " + ElectricScooter.hasFastCharging());
        System.out.println("Price: ₹" + ElectricScooter.getPrice());
    }
}