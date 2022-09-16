
import javax.swing.JOptionPane;


public class EjerciciosArreglos {
     private float matrizDatos1[][]=null, matrizDatos2[][]=null;
     private float vector1[]=null, vector2[]=null;
     
    private int mFilas =0, nColumnas=0;
    private int longVector1=0;
    
    
    public void crearMatriz() {
        int m,n;
        m = Integer.parseInt(JOptionPane.showInputDialog("Numero Filas (m) :"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Numero Columnas (n) :"));
        matrizDatos1 = new float[m][n];
        mFilas = m;
        nColumnas = n;
    }
    
    public void lecturaMatriz() {

        int i, j;
        if (matrizDatos1==null)
        {
             crearMatriz();        
        }
        
        for (i = 0; i <= mFilas - 1; i = i + 1) {
            for (j = 0; j <= nColumnas - 1; j = j + 1) {

                matrizDatos1[i][j] = Float.parseFloat(
                        JOptionPane.showInputDialog("dato [" + i + "," + j +  "]:")
                );
            }
        }
    }
    
    public void visualizarMatriz(String titulo) {

        int i, j;
        String datos="";
        
        for (i = 0; i <= mFilas - 1; i = i + 1) {
            for (j = 0; j <= nColumnas - 1; j = j + 1) {
                 datos = datos  + matrizDatos1[i][j] +  "      ";
                
            }
                datos = datos  + "\n";
        }
        JOptionPane.showMessageDialog(null,datos,titulo,1);
    }
     
    public void crearVector() {
        int l;
        l = Integer.parseInt(JOptionPane.showInputDialog("Numero de elementos(l) :"));
        vector1 = new float[l];
        longVector1 = l;
    }
    
    public void lecturaVector() {

        int n;
        if (vector1==null)
        {
            crearVector();        
        }
        
        for (n = 0; n <= longVector1 - 1; n = n + 1) {
           vector1[n] = Float.parseFloat(JOptionPane.showInputDialog("dato vector 1 [" + n + "]:"));
        }
    }
    
    public void visualizarVector(String titulo) {
        int n;
        String datos="";
        
        for (n = 0; n <= longVector1 - 1; n = n + 1) {
            datos = datos  + vector1[n] +  "   ";
        }
        JOptionPane.showMessageDialog(null,datos,titulo,1);
    }
     
    public void multiplos3(){
        int n;
        String datos="";
        
        for (n = 0; n <= longVector1 - 1; n = n + 1) {
            if ((vector1[n]%3)==0){
                datos = datos  + vector1[n] +  "   ";   
            }
        }
        JOptionPane.showMessageDialog(null,datos);
    }
    
    public void eliminarP(){
        int n,m=0;
        float p;
        String datos="";
        vector2 = new float[longVector1];
        p = Float.parseFloat(JOptionPane.showInputDialog("Inserte un elemento a eliminar (P)"));
        for (n = 0; n <= longVector1 - 1; n = n + 1) {
            if (vector1[n]!=p){
                vector2[m]=vector1[n];
                datos = datos  + vector2[m] +  "   ";
                m=m+1;
            }
        }
        JOptionPane.showMessageDialog(null,datos);
    }
    
    public void productoVectores(){
        int n;
        float vector3[]= new float[longVector1];
        String datos="";
        vector2 = new float[longVector1];
        for (n = 0; n <= longVector1 - 1; n = n + 1) {
           vector2[n] = Float.parseFloat(JOptionPane.showInputDialog("dato vector 2 [" + n + "]:"));
        }
        for (n = 0; n <= longVector1 - 1; n = n + 1) {
            vector3[n]=vector1[n]*vector2[longVector1-(n+1)];
        }
        for (n = 0; n <= longVector1 - 1; n = n + 1) {
            datos=datos+vector3[n]+ "   ";
        }
        JOptionPane.showMessageDialog(null,datos);
    }
    
    public void busquedaClave(){
        int n=0;
        boolean encontrada=false;
        float clave;
        clave=Float.parseFloat(JOptionPane.showInputDialog("Inserte elemento clave"));
        while (n<=longVector1-1 && encontrada==false){
            if (vector1[n]==clave){
                encontrada=true;
            }
            n=n+1;
        }
        if (encontrada==true){
            JOptionPane.showMessageDialog(null,"La clave fue encontrada");
        } else {
            JOptionPane.showMessageDialog(null,"La clave no fue encontrada");
        }
    }
}
