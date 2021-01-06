public class CurrentStatusDisplay implements Observer, DisplayNotify {    
    private int pin;
    private Subject notify;

    public CurrentStatusDisplay(Subject notify) {
        this.notify = notify;
        notify.registerObserver(this);
    }

    public void update(int pin) {
        this.pin = pin;        
        display();
    }

    public void display() {
        System.out.println("Alarm saat ini Mati");
    }
}