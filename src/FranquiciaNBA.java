public class FranquiciaNBA {

    private Jugador[] plantilla;
    private final int MAX_JUGADORES;

    public FranquiciaNBA(int MAX_JUGADORES) {
        this.MAX_JUGADORES = MAX_JUGADORES;
        plantilla = new Jugador[MAX_JUGADORES];
    }

    public Jugador buscarJugador(int id){
        boolean seguirBuscando = true;
        Jugador jugadorEncontrado = null;

        for (int i = 0; i < MAX_JUGADORES && seguirBuscando; i++) {
            if (plantilla[i].getId() == id){
                jugadorEncontrado = plantilla[i];
                seguirBuscando = false;
            }
        }
        return jugadorEncontrado;
    }

    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < MAX_JUGADORES; i++) {
            if( plantilla[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    public boolean ficharJugador(Jugador nuevoJugador){
        boolean jugadorFichado = false;
        int huecoLibre = buscarPrimerHuecoLibre();

        if (nuevoJugador != null && huecoLibre != -1 && buscarJugador(nuevoJugador.getId()) == null) {
            jugadorFichado = true;
            plantilla[huecoLibre] = nuevoJugador;
        }
        return jugadorFichado;
    }





}
