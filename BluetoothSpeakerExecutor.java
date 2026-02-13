class BluetoothSpeakerExecutor {
    public static void main(String[] args){
        System.out.println("Brand: " + BluetoothSpeaker.getBrand());
        System.out.println("Battery Life: " + BluetoothSpeaker.getBatteryLife() + " hours");
        System.out.println("Waterproof: " + BluetoothSpeaker.isWaterproof());
        System.out.println("Price: ₹" + BluetoothSpeaker.getPrice());
    }
}

