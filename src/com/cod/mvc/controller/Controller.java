
package cod.mvc.controller;

import cod.mvc.model.Model;

public class Controller {

    private final Model miModel = new Model();

    public Controller(Model miModel) {

        ObserverVelocidad ObVelocida = new ObserverVelocidad();
        miModel.addObserver(ObVelocida);

        ObserverLimite ObLimite = new ObserverLimite();
        miModel.addObserver(ObLimite);

    }

    /**
     * Crea un coche
     * @param modelo del coche
     * @param matricula por la que buscar el coche
     */
    public void crearCoche(String modelo, String matricula){
        miModel.crearCoche(matricula,modelo);
    }

    /**
     * Aumenta la velocidad de un coche
     * @param matricula por la que buscar el coche
     * @param velocidad nueva
     */
    public void subirVelocidad(String matricula, Integer v){
        miModel.subirVelocidad(matricula, v);
    }

    /**
     * Disminuye la velocidad de un coche
     * @param matricula por la que buscar el coche
     * @param velocidad nueva
     */
    public void bajarVelocidad(String matricula, Integer v){
        miModel.bajarVelocidad(matricula, v);
    }
}