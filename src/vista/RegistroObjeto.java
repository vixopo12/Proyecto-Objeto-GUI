
package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Tijera;

public class RegistroObjeto extends javax.swing.JFrame {

    ArrayList<Tijera> listTijera;
    
    public RegistroObjeto() {
        initComponents();
        this.setLocationRelativeTo(null);
        listTijera = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_CodTijera = new javax.swing.JTextField();
        txt_Color = new javax.swing.JTextField();
        txt_material = new javax.swing.JTextField();
        cb_TipoTijera = new javax.swing.JComboBox<>();
        btn_Registrar = new javax.swing.JButton();
        rb_fina = new javax.swing.JRadioButton();
        rb_redonda = new javax.swing.JRadioButton();
        rb_punta = new javax.swing.JRadioButton();
        rb_gruesa = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar tijeras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N

        jLabel1.setText("Codigo de la tijera: ");

        jLabel2.setText("Material:");

        jLabel3.setText("Tipo punta: ");

        jLabel4.setText("Tipo de tijera: ");

        jLabel5.setText("Color: ");

        cb_TipoTijera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tijeras Basculantes", "Tijeras con Filo de Navaja", "Tijeras Microdentadas", "Tijeras de Esculpir", "Tijeras Entresacar", "Tijera para Zurdos" }));

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_fina);
        rb_fina.setText("Fina ");

        buttonGroup1.add(rb_redonda);
        rb_redonda.setSelected(true);
        rb_redonda.setText("Redonda ");

        buttonGroup1.add(rb_punta);
        rb_punta.setText("En Punta");

        buttonGroup1.add(rb_gruesa);
        rb_gruesa.setText("Gruesa");

        jButton1.setText("Mostrar lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_CodTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_material, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rb_redonda)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rb_fina)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb_punta)
                                        .addGap(31, 31, 31)
                                        .addComponent(rb_gruesa))
                                    .addComponent(cb_TipoTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CodTijera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_fina)
                            .addComponent(rb_redonda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_punta)
                            .addComponent(rb_gruesa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_TipoTijera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_Registrar)
                .addGap(12, 12, 12)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        //Declaro y asigno variables con los componentes GUI
        String txtCodTijera = txt_CodTijera.getText();
        String txtColorTijera = txt_Color.getText();
        String txtMaterialTijera = txt_material.getText();
        String tipoPunta= "";
        String tipoTijera= cb_TipoTijera.getSelectedItem().toString();
        Tijera t1;
       
       if(rb_fina.isSelected()){
       tipoPunta="Fina";
       }if(rb_gruesa.isSelected()){
       tipoPunta="Gruesa";
       }if(rb_punta.isSelected()){
       tipoPunta="En punta";
       }if(rb_redonda.isSelected()){
       tipoPunta="Redonda";
       }
       
       
        
        //Validacion de campos vacios por GUI
        if (txtCodTijera.trim().equals("") && txtColorTijera.trim().equals("") && txtMaterialTijera.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un codigo, un color y un material valido");
        } else if (txtColorTijera.trim().equals("") && txtCodTijera.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un color y un codigo de tijera valido.");
        } else if (txtMaterialTijera.trim().equals("") && txtColorTijera.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un material y un color de tijera valido.");
        } else if (txtMaterialTijera.trim().equals("") && txtCodTijera.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un material y un codigo de tijera valido.");
        } else if (txtCodTijera.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un codigo de tijera valido");
        } else if (txtColorTijera.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un color de tijera valido");
        } else if (txtMaterialTijera.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un material de tijera valido");
        } else {
             //Añado objeto o la lista 
        t1 = new Tijera(txtCodTijera, txtMaterialTijera, tipoPunta, tipoTijera, txtColorTijera);
        listTijera.add(t1);
            JOptionPane.showMessageDialog(null, "Su objeto se registro con exito");
        }
        
        //Seteo componentes en GUI
        txt_CodTijera.setText("");
        txt_Color.setText("");
        txt_material.setText("");
        


    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("===Cantidad de elementos de la lista===");
        System.out.println("Cantidad elementos:" + listTijera.size());
        
        //Mostrar lista
         for (Tijera r : listTijera) {
             System.out.println("== Datos Tijera ==");
             System.out.println("Codigo Tijera: " + r.getCodTijera());
            System.out.println("Material: " + r.getMaterial());
            System.out.println("Tipo punta: " + r.getTipoPunta());
            System.out.println("Tipo Tijera: " + r.getTipoTijera());
            System.out.println("Color: " + r.getColor());
             System.out.println("===================");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroObjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_TipoTijera;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb_fina;
    private javax.swing.JRadioButton rb_gruesa;
    private javax.swing.JRadioButton rb_punta;
    private javax.swing.JRadioButton rb_redonda;
    private javax.swing.JTextField txt_CodTijera;
    private javax.swing.JTextField txt_Color;
    private javax.swing.JTextField txt_material;
    // End of variables declaration//GEN-END:variables
}
