public class StatePintuDibuka implements State {
    DigitalDoorLock digitalDoorLock;

    public StatePintuDibuka(DigitalDoorLock digitalDoorLock) {
        this.digitalDoorLock = digitalDoorLock;
    }

    public void insertPin(int pin) {
        System.out.println("Pintu Terbuka");
    }

    public void checkPin(int pin) {
        System.out.println("Pin benar");
    }

    public void alarm() {
        System.out.println("Alarm mati");
    }
    
    public String toString() {
        return "Pintu Terbuka";
    }
}
