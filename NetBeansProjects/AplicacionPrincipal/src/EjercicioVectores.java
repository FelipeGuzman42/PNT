
import javax.swing.JOptionPane;

public class EjercicioVectores {

    private float[] datosVector;
    private float[] datosEjercicio3;
    private float[] datosEjercicio4;
    private int n;

    public void lecturaVector(int longitud) {
        int i;
        n = longitud;
        datosVector = new float[longitud];
        for (i = 0; i <= n - 1; i = i + 1) {
            datosVector[i] = Float.parseFloat(JOptionPane.showInputDialog("Dato " + i + ": "));
        }
    }

    public float sumaElementos() {
        int i;
        float suma = 0;
        for (i = 0; i <= n - 1; i = i + 1) {
            suma = suma + datosVector[i];
        }
        return suma;
    }

    public float promedioElementos() {
        float promedio, suma = 0;
        int i;
        for (i = 0; i <= n - 1; i = i + 1) {
            suma = suma + datosVector[i];
        }
        promedio = suma / n;
        return promedio;
    }

    public void ejercicio3() {
        int m, i, l;
        float cont;
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite número de elementos:"));
        datosEjercicio3 = new float[m];
        for (i = 0; i <= m-1; i = i + 1) {
            datosEjercicio3[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite dato " + i + ":"));
        }
        for (i = 0; i <= m-1; i = i + 1) {
            for (l = i; l <= m-1; l = l + 1) {
                if (datosEjercicio3[i] < datosEjercicio3[l]) {
                    cont = datosEjercicio3[i];
                    datosEjercicio3[i] = datosEjercicio3[l];
                    datosEjercicio3[l] = cont;
                }
            }
            JOptionPane.showMessageDialog(null, datosEjercicio3[i] + "");
        }
    }

    public void ejercicio4() {
        int m, i, posicionmin, posicionmax;
        float min, max;
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite número de elementos:"));
        datosEjercicio4 = new float[m];
        for (i = 0; i <= m-1; i = i + 1) {
            datosEjercicio4[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite dato " + i + ":"));
        }
        min = datosEjercicio4[1];
        posicionmin = i;
        max = datosEjercicio4[1];
        posicionmax = i;
        for (i = 0; i <= m-1; i = i + 1) {
            if (datosEjercicio4[i] <= min) {
                min = datosEjercicio4[i];
                posicionmin = i;
            }
            if (datosEjercicio4[i] >= max) {
                max = datosEjercicio4[i];
                posicionmax = i;
            }
        }
        JOptionPane.showMessageDialog(null, "El elemento mayor esta en la posición " + posicionmax
                + "\n El elemento menor esta en la posición " + posicionmin);
    }
}
