import lombok.Data;

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
