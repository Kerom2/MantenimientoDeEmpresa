
package Clientes;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Control_Clientes {
    
        //metodo que bloquea objetos en formas de registro de clientes
    public void Bloquear_objetos_registar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6,
            JTextField texto7,
            JTextField texto9, JTextField texto0,
            JButton boton1, JButton boton2) {
        texto1.setEditable(true);//id
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        texto9.setEditable(false);
        texto0.setEditable(false);
        boton1.setEnabled(true);//buscar
        boton2.setEnabled(false);//registrar
    }
//------------------------------------------------------------------------------
    //metodo que bloquea objetos en formas de registro de clientes

    public void Desbloquear_objetos_registrar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4, JTextField texto5,
            JTextField texto6, JTextField texto7, JTextField texto8,
            JTextField texto9, JButton boton1, JButton boton2) {
        texto1.setEditable(false);//id
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);
        texto8.setEditable(true);
        texto9.setEditable(true);
        boton1.setEnabled(false);//buscar
        boton2.setEnabled(true);//registrar
    }
//------------------------------------------------------------------------------   
    //permite limpiar los campos textos

    public void Limpiar_Objetos_registrar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4, JTextField texto5,
            JTextField texto6, JTextField texto7, JTextField texto8,
            JTextField texto9) {
        texto1.setText(" ");
        texto2.setText(" ");
        texto3.setText(" ");
        texto4.setText(" ");
        texto5.setText(" ");
        texto6.setText(" ");
        texto7.setText(" ");
        texto8.setText(" ");
        texto9.setText(" ");

    }
//------------------------------------------------------------------------------ 
    //permite imprimir los datos enn el combo direccion

    public void CargarComboDireccion(JComboBox combo) {
        combo.addItem("San José");
        combo.addItem("Alajuela");
        combo.addItem("Cartago");
        combo.addItem("Heredia");
        combo.addItem("Guanacaste");
        combo.addItem("Puntarenas");
        combo.addItem("Limón");
    }
//------------------------------------------------------------------------------
    //permite imprimir los datos en el combo  de catgerias
    public void CargarComboCat(JComboBox combo) {
        combo.addItem("Personal");
        combo.addItem("Compañero");
        combo.addItem("Trabajo");
        combo.addItem("Confidencial");
    }
////////////////////////////////////////////////////////////////////////////////    
    //metodo que bloquea objetos en formas de registro de clientes

    public void Bloquear_objetos_consultar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10, JTextField texto11) {
        texto1.setEditable(true);//id
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        texto8.setEditable(false);
        texto9.setEditable(false);
        texto10.setEditable(false);
        texto11.setEditable(false);
    }
//------------------------------------------------------------------------------
    //permite limpiar los campos textos

    public void Limpiar_Componentes_consultar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10, JTextField texto11) {
        texto1.setText(" ");
        texto2.setText(" ");
        texto3.setText(" ");
        texto4.setText(" ");
        texto5.setText(" ");
        texto6.setText(" ");
        texto7.setText(" ");
        texto8.setText(" ");
        texto9.setText(" ");
        texto10.setText(" ");
        texto11.setText(" ");
    }

//------------------------------------------------------------------------------
    //metodo que bloquea objetos en formas de registro de clientes
    public void Bloquear_objetos_Modificar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10,
            JTextField texto11, JButton boton1, JButton boton2) {
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
        texto11.setEditable(false);
        boton1.setEnabled(false); //modificar
        boton2.setEnabled(true); //buscar
    }
//------------------------------------------------------------------------------
    //metodo que bloquea objetos en formas de registro de clientes

    public void Desbloquear_objetos_Modificar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10,
            JTextField texto11, JButton boton1, JButton boton2) {
        texto1.setEditable(false);
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);
        texto8.setEditable(true);
        texto9.setEditable(true);
        texto10.setEditable(true);
        texto11.setEditable(true);
        boton1.setEnabled(true); //modificar
        boton2.setEnabled(false); //buscar
    }
//------------------------------------------------------------------------------
    //permite limpiar los campos textos

    public void Limpiar_Componentes_Modificar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4, JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10,
            JTextField texto11) {
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
        texto11.setText("");
    }
//------------------------------------------------------------------------------
    //metodo que bloquea objetos en formas de registro de clientes
    public void Bloquear_objetos_Eliminar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10,
            JTextField texto11, JButton boton1, JButton boton2) {
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
        texto11.setEditable(false);
        boton1.setEnabled(false); //eliminar
        boton2.setEnabled(true); //buscar
    }
//------------------------------------------------------------------------------
    //permite limpiar los campos textos

    public void Limpiar_Componentes_Eliminar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4, JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10,
            JTextField texto11) {
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
        texto11.setText("");
    }
//------------------------------------------------------------------------------
        //metodo que bloquea objetos en formas de registro de clientes

    public void Desbloquear_objetos_Eliminar(JTextField texto1, JTextField texto2,
            JTextField texto3, JTextField texto4,
            JTextField texto5, JTextField texto6,
            JTextField texto7, JTextField texto8,
            JTextField texto9, JTextField texto10,
            JTextField texto11, JButton boton1, JButton boton2) {
        texto1.setEditable(false);
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(true);
        texto8.setEditable(true);
        texto9.setEditable(true);
        texto10.setEditable(true);
        texto11.setEditable(true);
        boton1.setEnabled(true); //eliminar
        boton2.setEnabled(false); //buscar
    }
    
}
