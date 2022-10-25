package com.ilia.digital.folhadepontoapplication.controller;

import com.ilia.digital.folhadepontoapplication.dto.MessageResponseDTO;
import com.ilia.digital.folhadepontoapplication.dto.MomentoDTO;
import com.ilia.digital.folhadepontoapplication.repository.MomentoRepository;
import com.ilia.digital.folhadepontoapplication.service.MomentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/batidas")
public class MomentoController {

    private MomentoRepository momentoRepository;

//    @Autowired
//    public MomentoController(MomentoRepository momentoRepository) {
//        this.momentoRepository = momentoRepository;
//    }
//
//    @PostMapping
//    public MessageResponseDTO create(@RequestBody Momento momento) {
//        Momento savedMomento = momentoRepository.save(momento);
//        return MessageResponseDTO.builder()
//                .message("Momento da batida registrado.")
//                .build();
//    }
//}

    private MomentoService momentoService;

    @Autowired
    public MomentoController(MomentoService momentoService) {
        this.momentoService = momentoService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid MomentoDTO momentoDTO){
        return momentoService.create(momentoDTO);

    }
}
