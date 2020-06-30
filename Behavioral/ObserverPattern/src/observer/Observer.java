package observer;

import subject.Subject;

/**
 * @author preetombhowmik
 */
public interface Observer {
    void update(Subject publisher);
}
