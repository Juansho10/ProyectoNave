import lombok.Data;

/**
 * @author Juan Pablo Ayala
 * Subclase de la clase principal.
 * Se definen atributos de la subclase, metodos de clase y se implementan metodos de la clase padre.
 */
@Data
public class NaveLanzadera extends NaveEspacial {
    private String tipoCombustible;
    private String recorridoMaximo;
    private String paisOrigen;

    public void soltarCarga () {
        System.out.println("La nave acaba de soltar la carga");
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
