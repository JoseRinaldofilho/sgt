package br.com.basis.sgt3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Tarefa {


    private long id;
    private String nome;
    private String descricao;
    private String Importacia;
    private String Progesso;


}
