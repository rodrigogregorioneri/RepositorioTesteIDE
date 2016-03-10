package sample.pessoa.dao;

import javax.persistence.*;
import sample.pessoa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class CidadeDAO extends BasicDAO<String, Cidade> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 2018200409l;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public CidadeDAO(EntityManager entitymanager) {
    super(entitymanager);
  }



  /**
   * Remove a instância de Cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM Cidade entity WHERE entity.id = :id");
      query.setParameter("id", id);
           
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Cidade findById(java.lang.String id){
      TypedQuery<Cidade> query = this.entityManager.createQuery("SELECT entity FROM Cidade entity WHERE entity.id = :id", Cidade.class);
      query.setParameter("id", id);
           
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Pessoa> findPessoa(java.lang.String id, int limit, int offset) {
      TypedQuery<Pessoa> query = this.entityManager.createQuery("SELECT entity FROM Pessoa entity WHERE entity.cidade.id = :id", Pessoa.class);
      query.setParameter("id", id);

      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }


  /**
   * NamedQuery list
   * @generated
   */
  public List<Cidade> list(int limit, int offset){
      return this.entityManager.createNamedQuery("cidadeList", Cidade.class).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
  /**
   * NamedQuery listByNome
   * @generated
   */
  public List<Cidade> listByNome(java.lang.String nome, int limit, int offset){
      return this.entityManager.createNamedQuery("cidadeListByNome", Cidade.class).setParameter("nome", nome).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
}