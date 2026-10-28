public abstract class Ayudante extends Personaje {
    protected int costoPista;

    public Ayudante(String nombre, int costoPista) {
        super(nombre);
        this.costoPista = costoPista;
    }

    public abstract String darPista(Mision m);
}