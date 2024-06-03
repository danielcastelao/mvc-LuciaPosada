package cod.mvc.view;

import cod.mvc.model.Model;

public class View {
    /**
     * Muestra la velocidad actual del coche cuya matricula se le haya proporcionado
     * @param matricula identificador unico del coche
     * @param velocidad variable que se quiere mostrar
     */
    public static void muestraVelocidad(String matricula,int velocidad){
        System.out.println("La velocidad del coche con matricula "+matricula+", es "+ velocidad+" Km/h");
    }
}