package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

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