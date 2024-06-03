package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Model;

public class App {
    public static void main(String[] args) {
        Model miModel = new Model();

        Controller miController = new Controller(miModel);

        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");
        miController.crearCoche("Mini", "ITC 9937");

        // Comprobacion subida
        miController.subirVelocidad("ITC 9937", 70);
        miController.subirVelocidad("SBC 1234", 30);

        // Comprobacion bajada
        miController.bajarVelocidad("ITC 9937", 50);

        // Comporbacion sobrepaso del limite
        miController.subirVelocidad("HYU 4567", 150);

    }
}