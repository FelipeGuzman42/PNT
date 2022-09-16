import javax.swing.JOptionPane;

public class AplicacionMatematicas {

    public static void main(String[] args) {
        
        //float a, b, c, d, e, f;
        Matematicas mate1, mate2, mate3;
        mate1 = new Matematicas();
/*
        a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor 1:"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor 2:"));

        c = mate1.sumar(a, b);
        JOptionPane.showMessageDialog(null, "La suma es " + c);

        d = mate1.restar(a, b);
        JOptionPane.showMessageDialog(null, "La resta es " + d);

        e = mate1.multiplicar(a, b);
        JOptionPane.showMessageDialog(null, "La multiplicación es " + e);

        int maximo;
        if (a != 0 || b != 0) {
            maximo = mate1.maximoComunDivisor(a, b);
            JOptionPane.showMessageDialog(null, "El máximo común divisor es " + maximo);
        } else {
            JOptionPane.showMessageDialog(null, "No existe másximo común divisor");
        }
        */
        mate1.ejercicio6();
        mate1.ejercicio8();
    }

}