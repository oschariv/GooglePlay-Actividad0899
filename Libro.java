
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int numPaginas;
    private boolean ficcion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, int ano, int numPaginas, boolean ficcion)
    {
        super(titulo, ano);
        this.numPaginas = numPaginas;
        this.ficcion = ficcion;
    }
    
    /**
     * Metodo que devuelve el numero de paginas de un libro.
     * 
     * @return     El numero de paginas
     */
    public int getNumeroPaginas()
    {
        return numPaginas;
    }
    
    /**
     * Metodo que devuelve si un libro es de ficcion o no.
     * 
     * @return     Si es de ficcion(True) o no(False)
     */
    public boolean getFiccion()
    {
        return ficcion;
    }
}
