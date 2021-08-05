package br.com.basis.sgt3.domain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "tarefa")
@Getter
@Setter
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @JoinColumn(name = "id_tipo")
    @ManyToOne
    private TipoTarefa tipoTarefa;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tarefa")
    List<Comentario> comentarios;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(id, tarefa.id) &&
                Objects.equals(titulo, tarefa.titulo) &&
                Objects.equals(tipoTarefa, tarefa.tipoTarefa) &&
                Objects.equals(comentarios, tarefa.comentarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, tipoTarefa, comentarios);
    }
}