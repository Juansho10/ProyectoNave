import lombok.Data;

@Data
abstract public class NaveEspacial {

    private String id;
    private String nombre;
    private String tipo;
    private String uso;

    abstract public void despegar();
    abstract public void orbitar();
    abstract public void aterrizar();








}
