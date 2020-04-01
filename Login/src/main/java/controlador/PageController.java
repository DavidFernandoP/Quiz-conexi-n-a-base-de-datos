/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

//import java.util.ArrayList;

import dao.UsuarioDAO;
import java.io.IOException;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import modelo.Usuario;

//import java.util.List;
//import modelo.TipoUsuario;
//import modelo.Usuario;

/**
 *
 * @author David Parra
 */
public class PageController {
    
    private Usuario usuario;
    private Usuario usuarioAutenticado = null;
    
    //private final static logger LOGGER = 
    
    @EJB
    private UsuarioDAO ejbDao;

    /*String correo;
    String clave;
    
    Usuario usuarioAutentificado;
    List<Usuario> listadoUsuarios;*/
    
    public PageController() {
        
        usuario = new Usuario();
        
        /*listadoUsuarios = new ArrayList<>();
        listadoUsuarios.add(new Usuario("David", "1", "David", "Parra", "Masculino", "Sistemas", false, 'a', TipoUsuario.Administrativo));
        listadoUsuarios.add(new Usuario("Carlos", "1", "David", "Parra", "Masculino", "Sistemas", false, 'a', TipoUsuario.Administrativo));
        listadoUsuarios.add(new Usuario("Miguel", "1", "David", "Parra", "Masculino", "Sistemas", false, 'a', TipoUsuario.Administrativo));
        listadoUsuarios.add(new Usuario("Silvia", "1", "David", "Parra", "Masculino", "Sistemas", false, 'a', TipoUsuario.Administrativo));*/
        
    }
    
    public void login() throws IOException{
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        
        //usuarioAutenticado = ejbDao.encontrarUsuarioPorLogin(usuario.getCorreo(), usuario.getClave());
        
        if(usuarioAutenticado!=null){
            ctx.getExternalContext().redirect("home");
        }else{
            ctx.getExternalContext().redirect("index");
        }
    
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
