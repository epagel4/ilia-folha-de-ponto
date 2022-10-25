package com.ilia.digital.folhadepontoapplication.mapper;

import com.ilia.digital.folhadepontoapplication.dto.MomentoDTO;
import com.ilia.digital.folhadepontoapplication.model.Momento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface MomentoMapper {

    MomentoMapper INSTANCE = Mappers.getMapper(MomentoMapper.class);

    Momento toModel(MomentoDTO momentoDTO);

    MomentoDTO toDTO(Momento momento);




}
