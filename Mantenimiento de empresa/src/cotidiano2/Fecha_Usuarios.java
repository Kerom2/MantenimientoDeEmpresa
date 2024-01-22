
package cotidiano2;
//importamosla clase que nos permite usar los comandos que obtienen la fecha del sisstema
import java.util.Date;

//esta es la clase fecha sistema
public class Fecha_Usuarios {
    //funcion que nos permite obtener y desplegar la fecha actual
    public String fecha()
    {
        //variables de la funcion
        int dia, mes, anio;
        
        //define y construye F del tipo de clase date
        Date f = new Date ();
        
        //la funcion get day permite obtener el dia de la fecha del sistema
        //y lo asigna a la variable
        dia = f.getDate();
        
        //la funcion get month permite obtener el año de la fecha del sistema
        //y lo asigna a la variable. se le suma 1 poque el mes lo obtiene
        //a partir del numero 0.
        mes = f.getMonth()+1;
        
        //la funcion get year permite obtener el año de la fecha del sistema
        //y lo asigna a la variable. usa el formato en 2 digitos entonces se le
        //suma 1900 para que trabaje en formato de 4 digitos.
        anio = f.getYear() + 1900;
        
       //retorna la fecha en el formato epecífico.
       return dia + "/" + mes + "/" + anio;
    } 
}
