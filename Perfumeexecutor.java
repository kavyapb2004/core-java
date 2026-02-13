class PerfumeExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + Perfume.getBrand());
        System.out.println("Fragrance Type: " + Perfume.getFragranceType());
        System.out.println("Quantity: " + Perfume.getQuantity() + " ml");
        System.out.println("Long Lasting: " + Perfume.isLongLasting());
        System.out.println("Price: ₹" + Perfume.getPrice());
    }
}
