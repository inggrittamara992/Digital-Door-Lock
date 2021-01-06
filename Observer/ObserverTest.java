import java.util.Scanner;

public class ObserverTest {

    public static void main(String[] args) {
        Akun notify = new Akun();
        Scanner sc = new Scanner(System.in);
        CurrentStatusDisplay currentStatus = new CurrentStatusDisplay(notify);
        PinPintu pinPintuDisplay = new PinPintu(notify);        

        for(int i = 1; i > 0 ;i++){
            System.out.print("Masukkan pin: ");
            int pin = sc.nextInt();            
            notify.setMeasurements(pin); 
            if(pin == pinPintuDisplay.getPin()){
                break;
            }
            System.out.print("Masukkan lagi(y/n): ");
            sc.nextLine();
            String option = sc.nextLine();            
            if(option.equals("y")){
                continue;
            }            
            else {
                break;
            }
        }            

        currentStatus.display();
    }
}
