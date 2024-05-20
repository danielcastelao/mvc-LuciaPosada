package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;

public class ObserverLimite implements Observer{

    public final static int VELOCIDAD_LIMITE = 100;

    @Override
    public void update(Coche coche) {
        if(coche.velocidad>VELOCIDAD_LIMITE){
            System.out.println("Limite de velocidad sobrepasado");
        }
    }
}
