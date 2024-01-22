package Usuarios;

import java.sql.*;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
//nos permite hacer uso del objeto Tablas
import javax.swing.table.DefaultTableModel;

public class ModeloUsuarios {

    //instanciamos la clase que nos conecta a la base de datos.
    ConexionBD cbd = new ConexionBD();

    //se definen etas variables de tipo static para poder usarlas en cualquier 
    //clase de todo el proyecto.
    //en el plogin usuaruii se va a guardar el login del usuario que ingresa y en el 
    //pnivelusuario se va a guardar el nivel del usuario que ingresó
    public String Plogin;
    public String pnivel;
//------------------------------------------------------------------------------
    //funcion que nos permite buscar un id y validarlo

    public int buscar_id(String ide) {
        int enco = 0;
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_usuarios where id = '" + ide + "'";
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
    //funcion que nos permite buscar un id y validarlo

    public int buscar_login(String log) {
        int enco = 0;
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_usuarios WHERE login = '" + log + "'";
            ResultSet rs = ConexionBD.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en sql que esta almacenada en query
            //y los resultados, los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) //Si rs no es null, es que hay algo
            {
                //Compara lo que hay en rs en el campo identificacion con ide
                if (log.equals(rs.getString("login"))) {
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

    public boolean ingresarcliente(String ide, String nom, String log, String niv,
            String ing, String co, String con) {
        try {
            cbd.conectarbase();
            String query = "INSERT INTO tabla_usuarios (id, nombre,login, nivel,"
                    + " fecha, correo, contra) "
                    + "VALUES ('" + ide + "','" + nom + "','" + log + "','" + niv
                    + "','" + ing + "','" + co + "','" + con + "')";
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

    public void mostrardatos(JTextField ide, JTextField nombre,
            JTextField log, JTextField niv, JTextField fec,
            JTextField co, JPasswordField con) {
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_usuarios WHERE login = '" + log + "'";
            //Aqui ejecuta la instruccion query y los resultados quedan almacenados en rs
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();
            if (rs != null) {
                if (log.equals(
                        rs.getString("login"))) {
                    nombre.setText(rs.getString("nombre"));
                    ide.setText("id");//NO ENTIENDO ESTE ERRRO
                    niv.setText("nivel");
                    fec.setText("fecha");
                    co.setText("correo");
                    con.setText("contra");
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
    //metodo que permite eliminar cliente de la tablacliente

    public boolean Eliminarcliente(String log) {
        boolean borrado = true;
        try {
            cbd.conectarbase();
            String query = "delete from tabla_usuarios where login = '" + log + "'";
            cbd.stmt.execute(query);
        } catch (Exception ex) {
            System.out.println(ex);
            borrado = false;
        } finally {
            cbd.desconectarbase();
        }
        return borrado;
    }
//------------------------------------------------------------------------------    
    //metodo que permite modificar los datos de la tabla

    public boolean modificar_usuarios(String ide, String nom, String log, String niv,
            String ing, String co, String con) {

        try {
            cbd.conectarbase();
            String query = "update tabla_usuarios set id = '" + ide + "', nombre= '" + nom + "',"
                    + " login= '" + log + "', nivel = '" + niv + "', fecha = '" + ing + "', "
                    + "correo = '" + co + "', contra = '" + con + '"';
            cbd.stmt.execute(query);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            cbd.desconectarbase();
        }
        return true;
    }
//------------------------------------------------------------------------------  

    public void CargarCombo_Clientes(JComboBox combo) {
        try {
            cbd.conectarbase();
            String query = "select * from tabla_usuarios";
            ResultSet rs = cbd.stmt.executeQuery(query);
            rs.first();

            if (rs != null) {
                //ciclo para recorrer el rs y cargar los datos del combo
                do {
                    combo.addItem(rs.getString("login"));
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
    //funcion que permite buscar un login y password del usuario que ingresa al proyecto

    public int buscarUsuario(String login, String pass) {
        int enco = 0;
        try {
            cbd.conectarbase();
            String query = "SELECT * FROM tabla_usuarios where login = "
                    + "'" + login + "' and cont ='" + pass + "'";
            ResultSet rs = ConexionBD.stmt.executeQuery(query);
            //Aqui ejecuta la instruccion en sql que esta almacenada en query
            //y los resultados, los deja en la variable rs
            rs.first(); //Ubica el primer registro del rs
            if (rs != null) //Si rs no es null, es que hay algo
            {
                //Compara lo que hay en rs en el campo identificacion con ide
                if (login.equals(rs.getString("login"))) {
                    enco = 1;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return enco;
    }
//------------------------------------------------------------------------------

    public boolean ingresarbitacora(String fecha, String user, String re) {
        try {
            cbd.conectarbase();
            //Da la instruccion de que hace la base de datos de la tablabitacora
            String query = "INSERT INTO tabla_bitacora (fechaMov,usuario,transRe)"
                    + "VALUES ('" + fecha + "','" + user + "','" + re + "')";
            cbd.stmt.execute(query);
            //Aqui ejecuta la instrucion en SQL que esta almacenada en query
            //y los resultados,los deja en la variable rs
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                cbd.desconectarbase();
            } catch (Exception e) {
            }

        }
        return true;
    }

}//final
