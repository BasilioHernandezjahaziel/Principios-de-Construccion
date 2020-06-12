
package uv.principios.dao;

/**
 *
 * @author gabrielhs, jahaziel y david
 */
public interface IDAOGeneral<T> {
    public boolean guardar (T pojo);
    public boolean eliminar(T pojo);
}
