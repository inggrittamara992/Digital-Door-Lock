public class DigitalDoorLock {

    State statePintuTerkunci;
    State statePin;
    State statePintuDibuka;
    State statePintuTertutup;    

    State state;    

    public DigitalDoorLock() {
        statePintuDibuka = new StatePintuDibuka(this);
        statePintuTerkunci = new StatePintuTerkunci(this);
        statePin = new StatePin(this);
        statePintuTertutup = new StatePintuTertutup(this);
        
        state = statePintuTerkunci;        
    }

    public void insertPin(int pin) {
        state.insertPin(pin);
    }

    public void checkPin(int pin) {
        state.checkPin(pin);
    }

    public void alarm() {
        state.alarm();
    }    

    void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getStatePin() {
        return statePin;
    }

    public State getStatePintuDibuka() {
        return statePintuDibuka;
    }

    public State getStatePintuTertutup() {
        return statePintuTertutup;
    }

    public State getStatePintuTerKunci() {
        return statePintuTerkunci;
    }
    

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nDigital Door Lock");        
        
        result.append("\n"+ state + "\n");
        return result.toString();
    }
}
