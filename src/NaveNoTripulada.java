import lombok.Data;

/**
 * @author Juan Pablo Ayala
 * Subclase de la clase principal.
 * Se definen atributos de la subclase, metodos de clase y se implementan metodos de la clase padre.
 */

@Data
public class NaveNoTripulada extends NaveEspacial {
    private String tipoCelda;
    private String planetasEstudiar;

    public void inspeccionar () {
        System.out.println("La nave esta inspeccionando");
    }

    @Override
    public void despegar() {
        System.out.println("La nave ha despegado");

    }

    @Override
    public void orbitar() {
        System.out.println("La nave esta orbitando");

    }

    @Override
    public void aterrizar () {
        System.out.println("La nave acaba de aterrizar");

    }
}