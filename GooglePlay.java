import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author Oscar Charro Rivera 
 * @version 1.0
 */
public class GooglePlay
{
    // instance variables - replace the example below with your own
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Producto> listaAplicaciones;

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        listaUsuarios = new ArrayList<Usuario>();
        listaAplicaciones = new ArrayList<Producto>();
    }

    /**
     * Metodo que Añade un nuevo usuario al arraylist listaUsuarios.
     * 
     * @param  cuenta Objeto de la clase usuario para añadir la cuenta.
     */
    public void addUsuario(Usuario cuenta)
    {
        listaUsuarios.add(cuenta);
    }

    /**
     * Metodo para obtener el numero de usuarios.
     * 
     * @return Devuelve el numero de usuarios.
     */
    public int getNumeroUsuarios(){
        return listaUsuarios.size();
    }
    
    /**
     * Metodo que Añade un nuevo usuario al arraylist listaUsuarios.
     * 
     * @param  cuenta Objeto de la clase usuario para añadir la cuenta.
     */
    public void addProducto(Producto producto)
    {
    listaAplicaciones.add(producto);
    }

    /**
     * Metodo para obtener el numero de usuarios.
     * 
     * @return Devuelve el numero de usuarios.
     */
    public int getNumeroProductos(){
        return listaAplicaciones.size();
    }
}










