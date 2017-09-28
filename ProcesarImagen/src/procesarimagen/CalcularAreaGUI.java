/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesarimagen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Veronica Cortes y Jazmin Patiño
 */
public class CalcularAreaGUI extends javax.swing.JFrame {

    private ProcesarImagen procesador;
    private String ruta;

    /**
     * Creates new form CalcularAreaGUI
     */
    public CalcularAreaGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jSliderNumerosAleatorios = new javax.swing.JSlider();
        jButtonCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabelPorcentaje = new javax.swing.JLabel();
        jPanelImagen = new javax.swing.JPanel();
        jMenuBarFile = new javax.swing.JMenuBar();
        jMenuAbrirArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSliderNumerosAleatorios.setMinimum(1);
        jSliderNumerosAleatorios.setPaintLabels(true);
        jSliderNumerosAleatorios.setPaintTicks(true);
        jSliderNumerosAleatorios.setToolTipText("");
        jSliderNumerosAleatorios.setValue(30);
        jSliderNumerosAleatorios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderNumerosAleatoriosStateChanged(evt);
            }
        });
        jSliderNumerosAleatorios.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSliderNumerosAleatoriosPropertyChange(evt);
            }
        });

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        jLabel1.setText("Porcentaje de puntos aleatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jSliderNumerosAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPorcentaje)
                        .addGap(28, 28, 28)
                        .addComponent(jSliderNumerosAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalcular))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenuAbrirArchivo.setText("Archivo");

        jMenuItem1.setText("Abrir imagen");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAbrirArchivo.add(jMenuItem1);

        jMenuBarFile.add(jMenuAbrirArchivo);

        setJMenuBar(jMenuBarFile);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        jfc.setDialogTitle("Select an image");
        jfc.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG images", "png");
        jfc.addChoosableFileFilter(filter);

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = jfc.getSelectedFile();

                this.ruta = selectedFile.getPath();

                BufferedImage img = ImageIO.read(selectedFile);
                ImageIcon icon = new ImageIcon(img);
                ImageLabel label = new ImageLabel(icon);
                jPanelImagen.removeAll();
                jPanelImagen.add(label);                              
                this.repaint();
            } catch (IOException ex) {
                Logger.getLogger(CalcularAreaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        try {
            
            if (ruta == null)
                throw new IllegalArgumentException("Debe especificar una imagen PNG");
            
            procesador = new ProcesarImagen();
            
            int porcentaje = jSliderNumerosAleatorios.getValue();
            int limite = 90; 

            int contadores[][] = procesador.calcular(this.ruta, porcentaje, limite);

            StringBuilder sb = new StringBuilder();

            sb.append(
                    String.format("Ancho: %d Alto: %d\n",
                            procesador.getAncho(), procesador.getAlto()));
            
            int tamano = procesador.getAncho() * procesador.getAlto();
            sb.append(
                    String.format("Puntos totales (tamaño): %d\n", tamano));            

            sb.append(String.format("Porcentaje de números aleatorios: %d%%\n", porcentaje));
            
            sb.append(String.format("Límite: %d%%\n", limite));
            
            long tamanoRelativo = procesador.getPuntosAleatorios().getNumeroAleatorios();
            
            long puntosEstimadosNegros = (long)tamano * (long)contadores[0][1]  / (long)tamanoRelativo;
            long puntosEstimadosBlancos = (long)tamano * (long)contadores[1][1]  / (long)tamanoRelativo;

            sb.append(String.format("Puntos negros estimados: %d\n", puntosEstimadosNegros));
            sb.append(String.format("Puntos blancos estimados: %d\n", puntosEstimadosBlancos));
            
            double puntosAleatoriosNegros = contadores[0][1] * 100.0 / tamanoRelativo;
            double puntosAleatoriosBlancos = contadores[1][1] * 100.0 / tamanoRelativo;            
                    
            sb.append("---------------------------------------------------\n\n\n");
            
            sb.append(
                    String.format("Puntos totales relativos (puntos relativos): %d\n", tamanoRelativo));            
            
            sb.append(String.format("Puntos relativos negros (aleatorios negros): %d - %3.2f%%\n", contadores[0][1], puntosAleatoriosNegros));
            sb.append(String.format("Puntos relativos blancos (aleatorios negros): %d - %3.2f%%\n", contadores[1][1], puntosAleatoriosBlancos));
            // sb.append(String.format("Otro: %d\n - ", contadores[2][1]));

            jTextAreaResultado.setText(sb.toString());

        } catch (Exception ex) {
            jTextAreaResultado.setText(ex.toString());
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jSliderNumerosAleatoriosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSliderNumerosAleatoriosPropertyChange
       jLabelPorcentaje.setText(String.format("%d%%", jSliderNumerosAleatorios.getValue()));
    }//GEN-LAST:event_jSliderNumerosAleatoriosPropertyChange

    private void jSliderNumerosAleatoriosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderNumerosAleatoriosStateChanged
        jLabelPorcentaje.setText(String.format("%d%%", jSliderNumerosAleatorios.getValue()));
    }//GEN-LAST:event_jSliderNumerosAleatoriosStateChanged

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
            java.util.logging.Logger.getLogger(CalcularAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularAreaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPorcentaje;
    private javax.swing.JMenu jMenuAbrirArchivo;
    private javax.swing.JMenuBar jMenuBarFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderNumerosAleatorios;
    private javax.swing.JTextArea jTextAreaResultado;
    // End of variables declaration//GEN-END:variables
}

class ImageLabel extends JLabel {

    public ImageLabel(String img) {
        this(new ImageIcon(img));
    }

    public ImageLabel(ImageIcon icon) {
        setIcon(icon);
        // setMargin(new Insets(0,0,0,0));
        setIconTextGap(0);
        // setBorderPainted(false);
        setBorder(null);
        setText(null);
        setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
    }

}
