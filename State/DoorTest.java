import java.util.Scanner;
public class DoorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DigitalDoorLock digitalDoorLock = new DigitalDoorLock();

        System.out.println(digitalDoorLock);
        System.out.print("masukkan Pin: ");
        int userpin = sc.nextInt();


        digitalDoorLock.insertPin(userpin); 

        System.out.println(digitalDoorLock);
    }
}
