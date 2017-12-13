package ejercicio15;

/**
 *
 * @author Arturo
 */
public class ProbaPractica{

    private float nota, notaFinal;

    public ProbaPractica(){
    }

    public ProbaPractica(float nota){
        this.nota=nota;
    }

    public float notaProbaP(){
        notaFinal=nota*(40f/100f);
        return notaFinal;
    }
}
