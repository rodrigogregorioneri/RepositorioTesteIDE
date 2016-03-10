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
@Path("/Cidade")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class CidadeREST implements RESTService<Cidade> {
  /**
   * @generated
   */
  private SessionManager session;
  /**
   * @generated
   */  
  private CidadeBusiness business;
  /**
   * @generated
   */
  private PessoaBusiness pessoaBusiness;
  /**
   * @generated
   */  
  @Context 
  private HttpServletRequest request;

  /**
   * @generated
   */
  public CidadeREST() {
    this.session = SessionManager.getInstance();
    this.session.getEntityManager().clear();
    this.business = new CidadeBusiness(session);
    this.pessoaBusiness = new PessoaBusiness(session);
  }
  
  /**
   * @generated
   */  
  @POST
  public Response post(Cidade entity) {
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
  public Response put(Cidade entity) {
    try {
	    session.begin();
	    Cidade updatedEntity = business.update(entity);
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
  public Response putWithId(Cidade entity) {
    try {
	    session.begin();
	    Cidade updatedEntity = business.update(entity);
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
  public Response delete(Cidade entity) {  
		try {
			session.begin();
			Cidade updatedEntity = business.update(entity);
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
   * OneToMany Relationship GET
   * @generated
   */
  @GET
  @Path("/{instanceId}/Pessoa")
  public GenericEntity<List<Pessoa>> findPessoa(@PathParam("instanceId") java.lang.String instanceId, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset) {
    return new GenericEntity<List<Pessoa>>(this.business.findPessoa(instanceId, limit, offset)){};
  }
  
  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @DELETE
  @Path("/{instanceId}/Pessoa/{relationId}")
  public Response deletePessoa(@PathParam("relationId") java.lang.String relationId) {
		try {
			session.begin();
			if (this.pessoaBusiness.deleteById(relationId) > 0) {
				session.commit();
				return Response.ok().build();
			} else {
				session.rollBack();
				return Response.status(404).build();
			}
		} catch(Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);	
		}
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @PUT
  @Path("/{instanceId}/Pessoa/{relationId}")
  public Response putPessoa(Pessoa entity, @PathParam("relationId") java.lang.String relationId) {
		try {
			session.begin();
			Pessoa updatedEntity = this.pessoaBusiness.update(entity);
			session.commit();
			return Response.ok(updatedEntity).build();
		} catch(Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);	
		}
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @POST
  @Path("/{instanceId}/Pessoa")
  public Response postPessoa(Pessoa entity, @PathParam("instanceId") java.lang.String instanceId) {
		try {
			session.begin();
			Cidade cidade = this.business.findById(instanceId);
			entity.setCidade(cidade);
			this.pessoaBusiness.save(entity);
			session.commit();
			this.pessoaBusiness.refresh(entity);
			return Response.ok(entity).build();
		} catch(Exception exception) {
			session.rollBack();
			throw new CustomWebApplicationException(exception);	
		}
  }   
  


  
  /**
   * NamedQuery list
   * @generated
   */
  @GET
  	
  public GenericEntity<List<Cidade>> list(@DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Cidade>>(business.list(limit, offset)){};

  }
  /**
   * NamedQuery listByNome
   * @generated
   */
  @GET
  @Path("/listByNome/{nome}")	
  public GenericEntity<List<Cidade>> listByNome(@PathParam("nome")java.lang.String nome, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Cidade>>(business.listByNome(nome, limit, offset)){};

  }
	
  /**
   * NamedQuery listByNome
   * @generated
   */
  @GET
  @Path("/listByNome")	
  public GenericEntity<List<Cidade>> listByNomeParams(@QueryParam("nome")java.lang.String nome, @DefaultValue("100") @QueryParam("limit") int limit, @DefaultValue("0") @QueryParam("offset") int offset){
      return new GenericEntity<List<Cidade>>(business.listByNome(nome, limit, offset)){};	
  }
}
