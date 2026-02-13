class MakeupKitExecutor {
    public static void main(String[] args){

        System.out.println("Website: " + MakeupKit.getWebsite());
        System.out.println("Brand: " + MakeupKit.getBrand());
        System.out.println("Items Count: " + MakeupKit.getItemsCount());
        System.out.println("Price: ₹" + MakeupKit.getPrice());
        System.out.println("Rating: " + MakeupKit.getRating());
        System.out.println("Reviews: " + MakeupKit.getReviews());
        System.out.println("Gift Pack: " + MakeupKit.isGiftPack());
        System.out.println("Discount: " + MakeupKit.getDiscount() + "%");
        System.out.println("In Stock: " + MakeupKit.isInStock());
        System.out.println("Replacement Available: " + MakeupKit.isReplacementAvailable());
    }
}
