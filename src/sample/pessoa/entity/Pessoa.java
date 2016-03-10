package sample.pessoa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PESSOA
 * @generated
 */
@Entity
@Table(name = "\"PESSOA\"")
@NamedQueries({
        @NamedQuery(name = "pessoaList", query = "select p from Pessoa p"),
        @NamedQuery(name = "pessoaListByNome", query = "select p from Pessoa p where p.nome LIKE CONCAT('%', CONCAT(:nome,'%'))"),
        @NamedQuery(name = "pessoaListBySobrenome", query = "select p from Pessoa p where p.sobrenome LIKE CONCAT('%', CONCAT(:sobrenome,'%'))"),
        @NamedQuery(name = "pessoaListByCidade", query = "select p from Pessoa p where p.cidade.id = :id"),
        @NamedQuery(name = "pessoaListByAtivo", query = "select p from Pessoa p where p.ativo = :ativo")
})
@XmlRootElement
public class Pessoa implements Serializable {

  public String teste;

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1907817549l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id")
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Column(name = "nome", nullable = true, unique = false)
	private java.lang.String nome;
	
	/**
	 * @generated
	 */
	@Column(name = "sobrenome", nullable = true, unique = false)
	private java.lang.String sobrenome;
	
	/**
	 * @generated
	 */
	@Column(name = "ativo", nullable = true, unique = false)
	private java.lang.Boolean ativo;
	
	/**
	 * @generated
	 */
	@Column(name = "telefone", nullable = true, unique = false)
	private java.lang.String telefone;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="fk_cidade", referencedColumnName = "id")
	private Cidade cidade;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Pessoa(){
	}

	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.String getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	
	/**
	 * Obtém nome
	 * @param nome nome
	 * return nome
	 * @generated
	 */
	public java.lang.String getNome(){
		return this.nome;
	}
	
	/**
	 * Define nome
	 * @param nome nome
	 * @generated
	 */
	public void setNome(java.lang.String nome){
		this.nome = nome;
	}
	
	/**
	 * Obtém sobrenome
	 * @param sobrenome sobrenome
	 * return sobrenome
	 * @generated
	 */
	public java.lang.String getSobrenome(){
		return this.sobrenome;
	}
	
	/**
	 * Define sobrenome
	 * @param sobrenome sobrenome
	 * @generated
	 */
	public void setSobrenome(java.lang.String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	/**
	 * Obtém ativo
	 * @param ativo ativo
	 * return ativo
	 * @generated
	 */
	public java.lang.Boolean getAtivo(){
		return this.ativo;
	}
	
	/**
	 * Define ativo
	 * @param ativo ativo
	 * @generated
	 */
	public void setAtivo(java.lang.Boolean ativo){
		this.ativo = ativo;
	}
	
	/**
	 * Obtém telefone
	 * @param telefone telefone
	 * return telefone
	 * @generated
	 */
	public java.lang.String getTelefone(){
		return this.telefone;
	}
	
	/**
	 * Define telefone
	 * @param telefone telefone
	 * @generated
	 */
	public void setTelefone(java.lang.String telefone){
		this.telefone = telefone;
	}
	
	/**
	 * Obtém cidade
	 * @param cidade cidade
	 * return cidade
	 * @generated
	 */
	public Cidade getCidade(){
		return this.cidade;
	}
	
	/**
	 * Define cidade
	 * @param cidade cidade
	 * @generated
	 */
	public void setCidade(Cidade cidade){
		this.cidade = cidade;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
	
	/**
	 * @generated
	 */	
	@Override
  	public boolean equals(Object obj) {
    
	    if(this == obj)
	      return true;
	    
	    if(obj == null)
	      return false;
	    
	    if(!(obj instanceof Pessoa))
	      return false;
	    
	    Pessoa other = (Pessoa)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}