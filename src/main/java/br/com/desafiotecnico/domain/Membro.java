package br.com.desafiotecnico.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Membro")
@Table(name = "membros")
@Data
public class Membro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name="idprojeto")
    @MapsId
    private Projeto projeto;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name="idpessoa")
    @MapsId
    private Pessoa pessoa;
}
