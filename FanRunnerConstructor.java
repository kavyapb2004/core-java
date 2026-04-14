class FanRunnerConstructor {
    public static void main(String[] args) {

        Capacitor capacitor = new Capacitor();
		
		Fan fan = new Fan(capacitor);
		
        capacitor.capacitorId = 103;
        capacitor.brand = "Usha";
        capacitor.capacitance = 2.25;
        capacitor.material = "Polypropylene";

		fan.getCapacitorDetails();
    }
}