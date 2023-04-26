package br.com.desafiotecnico.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity(name="Pessoa")
@Table(name = "pessoa")
@Data
public class Pessoa  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Date dataNacimento;
    private String cpf;
    private Boolean funcionario;
}
