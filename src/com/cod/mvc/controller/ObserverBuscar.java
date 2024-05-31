package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

public class ObserverBuscar implements Observer{

    @Override
    public void update(Coche coche, Model modelo) {
        View.muestraDatosCoche(coche.matricula,coche.modelo,coche.velocidad);
    }
}
