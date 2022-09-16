package proyectofinal;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Felipe Gustavo Guzmán Avendaño
 * @author Daniela Ferrand Santamaría
 */
public class Componentes {

    public static DefaultTableModel player1 = new DefaultTableModel();
    public static DefaultTableModel player2 = new DefaultTableModel();
    public static DefaultTableModel maskplayer1 = new DefaultTableModel();
    public static DefaultTableModel maskplayer2 = new DefaultTableModel();
    public static Random rnd = new Random();
    public static int rowColumn, scoreplayer1 = 0, B1 = 0, P1 = 0, S1 = 0, scoreplayer2 = 0, B2 = 0, P2 = 0, S2 = 0;
    public static int[][] principalplayer1 = new int[3][2];
    public static int[][] principalplayer2 = new int[3][2];
    public static boolean Turno = true;

    public static int player1generator() {
        for (int i = 0; i < rowColumn; i++) {
            for (int j = 0; j < rowColumn; j++) {
                player1.setValueAt("o", j, i);
            }
        }
        int xboat, yboat, xmax, ymax;
        xmax = rowColumn - 2;
        ymax = rowColumn - 2;
        xboat = (int) (rnd.nextDouble() * xmax + 1);
        yboat = (int) (rnd.nextDouble() * rowColumn + 0);

        principalplayer1[0][0] = xboat;
        principalplayer1[0][1] = yboat;

        String boat = new String();
        boat = "B";
        player1.setValueAt(boat, principalplayer1[0][1], principalplayer1[0][0]);
        player1.setValueAt(boat, principalplayer1[0][1], principalplayer1[0][0] + 1);
        player1.setValueAt(boat, principalplayer1[0][1], principalplayer1[0][0] - 1);

        do {
            xboat = (int) (rnd.nextDouble() * (rowColumn - 1) + 0);
            yboat = (int) (rnd.nextDouble() * (rowColumn - 1) + 0);
        } while ((xboat == principalplayer1[0][0] && yboat == principalplayer1[0][1]) || xboat + 1 == principalplayer1[0][0] || xboat - 1 == principalplayer1[0][0]);

        principalplayer1[1][0] = xboat;
        principalplayer1[1][1] = yboat;

        boat = "P";

        player1.setValueAt(boat, principalplayer1[1][1], principalplayer1[1][0]);
        player1.setValueAt(boat, principalplayer1[1][1] + 1, principalplayer1[1][0] + 1);
        player1.setValueAt(boat, principalplayer1[1][1], principalplayer1[1][0] + 1);
        player1.setValueAt(boat, principalplayer1[1][1] + 1, principalplayer1[1][0]);

        do {
            xboat = (int) (rnd.nextDouble() * xmax + 1);
            yboat = (int) (rnd.nextDouble() * ymax + 1);
        } while ((xboat == principalplayer1[1][0] && yboat == principalplayer1[1][1]) || (xboat + 1 == principalplayer1[1][0] && yboat + 1 == principalplayer1[1][1])
                || (xboat + 1 == principalplayer1[1][0] && yboat == principalplayer1[1][1]) || (xboat == principalplayer1[1][0] && yboat + 1 == principalplayer1[1][1])
                || (xboat == principalplayer1[0][0] && yboat == principalplayer1[0][1]) || xboat + 1 == principalplayer1[0][0] || xboat - 1 == principalplayer1[0][0]);

        principalplayer1[2][0] = xboat;
        principalplayer1[2][1] = yboat;

        boat = "S";

        player1.setValueAt(boat, principalplayer1[2][1], principalplayer1[2][0]);
        player1.setValueAt(boat, principalplayer1[2][1] + 1, principalplayer1[2][0]);
        player1.setValueAt(boat, principalplayer1[2][1] - 1, principalplayer1[2][0]);
        player1.setValueAt(boat, principalplayer1[2][1], principalplayer1[2][0] + 1);
        player1.setValueAt(boat, principalplayer1[2][1], principalplayer1[2][0] - 1);

        return 0;
    }

    public static int player2generator() {
        for (int i = 0; i < rowColumn; i++) {
            for (int j = 0; j < rowColumn; j++) {
                player2.setValueAt("o", j, i);
            }
        }
        int xboat, yboat, xmax, ymax;
        xmax = rowColumn - 2;
        ymax = rowColumn - 2;
        xboat = (int) (rnd.nextDouble() * xmax + 1);
        yboat = (int) (rnd.nextDouble() * rowColumn + 0);

        principalplayer2[0][0] = xboat;
        principalplayer2[0][1] = yboat;

        String boat = new String();
        boat = "B";
        player2.setValueAt(boat, principalplayer2[0][1], principalplayer2[0][0]);
        player2.setValueAt(boat, principalplayer2[0][1], principalplayer2[0][0] + 1);
        player2.setValueAt(boat, principalplayer2[0][1], principalplayer2[0][0] - 1);

        do {
            xboat = (int) (rnd.nextDouble() * (rowColumn - 1) + 0);
            yboat = (int) (rnd.nextDouble() * (rowColumn - 1) + 0);
        } while ((xboat == principalplayer2[0][0] && yboat == principalplayer2[0][1]) || xboat + 1 == principalplayer2[0][0] || xboat - 1 == principalplayer2[0][0]);

        principalplayer2[1][0] = xboat;
        principalplayer2[1][1] = yboat;

        boat = "P";

        player2.setValueAt(boat, principalplayer2[1][1], principalplayer2[1][0]);
        player2.setValueAt(boat, principalplayer2[1][1] + 1, principalplayer2[1][0] + 1);
        player2.setValueAt(boat, principalplayer2[1][1], principalplayer2[1][0] + 1);
        player2.setValueAt(boat, principalplayer2[1][1] + 1, principalplayer2[1][0]);

        do {
            xboat = (int) (rnd.nextDouble() * xmax + 1);
            yboat = (int) (rnd.nextDouble() * ymax + 1);
        } while ((xboat == principalplayer2[1][0] && yboat == principalplayer2[1][1]) || (xboat + 1 == principalplayer2[1][0] && yboat + 1 == principalplayer2[1][1])
                || (xboat + 1 == principalplayer2[1][0] && yboat == principalplayer2[1][1]) || (xboat == principalplayer2[1][0] && yboat + 1 == principalplayer2[1][1])
                || (xboat == principalplayer2[0][0] && yboat == principalplayer2[0][1]) || xboat + 1 == principalplayer2[0][0] || xboat - 1 == principalplayer2[0][0]);

        principalplayer2[2][0] = xboat;
        principalplayer2[2][1] = yboat;

        boat = "S";

        player2.setValueAt(boat, principalplayer2[2][1], principalplayer2[2][0]);
        player2.setValueAt(boat, principalplayer2[2][1] + 1, principalplayer2[2][0]);
        player2.setValueAt(boat, principalplayer2[2][1] - 1, principalplayer2[2][0]);
        player2.setValueAt(boat, principalplayer2[2][1], principalplayer2[2][0] + 1);
        player2.setValueAt(boat, principalplayer2[2][1], principalplayer2[2][0] - 1);

        return 0;
    }

    public static void mostrarplayer1() {
        String bombasplayer1 = "", tableroplayer1 = "";

        for (int i = 0; i < rowColumn; i++) {
            bombasplayer1 = bombasplayer1 + "|";
            for (int j = 0; j < rowColumn; j++) {
                bombasplayer1 = bombasplayer1 + maskplayer2.getValueAt(j, i);
                bombasplayer1 = bombasplayer1 + " ";
            }
            bombasplayer1 = bombasplayer1 + "|\n";
        }
        JOptionPane.showMessageDialog(null, bombasplayer1, "Bombas Lanzadas", JOptionPane.WARNING_MESSAGE);

        for (int i = 0; i < rowColumn; i++) {
            tableroplayer1 = tableroplayer1 + "|";
            for (int j = 0; j < rowColumn; j++) {
                tableroplayer1 = tableroplayer1 + player1.getValueAt(j, i);
                tableroplayer1 = tableroplayer1 + " ";
            }
            tableroplayer1 = tableroplayer1 + "|\n";
        }
        JOptionPane.showMessageDialog(null, tableroplayer1, "Tu Tablero de Juego", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarplayer2() {
        String bombasplayer2 = "", tableroplayer2 = "";

        for (int i = 0; i < rowColumn; i++) {
            bombasplayer2 = bombasplayer2 + "|";
            for (int j = 0; j < rowColumn; j++) {
                bombasplayer2 = bombasplayer2 + maskplayer1.getValueAt(j, i);
                bombasplayer2 = bombasplayer2 + " ";
            }
            bombasplayer2 = bombasplayer2 + "|\n";
        }
        JOptionPane.showMessageDialog(null, bombasplayer2, "Bombas Lanzadas", JOptionPane.WARNING_MESSAGE);

        for (int i = 0; i < rowColumn; i++) {
            tableroplayer2 = tableroplayer2 + "|";
            for (int j = 0; j < rowColumn; j++) {
                tableroplayer2 = tableroplayer2 + player2.getValueAt(j, i);
                tableroplayer2 = tableroplayer2 + " ";
            }
            tableroplayer2 = tableroplayer2 + "|\n";
        }
        JOptionPane.showMessageDialog(null, tableroplayer2, "Tu Tablero de Juego", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void fB1(int x, int y) {
        B1++;
        player1.setValueAt("X", y, x);
        maskplayer1.setValueAt("B", y, x);
        if (x == principalplayer1[0][0] && y == principalplayer1[0][1]) {
            scoreplayer2 = scoreplayer2 + 2000;
        } else {
            scoreplayer2 = scoreplayer2 + 1000;
        }
        if (B1 > 1) {
            player1.setValueAt("X", principalplayer1[0][1], principalplayer1[0][0]);
            player1.setValueAt("X", principalplayer1[0][1], principalplayer1[0][0] + 1);
            player1.setValueAt("X", principalplayer1[0][1], principalplayer1[0][0] - 1);
            maskplayer1.setValueAt("B", principalplayer1[0][1], principalplayer1[0][0]);
            maskplayer1.setValueAt("B", principalplayer1[0][1], principalplayer1[0][0] + 1);
            maskplayer1.setValueAt("B", principalplayer1[0][1], principalplayer1[0][0] - 1);
        }
    }

    public static void fP1(int x, int y) {
        P1++;
        player1.setValueAt("X", y, x);
        maskplayer1.setValueAt("S", y, x);
        scoreplayer2 = scoreplayer2 + 500;
        if (P1 > 2) {
            player1.setValueAt("X", principalplayer1[1][1], principalplayer1[1][0]);
            player1.setValueAt("X", principalplayer1[1][1] + 1, principalplayer1[1][0] + 1);
            player1.setValueAt("X", principalplayer1[1][1], principalplayer1[1][0] + 1);
            player1.setValueAt("X", principalplayer1[1][1] + 1, principalplayer1[1][0]);
            maskplayer1.setValueAt("S", principalplayer1[1][1], principalplayer1[1][0]);
            maskplayer1.setValueAt("S", principalplayer1[1][1] + 1, principalplayer1[1][0] + 1);
            maskplayer1.setValueAt("S", principalplayer1[1][1], principalplayer1[1][0] + 1);
            maskplayer1.setValueAt("S", principalplayer1[1][1] + 1, principalplayer1[1][0]);
        }
    }

    public static void fS1(int x, int y) {
        S1++;
        player1.setValueAt("X", y, x);
        maskplayer1.setValueAt("S", y, x);
        if (x == principalplayer1[2][0] && y == principalplayer1[2][1]) {
            scoreplayer2 = scoreplayer2 + 3000;
            player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]);
            player1.setValueAt("X", principalplayer1[2][1] + 1, principalplayer1[2][0]);
            player1.setValueAt("X", principalplayer1[2][1] - 1, principalplayer1[2][0]);
            player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0] + 1);
            player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0] - 1);
            maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]);
            maskplayer1.setValueAt("S", principalplayer1[2][1] + 1, principalplayer1[2][0]);
            maskplayer1.setValueAt("S", principalplayer1[2][1] - 1, principalplayer1[2][0]);
            maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0] + 1);
            maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0] - 1);
        } else {
            scoreplayer2 = scoreplayer2 + 1000;
            if (S1 > 2) {
                player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]);
                player1.setValueAt("X", principalplayer1[2][1] + 1, principalplayer1[2][0]);
                player1.setValueAt("X", principalplayer1[2][1] - 1, principalplayer1[2][0]);
                player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0] + 1);
                player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0] - 1);
                maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]);
                maskplayer1.setValueAt("S", principalplayer1[2][1] + 1, principalplayer1[2][0]);
                maskplayer1.setValueAt("S", principalplayer1[2][1] - 1, principalplayer1[2][0]);
                maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0] + 1);
                maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0] - 1);
            }
        }
    }

    public static void fB2(int x, int y) {
        B2++;
        player2.setValueAt("X", y, x);
        maskplayer2.setValueAt("B", y, x);
        if (x == principalplayer2[0][0] && y == principalplayer2[0][1]) {
            scoreplayer1 = scoreplayer1 + 2000;
        } else {
            scoreplayer1 = scoreplayer1 + 1000;
        }
        if (B2 > 1) {
            player2.setValueAt("X", principalplayer2[0][1], principalplayer2[0][0]);
            player2.setValueAt("X", principalplayer2[0][1], principalplayer2[0][0] + 1);
            player2.setValueAt("X", principalplayer2[0][1], principalplayer2[0][0] - 1);
            maskplayer2.setValueAt("B", principalplayer2[0][1], principalplayer2[0][0]);
            maskplayer2.setValueAt("B", principalplayer2[0][1], principalplayer2[0][0] + 1);
            maskplayer2.setValueAt("B", principalplayer2[0][1], principalplayer2[0][0] - 1);
        }
    }

    public static void fP2(int x, int y) {
        P2++;
        player2.setValueAt("X", y, x);
        maskplayer2.setValueAt("S", y, x);
        scoreplayer1 = scoreplayer1 + 500;
        if (P2 > 2) {
            player2.setValueAt("X", principalplayer2[1][1], principalplayer2[1][0]);
            player2.setValueAt("X", principalplayer2[1][1] + 1, principalplayer2[1][0] + 1);
            player2.setValueAt("X", principalplayer2[1][1], principalplayer2[1][0] + 1);
            player2.setValueAt("X", principalplayer2[1][1] + 1, principalplayer2[1][0]);
            maskplayer2.setValueAt("S", principalplayer2[1][1], principalplayer2[1][0]);
            maskplayer2.setValueAt("S", principalplayer2[1][1] + 1, principalplayer2[1][0] + 1);
            maskplayer2.setValueAt("S", principalplayer2[1][1], principalplayer2[1][0] + 1);
            maskplayer2.setValueAt("S", principalplayer2[1][1] + 1, principalplayer2[1][0]);
        }
    }

    public static void GameConfig() {
        rowColumn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Numero De Filas y Columnas del Tablero de Juego \n(Mayor a 7)"));

        if (rowColumn < 8) {
            JOptionPane.showMessageDialog(null, "Ingrese Algo Válido Mayor a 7");
        } else {
            player1.setColumnCount(rowColumn);
            player1.setRowCount(rowColumn);
            player2.setColumnCount(rowColumn);
            player2.setRowCount(rowColumn);
            maskplayer1.setColumnCount(rowColumn);
            maskplayer1.setRowCount(rowColumn);
            maskplayer2.setColumnCount(rowColumn);
            maskplayer2.setRowCount(rowColumn);
            player1generator();
            player2generator();
        }
    }

    public static void fS2(int x, int y) {
        S2++;
        player2.setValueAt("X", y, x);
        maskplayer2.setValueAt("S", y, x);
        if (x == principalplayer2[2][0] && y == principalplayer2[2][1]) {
            scoreplayer1 = scoreplayer1 + 3000;
            player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]);
            player2.setValueAt("X", principalplayer2[2][1] + 1, principalplayer2[2][0]);
            player2.setValueAt("X", principalplayer2[2][1] - 1, principalplayer2[2][0]);
            player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0] + 1);
            player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0] - 1);
            maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]);
            maskplayer2.setValueAt("S", principalplayer2[2][1] + 1, principalplayer2[2][0]);
            maskplayer2.setValueAt("S", principalplayer2[2][1] - 1, principalplayer2[2][0]);
            maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0] + 1);
            maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0] - 1);
        } else {
            scoreplayer1 = scoreplayer1 + 1000;
            if (S2 > 2) {
                player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]);
                player2.setValueAt("X", principalplayer2[2][1] + 1, principalplayer2[2][0]);
                player2.setValueAt("X", principalplayer2[2][1] - 1, principalplayer2[2][0]);
                player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0] + 1);
                player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0] - 1);
                maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]);
                maskplayer2.setValueAt("S", principalplayer2[2][1] + 1, principalplayer2[2][0]);
                maskplayer2.setValueAt("S", principalplayer2[2][1] - 1, principalplayer2[2][0]);
                maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0] + 1);
                maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0] - 1);
            }
        }
    }

    public static void player1game() {
        if (Turno == true) {
            int y = 1, x = 1;
            JOptionPane.showMessageDialog(null, "Jugador 1");
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Coordenada X: "));
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Coordenada Y: "));

            x = x - 1;
            y = y - 1;

            String Actual = (String) player2.getValueAt(y, x);

            if ("B".equals(Actual) && B1 < 2) {
                fB2(x, y);
            } else if ("P".equals(Actual)) {
                fP2(x, y);
            } else if ("S".endsWith(Actual)) {
                fS2(x, y);
            } else {
                maskplayer2.setValueAt("0", y, x);
            }

            JOptionPane.showMessageDialog(null, "Tu Puntaje Es: " + scoreplayer1);

            mostrarplayer1();

            Turno = false;

        }

    }

    public static void player2game() {
        if (Turno == false) {
            int y = 1, x = 1;
            JOptionPane.showMessageDialog(null, "Jugador 2");
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Coordenada X: "));
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Coordenada Y: "));

            x = x - 1;
            y = y - 1;

            String Actual = (String) player1.getValueAt(y, x);

            if ("B".equals(Actual) && B1 < 2) {
                fB1(x, y);
            } else if ("P".equals(Actual)) {
                fP1(x, y);
            } else if ("S".endsWith(Actual)) {
                fS1(x, y);
            } else {
                maskplayer1.setValueAt("0", y, x);
            }

            JOptionPane.showMessageDialog(null, "Tu Puntaje Es: " + scoreplayer1);

            mostrarplayer2();

            Turno = true;

        }

    }
}
