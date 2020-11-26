
package ProductosLacteos;

/**
 *
 * @author Raulito
 */
public class main {
    /*
    Se traen los comportamientos de las clases hijas para ser imprimidos
    */
    public static void main (String [] args){
        Producto1 Objeto1=new Producto1 ();
        Producto2 Objeto2 = new Producto2();
        System.out.println("Producto 1");
        Objeto1.imprimirProducto1();
        System.out.println("Producto 2");
        Objeto2.imprimirProducto2();
      
        
    }
}
