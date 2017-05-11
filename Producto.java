
/**
 * Write a description of class Producto here.
 * 
 * @author Oscar Charro Rivera 
 * @version 1.0
 */
public abstract class Producto
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int vecesVendida;
    
    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombre)
    {
        this.nombre = nombre;
        vecesVendida = 0;
    }
    
    /**
     * Metedo que delvuelve el nombre de la aplicacion.
     * 
     * @return El nombre de la aplicacion
     */
    protected String getDenominacion(){
        return nombre;
    }
    
    /**
     * Metodo que devuelve el numero de veces que se ha vendido una aplicacion
     * 
     * @return Entero con el numero de ventas.
     */
    public int getVecesVendida(){
        return vecesVendida;
    }
    
    /**
     * Metedo que establece una nueva venta para la aplicacion.
     */
    public void setVenta(){
        vecesVendida++;
    }
    
    public abstract double calcularPrecio();
}
