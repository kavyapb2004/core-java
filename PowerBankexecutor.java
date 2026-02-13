class PowerBankExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + PowerBank.getBrand());
        System.out.println("Capacity: " + PowerBank.getCapacity() + " mAh");
        System.out.println("Output Ports: " + PowerBank.getOutputPorts());
        System.out.println("Fast Charging: " + PowerBank.supportsFastCharging());
        System.out.println("Price: ₹" + PowerBank.getPrice());
    }
}
