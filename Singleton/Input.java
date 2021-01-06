import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    private int pin = 1234;
    private static Input uniqueInstance;

    private Input() {}

    public static Input getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Input();
        }
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.print("Masukkan Pin: ");
        int pin = sc.nextInt();
        System.out.println("1. Ubah Pin");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = sc.nextInt();
        if(pilihan == 1) {
            System.out.print("Masukkan Pin baru: ");
            int newPin = sc.nextInt();
            changePin(newPin);
        }
    }

    public void changePin(int pinbaru) {
        this.pin = pinbaru;
        System.out.println("Pin berhasil diubah menjadi " + pin);
    }

}
