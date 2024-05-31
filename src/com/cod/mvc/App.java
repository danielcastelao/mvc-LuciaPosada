package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

public class App {
    public static void main(String[] args) {
        Model miModel = Model.getInstance();

        Controller miController = new Controller(miModel);

        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");
        miController.crearCoche("Seat", "CDY 5866");

        miController.cambiarVelocidad("SBC 1234", 30);
        miController.cambiarVelocidad("HYU 4567", 150);

        miController.buscarCoche("SBC 1234");

    }
}
