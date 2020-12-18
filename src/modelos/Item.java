package modelos;

/**
 * Contiene los datos de un objeto
 *
 * @version 09/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas
 */
public class Item {

    private int id;
    private String nombre;
    private String descripcion;
    private String rutaImagen;

    /**
     * Constructor vacio
     */
    public Item() {

    }

    /**
     * Constructor con parámetros del Item
     *
     * @param id Codigo del item
     * @param nombre Nombre del item
     * @param descripcion Descripcion del item
     * @param rutaImagen Ruta del item
     */
    public Item(int id, String nombre, String descripcion, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Obtiene el codigo del item
     *
     * @return Codigo del item
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el codigo del item
     *
     * @param id Codigo del item
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el codigo del item
     *
     * @return Codigo del item
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del item
     *
     * @param nombre Nombre del item
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la Descripcion del item
     *
     * @return Descripcion del item
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcio del item
     *
     * @param descripcion Descripcion del item
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la ruta de la imagen
     *
     * @return Imagen del item
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Establece la ruta de la imagen
     *
     * @param rutaImagen Ruta de la imagen
     */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

}
