package sample.pessoa.business;

import sample.pessoa.dao.*;
import sample.pessoa.entity.*;
import sample.pessoa.dao.*;

import java.util.*;

/**
 * Classe que representa a camada de negócios de Cidade
 * @generated
 **/
public class CidadeBusiness {

  /**
   * Instância da classe CidadeDAO que faz o acesso ao banco de dados
   * @generated
   */
  private CidadeDAO dao;
  
  /**
   * Singleton de sessão usado para abrir e fechar conexão com o banco de dados
   * @generated
   */
  protected SessionManager sessionManager;
	
  /**
   * Copia referência da sessão e instancia DAO relacionada à essa classe para manipular o banco de dados
   * 
   * @param sessionmanager
   *          Singleton de sessão
   * @generated modifiable
   */
  public CidadeBusiness(final SessionManager sessionmanager) {
    // begin-user-code
    // end-user-code
    this.sessionManager = sessionmanager;
    this.dao = new CidadeDAO(sessionmanager.getEntityManager());
    // begin-user-code
    // end-user-code
  }
  
  /**
   * Construtor padrão, inicializa singleton de sessão
   * @generated modifiable   
   */
  public CidadeBusiness() {
    // begin-user-code
    // end-user-code  
    this(SessionManager.getInstance());
    // begin-user-code
    // end-user-code    
  }	

  /**
   * Grava valor no banco
   * 
   * @param entity Linha da tabela a ser persistida no banco de dados
   * @generated modifiable   
   */
  public void save(final Cidade entity) {
    // begin-user-code
    // end-user-code  
    dao.save(entity);
    // begin-user-code
    // end-user-code    
  }
  
  /**
   * Dá um refresh na entidade com valores valor no banco
   * 
   * @param entity Entidade
   * @generated modifiable
   */
  public void refresh(final Cidade entity) {
    // begin-user-code
    // end-user-code  
    dao.refresh(entity);
    // begin-user-code
    // end-user-code  
  }  
  
  /**
   * Atualiza valor do banco
   * 
   * @param entity Linha da tabela a ser atualizada
   * @generated modifiable   
   */
  public Cidade update(final Cidade entity) {
    // begin-user-code
    // end-user-code  
	Cidade updatedEntity = dao.update(entity);
    // begin-user-code
    // end-user-code	
    return updatedEntity;
  }
  
  /**
   * Apaga valor do banco
   * 
   * @param entity Linha da tabela a ser excluída
   * @generated modifiable   
   */
  public void delete(final Cidade entity){
    // begin-user-code
    // end-user-code    
	dao.delete(entity);
    // begin-user-code
    // end-user-code  	
  }
  
  /**
   * Remove a instância de Cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated modifiable   
   */  
  public int deleteById(java.lang.String id){
    // begin-user-code
    // end-user-code  
    int result = dao.deleteById(id);
    // begin-user-code
    // end-user-code    
    return result;    
  }  
  
  /**
   * Obtém a instância de Cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated modifiable
   */  
  public Cidade findById(java.lang.String id){
    // begin-user-code
    // end-user-code  
    Cidade entity = dao.findById(id);
    // begin-user-code
    // end-user-code      
    return entity;  
  }   
  
  /**
   * @generated modifiable
   */  
  public List<Pessoa> findPessoa(java.lang.String id, int limit, int offset) {
      // begin-user-code
      // end-user-code  
      List<Pessoa> result = dao.findPessoa(id, limit, offset);
      // begin-user-code  
      // end-user-code        
      return result;	  
  }


  
  /**
   * @generated modifiable
   */  	
  public List<Cidade> list(int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Cidade> result = dao.list(limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
  /**
   * @generated modifiable
   */  	
  public List<Cidade> listByNome(java.lang.String nome, int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Cidade> result = dao.listByNome(nome, limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
}
