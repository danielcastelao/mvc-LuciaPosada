package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

public interface Observable {

    static void addObserver(Observer arg) {}

    static void removeObserver(Observer arg) {}

    static void notifyObservers(Coche arg) {}
}
