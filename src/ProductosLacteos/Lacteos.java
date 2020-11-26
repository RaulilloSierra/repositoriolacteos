
package ProductosLacteos;

/**
 *
 * @author Raul Jesus Sierra
 */
public class Lacteos {//atributos
    public String Producto;
    public int Precio, Cantidad;
    
    public Lacteos(){//por defecto
    }
    public Lacteos (String Producto, int Precio, int Cantidad){//sobrecarga y super 
        super();
        this.Producto=Producto;
        this.Precio=Precio;
        this.Cantidad=Cantidad;
    }
    /*
    A contiancion se programan los objetos setter y getter
    */
    public void setProducto(String Producto){
        this.Producto=Producto;
    }
    public String getProducto(){
        return Producto;
    }
    public void setPrecio(int Precio){
        this.Precio=Precio;
    }
    public int getPrecio(){
        return Precio;
    }
    public void setCantidad(int Cantidad){
        this.Cantidad=Cantidad;
    }
    public int getCantidad(){
        return Cantidad;
    }
}
