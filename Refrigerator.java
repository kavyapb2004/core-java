class Refrigerator {
    static boolean isCooling;

    static boolean startOrStopCooling() {
        if (isCooling == false) {
            isCooling = true;
            System.out.println("Refrigerator started cooling");
        } else {
            isCooling = false;
            System.out.println("Refrigerator stopped cooling");
        }
        return isCooling;
    }
}
