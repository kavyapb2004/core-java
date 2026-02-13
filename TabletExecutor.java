class TabletExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + Tablet.getBrand());
        System.out.println("Model: " + Tablet.getModel());
        System.out.println("Storage: " + Tablet.getStorage());
        System.out.println("Screen Size: " + Tablet.getScreenSize() + " inches");
        System.out.println("Supports Apple Pencil: " + Tablet.supportsPencil());
        System.out.println("Price: ₹" + Tablet.getPrice());
    }
}
