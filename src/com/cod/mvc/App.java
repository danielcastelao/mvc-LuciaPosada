package com.cod.mvc;

import com.cod.mvc.controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller miController = new Controller();

        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");

        miController.cambiarVelocidad("SBC 1234", 30);
        miController.cambiarVelocidad("HYU 4567", 150);
    }
}
