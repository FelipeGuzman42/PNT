
import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernan Fortich
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    
int player1generator ()
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

int player2generator ()
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        GameConfig = new javax.swing.JButton();
        yinput1 = new javax.swing.JTextField();
        xinput1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        xinput2 = new javax.swing.JTextField();
        yinput2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(maskplayer2);
        jScrollPane1.setViewportView(jTable1);

        GameConfig.setText("Configurar Juego");
        GameConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameConfigActionPerformed(evt);
            }
        });

        yinput1.setText("y");

        xinput1.setText("x");

        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntaje");

        jLabel2.setText("Jugador 2");

        jTable2.setModel(player2);
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("Jugador 1");

        xinput2.setText("x");
        xinput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xinput2ActionPerformed(evt);
            }
        });

        yinput2.setText("y");

        jButton2.setText("Jugar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable3.setModel(player1);
        jScrollPane3.setViewportView(jTable3);

        jLabel4.setText("Puntaje");

        jTable4.setModel(maskplayer1);
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(106, 106, 106))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(xinput2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(yinput2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(GameConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GameConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xinput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yinput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xinput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yinput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GameConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameConfigActionPerformed
        // TODO add your handling code here:
        try{
        rowColumn=Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Numero De Filas y Columnas del Tablero de Juego"));
        
        if(rowColumn<8)
        {
            JOptionPane.showMessageDialog(null,"Ingrese Algo Valido", "WARNING", JOptionPane.WARNING_MESSAGE);
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
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Ingrese Algo Valido @"+e.getMessage(), "WARNING...", JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_GameConfigActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {   
            if(Turno==false)
            {
                int x=Integer.parseInt(xinput1.getText());
                int y=Integer.parseInt(yinput1.getText());

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

                jLabel1.setText(String.valueOf(scoreplayer1));
                
                Turno=true;
                

            }
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Ingrese Algo Valido @"+e.getMessage(), "WARNING...", JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void xinput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xinput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xinput2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(Turno==true)
            {
                int x=Integer.parseInt(xinput2.getText());
                int y=Integer.parseInt(yinput2.getText());

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

                jLabel4.setText(String.valueOf(scoreplayer2));
                
                Turno=false;
                
            }



        }catch(Exception e){JOptionPane.showMessageDialog(null, "Ingrese Algo Valido @"+e.getMessage(), "WARNING...", JOptionPane.WARNING_MESSAGE);}

    }//GEN-LAST:event_jButton2ActionPerformed

    void fB1(int x, int y)
    {
        B1++;
              player1.setValueAt("X", y, x);
              maskplayer1.setValueAt("B", y, x);
              if (x==principalplayer1[0][0] && y == principalplayer1[0][1])
              {
                  scoreplayer1=scoreplayer1+2000;
              }else
              {
                      scoreplayer1= scoreplayer1+1000;
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
    
    void fP1(int x, int y)
    {
        P1++;
              player1.setValueAt("X", y, x);
              maskplayer1.setValueAt("S", y, x);
              scoreplayer1=scoreplayer1+500;
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
    
    void fS1(int x, int y)
    {
        S1++;
        player1.setValueAt("X", y, x);
        maskplayer1.setValueAt("S", y, x);
        if (x==principalplayer1[2][0] && y==principalplayer1[2][1])
        {
            scoreplayer1=scoreplayer1+3000;
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
            scoreplayer1=scoreplayer1+1000;
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
    
    
    void fB2(int x, int y)
    {
        B2++;
              player2.setValueAt("X", y, x);
              maskplayer2.setValueAt("B", y, x);
              if (x==principalplayer2[0][0] && y == principalplayer2[0][1])
              {
                  scoreplayer2=scoreplayer2+2000;
              }else
              {
                      scoreplayer2= scoreplayer2+1000;
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
    
    void fP2(int x, int y)
    {
        P2++;
              player2.setValueAt("X", y, x);
              maskplayer2.setValueAt("S", y, x);
              scoreplayer2=scoreplayer2+500;
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
    
    void fS2(int x, int y)
    {
        S2++;
        player2.setValueAt("X", y, x);
        maskplayer2.setValueAt("S", y, x);
        if (x==principalplayer2[2][0] && y==principalplayer2[2][1])
        {
            scoreplayer2=scoreplayer2+3000;
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
            scoreplayer2=scoreplayer2+1000;
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    DefaultTableModel player1 = new DefaultTableModel();
    DefaultTableModel player2 = new DefaultTableModel();
    DefaultTableModel maskplayer1 = new DefaultTableModel();
    DefaultTableModel maskplayer2 = new DefaultTableModel();
    Random rnd = new Random();
    int rowColumn,scoreplayer1=0,B1=0, P1=0, S1=0, scoreplayer2=0, B2=0, P2=0, S2=0;
    int [][] principalplayer1 = new int [3][2];
    int [][] principalplayer2 = new int [3][2];
    boolean Turno=true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GameConfig;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField xinput1;
    private javax.swing.JTextField xinput2;
    private javax.swing.JTextField yinput1;
    private javax.swing.JTextField yinput2;
    // End of variables declaration//GEN-END:variables
}
