public class Main {
    public static void main(String[] args) {

        FranquiciaNBA franquiciaNBA = new FranquiciaNBA(15);

        Jugador jugador1 = new Jugador(1,"Lebron", "Escolta", 12.4);
        Jugador jugador2 = new Jugador(2,"Anteto", "Pivot", 15.2);
        Jugador jugador3 = new Jugador(3,"Luka", "Base", 33.3);

        System.out.println(franquiciaNBA.buscarJugador(1));

        franquiciaNBA.ficharJugador(jugador1);
        franquiciaNBA.ficharJugador(jugador2);
        franquiciaNBA.ficharJugador(jugador3);

        System.out.println(franquiciaNBA.mostrarPlantilla());

        System.out.println("Total de jugadores en la platilla: " + franquiciaNBA.contarJugadoresActuales());
    }
}