package ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class CalcularNota{

    private float notaPE, notaPP, notaB, notaFin;
    private String repeat;

    public CalcularNota(){
    }

    public void calcularNotaFin(){
        do{
        float ex1=Float.parseFloat(JOptionPane.showInputDialog("Intoduce nota del primer examen"));
        float ex2=Float.parseFloat(JOptionPane.showInputDialog("Intoduce nota del segundo examen"));
        ProbasEscritas p1=new ProbasEscritas(ex1, ex2);
        notaPE=p1.notaProbaE();
        float prac=Float.parseFloat(JOptionPane.showInputDialog("Intoduce nota del prueba páctica"));
        ProbaPractica p2=new ProbaPractica(prac);
        notaPP=p2.notaProbaP();
        int bol=Integer.parseInt(JOptionPane.showInputDialog("Intoduce numero de boletines entregados"));
        Boletins b=new Boletins(bol);
        notaB=b.notaBoletins();
        notaFin=notaPE+notaPP+notaB;
        JOptionPane.showMessageDialog(null, "Nota Exames: "+notaPE+"\nNotaPrueba: "+notaPP+"\nNota Boletin: "+notaB+"\nLa nota final: "+notaFin);
        repeat=JOptionPane.showInputDialog("¿Quieres volver a calcular la nota? (y/n): ");
        }while(repeat.equals("y"));
    }
}
