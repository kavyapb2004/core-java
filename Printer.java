class Printer {
    static boolean isPrinting;

    static boolean printOrStop() {
        if (isPrinting == false) {
            isPrinting = true;
            System.out.println("Printer started printing");
        } else {
            isPrinting = false;
            System.out.println("Printer stopped printing");
        }
        return isPrinting;
    }
}
