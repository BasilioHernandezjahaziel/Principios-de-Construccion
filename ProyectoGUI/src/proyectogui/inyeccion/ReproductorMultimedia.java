
package proyectogui.inyeccion;

/**
 *
 * @author gabrielhs
 */
public class ReproductorMultimedia {
    public void play(IMedio medio ){
    medio.beginplay();
    }
    
    public void stop(IMedio medio){
    medio.stoplay();
    }
}
