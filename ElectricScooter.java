class ElectricScooter {
    static boolean isRunning;

    static boolean startOrStop() {
        if (isRunning == false) {
            isRunning = true;
            System.out.println("Electric Scooter started");
        } else {
            isRunning = false;
            System.out.println("Electric Scooter stopped");
        }
        return isRunning;
    }
}
