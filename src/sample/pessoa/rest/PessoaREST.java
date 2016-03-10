package sample.pessoa.rest;


import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.persistence.*;

import sample.pessoa.rest.util.*;

import sample.pessoa.dao.*;
import sample.pessoa.entity.*;
import sample.pessoa.business.*;
import sample.pessoa.rest.exceptions.*;
import sample.pessoa.dao.*;
import javax.servlet.http.HttpServletRequest;



/**
 * Publicando metodos de negocio via REST
 * @generated
 **/
@Path("/Pessoa")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class PessoaREST implements RESTService<Pessoa> {
  /**
   * @generated
   */
  private SessionManager session;
  /**
   * @generated
   */  
  private PessoaBusiness business;
  /**
   * @generated
   */  
  @Context 
  private HttpServletRequest request;

  /**
   * @generated
   */
  public PessoaREST() {
    this.session = SessionManager.getInstance();
    this.session.getEntityManager().clear();
    this.business = new PessoaBusiness(session);
  }
  
  /**
   * @generated
   */  
  @POST
  public Response post(Pessoa entity) {
    try {
	    session.begin();
	    business.save(entity);
	    session.commit();
	    business.refresh(entity);
	    return Response.ok(entity).build();
    }
    
    catch(Exception exception){
	    session.rollBack();
        throw new CustomWebApplicationException(exception);
    }
  }

  /**
   * @generated
   */
  @PUT
  public Response put(Pessoa entity) {
    try {
	    session.begin();
	    Pessoa updatedEntity = business.update(entity);
	    session.commit();
	    return Response.ok(updatedEntity).build();
    }
    
    catch(Exception exception){
	    session.rollBack();
        throw new CustomWebApplicationException(exception);
    }  
  }
  
  /**
   * @generated
   */  
  @PUT
  @Path("/{id}")
  public Response putWithId(Pessoa entity) {
    try {
	    session.begin();
	    Pessoa updatedEntity = business.update(entity);
	    session.commit();
	    return Response.ok(updatedEntity).build();
    }
    
    catch(Exception exception){
	    session.rollBack();
        throw new CustomWebApplicationException(exception);
    }  
  }
  
  /**
   * @generated
   */  
  @DELETE
  public Response delete(Pessoa entity) {  
		try {
			session.begin();
			Pessoa updatedEntity = business.update(entity);
			business.delete(updatedEntity);
			session.commit();
			return Response.ok().build();
		}

		catch (Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);
		}    
  } 
   
  /**
   * @generated
   */    
  @DELETE
  @Path("/{id}")
  public Response delete(@PathParam("id") java.lang.String id) {  
		try {
			session.begin();
			if (business.deleteById(id) > 0) {
				session.commit();
				return Response.ok().build();
			} else {
				return Response.status(404).build();
			}
		}

		catch (Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);
		}    
  }
  
  
  


  
  /**
   * NamedQuery list
   * @generated
   */
  @GET
  	
  public GenericEntity<List<Pessoa>> list(@DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.list(limit, offset)){};

  }
  /**
   * NamedQuery listByNome
   * @generated
   */
  @GET
  @Path("/listByNome/{nome}")	
  public GenericEntity<List<Pessoa>> listByNome(@PathParam("nome")java.lang.String nome, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listByNome(nome, limit, offset)){};

  }
  /**
   * NamedQuery listBySobrenome
   * @generated
   */
  @GET
  @Path("/listBySobrenome/{sobrenome}")	
  public GenericEntity<List<Pessoa>> listBySobrenome(@PathParam("sobrenome")java.lang.String sobrenome, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listBySobrenome(sobrenome, limit, offset)){};

  }
  /**
   * NamedQuery listByCidade
   * @generated
   */
  @GET
  @Path("/listByCidade/{id}")	
  public GenericEntity<List<Pessoa>> listByCidade(@PathParam("id")java.lang.String id, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listByCidade(id, limit, offset)){};

  }
  /**
   * NamedQuery listByAtivo
   * @generated
   */
  @GET
  @Path("/listByAtivo/{ativo}")	
  public GenericEntity<List<Pessoa>> listByAtivo(@PathParam("ativo")java.lang.Boolean ativo, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listByAtivo(ativo, limit, offset)){};

  }
	
  /**
   * NamedQuery listByNome
   * @generated
   */
  @GET
  @Path("/listByNome")	
  public GenericEntity<List<Pessoa>> listByNomeParams(@QueryParam("nome")java.lang.String nome, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listByNome(nome, limit, offset)){};	
  }
  /**
   * NamedQuery listBySobrenome
   * @generated
   */
  @GET
  @Path("/listBySobrenome")	
  public GenericEntity<List<Pessoa>> listBySobrenomeParams(@QueryParam("sobrenome")java.lang.String sobrenome, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listBySobrenome(sobrenome, limit, offset)){};	
  }
  /**
   * NamedQuery listByCidade
   * @generated
   */
  @GET
  @Path("/listByCidade")	
  public GenericEntity<List<Pessoa>> listByCidadeParams(@QueryParam("id")java.lang.String id, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listByCidade(id, limit, offset)){};	
  }
  /**
   * NamedQuery listByAtivo
   * @generated
   */
  @GET
  @Path("/listByAtivo")	
  public GenericEntity<List<Pessoa>> listByAtivoParams(@QueryParam("ativo")java.lang.Boolean ativo, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Pessoa>>(business.listByAtivo(ativo, limit, offset)){};	
  }
}
