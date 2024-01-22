//esta es la clase valdaciones que permite validar que al digitar datos por el usuario
//no permita digitar numeros cuando el campo texto acepte letras y viceversa.
package cotidiano2;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Validaciones {
    //procdimiento para que acepte sollo numeros cuando se escribe en un campo texto.
    public void SoloNum (java.awt.event.KeyEvent evt){
        //aqui obtiene el caracter de la tecla digitada por el ususario.
        char a  = evt.getKeyChar();
        //este if controla si el caracter si el carcacter es distinto de las 
        //teclaas especificas
        if (a != KeyEvent.VK_BACK_SPACE && a != KeyEvent.VK_DELETE && 
                a != KeyEvent.VK_ENTER){
            //aqui compara si el caracter ingresado es un digito
            if (!Character.isDigit(a)){
                JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", 
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                //consume libera/limpia el ultimo evento realizado
                evt.consume();
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////
    //procedimiento para que acepte solo letras en un campo txto cundo se llama
    public void SoloLet (java.awt.event.KeyEvent evt){
        char a = evt.getKeyChar();
        //este if controla si el caracter si el carcacter es distinto de las 
        //teclaas especificas
        if (a != KeyEvent.VK_BACK_SPACE && a != KeyEvent.VK_DELETE && 
                a != KeyEvent.VK_ENTER){
            //aqui compara si el caracter ingresado es un digito
            if (Character.isDigit(a)){
                JOptionPane.showMessageDialog(null, "Solo puede ingresar letras", 
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                //consume libera/limpia el ultimo evento realizado
                evt.consume();
            }
        }
        
    }
    
    
    
}//final
