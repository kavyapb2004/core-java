class DigitalCameraExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + DigitalCamera.getBrand());
        System.out.println("Model: " + DigitalCamera.getModel());
        System.out.println("Megapixels: " + DigitalCamera.getMegaPixels());
        System.out.println("Lens Type: " + DigitalCamera.getLensType());
        System.out.println("WiFi Available: " + DigitalCamera.hasWiFi());
        System.out.println("Price: ₹" + DigitalCamera.getPrice());
    }
}