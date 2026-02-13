class VacuumCleanerExecutor {
    public static void main(String[] args){
        System.out.println("Brand: " + VacuumCleaner.getBrand());
        System.out.println("Power: " + VacuumCleaner.getPower() + " Watts");
        System.out.println("Bagless: " + VacuumCleaner.isBagless());
        System.out.println("Price: ₹" + VacuumCleaner.getPrice());
    }
}
