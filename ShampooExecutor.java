class ShampooExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + Shampoo.getBrand());
        System.out.println("Hair Type: " + Shampoo.getHairType());
        System.out.println("Quantity: " + Shampoo.getQuantity() + " ml");
        System.out.println("Sulfate Free: " + Shampoo.isSulfateFree());
        System.out.println("Price: ₹" + Shampoo.getPrice());
    }
}
