class FanRunnerMethod {
    public static void main(String[] args) {

        Capacitor capacitor = new Capacitor();
        Fan fan = new Fan(capacitor);

        fan.createCapacitor(capacitor);
        System.out.println("create capacitor invoked");

        capacitor.capacitorId = 101;
        capacitor.brand = "Crompton";
        capacitor.capacitance = 2.5;
        capacitor.material = "Polypropylene";

        fan.getCapacitorDetails();
    }
}