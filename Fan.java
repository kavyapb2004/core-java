class Fan {
    Capacitor capacitor;

    Fan(Capacitor capacitor) {
		System.out.println("constructor invoked");
        this.capacitor = capacitor;
    }

    public boolean createCapacitor(Capacitor capacitor) {
        boolean isCapacitorCreated = false;

        System.out.println("Inside createCapacitor method");

        this.capacitor = capacitor;
        System.out.println(this.capacitor);

        isCapacitorCreated = true;
        return isCapacitorCreated;
    }

    public void getCapacitorDetails() {
        
            System.out.println("Capacitor Id: " + this.capacitor.capacitorId);
            System.out.println("Brand: " + this.capacitor.brand);
            System.out.println("Capacitance: " + this.capacitor.capacitance);
            System.out.println("Material: " + this.capacitor.material);
        
    }
}