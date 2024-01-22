//aqui se controlas los bloques, desbloqueos y limpiezas
package Usuarios;

import javax.swing.JOptionPane;
import javax.swing.*;

public class Control_Objetos_Usuarios {

    public void Combo_nivel(JComboBox box) {
        box.addItem("Administrador");
        box.addItem("Operacional");
        box.addItem("Final");

    }
//------------------------------------------------------------------------------
    
//------------------------------------------------------------------------------
    //permite bloquear los objetos de registrar 
    public void Bloquear_objetos_registar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JPasswordField texto6,
            JButton boton1, JButton boton2) {
        texto1.setEditable(true);//id
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        boton1.setEnabled(true);//buscar
        boton2.setEnabled(false);//registrar
    }
//------------------------------------------------------------------------------
    //permite desbloquear los objetos de registrar 

    public void Desbloquear_objetos_registar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JPasswordField texto6,
            JButton boton1, JButton boton2) {
        texto1.setEditable(false);//id
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        boton1.setEnabled(false);//buscar
        boton2.setEnabled(true);//registrar
    }
//------------------------------------------------------------------------------
    //permite limpiar los objetos de registrar

    public void Limpiar_Objetos_registrar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4, JTextField texto6,
            JPasswordField texto7) {
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto6.setText("");
        texto7.setText("");
    }
//------------------------------------------------------------------------------
    //permite bloquear los objetos de consultar

    public void Bloquear_objetos_consultar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6, JPasswordField texto7) {
        texto1.setEditable(true);//id
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);

    }
//------------------------------------------------------------------------------
    ////permite limpiar los objetos de consultar 

    public void Limpiar_Objetos_consultar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4, JTextField texto6,
            JTextField texto5, JPasswordField texto7) {
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
    }
//------------------------------------------------------------------------------
    //permite bloquear los objetos de modificar

    public void Bloquear_objetos_modificar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6, JPasswordField texto7,
            JButton boton1, JButton boton2) {
        texto1.setEditable(true);//id
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        boton1.setEnabled(true);//buscar
        boton2.setEnabled(false);//modificar
    }
//------------------------------------------------------------------------------
    //permite limpiar los objetos de modificar 

    public void Limpiar_Objetos_modificar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4, JTextField texto6,
            JTextField texto5, JPasswordField texto7) {
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");

    }
    //------------------------------------------------------------------------------
    //permite bloquear los objetos de modificar

    public void Desbloquear_objetos_modificar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6, JPasswordField texto7,
            JButton boton1, JButton boton2) {
        texto1.setEditable(true);
        texto2.setEditable(true);
        texto3.setEditable(false);//id
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);
        boton1.setEnabled(false);//buscar
        boton2.setEnabled(true);//modificar
    }
}//final
