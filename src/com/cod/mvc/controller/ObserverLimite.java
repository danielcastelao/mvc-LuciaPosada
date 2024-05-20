package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;

public class ObserverLimite implements Observer{

    @Override
    public void update(Coche coche) {
        if(coche.velocidad>100){
            System.out.println("Limite de velocidad sobrepasado");
        }
    }
}
