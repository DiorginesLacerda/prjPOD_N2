package br.edu.qi.planetoffice.model;
// Generated 09/12/2018 19:07:56 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="horario_pessoa")
public class HorarioPessoa  implements java.io.Serializable {


     private HorarioPessoaId id;
     private Horario horario;
     private Pessoa pessoa;
     private Integer ano;
     private String situacao;

    public HorarioPessoa() {
    }

	
    public HorarioPessoa(HorarioPessoaId id, Horario horario, Pessoa pessoa) {
        this.id = id;
        this.horario = horario;
        this.pessoa = pessoa;
    }
    public HorarioPessoa(HorarioPessoaId id, Horario horario, Pessoa pessoa, Integer ano, String situacao) {
       this.id = id;
       this.horario = horario;
       this.pessoa = pessoa;
       this.ano = ano;
       this.situacao = situacao;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idPessoa", column=@Column(name="idPessoa", nullable=false) ), 
        @AttributeOverride(name="idHorario", column=@Column(name="idHorario", nullable=false) ) } )
    public HorarioPessoaId getId() {
        return this.id;
    }
    
    public void setId(HorarioPessoaId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idHorario", nullable=false, insertable=false, updatable=false)
    public Horario getHorario() {
        return this.horario;
    }
    
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPessoa", nullable=false, insertable=false, updatable=false)
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    @Column(name="ano")
    public Integer getAno() {
        return this.ano;
    }
    
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    
    @Column(name="situacao", length=15)
    public String getSituacao() {
        return this.situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }




}


