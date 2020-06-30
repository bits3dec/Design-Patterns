package subject;

import observer.Observer;

/**
 * @author preetombhowmik
 */
public interface Subject {
    void register(Observer observer);
    void deRegister(Observer observer);
    void notifyUsers();
}
