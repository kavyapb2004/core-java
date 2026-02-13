class FaceMaskExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + FaceMask.getBrand());
        System.out.println("Type: " + FaceMask.getType());
        System.out.println("Quantity: " + FaceMask.getQuantity() + " g");
        System.out.println("Paraben Free: " + FaceMask.isParabenFree());
        System.out.println("Price: ₹" + FaceMask.getPrice());
    }
}