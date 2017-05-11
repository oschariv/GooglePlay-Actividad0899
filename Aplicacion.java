
/**
 * Write a description of class Aplicacion here.
 * 
 * @author Oscar Charro Rivera 
 * @version 1.0
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private double tamano;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre, double tamano, Categoria categoria)
    {
        super(nombre);
        this.tamano = tamano;
        this.categoria = categoria;
    }

    /**
     * Metodo que devuelve el tamaño de la aplicacion.
     * 
     * @return     El tamaño en MB. 
     */
    public double getTamanoEnMB()
    {
        return tamano;
    }

    /**
     * Metodo que devuelve la categoria de la aplicacion.
     * 
     * @return La categoria
     */
    public String getCategoria(){
        return categoria.getNombreCategoria();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        return super.getDenominacion();
    }
}
