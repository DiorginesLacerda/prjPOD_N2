package br.edu.qi.planetoffice.model;
// Generated 09/12/2018 19:07:56 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Filiacao generated by hbm2java
 */
@Entity
@Table(name="filiacao")
public class Filiacao  implements java.io.Serializable {


     private Integer idFiliacao;
     private Pessoa pessoa;
     private TipoFiliacao tipoFiliacao;
     private String descricao;

    public Filiacao() {
    }

    public Filiacao(Pessoa pessoa, TipoFiliacao tipoFiliacao, String descricao) {
       this.pessoa = pessoa;
       this.tipoFiliacao = tipoFiliacao;
       this.descricao = descricao;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idFiliacao", unique=true, nullable=false)
    public Integer getIdFiliacao() {
        return this.idFiliacao;
    }
    
    public void setIdFiliacao(Integer idFiliacao) {
        this.idFiliacao = idFiliacao;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPessoa")
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idTipo")
    public TipoFiliacao getTipoFiliacao() {
        return this.tipoFiliacao;
    }
    
    public void setTipoFiliacao(TipoFiliacao tipoFiliacao) {
        this.tipoFiliacao = tipoFiliacao;
    }

    
    @Column(name="descricao", length=15)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


