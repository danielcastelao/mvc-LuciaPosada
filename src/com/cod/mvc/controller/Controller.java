
package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

public class Controller {

    private final Model miModel = new Model();

    public Controller(Model miModel) {

        ObserverVelocidad ObVelocida = new ObserverVelocidad();
        miModel.addObserver(ObVelocida);

        ObserverLimite ObLimite = new ObserverLimite();
        miModel.addObserver(ObLimite);

    }

    public void crearCoche(String nombre, String matricula){
        miModel.crearCoche(matricula,nombre);
    }

}