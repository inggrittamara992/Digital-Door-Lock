public class PinPintu implements Observer, DisplayNotify {
    private int pin = 1234;
    private int userpin;
    private int fail = 0;
    private Akun notify;

    public PinPintu(Akun notify) {
        this.notify = notify;
        notify.registerObserver(this);
    }

    public int getPin() {
        return this.pin;
    }

    public void update(int pin) {  
        this.userpin = pin;      
        display();
    }

    public void display() {                
        if (userpin == pin) {
            System.out.println("Pin benar");
        } else {            
            System.out.println("Pin Salah, Alarm Bunyi");
            fail += 1;
            if(fail >= 3) {
                System.out.println("Mohon tunggu selama 30 detik");
            }
        }
    }
}
