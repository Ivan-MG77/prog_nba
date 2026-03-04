public class Jugador {

    private int id;
    private String nombre;
    private String posicion;
    private double puntosPromedio;

    public Jugador(int id, String nombre, String posicion, double puntosPromedio) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
        this.puntosPromedio = puntosPromedio;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPosicion(){
        return posicion;
    }

    public double getPuntosPromedio(){
        return puntosPromedio;
    }

    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();

        sb.append(String.format("Id: %d", this.id));
        sb.append(String.format("Nombre: %s", this.nombre));
        sb.append(String.format("Posicion: %s", this.posicion));
        sb.append(String.format("Puntos Promedio: %.2f", this.puntosPromedio));

        return sb.toString();
    }
}
