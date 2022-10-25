package com.ilia.digital.folhadepontoapplication.service;

import com.ilia.digital.folhadepontoapplication.dto.MessageResponseDTO;
import com.ilia.digital.folhadepontoapplication.dto.MomentoDTO;
import com.ilia.digital.folhadepontoapplication.mapper.MomentoMapper;
import com.ilia.digital.folhadepontoapplication.model.Momento;
import com.ilia.digital.folhadepontoapplication.repository.MomentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MomentoService {

    private MomentoRepository momentoRepository;

    private final MomentoMapper momentoMapper = MomentoMapper.INSTANCE;

    @Autowired
    public MomentoService(MomentoRepository momentoRepository) {
        this.momentoRepository = momentoRepository;
    }

    public MessageResponseDTO create(MomentoDTO momentoDTO){

        Momento momentoToSave = Momento.builder()
                .id(momentoDTO.getId())
                .dataHora(momentoDTO.getDataHora())
                .build();

//        Momento momentoToSave = momentoMapper.toModel(momentoDTO);

        Momento savedMomento = momentoRepository.save(momentoToSave);
        return MessageResponseDTO.builder()
                .message("Momento da batida criado.")
                .build();
    }
}
