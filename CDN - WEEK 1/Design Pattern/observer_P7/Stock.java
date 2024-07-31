package observer_P7;

import java.util.List;

@SuppressWarnings("unused")
public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}

