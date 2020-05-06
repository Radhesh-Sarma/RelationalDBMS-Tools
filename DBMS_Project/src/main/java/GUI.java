
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radhesh Sarma
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    Directory d = new Directory(3,2);
    
    public GUI() {
        initComponents();
         this.setExtendedState(MAXIMIZED_BOTH);
       Object[] cname={"Directory Number","Bucket ID","Local Depth" ,"Content of Bucket pointed by it",};
            DefaultTableModel model=new DefaultTableModel(cname,16);
            table.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userinput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        user_input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userinput.setBackground(java.awt.Color.black);
        userinput.setPreferredSize(new java.awt.Dimension(2000, 1200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("We Assume initital global depth = 2 , BFR = 3, hash function as k%10");

        Insert.setBackground(java.awt.Color.darkGray);
        Insert.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Insert.setForeground(java.awt.Color.white);
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        user_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_input.setToolTipText("");
        user_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_inputFocusLost(evt);
            }
        });
        user_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_inputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("DBMS MODULE 2");

        table.setBackground(java.awt.Color.darkGray);
        table.setFont(new java.awt.Font("Caviar Dreams", 1, 20)); // NOI18N
        table.setForeground(java.awt.Color.white);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Directory Number", "Bucket ID", "Local Depth", "Content of Bucket pointed by it"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setEnabled(false);
        table.setGridColor(java.awt.Color.black);
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout userinputLayout = new javax.swing.GroupLayout(userinput);
        userinput.setLayout(userinputLayout);
        userinputLayout.setHorizontalGroup(
            userinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userinputLayout.createSequentialGroup()
                .addGroup(userinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userinputLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(user_input, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userinputLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(userinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1932, Short.MAX_VALUE)
                            .addComponent(jLabel1))))
                .addGap(85, 85, 85))
            .addGroup(userinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userinputLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1373, Short.MAX_VALUE)))
        );
        userinputLayout.setVerticalGroup(
            userinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userinputLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(userinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_input, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(userinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userinputLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1035, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userinput, javax.swing.GroupLayout.PREFERRED_SIZE, 2046, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userinput, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        
        int value;
        
        try
        {
                 value = Integer.parseInt(user_input.getText());
                d.insert(value);


                ArrayList<Bucket> buckets = d.getBuckets();
                
                HashMap<Integer,Integer> index = d.getIndex();
                
                int len = (int) Math.pow(2, d.getDepth());
                for(int i = 0; i < len; i++)
                {
                    String str = Integer.toBinaryString(BitUtility.getRightMostBits(i,d.getDepth()));
                 StringBuilder sb = new StringBuilder();

                   for (int toPrepend=d.getDepth()-str.length(); toPrepend>0; toPrepend--)  sb.append('0');
                   
                 sb.append(str);
                  str = sb.toString();
                  
                   table.setValueAt((Object)(str),i,0);
                   
                    if(index.get(i) != -1)
                    {
                        Bucket b = buckets.get(index.get(i));
                        table.setValueAt((Object)(b.id),i,1);
                        table.setValueAt((Object)(b.getLocalDepth()),i,2);
                        table.setValueAt((Object)(b.print()),i,3);
                    }
                }
            
        
        
        }
        catch( NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter an integer");
        }
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertActionPerformed

    private void user_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_inputFocusGained
        // TODO add your handling code here:
        if(user_input.getText().equals("Enter Integer")){
            user_input.setText(null);
            user_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_user_inputFocusGained

    private void user_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_inputFocusLost
        // TODO add your handling code here:
        if(user_input.getText().equals("")){
            user_input.setForeground(new Color(204,204,204));
            user_input.setText("Enter Integer");
        }
    }//GEN-LAST:event_user_inputFocusLost

    private void user_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_inputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_user_inputActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField user_input;
    private javax.swing.JPanel userinput;
    // End of variables declaration//GEN-END:variables
}
