
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

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**
     * Metedo que delvuelve el nombre de la aplicacion.
     * 
     * @return El nombre de la aplicacion
     */
    protected String getDenominacion(){
        return nombre;
    }
}
