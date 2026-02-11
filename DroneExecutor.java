class DroneExecutor {
    public static void main(String[] args) {

        boolean ref = Drone.takeOffOrLand();  
        System.out.println("Drone is flying " + ref);
    }
}
