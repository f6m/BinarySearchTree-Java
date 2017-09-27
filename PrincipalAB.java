// Para la compilacion...
// (1) Instalar el compilador:
// sudo apt-get install openjdk-7-jdk
// Si hay detalles con la version:
// update-alternatives --config java --> seleccionar openjdk-7
// Compilacion en el shell:
// $javac ab.java PrincipalAB.java -g
// la opcion -g es para activar el espulgador jdb
// Ejecución en el shell:
// $java PrincipalAB
// Para espulgar:
// $jdb PrincipalAB

// Detalles: Falta incluir la documentacion con javadoc, y agregar documentacion uml.
// Detalles: Falta hacer modificaciones como el menu general y los submenus.
// Detalles: Falta inclur los recorridos y la impresion del arbol, plantillas, borrado, etc.


import java.util.*; //usamos el paquete util, importando toas las clases
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrincipalAB {
public static void main( String args[] )
{
    JOptionPane.showMessageDialog(null,"Creando un Arbol Binario con Java!");

//System.out.println("Creando un Arbol Binario de Busqueda con Java!");

// Creamos una instancia (objeto) de la clase ab y le reservamos memoria
ab q = new ab();

//Insertamos nodos ... 
q.insertar(1);
q.insertar(3);
q.insertar(2);
q.insertar(5);
q.insertar(0);

//Buscamos datos en los nodos del arbol
/* if(q.buscar(1))
{
    // JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
    //System.out.println("Dato 1: disponible");
JOptionPane.showMessageDialog(null,"Dato 1: disponible");
}
else{ 
    //System.out.println("Dato 1; no encontrado");
JOptionPane.showMessageDialog(null,"Dato 1: no encontrado en ab");
}
//Buscamos datos en los nodos del arbol
if(q.buscar(10))
{
    //System.out.println("Dato 10: disponible");
JOptionPane.showMessageDialog(null,"Dato 10: disponible");

}
else{ 
    //System.out.println("Dato 10: no encontrado");
JOptionPane.showMessageDialog(null,"Dato 10: no encontado en ab");
}
*/
q.pre();
System.out.print("\n");
q.in();
System.out.print("\n");
q.pos();
System.out.print("\n");

JOptionPane.showMessageDialog(null,"Introduce el campo del nodo a borrar:");
q.borrar(3);
q.pre();
System.out.print("\n");

} //Fin main
} //Fin PrincipalAB

