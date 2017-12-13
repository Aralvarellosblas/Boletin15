package ejercicio15;

/**
 *
 * @author Arturo
 */
public class ProbasEscritas{

    private float nota1, nota2, media, notaFinal;

    public ProbasEscritas(){
    }

    public ProbasEscritas(float nota1, float nota2){
        this.nota1=nota1;
        this.nota2=nota2;
    }

    public float notaProbaE(){
        media=(nota1+nota2)/2;
        notaFinal=media*(40f/100f);
        return notaFinal;
    }
}
