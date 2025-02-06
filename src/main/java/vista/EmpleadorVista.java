/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.EmpleadorControlador;
import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.PersonaModelo;
import modelo.PostulanteModelo;
import controlador.PostulanteControlador;
import static java.awt.PageAttributes.MediaType.A4;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.EmpleadorModelo;

/**
 *
 * @author Usuario
 */
public class EmpleadorVista extends javax.swing.JInternalFrame {

    //ATRIBUTOS GLOBALES
    DefaultTableModel model = new DefaultTableModel();
    EmpleadorModelo e = new EmpleadorModelo();
    EmpleadorControlador ec = new EmpleadorControlador();
    ArrayList<EmpleadorModelo> listaEmpleadores = new ArrayList<>();

    public EmpleadorVista() {
        initComponents();
        cbxEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ministerio de Salud", "IESS", "GAD", "Cámara de Comercio", "Netlife", "Emelnorte", "Emapa"}));
        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Gerente General", "Gerente Zonal", "Responsable TTHH", "Miembro TTHH"}));
        this.setModel();
    }

    //MÉTODOS DE VALIDACIÓN
    public void setModel() {
        String[] cabecera = {"Nro.", "Nombres", "Apellidos", "Cedula", "Direccion", "Correo Electrónico", "Fecha Nacimiento", "Empresa", "Cargo"};
        model.setColumnIdentifiers(cabecera);
        //SCBREESCRIBIENDO LA PROPIEDAD MODELO DE LA TABLA tblPostulantes
        tblEmpleador.setModel(model);

    }

    public void setDatos() {
        Object[] datosFila = new Object[model.getColumnCount()];
        int nro = 1;
        //FOR REDUCIDO O FOREACH, POSEE 2 PARÁMETROS 1)TIPO DE DATO DE LA LISTA A RECORRER Y NOMBRE DEL 
        //2) EL NOMBRE DE LA ESTRUCTURA A RECORRER
        //EL FOREACH SIRVE PARA RECORRER E IMPRIMIR UNA LISTA MÁS NO PARA LLENAR
        for (EmpleadorModelo puntero : listaEmpleadores) {
            //CADA POSICIÓN DE DATOS FILA ES UNA CELDA DE LA FILA DE TABLA
            //SI TENGO 10 REGISTROS RECUPERADOS EN UNA CONSULTA
            //TENDRE 11 FILAS, 1 DE LA CABECERA, Y 10 DE LOS REGISTROS A MOSTRAR
            datosFila[0] = nro;
            datosFila[1] = puntero.getNombres();
            datosFila[2] = puntero.getApellidos();
            datosFila[3] = puntero.getCedula();
            datosFila[4] = puntero.getDireccion();
            datosFila[5] = puntero.getCorreoElectronico();
            datosFila[6] = puntero.getFechaNacimiento();
            datosFila[7] = puntero.getEmpresa();
            datosFila[8] = puntero.getCargo();

            nro++;
            model.addRow(datosFila);

        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDisponibilidad = new javax.swing.ButtonGroup();
        txtApellidos = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblEmpresa = new javax.swing.JLabel();
        cbxEmpresa = new javax.swing.JComboBox<>();
        lblCargo = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxCargo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpleador = new javax.swing.JTable();
        btnPDF = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EMPLEADORES");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        lblCedula.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(51, 0, 255));
        lblCedula.setText("CÉDULA:");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(51, 0, 255));
        lblDireccion.setText("DIRECCIÓN:");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblTitulo.setText("GESTIÓN DE EMPLEADORES");
        lblTitulo.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        lblNombres.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(51, 0, 255));
        lblNombres.setText("NOMBRES:");

        lblCorreo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(51, 0, 255));
        lblCorreo.setText("CORREO ELECTRÓNICO:");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        lblApellidos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(51, 0, 255));
        lblApellidos.setText("APELLIDOS:");

        lblFechaNacimiento.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(51, 0, 255));
        lblFechaNacimiento.setText("FECHA DE NACIMIENTO:");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });

        lblEmpresa.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(51, 0, 255));
        lblEmpresa.setText("EMPRESA:");

        lblCargo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(51, 0, 255));
        lblCargo.setText("CARGO:");

        btnCrear.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(51, 0, 204));
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(51, 0, 204));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(51, 0, 204));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 0, 204));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(51, 0, 204));
        btnLimpiar.setText("LIMPIAR ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblEmpleador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmpleador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmpleador);

        btnPDF.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPDF.setForeground(new java.awt.Color(51, 0, 204));
        btnPDF.setText("GENERAR PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombres)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblCedula))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                    .addComponent(txtCedula))
                                .addGap(108, 108, 108)
                                .addComponent(lblApellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaNacimiento)
                                    .addComponent(lblEmpresa)
                                    .addComponent(lblCargo)
                                    .addComponent(lblCorreo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxEmpresa, 0, 185, Short.MAX_VALUE)
                                    .addComponent(cbxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFechaNacimiento))))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(501, 501, 501))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombres)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblApellidos)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPDF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCrear)
                        .addComponent(btnBuscar)
                        .addComponent(btnActualizar)
                        .addComponent(btnEliminar)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        //CREAR EL MODELO EMPLEADOR
        
        e.setNombres(txtNombres.getText());
        e.setApellidos(txtApellidos.getText());
        e.setCedula(txtCedula.getText());
        e.setDireccion(txtDireccion.getText());
        e.setCorreoElectronico(txtCorreo.getText());
        e.setFechaNacimiento(txtFechaNacimiento.getText());
        e.setEmpresa(cbxEmpresa.getSelectedItem().toString());
        e.setCargo(cbxCargo.getSelectedItem() + "");
        //txtAMostrar.setText(e.toString());


        ec.insertarEmpleador(e);
        listaEmpleadores.add(e);
        setDatos();


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula=txtCedula.getText();
        ArrayList<Object[]> listaFilas = ec.buscarEmpleador(cedula);
         for (Object[] p : listaFilas) {
             model.addRow(p);
            
         
         }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        e.setNombres(txtNombres.getText());
        e.setApellidos(txtApellidos.getText());
        e.setCedula(txtCedula.getText());
        e.setDireccion(txtDireccion.getText());
        e.setCorreoElectronico(txtCorreo.getText());
        e.setFechaNacimiento(txtFechaNacimiento.getText());
        e.setEmpresa((String) cbxEmpresa.getSelectedItem());
        e.setCargo((String) cbxCargo.getSelectedItem());

        ec.actualizarEmpleador(e);
        limpiarTabla();
        cargarTabla();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiarTabla() {
        int a = model.getRowCount() - 1;  //Índices van de 0 a n-1
        //System.out.println("Tabla "+a);   //Para mostrar por consola el resultado
        for (int i = a; i >= 0; i--) {

            //System.out.println("i "+i);    //Para mostrar por consola el resultado
            model.removeRow(i);
        }
    }
    private void cargarTabla(){
        ArrayList<Object[]> lista = ec.datosEmpleadores();
        for (Object[] filas : lista) {
            model.addRow(filas);
        }
      
        tblEmpleador.setModel(model);
        
    }
    
    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // TODO add your handling code here:
        e.setNombres(txtNombres.getText());
        e.setApellidos(txtApellidos.getText());
        e.setCedula(txtCedula.getText());
        e.setDireccion(txtDireccion.getText());
        e.setCorreoElectronico(txtCorreo.getText());
        e.setFechaNacimiento(txtFechaNacimiento.getText());
        e.setEmpresa((String) cbxEmpresa.getSelectedItem());
        e.setCargo((String) cbxCargo.getSelectedItem());
        
        
        Document document = new Document();
        try {
            String nombreArchivo = "formularioEmpleadorPrueba.pdf";

            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();
            document.setMargins(50, 50, 50, 50);
            document.setPageSize(PageSize.A4);
            Font font= FontFactory.getFont(FontFactory.TIMES_ROMAN,20,BaseColor.BLUE);
            Paragraph titulo = new Paragraph("FORMULARIO EMPLEADOR",font);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            
            
            
            
            Font cuerpo= FontFactory.getFont(FontFactory.TIMES,16,BaseColor.BLACK);
            Paragraph detalle = new Paragraph(e.toString(),cuerpo);
            detalle.setSpacingBefore(20);
            document.add(detalle);
            
            
            document.close();
            JOptionPane.showMessageDialog(this, "PDF generado correctamente.");
        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage());

        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void tblEmpleadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadorMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblEmpleador.getModel();
        txtNombres.setText((String) dtm.getValueAt(tblEmpleador.getSelectedRow(), 1));
        txtApellidos.setText((String) dtm.getValueAt(tblEmpleador.getSelectedRow(), 2));
        txtCedula.setText(dtm.getValueAt(tblEmpleador.getSelectedRow(), 3).toString());
        txtDireccion.setText(dtm.getValueAt(tblEmpleador.getSelectedRow(), 4).toString());
        txtCorreo.setText((String) dtm.getValueAt(tblEmpleador.getSelectedRow(), 5));
        txtFechaNacimiento.setText(dtm.getValueAt(tblEmpleador.getSelectedRow(), 6).toString());
        
    }//GEN-LAST:event_tblEmpleadorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDisponibilidad;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPDF;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxEmpresa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblEmpleador;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
