
package ProductosLacteos;

/**
 *
 * @author Raul Jesus Sierra
 */
public class Lacteos {
    public String Producto;
    public int Precio, Cantidad;
    
    public Lacteos(){
    }
    public Lacteos (String Producto, int Precio, int Cantidad){
        super();
        this.Producto=Producto;
        this.Precio=Precio;
        this.Cantidad=Cantidad;
    }
    
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
