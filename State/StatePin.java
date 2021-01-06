import java.util.Random;

public class StatePin implements State {    
    DigitalDoorLock digitalDoorLock;
    int pin = 1234;

    public StatePin(DigitalDoorLock digitalDoorLock) {
        this.digitalDoorLock = digitalDoorLock;
    }

    public void insertPin(int pin) {                
        digitalDoorLock.checkPin(pin);
    }

    public void checkPin(int pin) {   
        if(this.pin == pin) {
            digitalDoorLock.setState(digitalDoorLock.getStatePintuDibuka());
        }        
        else {
            digitalDoorLock.setState(digitalDoorLock.getStatePintuTerKunci());
            digitalDoorLock.alarm();
        }
    }

    public void alarm() {
        System.out.println("Alarm mati");
    }   

    public String toString() {
        return "pin sudah dimasukkan";
    }
}
