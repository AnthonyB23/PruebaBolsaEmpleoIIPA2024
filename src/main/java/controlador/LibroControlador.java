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
import modelo.AutorModelo;
import modelo.LibroModelo;


/**
 *
 * @author Usuario
 */
public class LibroControlador {

    //INSTANCIO UN OBJETO DEL MODELO A INSERTAR
    private LibroModelo lm;
    //INSTANCIAR LA CONEXIÓN A LA BASE DE DATOS
    ConexionBDD conectar = new ConexionBDD();
    //CLASE QUE ME PERMITA CONECTARME DIRECTAMENTE A MYSQL
    Connection conectado = (Connection) conectar.conectar();
    //CLASE QUE ME PERMITE EJECUTAR MI SENTENCIA SQL
    PreparedStatement ejecutar;
    //OBTENER RESULTADOS DE LA CONSULTA
    ResultSet resultado;

    //MÉTODOS DE TRANSACCIONABILIDAD
    
    public ArrayList<Object[]> buscarLibro(String p_cedula) {
            ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_buscarLibrosAutor('"+p_cedula+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] oblibro = new Object[5];
                for (int i = 0; i <4; i++) {
                    oblibro[i+1] = resultado.getObject(i+1);
                }
                oblibro[0]=cont;
                listaObject.add(oblibro);
                cont++;
            }
            ejecutar.close();
            return listaObject;
           
        } catch (SQLException p) {
            System.out.println("ERROR SQL"+p);
        }
        return null;
    }
    
    
    

}
