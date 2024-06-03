
import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelTest {

    @Test
    public void comprobacionCrearCoche() {
        Model miModel = new Model();
        Coche coche = miModel.crearCoche("43656C35FD","Seat");
        Assertions.assertSame(coche,miModel.getCoche("43656C35FD"));
    }

    @Test
    public void comprobacionGetCoche(){
        Model miModel = new Model();
        Coche coche = miModel.crearCoche("43656C35FC","Seat");
        Assertions.assertSame(coche,miModel.getCoche("43656C35FC"));
    }

    @Test
    public void comprobacionSubirVelocidad(){
        Model miModel = new Model();
        Coche coche = miModel.crearCoche("43656C35FW","Seat");
        Assertions.assertEquals(24,miModel.subirVelocidad("43656C35FE",24));
    }

    @Test
    public void comprobacionBajarVelocidad(){
        Model miModel = new Model();
        Coche coche = miModel.crearCoche("43656C35FW","Seat");
        miModel.subirVelocidad("43656C35FW", 100); // Los coche se crean a 0 v, asi que hay que subirles la velocidad primero
        Assertions.assertEquals(60,miModel.bajarVelocidad("43656C35FX",40));
    }

    @Test
    public void getVelocidad(){
        Model miModel = new Model();
        Coche coche = miModel.crearCoche("43656C35FR","Seat");
        Assertions.assertEquals(0,miModel.getVelocidad("43656C35FR"));
    }
}