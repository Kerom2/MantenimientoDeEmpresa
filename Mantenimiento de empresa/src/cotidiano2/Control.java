//CLASE CONTROL OBJETOS EN LA CUAL VAMOS A MANIPULAR EL ESTADO DE LOS OBJETOS QUE SE 
//TRABAJAN EN LOS FORMULARIOS
package cotidiano2;

import javax.swing.JTextField;


public class Control {
    //metodo que bloquea el campo jtextfield1 donde se encuentra la fecha
    public void bloquea_objetoMenu(JTextField texto1) {

        texto1.setEditable(false);

    }
}
