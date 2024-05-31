package com.cod.mvc.view;

import com.cod.mvc.model.Model;

public class View {
    /**
     * Muestra la velocidad actual del coche cuya matricula se le haya proporcionado
     * @param matricula identificador unico del coche
     * @param velocidad variable que se quiere mostrar
     */
    public static void muestraVelocidad(String matricula,int velocidad){
        System.out.println("La velocidad del coche con matricula "+matricula+", es "+ velocidad+" Km/h");
    }

    /**
     * Moestra los datos del coche cuya matricula se le haya proporcionado
     * @param matricula variable que se quiere mostrar
     * @param model variable que se quiere mostrar
     * @param velocidad variable que se quiere mostrar
     */
    public static void muestraDatosCoche(String matricula,String model,int velocidad){
        System.out.println("Datos Coche:\nMatricula: "+matricula+"\nModelo: "+model+"\nVelocidad: "+velocidad);
    }
}
