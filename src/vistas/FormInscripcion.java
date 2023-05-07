/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import tp7.Alumno;
import tp7.Materia;

/**
 *
 * @author carlo
 */
public class FormInscripcion extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormInscripcion
     */
    public FormInscripcion() {
        initComponents();
        cargarMaterias();
        cargarAlumnos();        
    }
    
    public void cargarMaterias(){
        int cantidad = Menu.listaMaterias.size();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cmbMaterias.getModel();
        cmbMaterias.setModel(modelo);
        for (int i = 0; i < cantidad; i++) {
            modelo.addElement(Menu.listaMaterias.get(i));
        }
    }
    
    public void cargarAlumnos(){
        int cantidad = Menu.listaAlumnos.size();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cmbAlumnos.getModel();
        cmbAlumnos.setModel(modelo);
        for (int i = 0; i < cantidad; i++) {
            modelo.addElement(Menu.listaAlumnos.get(i));
        }
    }    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloIns = new javax.swing.JLabel();
        lblMateriaCombo = new javax.swing.JLabel();
        lblAlumnoCombo = new javax.swing.JLabel();
        cmbMaterias = new javax.swing.JComboBox<>();
        cmbAlumnos = new javax.swing.JComboBox<>();
        btnInscribir = new javax.swing.JButton();
        btnSalirIns = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(450, 290));

        lblTituloIns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloIns.setText("Inscripción a Materias");

        lblMateriaCombo.setText("Elija una materia");

        lblAlumnoCombo.setText("Elija un Alumno");

        cmbMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        cmbAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnSalirIns.setText("Salir");
        btnSalirIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblTituloIns))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMateriaCombo)
                            .addComponent(lblAlumnoCombo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMaterias, 0, 186, Short.MAX_VALUE)
                            .addComponent(cmbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnInscribir)
                .addGap(64, 64, 64)
                .addComponent(btnSalirIns)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloIns)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateriaCombo)
                    .addComponent(cmbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumnoCombo)
                    .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnSalirIns))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirInsActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirInsActionPerformed

    public boolean existeInscripcion(Alumno unAlumno, Materia unaMateria){
        boolean existe=false;
        int insc = unAlumno.getInscripciones().size();
        for(int i=0;i< insc;i++){
             if(unAlumno.getInscripciones().get(i).getIdMateria()==unaMateria.getIdMateria()){
                 existe=true;
                 break;
             }
         }
         return existe;
    }
    
    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        // TODO add your handling code here:
        Materia unaMateria = (Materia)cmbMaterias.getSelectedItem();
        Alumno unAlumno = (Alumno)cmbAlumnos.getSelectedItem();
        boolean existe = existeInscripcion(unAlumno, unaMateria);
        if (!existe) {
            unAlumno.agregarMaterias(unaMateria);
            JOptionPane.showMessageDialog(null, "Inscripción agregada correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe la inscripción");
        }
    }//GEN-LAST:event_btnInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalirIns;
    private javax.swing.JComboBox<String> cmbAlumnos;
    private javax.swing.JComboBox<String> cmbMaterias;
    private javax.swing.JLabel lblAlumnoCombo;
    private javax.swing.JLabel lblMateriaCombo;
    private javax.swing.JLabel lblTituloIns;
    // End of variables declaration//GEN-END:variables
}