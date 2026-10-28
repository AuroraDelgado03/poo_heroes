import java.util.List;

public class RetoSecuencia extends Reto {
    private List<Integer> patronNumerico;

    public RetoSecuencia(NivelDificultad dificultad) {
        super("Completar la secuencia numérica", dificultad);
    }

    @Override
    public boolean evaluarRespuesta(String respuesta) {
        
        return false;
    }

    @Override
    public void generarProblema() {
       
    }
}
