class DroneCameraExecutor {
    public static void main(String[] args){

        System.out.println("Brand: " + DroneCamera.getBrand());
        System.out.println("Model: " + DroneCamera.getModel());
        System.out.println("Flight Time: " + DroneCamera.getFlightTime() + " minutes");
        System.out.println("Camera Quality: " + DroneCamera.getCameraQuality());
        System.out.println("GPS Available: " + DroneCamera.hasGPS());
        System.out.println("Price: ₹" + DroneCamera.getPrice());
    }
}
