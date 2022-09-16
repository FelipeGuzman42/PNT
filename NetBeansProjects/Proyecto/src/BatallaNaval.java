
import javax.swing.JOptionPane;

public class BatallaNaval {
    String jugador1,jugador2;
    boolean tablero1[][],tablero2[][];
    int lancha=1,barco=3,porta=5;
    public void nombresJugadores(){
        jugador1=JOptionPane.showInputDialog("Inserte nombre del jugador 1");
        jugador2=JOptionPane.showInputDialog("Inserte nombre del jugador 2");
    }

    public void colocarBarcos(){
        int i,j;
        String datos="";
        tablero1 = new boolean[5][5];
        do {
            for (i = 0; i <= 4; i = i + 1) {
                for (j = 0; j <= 4; j = j + 1) {
                 datos = datos  + tablero1[i][j] +  "   ";  
                }
                datos = datos  + "\n";
            }
            JOptionPane.showMessageDialog(null,datos);
        } while (lancha!=0 || barco!=0 || porta!=0);
    }
}
