import java.util.*;

public class Cellphone implements Subject {
    private ArrayList observers;
    private float version;

    public Cellphone() {
        observers = new ArrayList();
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
            observer.update(version);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float version) {
        this.version = version;
        measurementsChanged();
    }

    public float getVersion() {
        return version;
    }

}
