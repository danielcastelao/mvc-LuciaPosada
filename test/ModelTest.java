
import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelTest {

    @Test
    public void comprobacionCrearCoche() {
        Coche coche = Model.crearCoche("43656C35FD","Seat",0);
        Assertions.assertSame(coche,Model.getCoche("43656C35FD"));
    }

    @Test
    public void comprobacionGetCoche(){
        Coche coche = Model.crearCoche("43656C35FC","Seat",0);
        Assertions.assertSame(coche,Model.getCoche("43656C35FC"));
    }

    @Test
    public void comprobacionCambiarVelocidad(){
        Model model = new Model();
        Coche coche = Model.crearCoche("43656C35FE","Seat",0);
        Assertions.assertEquals(24,model.cambiarVelocidad("43656C35FE",24));
    }

    @Test
    public void getVelocidad(){
        Coche coche = Model.crearCoche("43656C35FR","Seat",45);
        Assertions.assertEquals(45,Model.getVelocidad("43656C35FR"));
    }
}
