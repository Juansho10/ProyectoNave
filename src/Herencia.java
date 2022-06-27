public class Herencia {
    public static void main(String[] args) {
        NaveLanzadera naveLanzadera = new NaveLanzadera();
        naveLanzadera.setNombre("Saturno v");
        naveLanzadera.setTipo("Carga");
        naveLanzadera.setUso("Lanzar carga util al espacio");
        naveLanzadera.setTipoCombustible("Propelente liquido");
        naveLanzadera.setRecorridoMaximo("250 millones de Km");
        naveLanzadera.setPaisOrigen("Estados Unidos");


        NaveNoTripulada naveNoTripulada = new NaveNoTripulada();
        naveNoTripulada.setNombre("Cassini-Huygens");
        naveNoTripulada.setTipo("Sonda");
        naveNoTripulada.setUso("Analizar planeta");
        naveNoTripulada.setTipoCelda("Fotovoltaica");
        naveNoTripulada.setPlanetasEstudiar("Saturno, Marte, Jupiter, Mercurio, Pluton");

        NaveTripulada naveTripulada = new NaveTripulada();
        naveTripulada.setNombre("Apolo");
        naveTripulada.setTipo("Transportar");
        naveTripulada.setUso("Transportar personas al espacio exterior");
        naveTripulada.setCapacidadPasajeros("3");
        naveTripulada.setPeso("77 Toneladas");

        NaveNoTripulada naveNoTripulada1 = new NaveNoTripulada();
        naveNoTripulada1.setNombre("Mariner IV");
        naveNoTripulada1.setTipo("Sonda");
        naveNoTripulada1.setUso("Estudiar Marte");
        naveNoTripulada1.setTipoCelda("Sin energia");
        naveNoTripulada1.setPlanetasEstudiar("Marte");

        System.out.println("Nave 1");
        System.out.println("Nombre: " + naveLanzadera.getNombre() + " / " + "Tipo: " + naveLanzadera.getTipo() + " / " + "Uso: " + naveLanzadera.getUso()
                + " / " + "Pais de Origen: " + naveLanzadera.getPaisOrigen() + " / " + " Capacidad maxima de recorrido: " + naveLanzadera.getRecorridoMaximo());

        System.out.println("Nave 2");
        System.out.println("Nombre: " + naveNoTripulada.getNombre() + " / " + "Tipo: " + naveNoTripulada.getTipo() + " / " +
                "Uso: " + naveNoTripulada.getUso() + " / " + "Tipo de celda: " + naveNoTripulada.getTipoCelda() + " / " +
                "Planetas a estudiar: " + naveNoTripulada.getPlanetasEstudiar());

        System.out.println("Nave 3");
        System.out.println("Nombre: " + naveTripulada.getNombre() + " / " + "Tipo: " + naveTripulada.getTipo()
        + " / " + "Uso: " + naveTripulada.getUso() + " / " + "Capacidad de pasajeros: " + naveTripulada.getCapacidadPasajeros() +
                " / " + "Peso: " + naveTripulada.getPeso());

        System.out.println("Nave 4");
        System.out.println("Nombre: " + naveNoTripulada1.getNombre() + " / " + "Tipo: " + naveNoTripulada1.getTipo() + " / " +
                "Uso: " + naveNoTripulada1.getUso() + " / " + "Tipo de celda: " + naveNoTripulada1.getTipoCelda() + " / " +
                "Planetas a estudiar: " + naveNoTripulada1.getPlanetasEstudiar());
    }
}
