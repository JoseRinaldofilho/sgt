package br.com.basis.sgt3.service.mapper;

//import br.com.basis.sgt.domain.Tarefa;
//import br.com.basis.sgt.service.dto.TarefaDTO;
import br.com.basis.sgt3.domain.Tarefa;
import br.com.basis.sgt3.service.dto.TarefaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefaMapper extends EntityMapper<TarefaDTO, Tarefa> {



}
