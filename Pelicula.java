
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int duracion;
    private int calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int ano, int duracion, int calidad)
    {
        super(titulo, ano);
        this.duracion = duracion;
        this.calidad = calidad;
    }

    /**
     * Metodo que devuelve la duracion de una pelicula
     * 
     * @return    La duracion en minutos
     */
    public int getDuracion()
    {
        return duracion;
    }

    /**
     *  Metodo que devuelve la calidad de una pelicula
     *  
     *  @return     La calidad en pixeles
     */
    public String getCalidad(){
        String cadenaADevolver = "HD";
        if (calidad == 1080) {
            cadenaADevolver = "FullHD";
        }
        return cadenaADevolver;
    }
}
