package proyectofinal;

import javax.swing.JOptionPane;

/**
 * @author Felipe Gustavo Guzmán Avendaño
 * @author Daniela Ferrand Santamaría
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        Componentes ejercicios;
        ejercicios = new Componentes();

        String SN = new String();
        ejercicios.GameConfig();
        do {
            ejercicios.player1game();
            ejercicios.player2game();
            SN = JOptionPane.showInputDialog("Desea Continuar? (S/N): ");
        } while ("S".equals(SN));

    }

}
