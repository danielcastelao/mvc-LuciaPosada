
package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

public class Controller {

    public static void main(String[] args){

        ObserverVelocidad obVelocidad = new ObserverVelocidad();
        Model.addObserver(obVelocidad);

        Model.crearCoche("3546-DFS","Seat");
        Model.crearCoche("9775-LYD","Mini");

        Model.cambiarVelocidad("3546-DFS",33);
        Model.cambiarVelocidad("9775-LYD",28);

    }
}