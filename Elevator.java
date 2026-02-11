class Elevator {
    static boolean isMoving;

    static boolean moveOrStop() {
        if (isMoving == false) {
            isMoving = true;
            System.out.println("Elevator is moving");
        } else {
            isMoving = false;
            System.out.println("Elevator stopped");
        }
        return isMoving;
    }
}
