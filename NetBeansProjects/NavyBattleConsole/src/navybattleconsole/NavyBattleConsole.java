/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navybattleconsole;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernan Fortich
 */
public class NavyBattleConsole {
    
    public static DefaultTableModel player1 = new DefaultTableModel();
    public static DefaultTableModel player2 = new DefaultTableModel();
    public static DefaultTableModel maskplayer1 = new DefaultTableModel();
    public static DefaultTableModel maskplayer2 = new DefaultTableModel();
    public static Random rnd = new Random();
    public static int rowColumn,scoreplayer1=0,B1=0, P1=0, S1=0, scoreplayer2=0, B2=0, P2=0, S2=0;
    public static int [][] principalplayer1 = new int [3][2];
    public static int [][] principalplayer2 = new int [3][2];
    public static boolean Turno=true;
    
 public static void main(String[] args) {
     
        String SN= new String();
        Scanner teclado = new Scanner (System.in);
        GameConfig();
        do
        {
            player1game();
            player2game();
            
            System.out.print("Desea Continuar? (S/N): ");
            SN= teclado.nextLine();
        }while("S".equals(SN));       
       
        
    }
 
 
public static int player1generator ()
{
    for(int i=0; i<rowColumn; i++)
    {
        for(int j=0; j<rowColumn; j++)
        {
            player1.setValueAt("o", j, i );
        }
    }
    int xboat, yboat, xmax, ymax;
    xmax=rowColumn-2;
    ymax=rowColumn-2;
    xboat = (int)(rnd.nextDouble() * xmax + 1); 
    yboat = (int)(rnd.nextDouble() * rowColumn + 0);
        
    principalplayer1[0][0]=xboat;
    principalplayer1[0][1]=yboat;
    
    String boat= new String();
    boat="B";
    player1.setValueAt(boat, principalplayer1[0][1], principalplayer1[0][0] ); 
    player1.setValueAt(boat, principalplayer1[0][1],principalplayer1[0][0]+1);
    player1.setValueAt(boat,  principalplayer1[0][1], principalplayer1[0][0]-1);
    
   do
    {        
        xboat = (int)(rnd.nextDouble() * (rowColumn-1) + 0); 
        yboat = (int)(rnd.nextDouble() * (rowColumn-1) + 0);
    }while((xboat==principalplayer1[0][0] && yboat==principalplayer1[0][1]) || xboat+1==principalplayer1[0][0] || xboat-1==principalplayer1[0][0] );
    
    principalplayer1[1][0]= xboat;
    principalplayer1[1][1]=yboat;
       
    boat="P";
    
    player1.setValueAt(boat, principalplayer1[1][1], principalplayer1[1][0] ); 
    player1.setValueAt(boat, principalplayer1[1][1]+1,principalplayer1[1][0]+1);
    player1.setValueAt(boat,  principalplayer1[1][1], principalplayer1[1][0]+1);
    player1.setValueAt(boat,  principalplayer1[1][1]+1, principalplayer1[1][0]);
    
    do
    {
        xboat = (int)(rnd.nextDouble() * xmax + 1); 
        yboat = (int)(rnd.nextDouble() * ymax + 1);
    }while((xboat==principalplayer1[1][0] && yboat==principalplayer1[1][1]) || (xboat+1==principalplayer1[1][0] && yboat+1==principalplayer1[1][1]) 
                    || (xboat+1 ==principalplayer1[1][0] && yboat==principalplayer1[1][1]) || (xboat==principalplayer1[1][0] && yboat+1==principalplayer1[1][1])
                    || (xboat==principalplayer1[0][0] && yboat==principalplayer1[0][1]) || xboat+1==principalplayer1[0][0] || xboat-1==principalplayer1[0][0] );
    
    principalplayer1[2][0]=xboat;
    principalplayer1[2][1]=yboat;
    
    boat="S";
    
    player1.setValueAt(boat, principalplayer1[2][1], principalplayer1[2][0]);
    player1.setValueAt(boat, principalplayer1[2][1]+1, principalplayer1[2][0]);
    player1.setValueAt(boat, principalplayer1[2][1]-1, principalplayer1[2][0]);
    player1.setValueAt(boat, principalplayer1[2][1], principalplayer1[2][0]+1);
    player1.setValueAt(boat, principalplayer1[2][1], principalplayer1[2][0]-1);
    
    return 0;
}

public static int player2generator ()
{
    for(int i=0; i<rowColumn; i++)
    {
        for(int j=0; j<rowColumn; j++)
        {
            player2.setValueAt("o", j, i );
        }
    }
    int xboat, yboat, xmax, ymax;
    xmax=rowColumn-2;
    ymax=rowColumn-2;
    xboat = (int)(rnd.nextDouble() * xmax + 1); 
    yboat = (int)(rnd.nextDouble() * rowColumn + 0);
        
    principalplayer2[0][0]=xboat;
    principalplayer2[0][1]=yboat;
    
    String boat= new String();
    boat="B";
    player2.setValueAt(boat, principalplayer2[0][1], principalplayer2[0][0] ); 
    player2.setValueAt(boat, principalplayer2[0][1],principalplayer2[0][0]+1);
    player2.setValueAt(boat,  principalplayer2[0][1], principalplayer2[0][0]-1);
    
   do
    {        
        xboat = (int)(rnd.nextDouble() * (rowColumn-1) + 0); 
        yboat = (int)(rnd.nextDouble() * (rowColumn-1) + 0);
    }while((xboat==principalplayer2[0][0] && yboat==principalplayer2[0][1]) || xboat+1==principalplayer2[0][0] || xboat-1==principalplayer2[0][0] );
    
    principalplayer2[1][0]= xboat;
    principalplayer2[1][1]=yboat;
       
    boat="P";
    
    player2.setValueAt(boat, principalplayer2[1][1], principalplayer2[1][0] ); 
    player2.setValueAt(boat, principalplayer2[1][1]+1,principalplayer2[1][0]+1);
    player2.setValueAt(boat,  principalplayer2[1][1], principalplayer2[1][0]+1);
    player2.setValueAt(boat,  principalplayer2[1][1]+1, principalplayer2[1][0]);
    
    do
    {
        xboat = (int)(rnd.nextDouble() * xmax + 1); 
        yboat = (int)(rnd.nextDouble() * ymax + 1);
    }while((xboat==principalplayer2[1][0] && yboat==principalplayer2[1][1]) || (xboat+1==principalplayer2[1][0] && yboat+1==principalplayer2[1][1]) 
                    || (xboat+1 ==principalplayer2[1][0] && yboat==principalplayer2[1][1]) || (xboat==principalplayer2[1][0] && yboat+1==principalplayer2[1][1])
                    || (xboat==principalplayer2[0][0] && yboat==principalplayer2[0][1]) || xboat+1==principalplayer2[0][0] || xboat-1==principalplayer2[0][0] );
    
    principalplayer2[2][0]=xboat;
    principalplayer2[2][1]=yboat;
    
    boat="S";
    
    player2.setValueAt(boat, principalplayer2[2][1], principalplayer2[2][0]);
    player2.setValueAt(boat, principalplayer2[2][1]+1, principalplayer2[2][0]);
    player2.setValueAt(boat, principalplayer2[2][1]-1, principalplayer2[2][0]);
    player2.setValueAt(boat, principalplayer2[2][1], principalplayer2[2][0]+1);
    player2.setValueAt(boat, principalplayer2[2][1], principalplayer2[2][0]-1);
    
    return 0;
}


public static void mostrarplayer1 ()
{
    //Mostramos el maskplayer 2
    System.out.println("Bombas Lanzadas");
    for(int i=0; i<rowColumn; i++)
    {
        System.out.print("|");
        for(int j=0; j<rowColumn; j++)
        {
            System.out.print(maskplayer2.getValueAt(j, i));
        }
        System.out.println("|");         
    }
    
    System.out.println(" ");
    System.out.println("Tu Tablero de Juego"); 
    
    for(int i=0; i<rowColumn; i++)
    {
        System.out.print("|");
        for(int j=0; j<rowColumn; j++)
        {
            System.out.print(player1.getValueAt(j, i));
        }
        System.out.println("|");         
    }
}

public static void mostrarplayer2 ()
{
    //Mostramos el maskplayer 2
    System.out.println("Bombas Lanzadas");
    for(int i=0; i<rowColumn; i++)
    {
        System.out.print("|");
        for(int j=0; j<rowColumn; j++)
        {
            System.out.print(maskplayer1.getValueAt(j, i));
        }
        System.out.println("|");         
    }
    
    System.out.println(" ");
    System.out.println("Tu Tablero de Juego"); 
    
    for(int i=0; i<rowColumn; i++)
    {
        System.out.print("|");
        for(int j=0; j<rowColumn; j++)
        {
            System.out.print(player2.getValueAt(j, i));
        }
        System.out.println("|");         
    }
}


 public static void fB1(int x, int y)
    {
        B1++;
              player1.setValueAt("X", y, x);
              maskplayer1.setValueAt("B", y, x);
              if (x==principalplayer1[0][0] && y == principalplayer1[0][1])
              {
                  scoreplayer2=scoreplayer2+2000;
              }else
              {
                      scoreplayer2= scoreplayer2+1000;
              }
              if(B1>1)
              {
                  player1.setValueAt("X", principalplayer1[0][1], principalplayer1[0][0] ); 
                  player1.setValueAt("X", principalplayer1[0][1],principalplayer1[0][0]+1);
                  player1.setValueAt("X",  principalplayer1[0][1], principalplayer1[0][0]-1);
                  maskplayer1.setValueAt("B", principalplayer1[0][1], principalplayer1[0][0] ); 
                  maskplayer1.setValueAt("B", principalplayer1[0][1],principalplayer1[0][0]+1);
                  maskplayer1.setValueAt("B",  principalplayer1[0][1], principalplayer1[0][0]-1);
              }
    }
    
 public static void fP1(int x, int y)
    {
        P1++;
              player1.setValueAt("X", y, x);
              maskplayer1.setValueAt("S", y, x);
              scoreplayer2=scoreplayer2+500;
              if(P1>2)
              {
                  player1.setValueAt("X", principalplayer1[1][1], principalplayer1[1][0] ); 
                  player1.setValueAt("X", principalplayer1[1][1]+1,principalplayer1[1][0]+1);
                  player1.setValueAt("X",  principalplayer1[1][1], principalplayer1[1][0]+1);
                  player1.setValueAt("X",  principalplayer1[1][1]+1, principalplayer1[1][0]);
                  maskplayer1.setValueAt("S", principalplayer1[1][1], principalplayer1[1][0] ); 
                  maskplayer1.setValueAt("S", principalplayer1[1][1]+1,principalplayer1[1][0]+1);
                  maskplayer1.setValueAt("S",  principalplayer1[1][1], principalplayer1[1][0]+1);
                  maskplayer1.setValueAt("S",  principalplayer1[1][1]+1, principalplayer1[1][0]);
              }
    }
    
public static void fS1(int x, int y)
    {
        S1++;
        player1.setValueAt("X", y, x);
        maskplayer1.setValueAt("S", y, x);
        if (x==principalplayer1[2][0] && y==principalplayer1[2][1])
        {
            scoreplayer2=scoreplayer2+3000;
            player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]);
            player1.setValueAt("X", principalplayer1[2][1]+1, principalplayer1[2][0]);
            player1.setValueAt("X", principalplayer1[2][1]-1, principalplayer1[2][0]);
            player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]+1);
            player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]-1);
            maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]);
            maskplayer1.setValueAt("S", principalplayer1[2][1]+1, principalplayer1[2][0]);
            maskplayer1.setValueAt("S", principalplayer1[2][1]-1, principalplayer1[2][0]);
            maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]+1);
            maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]-1);
        }
        else
        {
            scoreplayer2=scoreplayer2+1000;
            if(S1>2)
            {
                player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]);
                player1.setValueAt("X", principalplayer1[2][1]+1, principalplayer1[2][0]);
                player1.setValueAt("X", principalplayer1[2][1]-1, principalplayer1[2][0]);
                player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]+1);
                player1.setValueAt("X", principalplayer1[2][1], principalplayer1[2][0]-1); 
                maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]);
                maskplayer1.setValueAt("S", principalplayer1[2][1]+1, principalplayer1[2][0]);
                maskplayer1.setValueAt("S", principalplayer1[2][1]-1, principalplayer1[2][0]);
                maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]+1);
                maskplayer1.setValueAt("S", principalplayer1[2][1], principalplayer1[2][0]-1);
            }
        }
    }
    
    
public static void fB2(int x, int y)
    {
        B2++;
              player2.setValueAt("X", y, x);
              maskplayer2.setValueAt("B", y, x);
              if (x==principalplayer2[0][0] && y == principalplayer2[0][1])
              {
                  scoreplayer1=scoreplayer1+2000;
              }else
              {
                      scoreplayer1= scoreplayer1+1000;
              }
              if(B2>1)
              {
                  player2.setValueAt("X", principalplayer2[0][1], principalplayer2[0][0] ); 
                  player2.setValueAt("X", principalplayer2[0][1],principalplayer2[0][0]+1);
                  player2.setValueAt("X",  principalplayer2[0][1], principalplayer2[0][0]-1);
                  maskplayer2.setValueAt("B", principalplayer2[0][1], principalplayer2[0][0] ); 
                  maskplayer2.setValueAt("B", principalplayer2[0][1],principalplayer2[0][0]+1);
                  maskplayer2.setValueAt("B",  principalplayer2[0][1], principalplayer2[0][0]-1);
              }
    }
    
public static void fP2(int x, int y)
    {
        P2++;
              player2.setValueAt("X", y, x);
              maskplayer2.setValueAt("S", y, x);
              scoreplayer1=scoreplayer1+500;
              if(P2>2)
              {
                  player2.setValueAt("X", principalplayer2[1][1], principalplayer2[1][0] ); 
                  player2.setValueAt("X", principalplayer2[1][1]+1,principalplayer2[1][0]+1);
                  player2.setValueAt("X",  principalplayer2[1][1], principalplayer2[1][0]+1);
                  player2.setValueAt("X",  principalplayer2[1][1]+1, principalplayer2[1][0]);
                  maskplayer2.setValueAt("S", principalplayer2[1][1], principalplayer2[1][0] ); 
                  maskplayer2.setValueAt("S", principalplayer2[1][1]+1,principalplayer2[1][0]+1);
                  maskplayer2.setValueAt("S",  principalplayer2[1][1], principalplayer2[1][0]+1);
                  maskplayer2.setValueAt("S",  principalplayer2[1][1]+1, principalplayer2[1][0]);
              }
    }
    
public static void fS2(int x, int y)
    {
        S2++;
        player2.setValueAt("X", y, x);
        maskplayer2.setValueAt("S", y, x);
        if (x==principalplayer2[2][0] && y==principalplayer2[2][1])
        {
            scoreplayer1=scoreplayer1+3000;
            player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]);
            player2.setValueAt("X", principalplayer2[2][1]+1, principalplayer2[2][0]);
            player2.setValueAt("X", principalplayer2[2][1]-1, principalplayer2[2][0]);
            player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]+1);
            player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]-1);
            maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]);
            maskplayer2.setValueAt("S", principalplayer2[2][1]+1, principalplayer2[2][0]);
            maskplayer2.setValueAt("S", principalplayer2[2][1]-1, principalplayer2[2][0]);
            maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]+1);
            maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]-1);
        }
        else
        {
            scoreplayer1=scoreplayer1+1000;
            if(S2>2)
            {
                player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]);
                player2.setValueAt("X", principalplayer2[2][1]+1, principalplayer2[2][0]);
                player2.setValueAt("X", principalplayer2[2][1]-1, principalplayer2[2][0]);
                player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]+1);
                player2.setValueAt("X", principalplayer2[2][1], principalplayer2[2][0]-1); 
                maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]);
                maskplayer2.setValueAt("S", principalplayer2[2][1]+1, principalplayer2[2][0]);
                maskplayer2.setValueAt("S", principalplayer2[2][1]-1, principalplayer2[2][0]);
                maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]+1);
                maskplayer2.setValueAt("S", principalplayer2[2][1], principalplayer2[2][0]-1);
            }
        }
    }
    

public static void player1game()
{
    if(Turno==true)
            {
                System.out.println();
                System.out.println("Jugador 1");
                System.out.println(" ");
                Scanner teclado = new Scanner (System.in);
                System.out.print("Ingrese la Coordenada X: ");
                int y=teclado.nextInt();
                System.out.print("Ingrese la Coordenada Y: ");
                int x=teclado.nextInt();

                x=x-1;
                y=y-1;

                String Actual = (String) player2.getValueAt(y, x);

                if("B".equals(Actual)&&B1<2)
                {
                   fB2(x,y);
                }
                else if("P".equals(Actual))
                {
                   fP2(x,y);
                }
                else if("S".endsWith(Actual))
                {
                    fS2(x,y);
                }
                else
                {
                   maskplayer2.setValueAt("0", y, x); 
                }

                System.out.print("/n Tu Puntaje Es: ");
                System.out.println(scoreplayer1);
                
                mostrarplayer1();
                
                Turno=false;
                
            }

}

public static void player2game()
{
    if(Turno==false)
            {
                System.out.println();
                System.out.println("Jugador 2");
                System.out.println(" ");
                Scanner teclado = new Scanner (System.in);
                System.out.print("Ingrese la Coordenada X: ");
                int y=teclado.nextInt();
                System.out.print("Ingrese la Coordenada Y: ");
                int x=teclado.nextInt();

                x=x-1;
                y=y-1;

                String Actual = (String) player1.getValueAt(y, x);

                if("B".equals(Actual)&&B1<2)
                {
                   fB1(x,y);
                }
                else if("P".equals(Actual))
                {
                   fP1(x,y);
                }
                else if("S".endsWith(Actual))
                {
                    fS1(x,y);
                }
                else
                {
                   maskplayer1.setValueAt("0", y, x); 
                }

                System.out.print("/n Tu Puntaje Es: ");
                System.out.println(scoreplayer2);
                
                mostrarplayer2();
                
                Turno=true;
                
            }

}

 public static void GameConfig()
 {
     Scanner teclado = new Scanner (System.in);
     
     System.out.println("Ingrese El Numero De Filas y Columnas del Tablero de Juego");
     rowColumn=teclado.nextInt();
     
     
        if(rowColumn<8)
        {
            System.out.println("Ingrese Algo Valido");
        }
        else
        {
            
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
    
}
