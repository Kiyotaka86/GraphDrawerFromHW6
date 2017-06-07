/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

/**
 *
 * @author Kio
 */
public class HW6Plot extends javax.swing.JFrame {

    /**
     * Creates new form HW6Plot
     */
    public HW6Plot() {
        initComponents();
        Showing a = (Showing) jPanel1;
        a.go();
        AxisField axs = (AxisField) jTextField1;
        AxisField axe = (AxisField) jTextField2;
        AxisField ays = (AxisField) jTextField3;
        AxisField aye = (AxisField) jTextField4;
        
        axs.setText(a.getxStart());
        axe.setText(a.getxEnd());
        ays.setText(a.getyStart());
        aye.setText(a.getyEnd());
        
        
        jTextField5.setText(a.getFuncName());
        jLabel1.setText("Xlabel");
        jLabel3.setText(a.getTitle());
        
        
        
        jComboBox1.addActionListener(new ActionListener(){
            @Override
            public  void actionPerformed(ActionEvent ev){
                JComboBox aa = (JComboBox) ev.getSource();
                String selectedColor = (String) aa.getSelectedItem();
                if(selectedColor.equals("Black"))
                    a.setLineColor(Color.BLACK);
                else if (selectedColor.equals("Green"))
                    a.setLineColor(Color.GREEN);
                else
                    a.setLineColor(Color.RED);
            }
        });
        
        axs.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ev){
            String input = axs.getText();
            double  result = Double.parseDouble(input);             
            a.setxStart(result);
            }
          
        });
        
        axe.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ev){
            String input = axe.getText();
            double  result = Double.parseDouble(input);             
            a.setxEnd(result);
            }
          
        });

        ays.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ev){
            String input = ays.getText();
            double  result = Double.parseDouble(input);             
            a.setyStart(result);
            }
          
        });
        
        aye.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ev){
            String input = aye.getText();
            double  result = Double.parseDouble(input);             
            a.setyEnd(result);
            }
          
        });
        
        jTextField5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                String input = jTextField5.getText();
                a.setFunction(input);
                
            }
            
            
            
        });
        
        
        a.addMouseListener(new MouseAdapter(){
               
                int wid = a.getWidth();
                int hei = a.getHeight();
                int xmin = 0;
                int ymin = 0;
                int xmax = (int)(wid);
                int ymax = (int)(hei);
                int xrange = (int) (a.getWidth());
                int yrange = (int) (a.getHeight());
            
            @Override
            public void mouseClicked(MouseEvent e){

                int xpos = e.getX();
                int ypos = e.getY();
                double xratio = ((xpos-wid*.5)/(xmax-xmin));
                double yratio = (hei*.5-ypos)/(ymax-ymin);
                
                if(xpos>xmin && xpos<xmax && ypos>ymin && ypos<ymax){
                    if(e.getButton()==MouseEvent.BUTTON1){
                        double[] zoom = new double[4];
                        zoom[0]=(a.getAxisrange()[0]+xratio)*.8;
                        zoom[1]=(a.getAxisrange()[1]+xratio)*.8;
                        zoom[2]=(a.getAxisrange()[2]+yratio)*.8;
                        zoom[3]=(a.getAxisrange()[3]+yratio)*.8;
     
                        a.setAxis(zoom);
                    }
                    else if(e.getButton()==MouseEvent.BUTTON3){
                        double[] zoom = new double[4];
                        zoom[0]=(a.getAxisrange()[0]+xratio)/.8;
                        zoom[1]=(a.getAxisrange()[1]+xratio)/.8;
                        zoom[2]=(a.getAxisrange()[2]+yratio)/.8;
                        zoom[3]=(a.getAxisrange()[3]+yratio)/.8;
                        a.setAxis(zoom);
                    
                    }
                    axs.setText(a.getxStart());
                    axe.setText(a.getxEnd());
                    ays.setText(a.getyStart());
                    aye.setText(a.getyEnd());
                    
                }
            }
        
            int pressedx;
            int pressedy;
            
            @Override
            public void mousePressed(MouseEvent e){

                if(e.getButton()==MouseEvent.BUTTON1){  
                    pressedx=e.getX();
                    pressedy=e.getY();
                }
            }
            
            @Override
            public void mouseReleased(MouseEvent e){
                
                int xchange = pressedx-e.getX();
                int ychange = e.getY()-pressedy;
                
                double xratio = xchange/(wid*.5);
                double yratio = ychange/(hei*.5);
                
                
                double[] move = new double[4];
                move[0]=(a.getAxisrange()[0]+xratio);
                move[1]=(a.getAxisrange()[1]+xratio);
                move[2]=(a.getAxisrange()[2]+yratio);
                move[3]=(a.getAxisrange()[3]+yratio);
     
                a.setAxis(move);
                axs.setText(a.getxStart());
                axe.setText(a.getxEnd());
                ays.setText(a.getyStart());
                aye.setText(a.getyEnd());
        
            }   
           
        });
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox1 = new MyCombox();
        jPanel1 = new Showing();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new AxisField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new AxisField();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField4 = new AxisField();
        jLabel2 = new YLabel();
        jTextField3 = new AxisField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setSize(new java.awt.Dimension(500, 400));

        jPanel3.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentResized(evt);
            }
        });
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jComboBox1.setMaximumSize(new java.awt.Dimension(150, 50));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox1);

        jPanel3.add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setMaximumSize(new java.awt.Dimension(150, 50));
        jPanel6.add(jTextField1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(jLabel1.getText());
        jLabel1.setAlignmentX(getAlignmentX());
        jLabel1.setMaximumSize(new java.awt.Dimension(15000, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 50));
        jPanel6.add(jLabel1);

        jTextField2.setText("jTextField2");
        jTextField2.setMaximumSize(new java.awt.Dimension(150, 50));
        jTextField2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField2InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField2);

        jPanel5.add(jPanel6);

        jTextField5.setText("jTextField5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField5);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Title");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel3.add(jLabel3, java.awt.BorderLayout.NORTH);

        jPanel4.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel4ComponentAdded(evt);
            }
        });
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jTextField4.setText("jTextField4");
        jTextField4.setMaximumSize(new java.awt.Dimension(150, 50));
        jPanel4.add(jTextField4);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(jLabel2.getText());
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(1000, 2500));
        jPanel4.add(jLabel2);

        jTextField3.setText("jTextField3");
        jTextField3.setMaximumSize(new java.awt.Dimension(150, 50));
        jPanel4.add(jTextField3);

        jPanel3.add(jPanel4, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField2InputMethodTextChanged
       
    }//GEN-LAST:event_jTextField2InputMethodTextChanged

    private void jPanel3ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3ComponentResized

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPanel4ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel4ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4ComponentAdded

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HW6Plot().setVisible(true);
                
            }
        });
        
        
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
