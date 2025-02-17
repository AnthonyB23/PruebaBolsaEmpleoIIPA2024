/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class MenuVista extends javax.swing.JFrame {

    /**
     * Creates new form MenuVista
     */
    public MenuVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpVista = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmnPostulante = new javax.swing.JMenuItem();
        mniEmpleador = new javax.swing.JMenuItem();
        mniLibro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniCargar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpVistaLayout = new javax.swing.GroupLayout(jdpVista);
        jdpVista.setLayout(jdpVistaLayout);
        jdpVistaLayout.setHorizontalGroup(
            jdpVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpVistaLayout.setVerticalGroup(
            jdpVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Usuarios");

        jmnPostulante.setText("Postulantes");
        jmnPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(jmnPostulante);

        mniEmpleador.setText("Empleadores");
        mniEmpleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmpleadorActionPerformed(evt);
            }
        });
        jMenu1.add(mniEmpleador);

        mniLibro.setText("Libros");
        mniLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLibroActionPerformed(evt);
            }
        });
        jMenu1.add(mniLibro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Archivos");

        mniCargar.setText("Cargar txt");
        mniCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCargarActionPerformed(evt);
            }
        });
        jMenu2.add(mniCargar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpVista)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpVista, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmnPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnPostulanteActionPerformed
        // TODO add your handling code here:
        PostulanteVista pv = new PostulanteVista();
        jdpVista.add(pv);
        pv.show();
    }//GEN-LAST:event_jmnPostulanteActionPerformed

    private void mniEmpleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmpleadorActionPerformed
        // TODO add your handling code here:
        EmpleadorVista ev=new EmpleadorVista();
        jdpVista.add(ev);
        ev.show();
        
        
    }//GEN-LAST:event_mniEmpleadorActionPerformed

    private void mniCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCargarActionPerformed
        // TODO add your handling code here:
        CargarArchivos ca = new CargarArchivos();
        jdpVista.add(ca);
        ca.show();
        
    }//GEN-LAST:event_mniCargarActionPerformed

    private void mniLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLibroActionPerformed
        // TODO add your handling code here:
        LibroVista av=new LibroVista();
        jdpVista.add(av);
        av.show();
                
    }//GEN-LAST:event_mniLibroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpVista;
    private javax.swing.JMenuItem jmnPostulante;
    private javax.swing.JMenuItem mniCargar;
    private javax.swing.JMenuItem mniEmpleador;
    private javax.swing.JMenuItem mniLibro;
    // End of variables declaration//GEN-END:variables
}
