
import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelTest {

    @Test
    public void comprobacionCrearCoche() {
        Coche coche = Model.crearCoche("43656C35FD","Seat",0);
        Assertions.assertEquals("43656C35FD",coche.matricula);
        Assertions.assertEquals("Seat",coche.modelo);
        Assertions.assertEquals(0,coche.velocidad);
    }
}
