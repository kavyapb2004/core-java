class AirConditionerExecutor {

    public static void main(String[] args) {

        System.out.println("Brand: " + AirConditioner.getBrand());
        System.out.println("Capacity: " + AirConditioner.getCapacity());
        System.out.println("Energy Rating: " + AirConditioner.getEnergyRating());
        System.out.println("Inverter Technology: " + AirConditioner.hasInverterTechnology());
        System.out.println("Cooling Type: " + AirConditioner.getCoolingType());
        System.out.println("Price: " + AirConditioner.getPrice());
    }
}