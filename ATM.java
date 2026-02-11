class ATM {
    static boolean isActive;

    static boolean activateOrDeactivate() {
        if (isActive == false) {
            isActive = true;
            System.out.println("ATM Machine Activated");
        } else {
            isActive = false;
            System.out.println("ATM Machine Deactivated");
        }
        return isActive;
    }
}
