class Drone {
    static boolean isFlying;

    static boolean takeOffOrLand() {
        if (isFlying == false) {
            isFlying = true;
            System.out.println("Drone has taken off");
        } else {
            isFlying = false;
            System.out.println("Drone has landed");
        }
        return isFlying;
    }
}
