class HospitalVentilator {
    static boolean isOperating;

    static boolean operateOrStop() {
        if (isOperating == false) {
            isOperating = true;
            System.out.println("Ventilator started operating");
        } else {
            isOperating = false;
            System.out.println("Ventilator stopped");
        }
        return isOperating;
    }
}
