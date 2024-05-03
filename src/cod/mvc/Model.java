
package cod.mvc;

import java.util.ArrayList;

public class Model {

    private static ArrayList<Coche> parking;

    public static Coche crearCoche(String matricula,String modelo,Integer velocidad){
        Coche cocheNuevo = new Coche(matricula,modelo,velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }
}
