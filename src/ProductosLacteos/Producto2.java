
package ProductosLacteos;

/**
 *
 * @author Raul Jesus Sierra
 */


public class Producto2 extends Lacteos {// atributos indicando la herencia de la clase prinicpal
    protected String Color, Sabor, Presentacion;
    protected int Costo;
    public Producto2(){
    }
    public Producto2(String Producto, int Precio, int Cantidad, String Color, String Sabor, int Costo, String Presentacion){//sobre carga
        super(Producto, Precio, Cantidad);//a través del super se hereda los atributos de la clase Lacteos
        this.Color=Color;
        this.Color=Color;
        this.Sabor=Sabor;
        this.Costo=Costo;
        this.Presentacion=Presentacion;
    }
    /*
    se añaden los getter y setter
    */
    public void setColor(String Color){
        this.Color=Color;
    }
    public String getColor(){
        return Color;
    }
    public void setSabor(String Sabor){
        this.Sabor=Sabor;
    }
    public String getSabor(){
        return Sabor;
    }
    public void setPresentacion(String Presentacion){
        this.Presentacion=Presentacion;
    }
    public String getPresentacion(){
        return Presentacion;
    }
    public void setCosto(int Costo){
        this.Costo=Costo;
    }
    public int getCosto(){
        return Costo;
    }
    public void imprimirProducto2(){//para imprimir
        Producto1 pr = new Producto1();
        pr.setProducto("Queso Holandes");
        pr.setColor("Amarillo con Cubierta Roja");
        pr.setSabor("Cremoso y salado");
        pr.setPresentacion("Unidad de 1 lb");
        pr.setCantidad(75);
        pr.setCosto(17500);
        pr.setPrecio(25000);
        System.out.println("Nombre del producto: "+pr.getProducto()+"\nColor: "+pr.getColor()+"\nSabor: "+pr.getSabor()+"\nPresentacion: "+pr.getPresentacion()+"\nCantidad en Bodega: "+pr.getCantidad());
        System.out.println("Costo: "+pr.getCosto()+"\nPrecio de Venta: "+pr.getPrecio()+"\n");
    }
    

 }
