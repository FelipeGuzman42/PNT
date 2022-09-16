
import javax.swing.JOptionPane;

public class AplicacionPrincipal {

    public static void main(String[] args) {
        // TODO code application logic here
        float suma, promedio,sumaDiagonalP,sumaDiagonalS;
        EjerciciosMatrices soluciones;
        int m, n, opcion;
        soluciones = new EjerciciosMatrices();
        m = Integer.parseInt(JOptionPane.showInputDialog("Numero Filas (m) :"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Numero Columnas (n) :"));
        soluciones.crearMatriz(m, n);
        soluciones.lectura();
        do {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ejercicios Matrices\n "
                            + "1. Lectura\n"
                            + "2. Suma de todos los datos\n"
                            + "3. Promedio de todos los datos\n"
                            + "4. Suma Cada Fila\n"
                            + "5. Suma de Cada Columna\n"
                            + "6. Suma Diagonal principal\n"
                            + "7. Suma Diagonal secundaria\n"
                            + "8. Salir\n"
                            + "Ingrese opcion : "
                    ));
            // la suma de cada fila calcula e imprime los resultados
            switch (opcion) {
                case 1:
                    soluciones.lectura();

                    break;
                case 2:
                    suma = soluciones.sumaElementos();
                    JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                    break;
                case 3:
                    promedio = soluciones.promedioElementos();
                    JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
                    break;

                case 4:
                    soluciones.sumaFilas();
                    break;
                case 5:
                    soluciones.sumaColumnas();
                    break;
                case 6:
                    if (m==n){
                    sumaDiagonalP = soluciones.sumaDiagonalPrincipal();
                    JOptionPane.showMessageDialog(null, "La suma de la diagonal principal es: " + sumaDiagonalP); 
                    } else {
                        JOptionPane.showMessageDialog(null, "La matriz no es cuadrada");
                    }
                    break;
                case 7:
                    if (m==n){
                    sumaDiagonalS = soluciones.sumaDiagonalSecundaria();
                    JOptionPane.showMessageDialog(null, "La suma de la diagonal secundaria es: " + sumaDiagonalS);    
                    } else {
                        JOptionPane.showMessageDialog(null, "La matriz no es cuadrada");
                    }
                    break;
            }

        } while (opcion != 8);

    }

}
