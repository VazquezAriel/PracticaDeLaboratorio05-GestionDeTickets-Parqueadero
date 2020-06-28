/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaRegistroDeEntrada extends javax.swing.JInternalFrame {

    //Ventanas internas
    private VentanaCrearVehiculo ventanaCrearVehiculo;
    private VentanaCrearCliente ventanaCrearCliente;

    //Controladores
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;

    public VentanaRegistroDeEntrada(ControladorCliente controladorCliente, ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo) {
        initComponents();

        //Controladores
        this.controladorCliente = controladorCliente;
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;

        //Ventanas
        this.ventanaCrearCliente = new VentanaCrearCliente(this, controladorCliente);
        this.ventanaCrearVehiculo = new VentanaCrearVehiculo(this, controladorVehiculo, controladorCliente);

        //agrego las ventanas internas
        jDesktopPane1.add(ventanaCrearCliente);
        jDesktopPane1.add(ventanaCrearVehiculo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jLabelNumeroDeTicket = new javax.swing.JLabel();
        jTextFieldNumeroDeTicket = new javax.swing.JTextField();
        jTextFieldFechaDeIngreso = new javax.swing.JTextField();
        jLabelFechaDeIngreso = new javax.swing.JLabel();
        jScrollPaneTablaVehiculos1 = new javax.swing.JScrollPane();
        jTableVehiculos = new javax.swing.JTable();
        jLabelPlaca = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelDatosCliente = new javax.swing.JPanel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jButtonRegistrarTicket = new javax.swing.JButton();
        jButtonCrearVehiculo = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanelPrincipal.setBackground(new java.awt.Color(12, 131, 131));
        jPanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        jLabelNumeroDeTicket.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelNumeroDeTicket.setText("Numero de Ticket :");

        jTextFieldNumeroDeTicket.setEditable(false);
        jTextFieldNumeroDeTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldFechaDeIngreso.setEditable(false);
        jTextFieldFechaDeIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelFechaDeIngreso.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelFechaDeIngreso.setText("Fecha y Hora de Ingreso:");

        jTableVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVehiculosMouseClicked(evt);
            }
        });
        jScrollPaneTablaVehiculos1.setViewportView(jTableVehiculos);

        jLabelPlaca.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelPlaca.setText("Placa del vehiculo:");

        jTextFieldPlaca.setEditable(false);
        jTextFieldPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPlaca.setText("Seleccione un Vehiculo");

        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabelTitulo.setText("Registrar Entrada");

        jPanelDatosCliente.setBackground(new java.awt.Color(12, 131, 131));
        jPanelDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos del cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Narrow", 0, 22))); // NOI18N
        jPanelDatosCliente.setMaximumSize(new java.awt.Dimension(0, 0));

        jLabelCedula.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelCedula.setText("Cedula:");

        jLabelNombre.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelDireccion.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelDireccion.setText("Direccion:");

        jLabelTelefono.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabelTelefono.setText("Telefono:");

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldTelefono.setEditable(false);
        jTextFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldDireccion.setEditable(false);
        jTextFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldCedula.setEditable(false);
        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelDatosClienteLayout = new javax.swing.GroupLayout(jPanelDatosCliente);
        jPanelDatosCliente.setLayout(jPanelDatosClienteLayout);
        jPanelDatosClienteLayout.setHorizontalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelDatosClienteLayout.setVerticalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosClienteLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCedula)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jButtonRegistrarTicket.setText("Registrar ticket");
        jButtonRegistrarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarTicketActionPerformed(evt);
            }
        });

        jButtonCrearVehiculo.setText("Crear nuevo vehiculo");
        jButtonCrearVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrarTicket)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonCrearVehiculo))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumeroDeTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNumeroDeTicket)
                            .addComponent(jTextFieldFechaDeIngreso)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabelTitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTablaVehiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo)
                        .addGap(13, 13, 13)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumeroDeTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumeroDeTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechaDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCrearVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jButtonRegistrarTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTablaVehiculos1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearVehiculoActionPerformed
        ventanaCrearVehiculo.setVisible(true);
    }//GEN-LAST:event_jButtonCrearVehiculoActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        limpiar();
        cargarDatosTablaVehiculos();

    }//GEN-LAST:event_formInternalFrameActivated

    private void jTableVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVehiculosMouseClicked
        int filaSeleccionada = jTableVehiculos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String cedulaCliente = jTableVehiculos.getValueAt(filaSeleccionada, 3).toString();
            Cliente cliente = controladorCliente.buscar(cedulaCliente);
            cargarDatosCliente(cliente);
            String placa = jTableVehiculos.getValueAt(filaSeleccionada, 0).toString();
            jTextFieldPlaca.setText(placa);

        }
    }//GEN-LAST:event_jTableVehiculosMouseClicked

    private void jButtonRegistrarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarTicketActionPerformed

        if (jTextFieldPlaca.getText().equals("Seleccione un vehiculo")) {
            JOptionPane.showMessageDialog(this, "Seleccione un Vehiculo o Registre uno nuevo");
        } else {
            jTextFieldFechaDeIngreso.setText(controladorTicket.obtenerFechaActual().toString());
            controladorTicket.crear(LocalDateTime.parse(jTextFieldFechaDeIngreso.getText()), controladorVehiculo.buscar(jTextFieldPlaca.getText()));
            JOptionPane.showMessageDialog(this, "El ticket se ha registrado con exito" + "\nFecha:" + jTextFieldFechaDeIngreso.getText());
            limpiar();
        }
    }//GEN-LAST:event_jButtonRegistrarTicketActionPerformed

    public VentanaCrearVehiculo getVentanaCrearVehiculo() {
        return ventanaCrearVehiculo;
    }

    public VentanaCrearCliente getVentanaCrearCliente() {
        return ventanaCrearCliente;
    }

    public JTextField getjTextFieldPlaca() {
        return jTextFieldPlaca;
    }

    public void cargarDatosTablaVehiculos() {
        DefaultTableModel modelo = (DefaultTableModel) jTableVehiculos.getModel();
        modelo.setRowCount(0);
        for (Vehiculo vehiculo : controladorVehiculo.listar()) {
            Object[] rowData = {vehiculo.getPlaca(), vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getCliente().toString()};
            modelo.addRow(rowData);
        }
        jTableVehiculos.setModel(modelo);
    }

    public void cargarDatosCliente(Cliente cliente) {
        jTextFieldCedula.setText(cliente.getCedula());
        jTextFieldNombre.setText(cliente.getNombre());
        jTextFieldDireccion.setText(cliente.getDireccion());
        jTextFieldTelefono.setText(cliente.getTelefono());
    }

    public void limpiar() {
        jTextFieldCedula.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldFechaDeIngreso.setText("");
        jTextFieldNombre.setText("");
        jTextFieldNumeroDeTicket.setText("");
        jTextFieldPlaca.setText("Seleccione un vehiculo");
        jTextFieldTelefono.setText("");
        jTextFieldNumeroDeTicket.setText(controladorTicket.obtenerSiguienteNumero() + "");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearVehiculo;
    private javax.swing.JButton jButtonRegistrarTicket;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaDeIngreso;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroDeTicket;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelDatosCliente;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneTablaVehiculos1;
    private javax.swing.JTable jTableVehiculos;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFechaDeIngreso;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumeroDeTicket;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
