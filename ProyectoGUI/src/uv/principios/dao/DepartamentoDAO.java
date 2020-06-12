
package uv.principios.dao;

import proyectogui.db.ConexionDB;

/**
 *
 * @author gabrielhs, jahaziel y david
 */
public class DepartamentoDAO implements IDAOGeneral <Departamento>{

    @Override
    public boolean guardar(Departamento pojo) {
        boolean res=false;
        ConexionDB con= ConexionDB.getInstance();
        String sql = "insert into departamentos (clave,nombre) values ('" +
                pojo.getClave() + "','" + pojo.getNombre() + "')";
        res = con.execute(sql);
        return res;
    }
    
    @Override
    public boolean eliminar(Departamento pojo) {
        boolean res=false;
        ConexionDB con= ConexionDB.getInstance();
        String sql = "DELETE FROM departamentos WHERE clave =" + "'" + pojo.getClave() + "'";
        res = con.execute(sql);
        return res;
    }

    
    
    




    
}
