package cod.mvc;

public class View {

    public static void muestraVelocidad(String matricula,int velocidad){
        System.out.println("La velocidad de coche con matricula "+matricula+", es "+Model.getVelocidad(matricula));
    }
}
