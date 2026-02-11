class SmartWatch {
    static boolean isActive;

    static boolean powerToggle() {
        if (isActive == false) {
            isActive = true;
            System.out.println("SmartWatch is Powered ON");
        } else {
            isActive = false;
            System.out.println("SmartWatch is Powered OFF");
        }
        return isActive;
    }
}
