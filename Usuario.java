import java.util.ArrayList;
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
    private ArrayList<Producto> listaAplicacionesCompradas;

    /**
     * Constructor for objects of class Usuario
     * 
     * @param correoElectronico String para añadir el correo electronico.
     */
    public Usuario(String correoElectronico)
    {
        this.correoElectronico = correoElectronico;
        listaAplicacionesCompradas = new ArrayList<Producto>();
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
    
    /**
     * Metodo que añade un Producto compradado.
     * 
     * @param producto Producto que compra el usuario
     */
    public void addProductoComprado(Producto producto){
        listaAplicacionesCompradas.add(producto);
    }
}
