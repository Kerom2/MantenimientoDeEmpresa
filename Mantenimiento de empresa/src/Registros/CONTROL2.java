//En esta clase tendremos el control de los botones como textfield en las diferentes
//clases del paquete
package Registros;

//CLASE CONTROL OBJETOS EN LA CUAL VAMOS A MANIPULAR EL ESTADO DE LOS OBJETOS QUE SE 
//TRABAJAN EN LOS FORMULARIOS
//SIN METODO MAIN NO SE PUEDE CORRER
import javax.swing.*;

public class CONTROL2 {
    //---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de registrar usuario

    public void bloquea_objetuser(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5,JPasswordField texto7,
            JButton boton1, JButton boton4) {

        texto1.setEditable(true);//login
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto7.setEditable(false);
        boton1.setEnabled(true);//buscar
        boton4.setEnabled(false);//agregar
    }
//---------------------------------------------------------------------------------------------//
    
      //metodo que bloquea objetos en form de registrar usuario

    public void desbloquea_objetuser(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5,JPasswordField texto7,
            JButton boton1, JButton boton4) {

        texto1.setEditable(false);//login
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(false);
        texto5.setEditable(true);
        texto7.setEditable(true);
        boton1.setEnabled(false);//buscar
        boton4.setEnabled(true);//agregar
    }
//---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form registrar contactos

    public void limpiarcampostextosuser(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JPasswordField texto7) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto7.setText("");

    }
//---------------------------------------------------------------------------------------------//
    
    
     //procedimiento que permite cargar los categoria en el combo de direccion

    public void Cargarnivel(JComboBox combo) {
        combo.addItem("Administrador");
        combo.addItem("Operacional");
        combo.addItem("Final");
   

    }

    //metodo que bloquea objetos en form de connsultar users
    public void bloquea_objeconsuser(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JPasswordField texto7) {

        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);

    }

    //---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form consultar users
    public void limpiarcampostextoscon(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JPasswordField texto7) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
    }

    //---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de bloquear modificar contactos
    public void bloquea_objeTMODIU(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JPasswordField texto7,
            JButton boton4, JButton boton1) {
        
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        boton4.setEnabled(false);//modificar
        boton1.setEnabled(true);//buscar

    }

    //---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form consultar modificar
    public void limpiarcampostextosmodi(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");

    }

    //---------------------------------------------------------------------------------------------//
    //---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de bloquear modificar contactos
    public void bloquea_objeteliuse(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JButton boton4, JButton boton1) {
        
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        boton4.setEnabled(false);//eliminar
        boton1.setEnabled(true);//buscar

    }

    //---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form consultar modificar
    public void limpiarcampostextoeliu(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");

    }

    //---------------------------------------------------------------------------------------------//
    
    
     //metodo que bloquea objetos en form de connsultar users
    public void desbloquea_objeconsuser(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JPasswordField texto7) {

        texto1.setEditable(true);
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);

    }
    
    
      //metodo que bloquea objetos en form de connsultar users
    public void desbloquea_objemodiu(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JPasswordField texto7,JButton boton4, JButton boton1) {

        texto1.setEditable(false);
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);
        boton4.setEnabled(true);//
        boton1.setEnabled(false);//buscar
        
        

    }
    
    //---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de bloquear modificar contactos
    public void DESbloquea_objeteliuse(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JButton boton4, JButton boton1) {
        
        texto1.setEditable(false);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        boton4.setEnabled(true);//eliminar
        boton1.setEnabled(false);//buscar

    }
    
}




