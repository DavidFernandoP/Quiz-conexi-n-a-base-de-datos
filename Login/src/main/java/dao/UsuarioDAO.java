/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelo.Usuario;

/**
 *
 * @author David Parra
 */
@Stateless
public class UsuarioDAO {
    
    /*@PersistenceContext(unitName = "LoginPU")
    private EntityManager em;
    
    public void crear(Usuario entity){
        em.persist(entity);
    }
    
    public void editar(Usuario entity){
        em.merge(entity);
    }
    
    public void eliminar(Usuario entity){
        em.remove( em.merge(entity));
    }
    public Usuario encontrarUsuarioPorLogin(String correo, String clave){
        Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.correo= :mail AND u.clave = :pass", Usuario.class);
        q.setParameter("mail", correo);
        q.setParameter("pass", clave);
        return (Usuario) q.getSingleResult();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")*/
}
