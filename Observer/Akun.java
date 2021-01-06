import java.util.*;

public class Akun implements Subject {
    private ArrayList<Observer> observers;
    private int pin;
    private String alarm;

    public Akun() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(pin);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int pin) {
        this.pin = pin;
        this.alarm = alarm;
        measurementsChanged();
    }

    public int getPin() {
        return pin;
    }

    public String getAlarm() {
        return alarm;
    }

}
