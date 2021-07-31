package br.com.basis.sgt3.service.mapper;
/*
import br.com.basis.sgt.domain.Comentario;
import br.com.basis.sgt.service.dto.ComentarioDTO;*/
import br.com.basis.sgt3.domain.Comentario;
import br.com.basis.sgt3.service.dto.ComentarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComentarioMapper extends EntityMapper<ComentarioDTO, Comentario> {
}
