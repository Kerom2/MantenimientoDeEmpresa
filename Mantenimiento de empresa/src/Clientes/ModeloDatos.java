
package Clientes;

import java.sql.*;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
//nos permite hacer uso del objeto Tablas
import javax.swing.table.DefaultTableModel;

public class ModeloDatos {
    //instanciamos la clase que nos conecta a la base de datos.
    ConexionBD cbd = new ConexionBD();
//------------------------------------------------------------------------------
   //funcion que nos permite buscar un id y validarlo
    public int buscar_id(String ide) {
        int enco = 0;
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_contactos where id = '" + ide + "'";
            ResultSet rs = ConexionBD.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en sql que esta almacenada en query
            //y los resultados, los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) //Si rs no es null, es que hay algo
            {
                //Compara lo que hay en rs en el campo identificacion con ide
                if (ide.equals(rs.getString("id"))) {
                    enco = 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return enco;
    }
//------------------------------------------------------------------------------  
    //Funcion que permite insertar un cliente en tablaclientes
    public boolean ingresarcliente(String ide, String nom, String dire, String reg,
            String cum, String cat, String telF, String telM,String correo) {
        try {
            cbd.conectarbase();
            String query = "INSERT INTO tabla_contactos (id, nombre_cont, dire, fecha_registro, fecha_cum,"
                    + " categoria, telefono_fijo, movil, correo) "
                    + "VALUES ('" + ide + "','" + nom + "','" + dire + "','" + reg + "','" + cum + "','"
                    +cat+ "','" + telF + "','" + telM + "','" + correo + "')";
            //Aqui ejecuta la sentencia en sql que esta en query
            cbd.stmt.execute(query);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cbd.desconectarbase();
            } catch (Exception e)//Un catch puede quedar vacio mi amerw
            {
            }
        }
        return true;
    }
//------------------------------------------------------------------------------
     //Procedimiento que permite mostrar los datos de un cliente
    public void mostrardatos(String ide, JTextField camponombre,
            JTextField campodire, JTextField camporeg, String campocum, 
            JTextField campocat,JTextField campotelF,JTextField campotelM,JTextField campoco) {
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_contactos WHERE id = '" + ide + "'" ;
            //Aqui ejecuta la instruccion query y los resultados quedan almacenados en rs
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                if (ide.equals(
                        rs.getString("id"))) {
                    camponombre.setText(rs.getString("nombre_cont"));
                    campodire.setText(rs.getString("dire"));
                    camporeg.setText(rs.getString("fecha_registro"));
                    campocum = rs.getString("fecha_cum");
                    campocat.setText(rs.getString("categoria"));
                    campotelF.setText(rs.getString("telefono_fijo"));
                    campotelM.setText(rs.getString("movil"));
                    campoco.setText(rs.getString("correo"));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cbd.desconectarbase();
            } catch (Exception e) {

            }
        }
    }
//------------------------------------------------------------------------------
    //esto me ayuda a poder juntar los tres datos de la fecha de cumpleaños
    public String getFechaCum(String ide) {
        String cump="";
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_contactos WHERE id = '" + ide + "'" ;
            //Aqui ejecuta la instruccion query y los resultados quedan almacenados en rs
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                if (ide.equals(
                        rs.getString("id"))) {
                    cump = rs.getString("fecha_cum");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cbd.desconectarbase();
            } catch (Exception e) {

            }
        }
        return cump;
    }
//------------------------------------------------------------------------------
    //est eproceso permite cargar las identificaciones de los clientes en el combo
    public void CargarComboClientes(JComboBox combo) {
        try {
            cbd.conectarbase();
            String query = "select * from tabla_contactos";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();

            if (rs != null) {
                //ciclo para recorrer el rs y cargar los datos del combo
                do {
                    combo.addItem(rs.getString("id"));
                    rs.next();
                    //accesa o lee el sgte registro
                } while (rs != null);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            cbd.desconectarbase();
        }
    }
//------------------------------------------------------------------------------
    //metodo que permite eliminar cliente de la tablacliente
    public boolean Eliminarcliente(String ide) {
        boolean borrado = true;
        try {
            cbd.conectarbase();
            String query = "delete from tabla_contactos where id = '" + ide + "'";
            cbd.stmt.execute(query);
        } catch (Exception ex) 
        {
            System.out.println(ex);
            borrado = false;
        }
        finally {
            cbd.desconectarbase();
        }return borrado;
    }
//------------------------------------------------------------------------------    
   //metodo que permite modificar los datos de la tabla
    public boolean modificar_clientes (String pide, String pnombre, String pdire, 
            String pregi, String pcum, String pcat, String pfijo,String pmovil, String pco){

    try{
        cbd.conectarbase();
        String query = "update tabla_contactos set nombre_cont = '"+pnombre+"', dire= '"+pdire+"',"
                + " fecha_registro= '"+pregi+"', fecha_cum = '"+pcum+"', categoria = '"+pcat+"', "
                + "telefono_fijo = '"+pfijo+"', movil = '"+pmovil+"', correo = '"+pco+"'";
        cbd.stmt.execute(query);
    }catch(Exception e){
        System.out.println(e);
        return false;
    }finally {
        cbd.desconectarbase();
    }
    return true;
} 
//------------------------------------------------------------------------------  
         //funcion que permite buscar un login y password del usuario que ingresa al proyecto
     public int buscarUsuario (String login, String pass){
         int enco = 0;
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_usuarios where login = '" + login + "' and cont ='"+ pass + "'";
            ResultSet rs = Clientes.ConexionBD.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en sql que esta almacenada en query
            //y los resultados, los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) //Si rs no es null, es que hay algo
            {
                //Compara lo que hay en rs en el campo identificacion con ide
                if (login.equals(rs.getString("id"))) {
                    enco = 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return enco;
     }
}
