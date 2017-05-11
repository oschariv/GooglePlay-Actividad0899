
/**
 * Write a description of class Multimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    // instance variables - replace the example below with your own
    private int ano;

    /**
     * Constructor for objects of class Multimedia
     */
    public ProductoMultimedia(String titulo, int ano)
    {
        super(titulo);
        this.ano = ano;
    }

    /**
     * Metodo que devuelve el titulo del producto multimedia
     * 
     * @return     el titulo
     */
    public String getTitulo()
    {
        return super.getDenominacion();
    }

    /**
     * Metodo que devuelve el año del producto multimedia.
     * 
     * @return     el año del producto multimedia
     */
    public int getAno()
    {
        return ano;
    }
}
