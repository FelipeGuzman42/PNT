
import javax.swing.JOptionPane;

public class Matematicas {

    private float operando1;
    private float operando2;

    public float sumar(float x, float y) {
        float r;
        r = x + y;
        return r;
    }

    public float restar(float x, float y) {
        float r;
        r = x - y;
        return r;
    }

    public float multiplicar(float x, float y) {
        return x * y;
    }

    public int maximoComunDivisor(float x, float y) {
        int a, b, aux;
        a = (int) x;
        b = (int) y;
        while (a != 0 && b != 0) {
            if (a < b) {
                aux = a;
                a = b;
                b = aux;
            }
            a = a - b;
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
    }

    public void ejercicio6() {
        String nombre;
        int edad,puntos,conteo,estatura,N;
        float peso;
        conteo=0;
        puntos=0;
        N=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos aspirantes hay?"));
        while (conteo<N) {
            nombre=JOptionPane.showInputDialog("Dime el nombre del aspirante");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Dime la edad"));
            if (edad<=25) {
                puntos=puntos+1;}
                estatura=Integer.parseInt(JOptionPane.showInputDialog("Dime la estaura en centímetros"));
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

    public void ejercicio8() {
        int N,conteo,numero,menores15,mayores50,entre25y45;
        conteo=0;
        menores15=0;
        mayores50=0;
        entre25y45=0;
        N=Integer.parseInt(JOptionPane.showInputDialog("Dime cuántos números naturales analizar"));
        while (conteo<N){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Dime un número natural"));
            if (numero<15){
                menores15=menores15+1;
            }
            if (numero>25 && numero<45){
                entre25y45=entre25y45+1;
            }
            if (numero>50){
                mayores50=mayores50+1;
            }
        }
        JOptionPane.showMessageDialog(null,"Hay "+menores15+" números menores a 15,\n"+entre25y45+" números entre 25 y 45 y\n"+mayores50+" números mayores a 50");
    }
}
