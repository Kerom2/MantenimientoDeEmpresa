//En esta clase hacemos los queery para que este muestre en cada reporte sobre el interes de cada persona que igrese
package Registros;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MODELO_REPORTES {

    //intaciamos el conector para que conecte la tabla de mysql con netbeans
    CONECTADOR cn = new CONECTADOR();

    //Aqui inicia los procesos para realizar los reportes 
    public void cargartablaclientes(JTable JTable1) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            String query = "SELECT * FROM  tablacontactos";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("id"), linea, 0);
                JTable1.setValueAt(rs.getString("nombre_cont"), linea, 1);
                JTable1.setValueAt(rs.getString("dire"), linea, 2);
                JTable1.setValueAt(rs.getString("fecha_registro"), linea, 3);
                JTable1.setValueAt(rs.getString("fecha_cum"), linea, 4);
                JTable1.setValueAt(rs.getString("categoria"), linea, 5);
                JTable1.setValueAt(rs.getString("telefono_fijo"), linea, 6);
                JTable1.setValueAt(rs.getString("movil"), linea, 7);
                JTable1.setValueAt(rs.getString("correo"), linea, 8);
                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafilacont(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //En este procedimiento cargamos todo los uausarios que hayan  
    public void cargartablaUSUARIOS(JTable JTable1) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            String query = "SELECT * FROM  tablausuarios";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("id"), linea, 0);
                JTable1.setValueAt(rs.getString("nombre"), linea, 1);
                JTable1.setValueAt(rs.getString("login"), linea, 2);
                JTable1.setValueAt(rs.getString("nivel"), linea, 3);
                JTable1.setValueAt(rs.getString("fecha"), linea, 4);
                JTable1.setValueAt(rs.getString("correo"), linea, 5);
                JTable1.setValueAt(rs.getString("contra"), linea, 6);

                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafila(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //este procedimiento permite agregar nuevas filas a una tabla de tipo JTable en usuarios
    public void agregarnuevafila(JTable Table) {
        //define la variable temp de tipo defaulttablemodel y obtiene el modelo de la tabla predetermina
        DefaultTableModel temp = (DefaultTableModel) Table.getModel();
        Object nuevo[] = {"", "", "", "", "", "", ""};
        //define nuevo como un objeto de 7 columnas y  si fuese mas columnas ,entones se especifican las comillas dependiendo de la cantidad de la cantidad de columnas
        temp.addRow(nuevo);
        //Agrega una nueva fila a temp del tipo de objeto nuevo , donde nuevo tiene 5 columnas especifiacadas
    }

    //este procedimiento permite agregar nuevas filas a una tabla de tipo JTable en contactos
    public void agregarnuevafilacont(JTable Table) {
        //define la variable temo de tipo defaulttablemodel y obtiene el modelo de la tabla predetermina
        DefaultTableModel temp = (DefaultTableModel) Table.getModel();
        Object nuevo[] = {"", "", "", "", "", "", "", "", ""};
        //define nuevo como un objeto de 10 columnas y  si fuese mas columnas ,entones se especifican las comillas dependiendo de la cantidad de la cantidad de columnas
        temp.addRow(nuevo);
        //Agrega una nueva fila a temp del tipo de objeto nuevo , donde nuevo tiene 5 columnas especifiacadas

    }

    //este procedimiento permite agregar nuevas filas a una tabla de tipo JTable en usuarios
    public void agregarnuevafilabita(JTable Table) {
        //define la variable temp de tipo defaulttablemodel y obtiene el modelo de la tabla predetermina
        DefaultTableModel temp = (DefaultTableModel) Table.getModel();
        Object nuevo[] = {"", "", "", ""};
        //define nuevo como un objeto de 4 columnas y  si fuese mas columnas ,entones se especifican las comillas dependiendo de la cantidad de la cantidad de columnas
        temp.addRow(nuevo);
        //Agrega una nueva fila a temp del tipo de objeto nuevo , donde nuevo tiene 5 columnas especifiacadas
    }

    //En este procedimiento cargamos todo los usuarios dependiendo de su categoria
    public void cargartablacategoria(JTable JTable1, String Categoria) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //en este query ejecutatara ls instruccuin que dice que seleciona todo dependiendo de la categoria en el que el contacto escoja
            String query = "SELECT * FROM tabla_contactos WHERE categoria = '" + Categoria + "'";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("id"), linea, 0);
                JTable1.setValueAt(rs.getString("nombre_cont"), linea, 1);
                JTable1.setValueAt(rs.getString("dire"), linea, 2);
                JTable1.setValueAt(rs.getString("fecha_registro"), linea, 3);
                JTable1.setValueAt(rs.getString("fecha_cum"), linea, 4);
                JTable1.setValueAt(rs.getString("categoria"), linea, 5);
                JTable1.setValueAt(rs.getString("telefono_fijo"), linea, 6);
                JTable1.setValueAt(rs.getString("movil"), linea, 7);
                JTable1.setValueAt(rs.getString("correo"), linea, 8);
                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 9) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafilacont(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs

            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //En este procedimiento cargamos todo los usuarios dependiendo el nombre que ponga el usuario
    public void cargartablaclientespornombre(JTable JTable1, String nom) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //el simbolo de % nos ayuda a sustituir o remplazar los caracteres restantes del nombre o letra que estamos buscando
            String query = "SELECT * FROM tabla_contactos WHERE nombre_cont LIKE '" + nom + "%'";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variable rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("id"), linea, 0);
                JTable1.setValueAt(rs.getString("nombre_cont"), linea, 1);
                JTable1.setValueAt(rs.getString("dire"), linea, 2);
                JTable1.setValueAt(rs.getString("fecha_registro"), linea, 3);
                JTable1.setValueAt(rs.getString("fecha_cum"), linea, 4);
                JTable1.setValueAt(rs.getString("categoria"), linea, 5);
                JTable1.setValueAt(rs.getString("telefono_fijo"), linea, 6);
                JTable1.setValueAt(rs.getString("movil"), linea, 7);
                JTable1.setValueAt(rs.getString("correo"), linea, 8);
                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafila(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //En este procedimiento cargamos todo los contactos dependiendo de la fecha que solicite el usuario
    public void cargartablaclientesporfechani(JTable JTable1, String Fea) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //el simbolo de % nos ayuda a sustituir o remplazar los caracteres restantes del nombre o letra que estamos buscando
            String query = "SELECT * FROM tabla_contactos WHERE fecha_cum LIKE '" + Fea + "%'";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("id"), linea, 0);
                JTable1.setValueAt(rs.getString("nombre_cont"), linea, 1);
                JTable1.setValueAt(rs.getString("dire"), linea, 2);
                JTable1.setValueAt(rs.getString("fecha_registro"), linea, 3);
                JTable1.setValueAt(rs.getString("fecha_cum"), linea, 4);
                JTable1.setValueAt(rs.getString("categoria"), linea, 5);
                JTable1.setValueAt(rs.getString("telefono_fijo"), linea, 6);
                JTable1.setValueAt(rs.getString("movil"), linea, 7);
                JTable1.setValueAt(rs.getString("correo"), linea, 8);
                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafila(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //En este procedimiento cargamos todos los contactos que se muestren dependiendo de las fechas que este escoga ya sea fecha1 o fecha2
    public void cargartablacontactosentrefechas(JTable JTable1, String fecha1, String fecha2) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //En el query ejecutaremos la siguiente instruccion donde el usuario escogera alguna fecha inicial y luego otra final y mostrara
            //todos los contactos que este entre esas fechas
            String query = "SELECT * FROM tabla_contactos WHERE fecha_registro  >= '" + fecha1 + "' AND FECHAREGISTRO <= '" + fecha2 + "' ";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("id"), linea, 0);
                JTable1.setValueAt(rs.getString("nombre_cont"), linea, 1);
                JTable1.setValueAt(rs.getString("dire"), linea, 2);
                JTable1.setValueAt(rs.getString("fecha_registro"), linea, 3);
                JTable1.setValueAt(rs.getString("fecha_cum"), linea, 4);
                JTable1.setValueAt(rs.getString("categoria"), linea, 5);
                JTable1.setValueAt(rs.getString("telefono_fijo"), linea, 6);
                JTable1.setValueAt(rs.getString("movil"), linea, 7);
                JTable1.setValueAt(rs.getString("correo"), linea, 8);
                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafila(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //En este procedimiento programaremos que se muestren todos los usuarios dependiendo del nivel que escoja el usuario
    public void cargartablaUSUARIOSNIVEL(JTable JTable1, String nivel) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //Instruccion que dicta que se mostrara todo de la tablausuarios dependiendo el nivel
            String query = "SELECT * FROM tabla_usuarios WHERE nivel = '" + nivel + "'";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("id"), linea, 0);
                JTable1.setValueAt(rs.getString("nombre"), linea, 1);
                JTable1.setValueAt(rs.getString("login"), linea, 2);
                JTable1.setValueAt(rs.getString("nivel"), linea, 3);
                JTable1.setValueAt(rs.getString("fecha"), linea, 4);
                JTable1.setValueAt(rs.getString("correo"), linea, 5);
                JTable1.setValueAt(rs.getString("contra"), linea, 6);

                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafila(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //Aqui inicia los procesos para realizar los reportes de la bitacora
    public void cargarbitacora(JTable JTable1) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //en este query mostramos todo lo de la tablabitacora
            String query = "SELECT * FROM  tabla_bitacora";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("numMov"), linea, 0);
                JTable1.setValueAt(rs.getString("fechaMov"), linea, 1);
                JTable1.setValueAt(rs.getString("usuario"), linea, 2);
                JTable1.setValueAt(rs.getString("transRe"), linea, 3);

                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafilabita(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }
    //En este procedimiento cargamos todos los cambios que se muestren dependiendo de las fechas que este escoga ya sea fecha1 o fecha2

    public void cargartablacontactosentrefechasBITA(JTable JTable1, String fecha1, String fecha2) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //En el query ejecutaremos la siguiente instruccion donde el usuario escogera alguna fecha inicial y luego otra final y mostrara
            //todos los cambios que este entre esas fechas
            String query = "SELECT * FROM tabla_bitacora WHERE fechaMov  >= '" + fecha1 + "' AND FechaMovimiento <= '" + fecha2 + "' ";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("numMov"), linea, 0);
                JTable1.setValueAt(rs.getString("fechaMov"), linea, 1);
                JTable1.setValueAt(rs.getString("usuario"), linea, 2);
                JTable1.setValueAt(rs.getString("transRe"), linea, 3);

                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafilabita(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }

    //En este procedimiento cargamos todos los usuarios que se muestren dependiendo del usuario que este escoga 
    public void cargartablaBITACORAUSUARIOS(JTable JTable1, String Usu) {
        //esta variable linea sirve para seguir reportando en la tabla
        int linea = 0;
        try {
            cn.conectarbase();
            //En el query ejecutaremos la siguiente instruccion donde el usuario escribira alguna letra o nombre de la persona a buscar
            String query = "SELECT * FROM tabla_bitacora WHERE usuario LIKE '" + Usu + "%'";
            ResultSet rs = cn.Stmt.executeQuery(query);
            //Aqui ejecuta la instruccion sql en esta en el query y los resultados los guarda en la variablr rs que es de tipo RESULTSET
            rs.first();
            //este ciclo permite cargar todos los registros del rs en el jtable1
            do {
                JTable1.setValueAt(rs.getString("numMov"), linea, 0);
                JTable1.setValueAt(rs.getString("fechaMov"), linea, 1);
                JTable1.setValueAt(rs.getString("usuario"), linea, 2);
                JTable1.setValueAt(rs.getString("transRe"), linea, 3);

                linea++;//Incrementa la variable linea para que cuando va a cargar un nuevo registro se cargue en la siguiennte
                //del jtable1
                if (linea >= 4) {
                    //Este procedimiento permite agregar nievas filas o  lineas a la tabla jtable1
                    agregarnuevafilabita(JTable1);
                }
                rs.next();//accesa o mueve el puntero al siguiente registro del rs
            } while (rs != null);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            cn.desconectarbase();
        }
    }
}
