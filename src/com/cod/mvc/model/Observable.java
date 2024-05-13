package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

public interface Observable {

    void addObserver(Observer arg);

    void removeObserver(Observer arg);

    void notifyObservers(Coche arg);
}
