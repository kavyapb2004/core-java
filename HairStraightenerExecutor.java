class HairStraightenerExecutor {
    public static void main(String[] args){

        System.out.println("Website: " + HairStraightener.getWebsite());
        System.out.println("Brand: " + HairStraightener.getBrand());
        System.out.println("Max Temperature: " + HairStraightener.getMaxTemperature() + "°C");
        System.out.println("Price: ₹" + HairStraightener.getPrice());
        System.out.println("Rating: " + HairStraightener.getRating());
        System.out.println("Warranty: " + HairStraightener.getWarranty() + " Years");
        System.out.println("Discount: " + HairStraightener.getDiscount() + "%");
        System.out.println("In Stock: " + HairStraightener.isInStock());
        System.out.println("Delivery Date: " + HairStraightener.getDeliveryDate());
        System.out.println("Replacement Available: " + HairStraightener.isReplacementAvailable());
    }
}