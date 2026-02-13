class FaceSerumExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + FaceSerum.getBrand());
        System.out.println("Main Ingredient: " + FaceSerum.getMainIngredient());
        System.out.println("Quantity: " + FaceSerum.getQuantity() + " ml");
        System.out.println("Dermatologically Tested: " + FaceSerum.isDermatologicallyTested());
        System.out.println("Price: ₹" + FaceSerum.getPrice());
    }
}
