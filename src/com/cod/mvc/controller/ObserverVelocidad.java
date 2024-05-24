package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

public class ObserverVelocidad implements Observer{
    /**
     * Notifica a la clase view cuando se realiza un cambio de velocidad de un coche
     * @param coche el objeto tipo coche que se a actualizado
     */
    @Override
    public void update(Coche coche,Model miModel) {
        View.muestraVelocidad(coche.matricula,coche.velocidad);
    }
}
