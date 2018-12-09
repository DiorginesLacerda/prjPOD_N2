package br.edu.qi.planetoffice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="etnias")
public class Etnia {

	   private Integer idEtnia;
       private String descricao;
       private Set<Pessoa> pessoas = new HashSet<Pessoa>(0);

       public Etnia() {
       }

       public Etnia(String descricao, Set<Pessoa> pessoas) {
       this.descricao = descricao;
       this.pessoas = pessoas;
       }
   
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       @Column(name="idEtnia", unique=true, nullable=false)
       public Integer getIdEtnia() {
           return this.idEtnia;
       }
       
       public void setIdEtnia(Integer idEtnia) {
           this.idEtnia = idEtnia;
       }

       
       @Column(name="descricao", length=15)
       public String getDescricao() {
           return this.descricao;
       }
       
       public void setDescricao(String descricao) {
           this.descricao = descricao;
       }

   @OneToMany(fetch=FetchType.LAZY, mappedBy="etnias")
       public Set<Pessoa > getPessoas() {
           return this.pessoas;
       }
       
       public void setPessoas(Set<Pessoa > pessoas) {
           this.pessoas = pessoas;
       }
}
