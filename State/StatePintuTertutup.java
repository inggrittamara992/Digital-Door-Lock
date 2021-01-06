public class StatePintuTertutup implements State {

    DigitalDoorLock digitalDoorLock;

    public StatePintuTertutup(DigitalDoorLock digitalDoorLock) {
        this.digitalDoorLock = digitalDoorLock;
    }

    public void insertPin(int pin) {
        System.out.println("Pin");
    }

    public void checkPin(int pin) {
        System.out.println("check");
    }

    public void alarm() {
        System.out.println("Alarm mati");
    }

    public String toString() {
        return "Pintu Tertutup";
    }
}
