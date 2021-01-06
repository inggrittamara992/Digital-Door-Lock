public class StatePintuTerkunci implements State {
    DigitalDoorLock digitalDoorLock;

    public StatePintuTerkunci(DigitalDoorLock digitalDoorLock) {
        this.digitalDoorLock = digitalDoorLock;
    }

    public void insertPin(int pin) {        
        digitalDoorLock.setState(digitalDoorLock.getStatePin());
        digitalDoorLock.insertPin(pin);
    }

    public void checkPin(int pin) {
        System.out.println("Pin belum dimasukkan");
    }

    public void alarm() {
        System.out.println("Alarm Bunyi");
    }    

    public String toString() {
        return "Pintu Terkunci";
    }
}
