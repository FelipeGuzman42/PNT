
import javax.swing.JOptionPane;

public class AplicacionPrincipal {

    public static void main(String[] args) {
        float total, promedio;
        int n, opcion;
        n = Integer.parseInt(JOptionPane.showInputDialog("Número de datos (n): "));
        EjercicioVectores soluciones;
        soluciones = new EjercicioVectores();
        soluciones.lecturaVector(n);
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ejercicio sobre vectores"
                    + "\n1. Suma"
                    + "\n2. Promedio"
                    + "\n3. Ejercicio 3"
                    + "\n4. Ejercicio 4"
                    + "\n7. Salir"
            )
            );
            switch (opcion) {
                case 1:
                    total = soluciones.sumaElementos();
                    JOptionPane.showMessageDialog(null, "La suma es: " + total);
                    break;
                case 2:
                    promedio = soluciones.promedioElementos();
                    JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
                    break;
                case 3:
                    soluciones.ejercicio3();
                    break;
                case 4:
                    soluciones.ejercicio4();
                    break;
            }
        } while (opcion != 7);
    }

}
