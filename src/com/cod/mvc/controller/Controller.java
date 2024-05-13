
package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

public class Controller {
    static Model modelo;

    public static void main(String[] args){
        modelo = new Model();

        ObserverVelocidad obVelocidad = new ObserverVelocidad();
        modelo.addObserver(obVelocidad);

        modelo.crearCoche("3546-DFS","Seat");
        modelo.crearCoche("9775-LYD","Mini");

        modelo.cambiarVelocidad("3546-DFS",36);
        modelo.cambiarVelocidad("9775-LYD",28);

    }
}