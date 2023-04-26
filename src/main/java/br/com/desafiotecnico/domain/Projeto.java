package br.com.desafiotecnico.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity(name="Projeto")
@Table(name = "projeto")
@Data
public class Projeto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Date dataInicio;
    private Date dataPrevisaoFim;
    private Date dataFim;
    private String descricao;
    private String status;
    private Double orcamento;
    private String risco;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name="idgerente")
    @MapsId
    private Pessoa pessoa;
}
