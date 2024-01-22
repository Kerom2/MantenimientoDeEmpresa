//EN ESTA CLASE DE CONEXION DE BASE DE DATOS EN LA CUAL SE VAN A DESSARROLLAAR TODOS
//LOS METODOS QUE PERMITEN DAR MANTENIMIENTO A LAS TABLAS DE BD
package Registros;
//clase  para oder utilizar los comandos sql

import java.sql.*;

public class CONECTADOR {
    //SE DEFINEN COMO STATIC PARA QUE PUEDAN UTILIZARSE CUALQUIER LUGAR DE TODO EL PROYECTO

    static String bd = "basecontactos";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/" + bd;
    //en url especificamos la direccion donde esta la base de datos ya que se hace por medio del enlace al localhost

    //La variabe o objeto connection es la que permitte hacer conexion y mantenerla
    static Connection con = null;
    //La variable statement es por medio de la cual se van a realizar todos los comandos sobre la tabla,Insert,Select,Udate,delete
    //etc...
    static Statement Stmt;

    //metodo para conectar con la bd
    public void conectarbase() throws SQLException {
        try {//Intente hacer
            //permite accesar el driver de conexion de MySql
            Class.forName("com.mysql.jdbc.Driver");
            //establece la conexion en la variabale con manejando los datos que tiene url,login,password
            con = DriverManager.getConnection(url, login, password);
            Stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //CONFIGURA EL STMT PARA PODER TRABAJAR CON LOS COMANDOS SOBRE LA TABLA DE LA BD
            if (con != null) {
                System.out.println("Conexion base de datos" + con + "Correcta...");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    //procedimiento que desconecta la base
    public void desconectarbase() {
        try {//Intente hacer

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
