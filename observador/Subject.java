package observador;

import java.security.PublicKey;

public interface Subject {
    public void registerObserver(observador.Observer o);
    public void removeObserver(observador.Observer o);
    public void notifyObservers();
}

