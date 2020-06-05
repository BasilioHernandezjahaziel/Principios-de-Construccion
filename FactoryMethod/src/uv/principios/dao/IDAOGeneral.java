/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.dao;

/**
 *
 * @author jahaziel1999
 */
public interface IDAOGeneral <T> {
    public boolean guardar(T pojo);
}
