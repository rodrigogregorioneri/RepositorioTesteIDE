package sample.pessoa.business;

import sample.pessoa.dao.*;
import sample.pessoa.entity.*;
import sample.pessoa.dao.*;

import java.util.*;

/**
 * Classe que representa a camada de negócios de Pessoa
 * @generated
 **/
public class PessoaBusiness {

  /**
   * Instância da classe PessoaDAO que faz o acesso ao banco de dados
   * @generated
   */
  private PessoaDAO dao;
  
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
  public PessoaBusiness(final SessionManager sessionmanager) {
    // begin-user-code
    // end-user-code
    this.sessionManager = sessionmanager;
    this.dao = new PessoaDAO(sessionmanager.getEntityManager());
    // begin-user-code
    // end-user-code
  }
  
  /**
   * Construtor padrão, inicializa singleton de sessão
   * @generated modifiable   
   */
  public PessoaBusiness() {
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
  public void save(final Pessoa entity) {
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
  public void refresh(final Pessoa entity) {
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
  public Pessoa update(final Pessoa entity) {
    // begin-user-code
    // end-user-code  
	Pessoa updatedEntity = dao.update(entity);
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
  public void delete(final Pessoa entity){
    // begin-user-code
    // end-user-code    
	dao.delete(entity);
    // begin-user-code
    // end-user-code  	
  }
  
  /**
   * Remove a instância de Pessoa utilizando os identificadores
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
   * Obtém a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated modifiable
   */  
  public Pessoa findById(java.lang.String id){
    // begin-user-code
    // end-user-code  
    Pessoa entity = dao.findById(id);
    // begin-user-code
    // end-user-code      
    return entity;  
  }   
  

  
  /**
   * @generated modifiable
   */  	
  public List<Pessoa> list(int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Pessoa> result = dao.list(limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
  /**
   * @generated modifiable
   */  	
  public List<Pessoa> listByNome(java.lang.String nome, int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Pessoa> result = dao.listByNome(nome, limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
  /**
   * @generated modifiable
   */  	
  public List<Pessoa> listBySobrenome(java.lang.String sobrenome, int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Pessoa> result = dao.listBySobrenome(sobrenome, limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
  /**
   * @generated modifiable
   */  	
  public List<Pessoa> listByCidade(java.lang.String id, int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Pessoa> result = dao.listByCidade(id, limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
  /**
   * @generated modifiable
   */  	
  public List<Pessoa> listByAtivo(java.lang.Boolean ativo, int limit, int offset){
      // begin-user-code
      // end-user-code  
      List<Pessoa> result = dao.listByAtivo(ativo, limit, offset);
      // begin-user-code
      // end-user-code        
      return result;	
  }  
}
