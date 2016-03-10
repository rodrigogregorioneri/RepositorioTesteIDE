package sample.pessoa.dao;

import javax.persistence.*;
import sample.pessoa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class PessoaDAO extends BasicDAO<String, Pessoa> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1907817549l;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public PessoaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }



  /**
   * Remove a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM Pessoa entity WHERE entity.id = :id");
      query.setParameter("id", id);
           
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Pessoa findById(java.lang.String id){
      TypedQuery<Pessoa> query = this.entityManager.createQuery("SELECT entity FROM Pessoa entity WHERE entity.id = :id", Pessoa.class);
      query.setParameter("id", id);
           
      return query.getSingleResult();	
  }



  /**
   * NamedQuery list
   * @generated
   */
  public List<Pessoa> list(int limit, int offset){
      return this.entityManager.createNamedQuery("pessoaList", Pessoa.class).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
  /**
   * NamedQuery listByNome
   * @generated
   */
  public List<Pessoa> listByNome(java.lang.String nome, int limit, int offset){
      return this.entityManager.createNamedQuery("pessoaListByNome", Pessoa.class).setParameter("nome", nome).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
  /**
   * NamedQuery listBySobrenome
   * @generated
   */
  public List<Pessoa> listBySobrenome(java.lang.String sobrenome, int limit, int offset){
      return this.entityManager.createNamedQuery("pessoaListBySobrenome", Pessoa.class).setParameter("sobrenome", sobrenome).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
  /**
   * NamedQuery listByCidade
   * @generated
   */
  public List<Pessoa> listByCidade(java.lang.String id, int limit, int offset){
      return this.entityManager.createNamedQuery("pessoaListByCidade", Pessoa.class).setParameter("id", id).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
  /**
   * NamedQuery listByAtivo
   * @generated
   */
  public List<Pessoa> listByAtivo(java.lang.Boolean ativo, int limit, int offset){
      return this.entityManager.createNamedQuery("pessoaListByAtivo", Pessoa.class).setParameter("ativo", ativo).setFirstResult(offset).setMaxResults(limit).getResultList();		
  }
  
}