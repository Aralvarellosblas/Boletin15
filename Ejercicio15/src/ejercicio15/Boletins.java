package ejercicio15;

/**
 *
 * @author Arturo
 */
public class Boletins{

    private float numBoletins, totalBoletins=17, porcentaje, nota;

    public Boletins(){
    }

    public Boletins(float numBoletins){
        this.numBoletins=numBoletins;
    }

    public float notaBoletins(){
        porcentaje=(numBoletins/totalBoletins)*100;
        if(porcentaje>=90){
            nota=2;
        }else if(porcentaje<90&&porcentaje>70){
            nota=1;
        }else{
            nota=0;
        }
        return nota;
    }
}
