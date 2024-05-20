
package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

public class Controller {

    public Controller() {

        ObserverVelocidad ObVelocida = new ObserverVelocidad();
        Model.addObserver(ObVelocida);

        ObserverLimite ObLimite = new ObserverLimite();
        Model.addObserver(ObLimite);

    }
}