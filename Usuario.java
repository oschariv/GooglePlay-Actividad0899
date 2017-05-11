
/**
 * Write a description of class Usuario here.
 * 
 * @author Oscar Charro Rivera 
 * @version 1.0
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String correoElectronico;

    /**
     * Constructor for objects of class Usuario
     * 
     * @param correoElectronico String para añadir el correo electronico.
     */
    public Usuario(String correoElectronico)
    {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Metodo que devuelve un String que contiene el correo electronico del usuario.
     * 
     * @return     El correo electronico 
     */
    public String getNombreCuenta()
    {
        return correoElectronico;
    }
}
