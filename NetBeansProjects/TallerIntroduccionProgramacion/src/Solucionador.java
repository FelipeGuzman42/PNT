
import javax.swing.JOptionPane;


public class Solucionador {

     public void ejercicio6()
     {
        String nombre;
        int edad,puntos,conteo,estatura,N;
        float peso;
        conteo=0;
        puntos=0;
        N=Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos aspirantes hay?"));
        while (conteo<N) {
            nombre=JOptionPane.showInputDialog("Dime el nombre del aspirante");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Dime la edad"));
            if (edad<=25) {
                puntos=puntos+1;}
                estatura=Integer.parseInt(JOptionPane.showInputDialog("Dime la estaura en cent�metros"));
            if (estatura>=175) {
                puntos=puntos+1;}
            peso=Integer.parseInt(JOptionPane.showInputDialog("Dime el peso en kilogramos"));
            if (peso<=70) {
                puntos=puntos+1;}
            if (puntos==3) {
                JOptionPane.showMessageDialog(null,"El aspirante "+nombre+" es aceptado");
            } else {
                JOptionPane.showMessageDialog(null,"El aspirante "+nombre+" no es aceptado");}
            conteo=conteo+1;
            puntos=0;
        }
     }
     
    public void ejercicio8()
     {
     int N,conteo,numero,menores15,mayores50,entre25y45;
        conteo=0;
        menores15=0;
        mayores50=0;
        entre25y45=0;
        N=Integer.parseInt(JOptionPane.showInputDialog("Dime cu�ntos n�meros naturales analizar"));
        while (conteo<N){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Dime un n�mero natural"));
            if (numero<15){
                menores15=menores15+1;
            }
            if (numero>25 && numero<45){
                entre25y45=entre25y45+1;
            }
            if (numero>50){
                mayores50=mayores50+1;
            }
            conteo=conteo+1;
        }
        JOptionPane.showMessageDialog(null,"Hay "+menores15+" n�meros menores a 15,\n"+entre25y45+" n�meros entre 25 y 45 y\n"+mayores50+" n�meros mayores a 50");
     }
}
