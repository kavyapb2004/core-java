class WaterPurifierExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + WaterPurifier.getBrand());
        System.out.println("Purification Type: " + WaterPurifier.getPurificationType());
        System.out.println("Storage Capacity: " + WaterPurifier.getCapacity() + " Litres");
        System.out.println("Mineral Enhancer: " + WaterPurifier.hasMineralEnhancer());
        System.out.println("Price: ₹" + WaterPurifier.getPrice());
    }
}
