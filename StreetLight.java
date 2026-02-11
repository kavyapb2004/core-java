class StreetLight {
    static boolean isOn;

    static boolean switchLight() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Street Light is ON");
        } else {
            isOn = false;
            System.out.println("Street Light is OFF");
        }
        return isOn;
    }
}
