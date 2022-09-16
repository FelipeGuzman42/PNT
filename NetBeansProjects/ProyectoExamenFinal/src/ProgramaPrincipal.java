
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CUGSF220
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
float suma, promedio;
        EjerciciosArreglos soluciones;
        String nombre;
        int m, n, opcion;
        soluciones = new EjerciciosArreglos();
        do {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Ejercicios Arreglos\n "
                            + "1. Lectura Vector 1\n"
                            + "2. Lectura Matriz 1\n"
                            + "3. Visualizacion Vector 1\n"
                            + "4. Visualización Matriz 1\n"
                            + "5. Multiplos de 3\n"
                            + "6. Eliminar P\n"
                            + "7. Ejercicio propuesto 152\n"
                            + "8. Ejercicio propuesto 153\n"
                            + "9. Ejercicio 7\n"
                            + "12. Salir\n"
                            + "Ingrese opcion : "
                    ));
            // la suma de cada fila calcula e imprime los resultados
            switch (opcion) {
                case 1:
                    soluciones.lecturaVector();

                    break;
                case 2:
                    soluciones.lecturaMatriz();
                    break;
                case 3:
                    soluciones.visualizarVector("Vector 1");
                    break;

                case 4:
                    soluciones.visualizarMatriz("Matriz 1 ");
                    break;
                case 5:
                    soluciones.multiplos3();
                    break;
                case 6:
                    soluciones.eliminarP();
                    break;
                case 7:
                    soluciones.productoVectores();
                    break;
                case 8:
                    soluciones.busquedaClave();
                    break;
                case 9:
                    break;
                    
                
            }

        } while (opcion != 12);

        
        
        
    }
    
}
