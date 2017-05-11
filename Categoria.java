
/**
 * Enumeration class Categoria - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Categoria
{
    JUEGOS("Juegos"), 

    PRODUCTIVIDAD("Productividad"), 

    COMUNICACIONES("Comunicaciones"), 

    MULTIMEDIA("Multimedia");

    //Atributos
    private String nombre;

    /**
     * Constructor de la clase enum Categoria
     * 
     *  @param nombreCat String para añadir el nombre de la categoria.
     */
    private Categoria(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que retorna un String con el nombre de la categoria.
     * 
     * @return El nombre de la categoria
     */
    public String getNombreCategoria(){
        return nombre;
    }
}
