package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

public class ObserverLimite implements Observer{

    /**
     * Velocidad a reducir en caso de sobrepasar el limite
     */
    public final static int REDUCCION_VELOCIDAD = 10;

    /**
     * Velocidad maxima
     */
    public final static int VELOCIDAD_LIMITE = 120;

    /**
     * Comprueba si el coche cuya velocidad se a actualizado supera el limite de velocidad y, de ser el caso, reduce la velocidad en 10
     * @param coche el objeto tipo coche que se a actualizado
     */
    @Override
    public void update(Coche coche) {
        if(coche.velocidad>VELOCIDAD_LIMITE){
            Model miModel = Model.getInstance();
            miModel.cambiarVelocidad(coche.matricula,coche.velocidad-REDUCCION_VELOCIDAD);
            System.out.println("Limite de velocidad sobrepasado, reduciendo velocidad. Ahora el coche va a "+coche.velocidad);
        }
    }
}
