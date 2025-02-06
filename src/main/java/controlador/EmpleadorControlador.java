/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.EmpleadorModelo;


/**
 *
 * @author Usuario
 */
public class EmpleadorControlador {

    //INSTANCIO UN OBJETO DEL MODELO A INSERTAR
    private EmpleadorModelo e;
    //INSTANCIAR LA CONEXIÓN A LA BASE DE DATOS
    ConexionBDD conectar = new ConexionBDD();
    //CLASE QUE ME PERMITA CONECTARME DIRECTAMENTE A MYSQL
    Connection conectado = (Connection) conectar.conectar();
    //CLASE QUE ME PERMITE EJECUTAR MI SENTENCIA SQL
    PreparedStatement ejecutar;
    //OBTENER RESULTADOS DE LA CONSULTA
    ResultSet resultado;

    //MÉTODOS DE TRANSACCIONABILIDAD
    public void insertarEmpleador(EmpleadorModelo e) {
        //1.- UTILIZAR EXCEPCIÓN
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO 
            String sentenciaSQL = "call insertar_empleador('"+e.getCedula()+"','"+e.getNombres()+"','"+e.getApellidos()+"','"+e.getDireccion()+"','"+e.getCorreoElectronico()+"','"+e.getFechaNacimiento()+"','"+e.getEmpresa()+"','"+e.getCargo()+"');";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null,"Empleador Creado con éxito");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null,"El Empleador no ha sido creado,"
                        + " revise que los datos ingresados sean correctos");
            }

        } catch (SQLException p) {
            //CAPTURAR PARA DARLE UN TRATAMIENTO 
            JOptionPane.showMessageDialog(null,"Comuniquese con el Administrador para solicitar ayuda");
                
        }

    }
    
    public ArrayList<Object[]> buscarEmpleador(String p_cedula) {
            ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_BuscarEmpleador('%"+p_cedula+"%');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] obempleador = new Object[9];
                for (int i = 0; i <8; i++) {
                    obempleador[i+1] = resultado.getObject(i+1);
                }
                obempleador[0]=cont;
                listaObject.add(obempleador);
                cont++;
            }
            ejecutar.close();
            return listaObject;
           
        } catch (SQLException p) {
            System.out.println("ERROR SQL"+e);
        }
        return null;
    }
    
    public ArrayList<Object[]> datosEmpleadores() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        
        try {
            String sql = "call sp_ListarEmpleador();";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] obempleador = new Object[9];
                for (int i = 0; i < 8; i++) {
                    obempleador[i+1] = resultado.getObject(i+1);
                }
                obempleador[0]=cont;
                listaObject.add(obempleador);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException p) {
            System.out.println("ERROR SQL CARGA EMPLEADORES");

        }

        return null;
    }
    
    public void actualizarEmpleador(EmpleadorModelo e) {
        try {
            String sentenciaSQL = "call sp_actualizarEmpleador('"+e.getCedula()+"','"+e.getNombres()+"','" + e.getApellidos()+"','"+e.getDireccion()+"','"+ e.getCorreoElectronico()+"','"+e.getFechaNacimiento()+"','"+e.getEmpresa()+"','"+e.getCargo()+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sentenciaSQL);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Empleador Actualizado con Éxito");
            
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
              
            }
        } catch (SQLException p) {
            System.out.println("ERROR SQL");
        }
    }

}
