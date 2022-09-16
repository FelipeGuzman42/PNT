
import javax.swing.JOptionPane;

public class EjerciciosMatrices {

    private float matrizDatos1[][], matrizDatos2[][];
    private int mFilas, nColumnas;

    public void crearMatriz(int mfil, int ncol) {
        matrizDatos1 = new float[mfil][ncol];
        mFilas = mfil;
        nColumnas = ncol;

    }

    public void lectura() {

        int i, j;
        for (i = 0; i <= mFilas - 1; i = i + 1) {
            for (j = 0; j <= nColumnas - 1; j = j + 1) {

                matrizDatos1[i][j] = Float.parseFloat(
                        JOptionPane.showInputDialog("dato [" + i + "," + j + "]:")
                );
            }
        }
    }

    public float sumaElementos() {
        int i, j;
        float sumaT = 0;
        for (i = 0; i <= mFilas - 1; i = i + 1) {
            for (j = 0; j <= nColumnas - 1; j = j + 1) {
                sumaT = sumaT + matrizDatos1[i][j];
            }
        }
        return sumaT;
    }

    public float promedioElementos() {
        float promedioT;
        int totalD = mFilas * nColumnas;
        promedioT = sumaElementos() / totalD;
        return promedioT;
    }

    public void sumaFilas() {
        float sumaFil = 0;
        int i, j;
        for (i = 0; i <= mFilas - 1; i = i + 1) {
            for (j = 0; j <= nColumnas - 1; j = j + 1) {
                sumaFil = sumaFil + matrizDatos1[i][j];
            }
            JOptionPane.showMessageDialog(null, "La suma de la Fila " + i + " es " + sumaFil);
            sumaFil = 0;
        }
    }

    public void sumaColumnas() {
        float sumaCol = 0;
        int j, i;
        for (j = 0; j <= nColumnas - 1; j = j + 1) {
            for (i = 0; i <= mFilas - 1; i = i + 1) {
                sumaCol = sumaCol + matrizDatos1[i][j];
            }
            JOptionPane.showMessageDialog(null, "La suma de la Columna " + j + " es " + sumaCol);
            sumaCol = 0;
        }
    }
    public float sumaDiagonalPrincipal() {
        float sumaDP = 0;
        int j, i;
        for (i = 0; i <= mFilas - 1; i = i + 1) {
            for (j = 0; j <= nColumnas - 1; j = j + 1) {
                if (i==j){
                    sumaDP=sumaDP+matrizDatos1[i][j];
                }
            }
        }
        return sumaDP;
    }
    public float sumaDiagonalSecundaria() {
        float sumaDS = 0;
        int j, i,cont=nColumnas-1;
        for (i = 0; i <= mFilas - 1; i = i + 1) {
            for (j = 0; j <= nColumnas - 1; j = j + 1) {
                if (j==cont){
                    sumaDS=sumaDS+matrizDatos1[i][j];
                    cont=cont-1;
                }
            }
        }
        return sumaDS;
    }
}
