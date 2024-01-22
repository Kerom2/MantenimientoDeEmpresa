//Esta es la clase para conectar con la base de datos en la cua; se van 
//a desarrollar todos los metodos que van a permitir darle mantenimiento a la base de datos
package Clientes;
//Ete import nos permite utilizar tods los datos de Java
import java.sql.*;


public class ConexionBD {
    //se definen como static para que puedan utilizarse en cualquier lugar de todo el proyecto
        static String bd = "basecontactos";
        static String login = "root";
        static String password = "";
        static String url = "jdbc:mysql://localhost/"+bd;
        //En url especificamos la direccion donde esta la base de datos ya que se
        //hace por medio del enlace al localhost, pero si bd estuviera en un
        //servidor, en lugar de localhost, escribiriamos la mascara o ip del 
        //servidor 100.100
        static Connection con = null;
        //La variable o objeto Connection es la que permite hacer conexion, es 
        //la que va a mantener la conexion establecida
        static Statement stmt;
        //La variable Statement es por la cual se van a realizar todos los 
        //comandos dentro de la tabla (tales como INSERT, SELECT, UPDATE, DELETE, etc)
        
        //Metodo para conectar la base de datos
        public void conectarbase() throws ClassNotFoundException
        {
            try//Intente hacer
            {
                Class.forName("com.mysql.jdbc.Driver");
                //permite accesar al driver de conexion de mysql
                
                con = DriverManager.getConnection(url, login, password);
                //Establece la conexion en la variable con manejando los datos
                //que tiene url, login y password
                
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
                //Configura el stmt para poder trabajar con los comandos sobre 
                //la tabla de la bd
                
                if (con != null)
                    System.out.println("Conexion correcta con la base de datos");
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
        }
        
        public void desconectarbase()
        {
            try
            {
                con.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
}
