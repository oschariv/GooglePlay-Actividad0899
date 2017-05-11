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

    /**
     * Metodo que permite comprar un producto de la tienda GooglePlay.
     * 
     * @param cuenta String correo que firma la compra.
     * @param app String que identifica la aplicacion a comprar.
     * 
     * @return Error(-1) si no localiza la app o la cuenta y el precio de la compra si
     *           puede realizar la compra correctamente.
     */
    public double comprar(String cuenta, String app) {
        double totalCompra = -1;
        int contExt = 0;
        boolean usuLocalizado = false;
        int contInt = 0;
        boolean appLocalizada = false;

        while (contExt < listaUsuarios.size()) {
            if (cuenta.equals(listaUsuarios.get(contExt).getNombreCuenta()) 
                    && !usuLocalizado) {
                usuLocalizado = true;
                while (contInt < listaAplicaciones.size()) {
                    if (app.equals(listaAplicaciones.get(contInt).getDenominacion()) 
                            && !appLocalizada) {
                        appLocalizada = true;
                        listaUsuarios.get(contExt).addProductoComprado(listaAplicaciones.get(contInt));
                        
                    }
                    contInt++;
                }
            }

            contExt++;
        }

        return totalCompra;
    }
}






