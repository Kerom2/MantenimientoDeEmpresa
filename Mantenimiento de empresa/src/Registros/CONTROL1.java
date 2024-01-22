//En esta clase tendremos el control de los botones como textfield en las diferentes
//clases del paquete
package Registros;

//CLASE CONTROL OBJETOS EN LA CUAL VAMOS A MANIPULAR EL ESTADO DE LOS OBJETOS QUE SE 
//TRABAJAN EN LOS FORMULARIOS
//SIN METODO MAIN NO SE PUEDE CORRER
import javax.swing.*;

public class CONTROL1 {
//---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de registrar clientes

    public void bloquea_objetregist(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JButton boton4, JButton boton5) {

        texto1.setEditable(true);//ide
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        texto8.setEditable(false);
        boton4.setEnabled(true);//buscar
        boton5.setEnabled(false);//agregar
    }
//---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form registrar contactos

    public void limpiarcampostextos(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        texto8.setText("");

    }
//---------------------------------------------------------------------------------------------//
    //procedimiento que permite cargar las direcciones en el combo de direccion

    public void Cargarcombillo(JComboBox combo) {
        combo.addItem("San José");
        combo.addItem("Alajuela");
        combo.addItem("Cartago");
        combo.addItem("Heredia");
        combo.addItem("Guanacaste");
        combo.addItem("Puntarenas");
        combo.addItem("Limón");

    }
    //---------------------------------------------------------------------------------------------//
    //procedimiento que permite cargar los categoria en el combo de direccion

    public void Cargarcate(JComboBox combo) {
        combo.addItem("Personal");
        combo.addItem("Compañero");
        combo.addItem("Trabajo");
        combo.addItem("Confidencial");

    }

    //---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de consultar contactos
    public void bloquea_objeconsu(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JTextField texto9, JTextField texto10) {

        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        texto8.setEditable(false);
        texto9.setEditable(false);
        texto10.setEditable(false);
    }

    //---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form consultar contactos
    public void limpiarcampostextoscon(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JTextField texto9, JTextField texto10) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        texto8.setText("");
        texto9.setText("");
        texto10.setText("");
    }

    //---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de bloquear modificar contactos
    public void bloquea_objeTMODI(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JTextField texto9, JTextField texto10, JButton boton4, JButton boton5) {
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        texto8.setEditable(false);
        texto9.setEditable(false);
        texto10.setEditable(false);
        boton4.setEnabled(false);//modificar
        boton5.setEnabled(true);//buscar

    }

    //---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form consultar modificar
    public void limpiarcampostextosmodi(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JTextField texto9, JTextField texto10) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        texto8.setText("");
        texto9.setText("");
        texto10.setText("");

    }

    //---------------------------------------------------------------------------------------------//
    //metodo que bloquea objetos en form de eliminar contacto
    public void bloquea_objeteli(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JTextField texto9, JTextField texto10, JButton boton4, JButton boton5) {
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        texto8.setEditable(false);
        texto9.setEditable(false);
        texto10.setEditable(false);
        boton4.setEnabled(false);//eliminar
        boton5.setEnabled(true);//buscar

    }

    //---------------------------------------------------------------------------------------------//
    //Procedimiento que permite limpiar los campos textos del form consultar modificar
    public void limpiarcampostextoeli(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JTextField texto9, JTextField texto10) {

        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        texto8.setText("");
        texto9.setText("");
        texto10.setText("");

    }

    //---------------------------------------------------------------------------------------------//
    //metodo que desbloquea objetos en form de registrar clientes
    public void desbloquea_objetregist(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JButton boton4, JButton boton5) {

        texto1.setEditable(true);//ide
        texto2.setEditable(true);
        texto3.setEditable(false);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);
        texto8.setEditable(true);
        boton4.setEnabled(false);//buscar
        boton5.setEnabled(true);//agregar
    }
//---------------------------------------------------------------------------------------------//

    //metodo que desbloquea objetos en form de bloquear modificar contactos
    public void desbloquea_objeTMODI(JTextField texto1, JTextField texto2, JTextField texto3,
            JTextField texto4, JTextField texto5, JTextField texto6, JTextField texto7,
            JTextField texto8, JTextField texto9, JTextField texto10, JButton boton4, JButton boton5) {
        texto1.setEditable(false);
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(false);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);
        texto8.setEditable(true);
        texto9.setEditable(true);
        texto10.setEditable(true);
        boton4.setEnabled(true);//modificar
        boton5.setEnabled(false);//buscar

    }

    //---------------------------------------------------------------------------------------------//
    
      
}
